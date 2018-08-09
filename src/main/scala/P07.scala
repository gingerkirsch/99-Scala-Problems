package org.p99.scala

/* Flatten a nested list structure. */
object P07 {

  def flatten(list: List[Any]): List[Int] = {
    if (list.isEmpty) Nil // end condition of recursion
    else flattenOne(list.head) ++ flatten(list.tail)
  }

  /**
    * @param elem can be an integer or a list
    */
  private def flattenOne(elem: Any): List[Int] = {
    elem match {
      case integer: Int => List(integer)
      case _ => flatten(elem.asInstanceOf[List[Any]])
    }
  }
}
