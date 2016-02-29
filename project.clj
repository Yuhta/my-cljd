(defproject my-cljd "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.martiansoftware/nailgun-server "0.9.1"]
                 [mwdict "0.1.0-SNAPSHOT"]
                 [yuhta/check-gmail "0.1.0-SNAPSHOT"]]
  :plugins [[lein-bin "0.3.5"]]
  :main com.martiansoftware.nailgun.NGServer
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :bin {:name "cljd"})
