(ns pynksound.components.artists
  (:require [pynksound.state :as state]))

(defn artists
  []
  [:main
    [:div.gigs
     (for [{:keys [user_id avatar_url username followers_count desc]} (vals @state/artists)]
        [:div.gig
          {:key user_id}
         [:img.gig__artwork {:src avatar_url :alt username}]
          [:div.gig__body
            [:div.gig__title
              [:div.btn.btn--primary.float--right.tooltip {:data-tooltip "Add to Order"}
              [:i.icon.icon--plus]] username]
           [:p.gig__price "Followers: " followers_count]\
            [:p.gig__desc desc]]])]])
