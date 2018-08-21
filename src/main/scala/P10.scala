package org.p99.scala

/* Run-length encoding of a list.
 * Use the result of problem P09 to implement the so-called run-length encoding data compression method.
 * Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of
 * duplicates of the element E.
 */
object P10 {

  def encode[E](list: List[E]): List[(Int, E)] = {
    P09.pack(list)
      .map(elem => (elem.size, elem.head))
  }

}
