(ns odition.core2
  (:require [goog.net.XhrIo]
            [goog.object :as o]
            [odition.degree :as degree]
            [odition.notes :as notes]
            [odition.scales :as scales]
            [odition.dictations :as dictations]
            [cljs.core.async :as async])
  (:require-macros [odition.core2 :as core]
                   [odition.resources :as resources]))

(defonce audio-buffers #js {})
(defonce scheduled-sources #js {})
(defonce scheduled-sources-id-counter (atom 0))

(defonce audio-loaded-chan (async/promise-chan))

(defonce audio-context (js/AudioContext.))

(def ^{:private true :dynamic true} *play-context* nil)

(defonce listening-chan (atom nil))

(defn- request-callback [callback resp]
  (callback (.getResponse (.-target resp))))

(defn- request-callback-error [note-name resp]
  (throw (ex-info "Error while requesting notes"
                  {:note-name note-name
                   :error (.getLastError resp)})))

(defn- request-mp3 [note-name callback]
  (let [xhr (goog.net.XhrIo.)]
    (goog.events.listen xhr goog.net.EventType.SUCCESS
                        (partial request-callback callback))
    (goog.events.listen xhr goog.net.EventType.ERROR
                        (partial request-callback-error note-name))
    (.setResponseType xhr goog.net.XhrIo.ResponseType.BLOB)
    (.send xhr (str "mp3/" note-name ".mp3"))))

(defn- audio-decode-error [note-name err]
  (throw (ex-info "Error while decoding audio buffer"
                  {:note-name note-name
                   :error err})))

(defn- audio-decode-success [note-name audio-buffer]
  (o/set audio-buffers note-name audio-buffer))

(defn- on-file-reader-load [loaded-atom note-name e]
  (let [loaded-counter (swap! loaded-atom dec)
        file-reader (.-target e)
        audio (.decodeAudioData audio-context (.-result file-reader))]
    (.then audio (partial audio-decode-success note-name))
    (.catch audio (partial audio-decode-error note-name))
    (when (= loaded-counter 0)
      (async/close! audio-loaded-chan))))

(defn- add-audio-buffer! [loaded-atom note-name blob]
  (let [file-reader (js/FileReader.)]
    (o/set file-reader "onload" (partial on-file-reader-load loaded-atom note-name))
    (.readAsArrayBuffer file-reader blob)))

(comment
  (request-mp3 "B6" (partial add-audio-buffer! "B6"))
  )

(defn load-audio! []
  (let [note-names (resources/sounds-resource)
        loaded-atom (atom (count note-names))]
    (doseq [note-name note-names]
      (request-mp3 note-name (partial add-audio-buffer! loaded-atom note-name)))))

(def ^:private degree->note-vector ["C" "D" "E" "F" "G" "A" "B"])

(def ^:private flat->sharp {"Db" "C#"
                            "Eb" "D#"
                            "Gb" "F#"
                            "Ab" "G#"
                            "Bb" "A#"})

(def ^:private sharp-scales #{{:degree 5 :flat? false}
                              {:degree 2 :flat? false}
                              {:degree 6 :flat? false}
                              {:degree 3 :flat? false}
                              {:degree 7 :flat? false}
                              {:degree 5 :flat? true}})

(defn- degree->note [d]
  (get degree->note-vector (dec d)))

(defn- degree*->degree [note degree*]
  (let [flat? (if (contains? degree/degree*->degree degree*) false true)
        degree* (if flat? (inc degree*) degree*)
        degree (degree/degree*->degree degree*)]
    (assoc note
           :degree degree
           :flat? flat?)))

(defn- note->absolute [root note]
  (let [degree* (+ (get degree/degree->degree* (:degree root))
                   (get degree/degree->degree* (:degree note)))
        degree* (if (:flat? root) (dec degree*) degree*)
        degree* (if (:flat? note) (dec degree*) degree*)
        degree* (if (>= degree* 12) (- degree* 12) degree*)]
    (degree*->degree note degree*)))

(comment
  (note->absolute (notes/map->Note {:degree 2 :flat? false}) (notes/map->Note {:degree 7 :flat? false}))
  )

(defn- transpose [root note]
  (let [degree* (- (get degree/degree->degree* (:degree note))
                   (get degree/degree->degree* (:degree root)))
        degree* (if (:flat? root) (inc degree*) degree*)
        degree* (if (:flat? note) (dec degree*) degree*)
        degree* (if (< degree* 0) (+ degree* 12) degree*)]
    (degree*->degree note degree*)))

(comment
  (transpose (notes/map->Note {:degree 7 :flat? true})
             (notes/map->Note {:degree 6 :flat? false}))
  )

(defn- played [play-context source-id e]
  (o/remove scheduled-sources source-id)
  (when play-context
    (swap! play-context dec)))

(defn- play
  ([{:keys [degree flat? octave]} start duration]
   (let [k (str (degree->note degree) (when flat? "b") octave)
         source (.createBufferSource audio-context)
         gain (.createGain audio-context)
         audio-buffer (o/get audio-buffers k)
         real-start (+ start 0.1)
         real-fadeout (+ real-start duration)
         real-end (+ real-fadeout 0.5)]
     (o/set source "buffer" audio-buffer)
     (.setValueAtTime (.-gain gain) 1 start)
     (.setValueAtTime (.-gain gain) 1 real-fadeout)
     (.connect source gain)
     (.connect gain (.-destination audio-context))
     (.linearRampToValueAtTime (.-gain gain) 0 real-end)
     (o/set scheduled-sources @scheduled-sources-id-counter source)
     (o/set source "onended" (partial played
                                      *play-context*
                                      @scheduled-sources-id-counter))
     (swap! scheduled-sources-id-counter inc)
     (when *play-context*
       (swap! *play-context* inc))
     (.start source real-start)
     (.stop source real-end)))
  ([root note start duration]
   (play (note->absolute root note) start duration)))

(comment
  (play {:degree 1 :flat? false :octave 3} audio-context.currentTime 1)
  
  (let [start audio-context.currentTime
        duration 1]
    (play {:degree 1 :flat? false :octave 3} start duration)
    (play {:degree 3 :flat? false :octave 3} (+ start duration) duration)
    (play {:degree 5 :flat? false :octave 3} (+ start duration duration) duration))
  
  (let [start audio-context.currentTime
        duration 1.5]
    (play {:degree 1 :flat? false :octave 3} start duration)
    (play {:degree 3 :flat? false :octave 3} start duration)
    (play {:degree 5 :flat? false :octave 3} start duration))
  )

(def ^{:dynamic true :private true} *time* nil)

(defn- add-time! [start duration]
  (set! *time* (max *time* (+ start duration))))

(defn- play-t
  ([note start duration]
   (play note start duration)
   (add-time! start (+ duration 0.1)))
  ([root note start duration]
   (play root note start duration)
   (add-time! start (+ duration 0.1))))

(defn- stop-one [source id _]
  (.stop source 0))

(defn stop []
  (if-let [listening-chan @listening-chan]
    (async/go
      (async/>! listening-chan :stop)
      (o/forEach scheduled-sources stop-one))
    (o/forEach scheduled-sources stop-one)))

(comment
  (let [start audio-context.currentTime
        duration 1]
    (play {:degree 1 :flat? false :octave 3} start duration)
    (play {:degree 3 :flat? false :octave 3} (+ start duration) duration)
    (play {:degree 5 :flat? false :octave 3} (+ start duration duration) duration))
  (stop)
  )

(defn- format-note
  ([root note]
   (format-note root note nil))
  ([root note {:keys [force-root] :as opts}]
   (let [root (cond force-root force-root
                    (:transpose opts) (transpose (:transpose opts) root)
                    :else root)
         {:keys [degree flat?]} (note->absolute root note)
         formatted (str (degree->note degree) (when flat? "b"))
         sharp-scale? (contains? sharp-scales (select-keys root [:degree :flat?]))]
     (if-let [formatted-sharp (when sharp-scale? (get flat->sharp formatted))]
       formatted-sharp
       formatted))))

(defn- down-to-root [scale note]
  (let [notes (take-while #(> (compare note %) 0) scale)]
    `[~note ~@(reverse notes)]))

(defn- notes-with-octave-down [root notes octave]
  (loop [notes notes
         notes-with-octave []
         prev-absolute-n nil
         octave octave]
    (if-let [n (first notes)]
      (let [absolute-n (note->absolute root n)
            prev-n (peek notes-with-octave)
            octave (if (and prev-absolute-n
                            (> (:degree absolute-n)
                               (:degree prev-absolute-n)))
                     (dec octave)
                     octave)
            n (assoc n :octave octave)]
        (recur (rest notes)
               (conj notes-with-octave n)
               absolute-n
               octave))
      notes-with-octave)))

(comment
  (down-to-root scales/major-scale (notes/map->Note {:degree 1 :flat? false}))
  (notes-with-octave-down (notes/map->Note {:degree 2 :flat? false})
                          (down-to-root scales/major-scale (notes/map->Note {:degree 7 :flat? false}))
                          1)
  )

(defn- up-to-root [scale note]
  (if (= note (notes/map->Note {:degree 1 :flat? false}))
    [note]
    (let [notes (drop-while #(>= (compare note %) 0) scale)
          notes `[~note ~@notes ~(notes/map->Note {:degree 1 :flat? false})]]
      notes)))

(defn- notes-with-octave-up [root notes octave]
  (loop [notes notes
         notes-with-octave []
         prev-absolute-n nil
         octave octave]
    (if-let [n (first notes)]
      (let [absolute-n (note->absolute root n)
            octave (if (and prev-absolute-n
                            (< (:degree absolute-n)
                               (:degree prev-absolute-n)))
                     (inc octave)
                     octave)
            n (assoc n :octave octave)]
        (recur (rest notes)
               (conj notes-with-octave n)
               absolute-n
               octave))
      notes-with-octave)))

(defn root->triad [root scale]
  (let [{:keys [octave] :as root} root
        third (get scale 2)
        fifth (get scale 4)]
    (notes-with-octave-up root [degree/degree-1 third fifth] octave)))

(comment
  (notes-with-octave-up (notes/map->Note {:degree 2 :flat? false})
                        (up-to-root scales/major-scale (notes/map->Note {:degree 2 :flat? false}))
                        1)
  
  )

(defn- no-flat? [degree]
  (or (= degree 4) (= degree 1)))

(defn- min-root-octave [{:keys [degree flat?]}]
  (cond (= degree 7) 0
        (and (= degree 6) (not flat?)) 0
        :else 1))

(defn- max-root-octave [{:keys [degree flat?]}]
  (if (<= degree 4)
    7
    6))

(defn with-random-octave
  ([root]
   (let [root-octave-min (min-root-octave root)
         root-octave-max  (max-root-octave root)]
     (assoc root :octave (rand-nth (range root-octave-min root-octave-max)))))
  ([root note]
   (let [root (assoc root :octave nil)
         note (assoc note :octave nil)
         absolute-note (note->absolute root note)
         note-octave-min (if (>= (compare absolute-note root) 0)
                           (min-root-octave root)
                           (inc (min-root-octave root)))
         note-octave-max (if (<= (compare absolute-note root) 0)
                           (max-root-octave root)
                           (dec (max-root-octave root)))
         note (assoc note :octave (rand-nth (range note-octave-min note-octave-max)))]
     note)))

(defn- play-to-root [root scale note]
  (let [to-root (if (>= (compare note degree/degree-5) 0)
                  (up-to-root scale note)
                  (down-to-root scale note))
        to-root (if (>= (compare note degree/degree-5) 0)
                  (notes-with-octave-up root to-root (:octave note))
                  (notes-with-octave-down root to-root (:octave note)))]
    (doseq [n to-root]
      (play-t root n *time* 0.4))))

(defn- play-triad [root scale]
  (core/with-time
    (let [triad (root->triad root scale)]
      #_(doseq [note triad]
        (play-t root note *time* 0.4))
      (play-t root *time* 1.4))))

(defn- play-basic [scale degrees]
  (binding [*time* audio-context.currentTime]
    (let [root (with-random-octave (rand-nth scales/chromatic-scale))
          note (with-random-octave root (rand-nth degrees))]
      (play-triad root scale)
      (play-t root note *time* 1.4)
      (add-time! *time* 1)
      (play-to-root root scale note)
      (add-time! *time* 1)
      (play-t root note *time* 2))))

(defn- melodic-dictation-degrees [{:keys [root notes] :as dictation}]
  (let [root (with-random-octave (rand-nth scales/chromatic-scale))
        notes (vec (for [n notes]
                    (with-random-octave root n)))]
    (assoc dictation
           :root root
           :notes notes)))

(defn- play-dictation [{:keys [root scale notes]}]
  (binding [*time* audio-context.currentTime]
    (play-triad root scale)
    (doseq [note notes]
      (play-t root note *time* 1))
    (add-time! *time* 1)
    (doseq [note notes]
      (play-to-root root scale note)
      (add-time! *time* 0.5))
    (add-time! *time* 0.5)
    (doseq [note notes]
      (play-t root note *time* 1))))

(comment
  (play-dictation  (-> (get dictations/dictations scales/major-scale-k)
                       rand-nth
                       melodic-dictation-degrees))
  )

(defn- play-context-watch [ch k r o n]
  (when (= n 0)
    (async/close! ch)))

(defn- play-context-chan [play-context]
  (let [ch (async/chan)]
    (add-watch play-context ::play-context (partial play-context-watch ch))
    ch))

(defn play-basic-while-listening []
  (async/go
    (let [chan (core/with-play-context
                 (play-basic scales/major-scale
                             scales/chromatic-scale))
          _ (async/<! chan)
          listening-chan @listening-chan]
      (when listening-chan
        (async/put! listening-chan :played)))))

(defn listen-basic []
  (when (compare-and-set! listening-chan nil (async/chan))
    (async/go-loop []
      (play-basic-while-listening)
      (if (= :stop (async/<! @listening-chan))
        (reset! listening-chan nil)
        (recur)))))

(comment
  (listen-basic)
  (stop)
  )

(defn play-dictation-while-listening []
  (async/go
    (let [dictation (-> (get dictations/dictations2 scales/major-scale-k)
                        (get 1)
                        melodic-dictation-degrees)
          chan (core/with-play-context
                 (play-dictation dictation))
          _ (async/<! chan)
          listening-chan @listening-chan]
      (when listening-chan
        (async/put! listening-chan :played)))))

(comment
  (-> (get dictations/dictations2 scales/major-scale-k)
      (get 1))
  )

(defn listen-dictation []
  (when (compare-and-set! listening-chan nil (async/chan))
    (async/go-loop []
      (play-dictation-while-listening)
      (if (= :stop (async/<! @listening-chan))
        (reset! listening-chan nil)
        (recur)))))

(comment
  (listen-dictation)
  (stop)
  )

(defn- play-dictation2 [{:keys [root scale notes]}]
  (binding [*time* audio-context.currentTime]
    (play-triad root scale)
    (doseq [note notes]
      (play-t root note *time* 1))))

(defn random-dictation []
  (let [root (with-random-octave (rand-nth scales/chromatic-scale))]
    {:root root
     :scale scales/major-scale
     :notes [(with-random-octave root (rand-nth scales/chromatic-scale))
             (with-random-octave root (rand-nth scales/chromatic-scale))]}))

(comment
  (defn random-dictation-2 []
    (for [degrees (for [d1 scales/chromatic-scale
                        d2 scales/chromatic-scale
                        :when (not= d1 d2)]
                    [d1 d2])]
      (let [root (with-random-octave (rand-nth scales/chromatic-scale))]
        {:root root
         :scale scales/major-scale
         :notes [(with-random-octave root (nth degrees 0))
                 (with-random-octave root (nth degrees 1))]})))

  (shuffle (random-dictation-2))

  (count dictations/all-dictations-2)
  
  )

(defn- format-root
  ([dictation]
   (format-root dictation nil))
  ([{:keys [root]} opts]
   (format-note root degree/degree-1 opts)))

(defn- format-nth
  ([dictation n]
   (format-nth dictation n nil))
  ([{:keys [root notes]} n opts]
   (format-note root (get notes n) opts)))

(defn- play-to-root-nth [{:keys [root scale notes]} n]
  (binding [*time* audio-context.currentTime]
    (play-to-root root scale (get notes n))))

(defonce last-rand-int (atom nil))

(defn rand-int2 [n]
  (loop [r (rand-int n)]
    (if (and @last-rand-int (= r @last-rand-int))
      (recur (rand-int n))
      (reset! last-rand-int r))))

(def nb-dictation 5)

(comment
  
  (def the-dictation
    {:root #odition.notes.Note {:degree 1
                                :flat? false
                                :octave 3}
     :scale scales/major-scale
     :notes [#odition.notes.Note {:degree 5
                                  :flat? true
                                  :octave 3}
             #odition.notes.Note {:degree 7
                                  :flat? true
                                  :octave 3}]})
  (do
    (def the-dictation (random-dictation))
    (play-dictation2 the-dictation)
    )
  (do
    (def the-dictation (nth (take nb-dictation dictations/all-dictations-2) (rand-int2 (count (take nb-dictation dictations/all-dictations-2)))))
    (play-dictation2 the-dictation)
    )
  (play-triad (:root the-dictation) (:scale the-dictation))
  (play-to-root-nth the-dictation 0)
  (play-to-root-nth the-dictation 1)
  (format-nth the-dictation 0 {:force-root degree/degree-1})
  (format-nth the-dictation 1 {:force-root degree/degree-1})
  )

(defn play-dictation-2-while-listening []
  (async/go
    (let [dictation (nth (take nb-dictation dictations/all-dictations-2) (rand-int2 (count (take nb-dictation dictations/all-dictations-2))))
          #_#__ (prn [(format-nth dictation 0 {:force-root degree/degree-1})
                  (format-nth dictation 1 {:force-root degree/degree-1})])
          chan (core/with-play-context
                 (play-dictation dictation))
          _ (async/<! chan)
          listening-chan @listening-chan]
      (when listening-chan
        (async/put! listening-chan :played)))))

(defn listen-dictation-2 []
  (when (compare-and-set! listening-chan nil (async/chan))
    (async/go-loop []
      (play-dictation-2-while-listening)
      (if (= :stop (async/<! @listening-chan))
        (reset! listening-chan nil)
        (recur)))))

(comment
  (listen-dictation-2)
  (stop)
  )
