package org.p99.scala

/* Find the Kth element of a list. */
object P03 {

  def nth[E](n: Int, list: List[E]): E = {
    // n=3 (!= 0) 1,2,3,4
    // n=2 (!= 0) 2,3,4
    // n=1 (!= 0) 3,4
    // n=0 (== 0) --> 3

    var tail = list
    var pointer = n
    while (pointer > 0 && tail.nonEmpty) {
      tail = tail.tail
      pointer -= 1
    }

    tail.head
  }
}
