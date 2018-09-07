package org.p99.scala

/* Rotate a list N places to the left. */
object P19 {

  def rotate[E](n: Int, list: List[E]): List[E] = {
    if (n == 0) {
      list
    } else {
      // Make sure n1 > 0
      val len = list.size
      val n1 = if (n > 0) n % len else (n + len) % len

      val (head, tail) = (list.head, list.tail)
      rotate(n1 - 1, tail :+ head)
    }
  }
}
