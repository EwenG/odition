(ns odition.build
  (:require [clojure.java.io :as io]
            [cljs.build.api :as build-api]
            [badigeon.clean :as clean]
            [badigeon.exec :as exec])
  (:import [java.nio.file Files]))

(defn build []
  (let [foreign-libs (-> (io/resource "deps.cljs") slurp read-string :foreign-libs)
        #_#_foreign-libs [(assoc (first foreign-libs) :file "resources/bundle-prod.js")]]
    (build-api/build (io/resource "odition/main.cljs")
                     {:output-to "site/main.js"
                      :output-dir "target/cljs-out"
                      :optimizations :advanced
                      :preloads []
                      :pretty-print false
                      :install-deps false
                      :target :none
                      :verbose false
                      :npm-deps false
                      :foreign-libs foreign-libs}))
  #_(exec/exec "cp" {:proc-args ["site-dev/index.html" "site-prod/index.html"]})
  #_(exec/exec "cp" {:proc-args ["-r" "site-dev/mp3" "site-prod/mp3"]})
  (exec/exec "sass" {:proc-args ["--no-source-map" "--style" "compressed"
                                 "resources/scss/main.scss" "site/main.css"]})
  (clean/clean "target/cljs-out")
  )

(comment
  (binding [*print-length* nil]
    (build))
  )
