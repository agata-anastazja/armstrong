(defproject armstrong-numbers "0.1.0-SNAPSHOT"
  :description "armstrong-numbers exercise"
  :url "https://github.com/exercism/clojure/tree/master/exercises/armstrong-numbers"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [lambdaisland/kaocha "1.0.632"]]
  :profiles {:kaocha {:dependencies [[lambdaisland/kaocha "1.0.632"]]}}
  :aliases {"kaocha" ["with-profile" "+kaocha" "run" "-m" "kaocha.runner"]})
