(defproject one-function-to-rule-them-all "1.0.0-SNAPSHOT"
  :description "One function to rule them all"
  :repositories {"stuart" "http://stuartsierra.com/maven2"}
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :profiles {:dev {:dependencies [[midje "1.4.0"]
                                  [com.stuartsierra/lazytest "1.2.3"]]}}
  :plugins [[lein-midje "2.0.0-SNAPSHOT"]])
