(ns odition.scales
  (:require [odition.notes :as notes]))

(def chromatic-scale
  [(notes/map->Note {:degree 1 :flat? false})
   (notes/map->Note {:degree 2 :flat? true})
   (notes/map->Note {:degree 2 :flat? false})
   (notes/map->Note {:degree 3 :flat? false})
   (notes/map->Note {:degree 3 :flat? true})
   (notes/map->Note {:degree 4 :flat? false})
   (notes/map->Note {:degree 5 :flat? true})
   (notes/map->Note {:degree 5 :flat? false})
   (notes/map->Note {:degree 6 :flat? true})
   (notes/map->Note {:degree 6 :flat? false})
   (notes/map->Note {:degree 7 :flat? true})
   (notes/map->Note {:degree 7 :flat? false})])

(def major-scale
  [(notes/map->Note {:degree 1 :flat? false})
   (notes/map->Note {:degree 2 :flat? false})
   (notes/map->Note {:degree 3 :flat? false})
   (notes/map->Note {:degree 4 :flat? false})
   (notes/map->Note {:degree 5 :flat? false})
   (notes/map->Note {:degree 6 :flat? false})
   (notes/map->Note {:degree 7 :flat? false})])

(def minor-natural-scale
  [(notes/map->Note {:degree 1 :flat? false})
   (notes/map->Note {:degree 2 :flat? false})
   (notes/map->Note {:degree 3 :flat? true})
   (notes/map->Note {:degree 4 :flat? false})
   (notes/map->Note {:degree 5 :flat? false})
   (notes/map->Note {:degree 6 :flat? true})
   (notes/map->Note {:degree 7 :flat? true})])

(def minor-dorian-scale
  [(notes/map->Note {:degree 1 :flat? false})
   (notes/map->Note {:degree 2 :flat? false})
   (notes/map->Note {:degree 3 :flat? true})
   (notes/map->Note {:degree 4 :flat? false})
   (notes/map->Note {:degree 5 :flat? false})
   (notes/map->Note {:degree 6 :flat? false})
   (notes/map->Note {:degree 7 :flat? true})])

(def major-scale-k "major-scale")
(def minor-natural-scale-k  "minor-natural-scale")
(def minor-dorian-scale-k  "minor-dorian-scale")

(def scales {major-scale-k major-scale
             minor-natural-scale-k minor-natural-scale
             minor-dorian-scale-k minor-dorian-scale})
