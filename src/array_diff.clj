(ns array-diff)

(defn array-diff [a b]
  (remove (set b) a))

(comment
  (into #{} [2 2])
  (remove #{1} [1 2])
  (array-diff [1 2] [1])

  (set [1 2])
  ((set [1 2]) 1)
  ((complement (set [1 2])) 3)
  ((set 1) [1 2])
  ([1 2] 1)

  (= (array-diff [1 2] [1]) [2])
  (= (array-diff [1 2 2] [1]) [2 2])
  (= (array-diff [1 2 2] [2]) [1])
  (= (array-diff [1 2 2] []) [1 2 2])
  (= (array-diff [1 2 3] [1 2]) [3])
  (= (array-diff [] [1 2]) []))
