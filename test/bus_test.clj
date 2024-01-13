(ns bus-test
  (:require [clojure.test :refer [deftest are is]]
            [bus :refer [number]]))

(deftest number-tests
  (are [seq expected] (= (number seq) expected)
    [[10 0] [3 5] [5 8]] 5
    [[3 0] [9 1] [4 10] [12 2] [6 1] [7 10]] 17
    [[3 0] [9 1] [4 8] [12 2] [6 1] [7 8]] 21))
