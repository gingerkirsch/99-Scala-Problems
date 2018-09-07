package org.p99.scala

import scala.util.Random

/* Extract a given number of randomly selected elements from a list. */
object P23 {

  def randomSelect[E](n: Int, list: List[E]): List[E] = randomSelect1(n, list, Nil)

  private def randomSelect1[E](n: Int, list: List[E], result: List[E]): List[E] = {
    if (n == 0) result
    else {
      // Be careful to choose 0 or positive integer
      val randIdx = Math.abs(new Random().nextInt()) % list.length
      val (subset, removed) = P20.removeAt(randIdx, list)
      randomSelect1(n - 1, subset, result :+ removed)
    }
  }

}
