package org.p99.scala

/* Run-length encoding of a list (direct solution).
 * Implement the so-called run-length encoding data compression method directly.
 * I.e. don't use other methods you've written (like P09's pack); do all the work directly.
 */
object P13 {
  def encodeDirect[E](list: List[E]): List[(Int, E)] = {
    list.foldRight[List[(Int, E)]](Nil) { case (elem, accum) =>
      if (accum.isEmpty) (1, elem) +: accum
      else {
        val head = accum.head
        if (elem.equals(head._2)) (head._1 + 1, head._2) +: accum.tail
        else (1, elem) +: accum
      }
    }
  }
}
