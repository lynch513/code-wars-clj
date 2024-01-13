(ns remove-url-anchor-test
  (:require [clojure.test :refer [deftest are]]
            [remove-url-anchor :refer [remove-url-anchor]]))

(deftest remove-url-anchor-tests
  (are [url expected] (= (remove-url-anchor url) expected)
    "test1#test2" "test1"
    "www.codewars.com#about" "www.codewars.com"
    "www.codewars.com/katas/?page=1#about" "www.codewars.com/katas/?page=1"
    "www.codewars.com/katas/" "www.codewars.com/katas/"))
