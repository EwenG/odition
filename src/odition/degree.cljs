(ns odition.degree)

(def ^:const degree-1 {:degree 1 :flat? false})
(def ^:const degree-5 {:degree 5 :flat? false})

(def degree->degree* {1 0
                      2 2
                      3 4
                      4 5
                      5 7
                      6 9
                      7 11})

(defn- degree*->degree-reducer [m k v]
  (assoc m v k))

(def degree*->degree (reduce-kv degree*->degree-reducer {} degree->degree*))
