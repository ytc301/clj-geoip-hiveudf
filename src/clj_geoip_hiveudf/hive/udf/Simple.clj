(ns clj-geoip-hiveudf.hive.udf.simple
  (:import [org.apache.hadoop.hive.ql.exec UDF]
           [org.apache.hadoop.io Text])
  (:gen-class
   :name clj-geoip-hiveudf.hive.udf.Simple
   :extends org.apache.hadoop.hive.ql.exec.UDF
   :methods [[evaluate [org.apache.hadoop.io.Text] org.apache.hadoop.io.Text]]))

(defn #^Text -evaluate
  "FIXME: add doc
  "
  [this #^Text s]
  (when s
    (Text.
      (try
        ;;;
      (catch Exception e (str (.getMessage e) ": " (.toString s)))))))
