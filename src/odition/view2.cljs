(ns odition.view2
  (:require [muance.core :as m :include-macros true]
            [muance.dom :as dom :include-macros true]
            [cljs.core.async :as async]
            [odition.core2 :as core]
            [odition.scales :as scales])
  (:require-macros [muance.h :as h]))

(defonce odition-state (atom {:audio-loaded? false
                              :listening? false
                              :views [:home]}))

(defn listening-watcher [r k o n]
  (swap! odition-state assoc :listening? (boolean n)))

(defn- watch-listening []
  (add-watch core/listening-chan ::listening listening-watcher))

(watch-listening)

(defonce vtree (dom/vtree))

(defn- has-view? [views v]
  (some #(= % v) views))

(defn- pop-to-view [views view]
  (loop [views views]
    (if (= (peek views) view)
      views
      (recur (pop views)))))

(defn- set-current-view [views view]
  (if-let [the-view (has-view? views view)]
    (pop-to-view views view)
    (conj views view)))

(defn- set-view! [e _ view]
  (swap! odition-state update :views set-current-view view))

(m/defcomp breadcrumb [{:keys [views]}]
  (let [current-view (peek views)]
    (h/nav
     (h/ol :class "breadcrumb"
           (h/li :class ["breadcrumb-item"
                         (when (= current-view :home) "active")]
                 (if (= current-view :home)
                   (h/text "Home")
                   (h/a :href "#"
                        ::m/on [:click set-view! :home]
                        "Home")))
           (when (has-view? views :basic-training)
             (h/li :class ["breadcrumb-item"
                           (when (= current-view :basic-training) "active")]
                   (if (= current-view :basic-training)
                     (h/text "Basic training")
                     (h/a :href "#" "Basic training"))))
           (when (has-view? views :basic-training2)
             (h/li :class ["breadcrumb-item"
                           (when (= current-view :basic-training2) "active")]
                   (if (= current-view :basic-training2)
                     (h/text "Basic training2")
                     (h/a :href "#" "Basic training2"))))))))

(m/defcomp home []
  (h/div
    :class "row"
    (h/button
     :type "button"
     :class ["btn" "btn-primary" "btn-lg" "btn-block"]
     :style {:max-width "960px"
             :margin-left "auto"
             :margin-right "auto"}
     ::m/on [:click set-view! :basic-training]
     (h/text "Basic training"))))

(m/defcomp basic-training2 []
  (h/div
   :class ["row" "row-cols-1"]
   (h/div
    :class ["col" "mb-4"]
    (h/div
     :class "card"
     (h/div
      :class "card-body"
      (h/h2 :class "card-title" "Play")
      (h/a :href "#"
           :class "stretched-link"
           ::m/on [:click #(prn "e")]))))))

(m/defcomp basic-training []
  (h/div
   :class ["row" "row-cols-2"]
   (h/div
    :class ["col" "mb-4"]
    (h/div
     :class "card"
     (h/div
      :class "card-body"
      (h/h2 :class "card-title" "Random major")
      (h/h3 :class ["card-subtitle" "text-muted"] "(many octaves)")
      (h/a :href "#"
           :class "stretched-link"
           ::m/on [:click set-view! :basic-training2]))))
   (h/div
    :class ["col" "mb-4"]
    (h/div
     :class "card"
     (h/div
      :class "card-body"
      (h/h2 :class "card-title" "C major")
      (h/h3 :class ["card-subtitle" "text-muted"] "(many octaves)")
      (h/a :href "#"
           :class "stretched-link"
           ::m/on [:click set-view! :basic-training2]))))))

(m/defcomp odition-comp [{:keys [views] :as state-value}]
  (h/div
   :class "container"
   (breadcrumb state-value)
   (let [current-view (peek views)]
     (case current-view
       :home (home)
       :basic-training (basic-training)
       :basic-training2 (basic-training2)))))

(defn- listen-basic-clicked [_ _]
  (core/listen-basic))

(defn- listen-dictation-clicked [_ state]
  (let [dictation-start (or (:dictation-start @state) 0)
        dictation-end (or (:dictation-eend @state) 131)]
    (core/listen-dictation-2 [dictation-start dictation-end])))

(defn- stop-clicked [_ _]
  (core/stop))

(defn dictation-start-changed [e state]
  (let [v (js/parseInt (.-value (.-target e)))]
    (swap! state assoc :dictation-start v)))

(defn dictation-end-changed [e state]
  (let [v (js/parseInt (.-value (.-target e)))]
    (swap! state assoc :dictation-end v)))

(m/defcomp odition-comp2 [{:keys [listening?] :as state-value}]
  (let [state (m/state)]
    (h/div
     :class "container"
     (h/div
      :class ["row" "row-cols-3"]
      (h/div
       :class ["col" "mb-4"]
       (h/button
        :type "button"
        :class ["btn" "btn-primary" "btn-lg" "btn-block"]
        :disabled (boolean listening?)
        ::m/on [:click listen-basic-clicked]
        (h/text "Listen basic")))
      (h/div
       :class ["col" "mb-4"]
       (h/div
        (h/button
         :type "button"
         :class ["btn" "btn-primary" "btn-lg" "btn-block"]
         :disabled (boolean listening?)
         ::m/on [:click listen-dictation-clicked]
         (h/text "Listen dictation")))
       (h/div
        (h/input :type "number"
                 :min "0"
                 :value 0
                 ::m/on [:change dictation-start-changed])
        (h/input :type "number"
                 :max "131"
                 :value 5
                 ::m/on [:change dictation-end-changed])))
      (h/div
       :class ["col" "mb-4"]
       (h/button
        :type "button"
        :class ["btn" "btn-primary" "btn-lg" "btn-block"]
        :disabled (not (boolean listening?))
        ::m/on [:click stop-clicked]
        (h/text "Stop")))))))

(defn patch-root
  ([]
   (patch-root @odition-state))
  ([state-value]
   (m/patch vtree odition-comp2 @odition-state)))

