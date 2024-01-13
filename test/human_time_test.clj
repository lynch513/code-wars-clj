(ns human-time-test
  (:require [clojure.test :refer [deftest are]]
            [human-time :refer [human-readable]]))

(deftest human-time-tests
  (are [seconds expected] (= (human-readable seconds) expected)
    0 "00:00:00"
    59 "00:00:59"
    60 "00:01:00"
    90 "00:01:30"
    86399 "23:59:59"
    359999 "99:59:59"))
