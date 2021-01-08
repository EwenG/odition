(ns odition.core2)

#_(defmacro with-listening [& body]
  `(binding [*play-context* (atom 0)]
     (let [ch# (play-context-chan *play-context*)]
       (if (compare-and-set! listening-chan nil ch#)
         (do
           ~@body 
           (reset! listening-chan nil))
         (cljs.core.async/close! ch#))
       ch#)))

(defmacro with-play-context [& body]
  `(binding [*play-context* (atom 0)]
     (let [ch# (play-context-chan *play-context*)]
       ~@body 
       ch#)))
