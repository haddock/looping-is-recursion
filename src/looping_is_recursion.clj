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

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

