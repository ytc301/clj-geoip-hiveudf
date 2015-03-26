(defproject clj-geoip-hiveudf "0.1.0-SNAPSHOT"
  :description "A Hive SimpleUDF wrapper around the clj-geoip library"
  :url "https://github.com/russellwhitaker/clj-geoip-hiveudf"
  :license {:name "The MIT License (MIT)"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.apache.hive/hive-exec "0.12.0"]
                 [org.apache.hive/hive-serde "0.12.0"]
                 [org.apache.hadoop/hadoop-core "1.2.1"]
                 [de.bertschneider/clj-geoip "0.2"]]
  :profiles {:dev {:dependencies [[speclj "3.2.0"]
                                  [lein-git-deps "0.0.2-SNAPSHOT"]]}}
  :plugins [[lein-git-deps "0.0.2-SNAPSHOT"]
            [speclj "3.2.0"]]
  :git-dependencies [["https://github.com/bertschneider/clj-geoip.git"]]
  :resource-paths [".lein-git-deps/clj-geoip"]
  :test-paths ["spec"]
  :aot :all)
