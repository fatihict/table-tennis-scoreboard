(ns table-tennis-scoreboard.intro
  (:require [devcards.core :as rc :refer-macros [defcard]]
            [table-tennis-scoreboard.ui.components :as comp]))

(defcard SVGPlaceholder
  "# SVG Placeholder"
  (comp/ui-placeholder {:w 200 :h 200}))
