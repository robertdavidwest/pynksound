(ns pynksound.components.gigs
  (:require [pynksound.state :as state]))

(defn gigs
  []
  [:main
    [:div.gigs
      (for [{:keys [id img title price desc]} (vals @state/gigs)]
        [:div.gig
          {:key id}
          [:img.gig__artwork {:src img :alt title}]
          [:div.gig__body
            [:div.gig__title
              [:div.btn.btn--primary.float--right.tooltip {:data-tooltip "Add to Order"}
              [:i.icon.icon--plus]] title]
            [:p.gig__price price]\
            [:p.gig__desc desc]]])]])