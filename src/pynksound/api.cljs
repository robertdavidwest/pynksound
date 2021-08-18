(ns pynksound.api
  (:require [ajax.core :refer [GET]]
            [pynksound.state :as state]))

(defn error-handler [{:keys [status status-text]}]
  (.log js/console (str "something bad happened: " status " " status-text)))

(defn index-by
  [key collection]
  "Transform a collection to a map with a given key as a lookup value"
  (->> collection
       (map (juxt key identity))
       (into {})))

(defn artists-handler [response]
  (let [prefix-w-artist_f #(str "artist-" %)
        alter-user-id_f #(update-in % [:user_id] prefix-w-artist_f)
        response (map alter-user-id_f response)
        response (index-by :user_id response)]
    (reset! state/artists response)))

(defn fetch-artists
  []
  (GET "http://localhost:3000/users"
       {:handler artists-handler
        :error-handler error-handler
        :response-format :json
        :keywords? true}))
