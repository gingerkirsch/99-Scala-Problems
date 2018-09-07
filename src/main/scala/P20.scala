package org.p99.scala

/* Remove the Kth element from a list.
 * Return the list and the removed element in a Tuple.
 * Elements are numbered from 0.
 */
object P20 {

  // Assumed that n is less than list.size
  def removeAt[E](n: Int, list: List[E]): (List[E], E) = splitAndRemove(n, Nil, list)

  private def splitAndRemove[E](n: Int, list1: List[E], list2: List[E]): (List[E], E) = {
    if (n == 0) {
      (list1 ++ list2.tail, list2.head)
    } else {
      splitAndRemove(n - 1, list1 :+ list2.head, list2.tail)
    }
  }
}
