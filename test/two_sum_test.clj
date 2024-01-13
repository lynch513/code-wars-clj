(ns two-sum-test
  (:require [clojure.test :refer [deftest are]]
            [two-sum :refer [two-sum]]))

(deftest two-sum-tests
  (are [seq target expected] (= (two-sum seq target) expected)
    [1 2 3] 4 [0 2]
    [1234 5678 9012] 14690 [1 2]
    [2 2 3] 4 [0 1]))
