(ns odition.dictations
  (:require [odition.scales :as scales]
            #_[odition.notes-parser :as notes-parser]))

(def force-roots [#odition.notes.Note {:degree 2
                                       :flat? true}
                  #odition.notes.Note {:degree 3
                                       :flat? false}])

(def dictations
  {scales/minor-natural-scale-k [{:root #odition.notes.Note {
                                                             :degree 6
                                                             :flat? false
                                                             :octave 3
                                                             }
                                  :scale [#odition.notes.Note {
                                                               :degree 1
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 2
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 3
                                                               :flat? true
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 4
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 5
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 6
                                                               :flat? true
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 7
                                                               :flat? true
                                                               :octave nil
                                                               }]
                                  :notes [#odition.notes.Note {
                                                               :degree 2
                                                               :flat? false
                                                               :octave 1
                                                               }
                                          #odition.notes.Note {
                                                               :degree 7
                                                               :flat? true
                                                               :octave 5
                                                               }
                                          #odition.notes.Note {
                                                               :degree 6
                                                               :flat? true
                                                               :octave 1
                                                               }
                                          #odition.notes.Note {
                                                               :degree 6
                                                               :flat? true
                                                               :octave 4
                                                               }]}

                                 {:root #odition.notes.Note {
                                                             :degree 5
                                                             :flat? true
                                                             :octave 2
                                                             }
                                  :scale [#odition.notes.Note {
                                                               :degree 1
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 2
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 3
                                                               :flat? true
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 4
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 5
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 6
                                                               :flat? true
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 7
                                                               :flat? true
                                                               :octave nil
                                                               }]
                                  :notes [#odition.notes.Note {
                                                               :degree 3
                                                               :flat? true
                                                               :octave 1
                                                               }
                                          #odition.notes.Note {
                                                               :degree 6
                                                               :flat? true
                                                               :octave 3
                                                               }
                                          #odition.notes.Note {
                                                               :degree 3
                                                               :flat? true
                                                               :octave 2
                                                               }
                                          #odition.notes.Note {
                                                               :degree 2
                                                               :flat? false
                                                               :octave 2
                                                               }]}

                                 {:root #odition.notes.Note {
                                                             :degree 1
                                                             :flat? false
                                                             :octave 2
                                                             }
                                  :scale [#odition.notes.Note {
                                                               :degree 1
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 2
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 3
                                                               :flat? true
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 4
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 5
                                                               :flat? false
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 6
                                                               :flat? true
                                                               :octave nil
                                                               }
                                          #odition.notes.Note {
                                                               :degree 7
                                                               :flat? true
                                                               :octave nil
                                                               }]
                                  :notes [#odition.notes.Note {
                                                               :degree 6
                                                               :flat? true
                                                               :octave 4
                                                               }
                                          #odition.notes.Note {
                                                               :degree 5
                                                               :flat? false
                                                               :octave 4
                                                               }
                                          #odition.notes.Note {
                                                               :degree 1
                                                               :flat? false
                                                               :octave 2
                                                               }
                                          #odition.notes.Note {
                                                               :degree 4
                                                               :flat? false
                                                               :octave 5
                                                               }]}]
   scales/major-scale-k [{:root #odition.notes.Note {
                                                     :degree 7
                                                     :flat? true
                                                     :octave 3
                                                     }
                          :scale [#odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 2
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave nil
                                                       }]
                          :notes [#odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave 3
                                                       }
                                  #odition.notes.Note {
                                                       :degree 2
                                                       :flat? false
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? false
                                                       :octave 4
                                                       }]}
                         {:root #odition.notes.Note {
                                                     :degree 2
                                                     :flat? false
                                                     :octave 4
                                                     }
                          :scale [#odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 2
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave nil
                                                       }]
                          :notes [#odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave 2
                                                       }
                                  #odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave 1
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? false
                                                       :octave 3
                                                       }]}
                         {:root #odition.notes.Note {
                                                     :degree 7
                                                     :flat? true
                                                     :octave 2
                                                     }
                          :scale [#odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 2
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave nil
                                                       }]
                          :notes [#odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave 3
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave 2
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? false
                                                       :octave 2
                                                       }
                                  #odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave 5
                                                       }]}]})

(def dictations2
  {scales/major-scale-k [{:root #odition.notes.Note {
                                                     :degree 7
                                                     :flat? true
                                                     :octave 3
                                                     }
                          :scale [#odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 2
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave nil
                                                       }]
                          :notes [#odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? true
                                                       :octave 3
                                                       }
                                  #odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? true
                                                       :octave 4
                                                       }]}

                         {:root #odition.notes.Note {
                                                     :degree 7
                                                     :flat? true
                                                     :octave 3
                                                     }
                          :scale [#odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 2
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave nil
                                                       }]
                          :notes [#odition.notes.Note {
                                                       :degree 2
                                                       :flat? true
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? false
                                                       :octave 3
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? true
                                                       :octave 4
                                                       }]}
                         {:root #odition.notes.Note {
                                                     :degree 7
                                                     :flat? true
                                                     :octave 3
                                                     }
                          :scale [#odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 2
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 3
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 4
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 5
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? false
                                                       :octave nil
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave nil
                                                       }]
                          :notes [#odition.notes.Note {
                                                       :degree 2
                                                       :flat? false
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 6
                                                       :flat? true
                                                       :octave 3
                                                       }
                                  #odition.notes.Note {
                                                       :degree 1
                                                       :flat? false
                                                       :octave 5
                                                       }
                                  #odition.notes.Note {
                                                       :degree 7
                                                       :flat? false
                                                       :octave 4
                                                       }]}]})


(comment
  (cljs.tools.reader.edn/read-string "#ee [a4^ddd]")

  [(a4 )]

  
  )

(comment

  (def notes-dictations (atom {}))

  (defn- swap-notes-dictation [dictation-name dictation]
    (swap! notes-dictations assoc dictation-name dictation))

  (notes-parser/make-dictation
   #odition.notes.Note {:degree 7
                        :flat? false
                        :octave 3}
   scales/minor-dorian-scale
   4
   "autumn_leaves_melody-unnamed-staff.notes"
   (partial swap-notes-dictation "autumn_leaves_melody-unnamed-staff.notes"))

  (def test-dictation {:root #odition.notes.Note {
                                                  :degree 1
                                                  :flat? false
                                                  :octave 3
                                                  }
                       :scale [#odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave nil
                                                    }
                               #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave nil
                                                    }
                               #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave nil
                                                    }
                               #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave nil
                                                    }
                               #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave nil
                                                    }
                               #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave nil
                                                    }
                               #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave nil
                                                    }]
                       :notes [[{:degree 3
                                 :flat? false
                                 :octave 3
                                 :unit 4
                                 :duration 1}
                                {:degree 6
                                 :flat? false
                                 :octave 3
                                 :unit 4
                                 :duration 1}
                                {:degree 1
                                 :flat? false
                                 :octave 4
                                 :unit 4
                                 :duration 1}
                                {:degree 5
                                 :flat? false
                                 :octave 3
                                 :unit 4
                                 :duration 1}]
                               [{:degree 6
                                 :flat? false
                                 :octave 2
                                 :unit 4
                                 :duration 2}
                                {:degree 1
                                 :flat? false
                                 :octave 3
                                 :unit 4
                                 :duration 2}
                                {:degree 5
                                 :flat? true
                                 :octave 3
                                 :unit 4
                                 :duration 2}]
                               [{:degree 6
                                 :flat? false
                                 :octave 2
                                 :unit 4
                                 :duration 2}
                                {:degree 1
                                 :flat? false
                                 :octave 3
                                 :unit 4
                                 :duration 2}
                                {:degree 5
                                 :flat? true
                                 :octave 3
                                 :unit 4
                                 :duration 2}]]}))


(def dictations-2 [{:root #odition.notes.Note{:degree 6, :flat? true, :octave 2}, :scale [#odition.notes.Note{:degree 1, :flat? false, :octave nil} #odition.notes.Note{:degree 2, :flat? false, :octave nil} #odition.notes.Note{:degree 3, :flat? false, :octave nil} #odition.notes.Note{:degree 4, :flat? false, :octave nil} #odition.notes.Note{:degree 5, :flat? false, :octave nil} #odition.notes.Note{:degree 6, :flat? false, :octave nil} #odition.notes.Note{:degree 7, :flat? false, :octave nil}], :notes [#odition.notes.Note{:degree 3, :flat? false, :octave 4} #odition.notes.Note{:degree 2, :flat? true, :octave 3}]}
                   
                   {:root #odition.notes.Note{:degree 2, :flat? true, :octave 4}, :scale [#odition.notes.Note{:degree 1, :flat? false, :octave nil} #odition.notes.Note{:degree 2, :flat? false, :octave nil} #odition.notes.Note{:degree 3, :flat? false, :octave nil} #odition.notes.Note{:degree 4, :flat? false, :octave nil} #odition.notes.Note{:degree 5, :flat? false, :octave nil} #odition.notes.Note{:degree 6, :flat? false, :octave nil} #odition.notes.Note{:degree 7, :flat? false, :octave nil}], :notes [#odition.notes.Note{:degree 5, :flat? false, :octave 5} #odition.notes.Note{:degree 6, :flat? true, :octave 3}]}

                   {:root #odition.notes.Note{:degree 4, :flat? false, :octave 4}, :scale [#odition.notes.Note{:degree 1, :flat? false, :octave nil} #odition.notes.Note{:degree 2, :flat? false, :octave nil} #odition.notes.Note{:degree 3, :flat? false, :octave nil} #odition.notes.Note{:degree 4, :flat? false, :octave nil} #odition.notes.Note{:degree 5, :flat? false, :octave nil} #odition.notes.Note{:degree 6, :flat? false, :octave nil} #odition.notes.Note{:degree 7, :flat? false, :octave nil}], :notes [#odition.notes.Note{:degree 3, :flat? true, :octave 4} #odition.notes.Note{:degree 7, :flat? true, :octave 3}]}

                   {:root #odition.notes.Note{:degree 2, :flat? false, :octave 6}, :scale [#odition.notes.Note{:degree 1, :flat? false, :octave nil} #odition.notes.Note{:degree 2, :flat? false, :octave nil} #odition.notes.Note{:degree 3, :flat? false, :octave nil} #odition.notes.Note{:degree 4, :flat? false, :octave nil} #odition.notes.Note{:degree 5, :flat? false, :octave nil} #odition.notes.Note{:degree 6, :flat? false, :octave nil} #odition.notes.Note{:degree 7, :flat? false, :octave nil}], :notes [#odition.notes.Note{:degree 3, :flat? true, :octave 4} #odition.notes.Note{:degree 5, :flat? true, :octave 5}]}

                   {:root #odition.notes.Note{:degree 6, :flat? false, :octave 3}, :scale [#odition.notes.Note{:degree 1, :flat? false, :octave nil} #odition.notes.Note{:degree 2, :flat? false, :octave nil} #odition.notes.Note{:degree 3, :flat? false, :octave nil} #odition.notes.Note{:degree 4, :flat? false, :octave nil} #odition.notes.Note{:degree 5, :flat? false, :octave nil} #odition.notes.Note{:degree 6, :flat? false, :octave nil} #odition.notes.Note{:degree 7, :flat? false, :octave nil}], :notes [#odition.notes.Note{:degree 5, :flat? false, :octave 5} #odition.notes.Note{:degree 7, :flat? true, :octave 1}]}

                   {:root #odition.notes.Note{:degree 5, :flat? false, :octave 5}, :scale [#odition.notes.Note{:degree 1, :flat? false, :octave nil} #odition.notes.Note{:degree 2, :flat? false, :octave nil} #odition.notes.Note{:degree 3, :flat? false, :octave nil} #odition.notes.Note{:degree 4, :flat? false, :octave nil} #odition.notes.Note{:degree 5, :flat? false, :octave nil} #odition.notes.Note{:degree 6, :flat? false, :octave nil} #odition.notes.Note{:degree 7, :flat? false, :octave nil}], :notes [#odition.notes.Note{:degree 3, :flat? true, :octave 2} #odition.notes.Note{:degree 6, :flat? false, :octave 4}]}

                   {:root #odition.notes.Note{:degree 3, :flat? true, :octave 3}, :scale [#odition.notes.Note{:degree 1, :flat? false, :octave nil} #odition.notes.Note{:degree 2, :flat? false, :octave nil} #odition.notes.Note{:degree 3, :flat? false, :octave nil} #odition.notes.Note{:degree 4, :flat? false, :octave nil} #odition.notes.Note{:degree 5, :flat? false, :octave nil} #odition.notes.Note{:degree 6, :flat? false, :octave nil} #odition.notes.Note{:degree 7, :flat? false, :octave nil}], :notes [#odition.notes.Note{:degree 2, :flat? true, :octave 3} #odition.notes.Note{:degree 4, :flat? false, :octave 4}]}])

(def all-dictations-2  [{:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 6
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 6
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? true
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 6
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? true
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? true
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 6
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 6
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? true
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 6
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? true
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? true
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? true
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 0
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 6
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? true
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 6
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 6
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 4
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 3
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? true
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 5
                                                    :flat? true
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? true
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 1
                                                    :flat? false
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 6
                                                    :flat? true
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 4
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 5
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 3
                                                      }
                                 #odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 3
                                                      :flat? true
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 6
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 2
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 6
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 4
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? true
                                                    :octave 3
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 2
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 6
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave 1
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? true
                                                      :octave 5
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 2
                                                    :flat? false
                                                    :octave 4
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave 5
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 3
                                                    :flat? false
                                                    :octave 1
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 6
                                                      :flat? true
                                                      :octave 6
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? true
                                                      :octave 1
                                                      }]}
                        {:root #odition.notes.Note {
                                                    :degree 7
                                                    :flat? true
                                                    :octave 0
                                                    }
                         :scale [#odition.notes.Note {
                                                      :degree 1
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 3
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 5
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 6
                                                      :flat? false
                                                      :octave nil
                                                      }
                                 #odition.notes.Note {
                                                      :degree 7
                                                      :flat? false
                                                      :octave nil
                                                      }]
                         :notes [#odition.notes.Note {
                                                      :degree 4
                                                      :flat? false
                                                      :octave 2
                                                      }
                                 #odition.notes.Note {
                                                      :degree 2
                                                      :flat? true
                                                      :octave 2
                                                      }]}])
