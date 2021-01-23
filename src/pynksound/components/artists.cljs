(ns pynksound.components.artists
  (:require [pynksound.state :as state]))

(defn artists
  []
  [:main
    [:div.gigs
      (for [{:keys [id img title followers-count desc]} (vals @state/artists)]
        [:div.gig
          {:key id}
          [:img.gig__artwork {:src img :alt title}]
          [:div.gig__body
            [:div.gig__title
              [:div.btn.btn--primary.float--right.tooltip {:data-tooltip "Add to Order"}
              [:i.icon.icon--plus]] title]
            [:p.gig__price "Followers: " followers-count]\
            [:p.gig__desc desc]]])]])
