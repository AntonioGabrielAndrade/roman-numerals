(ns roman-numerals.core
  (:gen-class))

(def base-numerals [["M" 1000] ["CM" 900] ["D" 500] ["CD" 400]
                    ["C" 100] ["XC" 90] ["L" 50] ["XL" 40]
                    ["X" 10] ["IX" 9] ["V" 5] ["IV" 4]
                    ["I" 1]])

(defn num-contains-base-numeral? [num base-numeral]
  (>= num (second base-numeral)))

(defn append-numeral-to-result [result numeral]
  (str result (first numeral)))

(defn subtract-numeral-from-num [num numeral]
  (- num (second numeral)))

(defn to-roman [number]
  (loop  [[numeral & others :as numerals] base-numerals
          result ""
          num number]

    (if (zero? num)
      result
      (if (num-contains-base-numeral? num numeral)
          (let [new-result (append-numeral-to-result result numeral)
                new-num (subtract-numeral-from-num num numeral)]
            (recur numerals new-result new-num))
          (recur others result num)))))