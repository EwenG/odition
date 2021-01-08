(ns odition.main
  (:require [cljs.core.async :as async]
            [muance.core :as m :include-macros true]
            [odition.core2 :as core]
            [odition.view2 :as view2]))

(m/append-child (.-body js/document) view2/vtree)

(add-watch view2/odition-state ::odition-app
           (fn [k r o n] (view2/patch-root n)))

(view2/patch-root)

(def ^:private audio-loading-or-loaded? (atom false))

(when-not @audio-loading-or-loaded?
  (reset! audio-loading-or-loaded? true)
  (async/go
    (core/load-audio!)
    (async/<! core/audio-loaded-chan)
    (swap! view2/odition-state assoc :audio-loaded? true)))


