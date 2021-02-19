(ns odition.core2)

(defn- with-play-context-impl [body]
  `(binding [*play-context* (atom 0)]
     (let [ch# (play-context-chan *play-context*)]
       ~@body 
       ch#)))

(defmacro with-play-context [& body]
  (with-play-context-impl body))

(defmacro with-time [& body]
  `(if *time*
     ~@body
     (binding [*time* audio-context.currentTime]
       ~@body)))

#_(defmacro while-listening [& body]
  `(cljs.core.async/go
     (let [chan (with-play-context ~@body)
           _ (cljs.core.async/<! chan)
           listening-chan @listening-chan]
       (when listening-chan
         (cljs.core.async/put! listening-chan :played)))))

#_(defmacro with-listening [& body]
  `(when (compare-and-set! listening-chan nil (cljs.core.async/chan))
     (cljs.core.async/go-loop []
       ~@body
       (if (= :stop (cljs.core.async/<! @listening-chan))
         (reset! listening-chan nil)
         (recur)))))
