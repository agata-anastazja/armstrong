(ns armstrong-numbers)

(defn exp [x n]
  (reduce * (repeat n x)))

(defn getDigitFromNumber [s index]
  (Integer/parseInt (str (nth s index)) ))

(defn get-digits-from-number [n]
  (map #(Integer/parseInt (str %)) (seq (str n))))

(defn expBasedOnBaseAsString [int-as-str index power]
  (exp (getDigitFromNumber int-as-str index) power))

(defn armstrong? [num]
    (= num 
      (let [int-as-str (str num)
            power (count int-as-str)]
        (loop [ index 0
                acc   0]
          (if (= index power)
            acc
            (recur  (inc index) 
                    (+ acc (expBasedOnBaseAsString int-as-str index power))))))))
