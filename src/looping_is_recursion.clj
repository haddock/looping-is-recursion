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
  ":(")

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

