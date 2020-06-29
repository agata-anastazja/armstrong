(ns armstrong-numbers)

(defn exp [base pow]
  (reduce * (repeat pow base)))

(defn- num->digits [n]
  (mapv #(Character/digit ^Character % 10) (str n)))

(defn armstrong? [n]
  (let [digits (num->digits n)
        length (count digits)
        xf     (map #(exp % length))]
    (->
     (transduce xf + digits)
     (= n))))
