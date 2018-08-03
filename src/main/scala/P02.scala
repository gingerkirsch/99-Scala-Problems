package org.p99.scala

/* Find the last but one element of a list. */
object P02 {

  def penultimate[E](list: List[E]): E = list.reverse.tail.head

}
