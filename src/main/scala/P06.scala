package org.p99.scala

import scala.util.Try

/* Find out whether a list is a palindrome. */
object P06 {

  def isPalindrome[E](list: List[E]): Boolean = {
    (list.size <= 1) || (Try {
      val head = list.head
      val last = P01.last(list)
      (head == last) && isPalindrome(list.slice(1, list.size - 1))
    } getOrElse false)
  }

}
