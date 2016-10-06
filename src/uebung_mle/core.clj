(ns uebungmle.core
  (:gen-class))


(def cols 100)
(def rows 100)

(defn getCities [m cityCol cityRow]
  (nth m (+ cityCol (* cols cityRow))))

(defn create-map [nr]
  (vec (map (fn [x] 
              (if (=  (quot x cols) (mod x cols) )
                0
                (rand-int 25)))
            (range (* nr nr)))))


(defn -main []
  
  (println "Hello, World!"))



