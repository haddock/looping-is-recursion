(ns looping-is-recursion)

(defn power [base exp]
  (if (zero? exp)
    1
    (let [helper (fn [acc n k]
                   (if (zero? k)
                     acc
                     (recur (* acc n) n (dec k))))]
      (helper base base (dec exp)))))

(defn last-element [a-seq]
  (let [tail (rest a-seq)]
    (if (empty? tail)
      (first a-seq)
      (recur tail))))

(defn seq= [seq1 seq2]
  (cond
   (and (empty? seq1) (empty? seq2)) true
   (or (empty? seq1) (empty? seq2)) false
   (not= (first seq1) (first seq2)) false
   :else (recur (rest seq1) (rest seq2))))

(defn find-first-index [pred a-seq]
  (loop [i 0 s a-seq]
    (cond
     (empty? s) nil
     (pred (first s)) i
     :else (recur (inc i) (rest s)))))

(defn avg [a-seq]
  (loop [acc 0 counter 0 s a-seq]
    (cond
     (empty? s) (/ acc counter)
     :else (recur (+ acc (first s)) (inc counter) (rest s)))))

(defn- toggle [a-set elem]
  (if (contains? a-set elem)
    (disj a-set elem)
    (conj a-set elem)))

(defn parity [a-seq]
  (loop [res '#{} s a-seq]
    (if (empty? s) res
     (recur (toggle res (first s)) (rest s)))))

(defn fast-fibo [n]
  (if (<= n 1)
    n
    (loop [x 1 y 0 count 2]
      (if (= count n)
        (+ x y)
        (recur (+ x y) x (inc count))))))


(defn cut-at-repetition [a-seq]
  [":("])

