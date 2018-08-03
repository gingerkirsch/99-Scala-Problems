package org.p99.scala

/* Find the last element of a list. */
object P01 {

  def last[E](list: List[E]): E = list.reverse.head

}
