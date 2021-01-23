(ns pynksound.state
  (:require [reagent.core :as r]))

(def artists (r/atom {:artist-01 {:id :artist-01
                                  :title "Lovecraft"
                                  :artist "Lovecraft"
                                  :desc "It could be said that Lovecraft’s greatest addiction in life is music..."
                                  :img "https://i1.sndcdn.com/avatars-000331737209-tlnwiq-large.jpg"
                                  :followers-count 3241}
                      :artist-02 {:id :artist-02
                                  :title "Pasha Geskin"
                                  :artist "Pasha Geskin"
                                  :desc ""
                                  :img "https://i1.sndcdn.com/avatars-000005870501-n465zq-large.jpg"
                                  :followers-count 247}
                      :artist-03 {:id :artist-03
                                  :title "C Λ T O R I"
                                  :artist "C Λ T O R I"
                                  :desc "Brooklyn based Catori works with sound both electronically and acoustically..."
                                  :img "https://i1.sndcdn.com/avatars-000704065903-04q66q-large.jpg"
                                  :followers-count 479}}))
