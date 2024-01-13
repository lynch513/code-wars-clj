(ns reduce-but-grow-test
  (:require [reduce-but-grow :refer [reduce-but-grow]]
            [clojure.test :refer [deftest testing is]]))

(deftest reduce-but-grow-test
  (testing "return the result of multiplying the values together"
    (is (= (reduce-but-grow [1 2 3 4]) 24))
    (is (= (reduce-but-grow [5]) 5))
    (is (= (reduce-but-grow [5 6]) 30))
    (is (= (reduce-but-grow [4 5 6]) 120))))
