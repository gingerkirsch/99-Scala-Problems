package org.p99.scala

/* Eliminate consecutive duplicates of list elements.
 * If a list contains repeated elements they should be replaced with a single copy of the element.
 * The order of the elements should not be changed.
 */
object P08 {

  def compress[E](list: List[E]): List[E] = compareWithTarget(list.head, list.tail)

  def compareWithTarget[E](target: E, list: List[E]): List[E] = {
    if (list.isEmpty) List(target)
    else if (target == list.head) compareWithTarget(target, list.tail)
    else List(target) ++ compress(list)
  }

}
