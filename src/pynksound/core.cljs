(ns pynksound.core
  (:require [reagent.core :as r]
            [pynksound.components.header :refer [header]]
            [pynksound.components.gigs :refer [gigs]]
            [pynksound.components.orders :refer [orders]]
            [pynksound.components.footer :refer [footer]]))

(defn app
  []
  [:div.container
    [header]
    [gigs]
    [orders]
    [footer]])

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app")))
