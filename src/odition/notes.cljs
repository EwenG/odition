(ns odition.notes)

(defn- compare-without-octave [x y]
  (cond (and (= (:degree x) (:degree y))
             (= (:flat? x) (:flat? y)))
        0
        (and (= (:degree x) (:degree y))
             (:flat? y))
        1
        (> (:degree x) (:degree y))
        1
        :else -1))

(defrecord Note [degree flat? octave]
  cljs.core/IComparable
  (-compare [x y]
    (cond (and (:octave x) (:octave y) (< (:octave x) (:octave y)))
          -1
          (and (:octave x) (:octave y) (> (:octave x) (:octave y)))
          1
          :else (compare-without-octave x y))))
