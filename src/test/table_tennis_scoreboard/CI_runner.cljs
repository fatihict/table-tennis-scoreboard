(ns table-tennis-scoreboard.CI-runner
  (:require
    table-tennis-scoreboard.tests-to-run
    [doo.runner :refer-macros [doo-all-tests]]))

;; This file is for running JS tests via karma/node for CI server
(doo-all-tests #".*-spec")
