(ns armstrong-numbers)

(defn exp [x n]
  (reduce * (repeat n x)))

(defn get-digits-from-number [n]
  (map #(Integer/parseInt (str %)) (seq (str n))))

(defn exp-int-list [list, power]
  (map #(exp % power) list))

(defn armstrong? [num]
    (= num 
      (let [digits (get-digits-from-number num)
            length (count digits)] 
        (apply + (exp-int-list digits length)))))