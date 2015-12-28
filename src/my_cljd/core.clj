(ns my-cljd.core
  (require [cljd :refer [start-server]])
  (:gen-class))

(defn -main []
  (start-server))
