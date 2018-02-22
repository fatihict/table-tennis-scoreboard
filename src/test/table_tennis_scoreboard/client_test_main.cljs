(ns table-tennis-scoreboard.client-test-main
  (:require table-tennis-scoreboard.tests-to-run
            [fulcro-spec.selectors :as sel]
            [fulcro-spec.suite :as suite]))

(enable-console-print!)

(suite/def-test-suite client-tests {:ns-regex #"table-tennis-scoreboard..*-spec"}
  {:default   #{::sel/none :focused}
   :available #{:focused}})

