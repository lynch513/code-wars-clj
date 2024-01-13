(ns rock-paper-scissors-test
  (:require [clojure.test :refer [deftest are]]
            [rock-paper-scissors :refer [rps]]))

(deftest rock-paper-scissors-tests
 (are [p1 p2 expected] (= (rps p1 p2) expected)
   "rock" "scissors" "Player 1 won!"
   "scissors" "paper" "Player 1 won!"
   "paper" "rock" "Player 1 won!"
   "scissors" "rock" "Player 2 won!"
   "paper" "scissors" "Player 2 won!"
   "rock" "paper" "Player 2 won!"
   "rock" "rock" "Draw!"
   "paper" "paper" "Draw!"
   "scissors" "scissors" "Draw!"))
