(ns user
  (:require [clojure.tools.namespace.repl :as tnr]
            [prc]
            [proto]))


(defn start
  [])

(defn reset []
  (tnr/refresh :after 'user/start))

(println "proto-repl-demo dev/user.clj loaded.")
