(ns table-tennis-scoreboard.client-main
  (:require [table-tennis-scoreboard.client :as client]
            [fulcro.client :as core]
            [table-tennis-scoreboard.ui.root :as root]))

; This is the production entry point. In dev mode, we do not require this file at all, and instead mount (and
; hot code reload refresh) from cljs/user.cljs
(reset! client/app (core/mount @client/app root/Root "app"))
