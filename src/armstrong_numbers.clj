(ns armstrong-numbers)

(defn exp [x n]
  (reduce * (repeat n x)))

(defn expBasedOnBaseAsString [int-as-str n]
  (exp (Integer/parseInt (nth int-as-str n)) n))

(defn armstrong? [num]
    (= num 
      (let [int-as-str (str num)
            power (count (str num))]
        (loop [ index 0
                acc   0]
          (if (= index (count int-as-str))
            acc
            (recur  (inc index) 
                    (+ acc (exp (Integer/parseInt (str (nth int-as-str index))) power ))))))))
