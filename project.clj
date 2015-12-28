(defproject my-cljd "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cljd "0.1.0-SNAPSHOT"]
                 [mwdict "0.1.0-SNAPSHOT"]]
  :plugins [[lein-bin "0.3.5"]]
  :main ^:skip-aot my-cljd.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :bin {:name "cljd"})
