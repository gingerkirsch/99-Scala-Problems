package org.p99.scala

/* Duplicate the elements of a list a given number of times.
 */
object P15 {

  def duplicateN[E](n: Int, list: List[E]): List[E] = {
    list.foldRight[List[E]](Nil) { case (elem, accum) =>
      val dups = for (_ <- 0 until n) yield elem
      dups ++: accum
    }
  }

}
