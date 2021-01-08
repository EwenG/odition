(ns odition.notes)

(defn note-data-reader [note-map]
  `(map->Note ~note-map))
