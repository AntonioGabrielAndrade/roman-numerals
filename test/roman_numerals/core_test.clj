(ns roman-numerals.core-test
  (:require [clojure.test :refer :all]
            [roman-numerals.core :refer :all]))

(deftest to-roman-test
  (testing "can convert decimal number to roman numeral"
    (is (= "I" (to-roman 1)))
    (is (= "II" (to-roman 2)))
    (is (= "III" (to-roman 3)))
    (is (= "IV" (to-roman 4)))
    (is (= "V" (to-roman 5)))
    (is (= "VI" (to-roman 6)))
    (is (= "VII" (to-roman 7)))
    (is (= "VIII" (to-roman 8)))
    (is (= "IX" (to-roman 9)))
    (is (= "X" (to-roman 10)))
    (is (= "XII" (to-roman 12)))
    (is (= "XV" (to-roman 15)))
    (is (= "XX" (to-roman 20)))
    (is (= "XXVII" (to-roman 27)))
    (is (= "L" (to-roman 50)))
    (is (= "MCMXCVIII" (to-roman 1998)))))

;(run-tests 'roman-numerals.core-test)