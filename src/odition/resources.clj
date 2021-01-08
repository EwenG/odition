(ns odition.resources
  (:require [clojure.java.io :as io]
            [clojure.data.json :as json])
  (:import [java.util Base64]))

#_(defmacro sounds-resource []
  (slurp (io/resource "acoustic_grand_piano-mp3.json")))

(defmacro sounds-resource []
  (vec (for [f (file-seq (io/file "site-dev/mp3"))
             :let [f-name (.getName f)]
             :when (.endsWith f-name ".mp3")]
         (subs f-name 0 (- (count f-name ) (count ".mp3"))))))


(defn- get-english-env
  "Returns env vars as a map with clojure keywords and LANGUAGE set to 'en'"
  []
  (let [env (System/getenv)]
    (assoc (zipmap (map keyword (keys env)) (vals env))
           :LANGUAGE "en")))

(defn- as-env-strings
  [env]
  (into-array String (map (fn [[k v]] (str (name k) "=" v)) env)))

(defn exec
  "Synchronously executes the specified command in a separate process. Prints the process output using \"clojure.core/print\". Throws an exception when the process exit code is not 0.
  - command: The command to be executed.
  - proc-args: A collection of command arguments. Default to no argument.
  - error-msg: The error message of the exception thrown upon error. Default to \"Process execution error\"."
  ([command]
   (exec command nil))
  ([command {:keys [proc-args error-msg] :or {error-msg "Process execution error"}}]
   (let [proc-env (as-env-strings (get-english-env))
         proc-command-args (into [command] proc-args)
         proc (.exec (Runtime/getRuntime)
                     ^"[Ljava.lang.String;" (into-array String proc-command-args)
                     ^"[Ljava.lang.String;" proc-env)]
     (.addShutdownHook (Runtime/getRuntime)
                       (Thread. (fn [] (.destroy proc))))
     (with-open [proc-out (.getInputStream proc)
                 proc-err (.getErrorStream proc)]
       (let [exit-code (.waitFor proc)]
         (print (slurp (io/reader proc-out)))
         (print (slurp (io/reader proc-err)))
         (when (not= exit-code 0)
           (throw (ex-info error-msg
                           {:exit-code exit-code
                            :command command
                            :proc-args proc-args}))))))))

(comment
  (def audio-map (json/read-str (slurp (io/resource "acoustic_grand_piano-mp3.json"))))
  
  (doseq [[k data] audio-map
          :let [data (subs data (count "data:audio/mp3;base64,"))
                data (.decode (Base64/getDecoder) data)]]
    (io/copy data (io/file (str "mp3/" k ".mp3"))))

  (doseq [f (file-seq (io/file "mp3"))
          :when (not (.isDirectory f))]
    (prn (str f))
    (exec "lame" {:proc-args ["-b" "63" "--scale" "4" (str f) (str "mp3-amplified/" (.getName f))]}))

  (with-local-vars [m {}]
    (doseq [f(file-seq (io/file "mp3-amplified"))
            :when (not (.isDirectory f))
            :let [k (first (.split (.getName f) "\\."))]
            :when (not (clojure.string/blank? k))]
      (let [arr (byte-array (.length f))]
        (with-open [is (io/input-stream f)]
          (.read is arr))
        
        (let [b64-string (str "data:audio/mp3;base64,"
                              (.encodeToString (Base64/getEncoder) arr))] 
          (var-set m (assoc @m k b64-string)))))
    (spit "resources/acoustic_grand_piano-mp3.json" (json/write-str @m :escape-slash false)))

  )
