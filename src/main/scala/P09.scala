package org.p99.scala

/* Pack consecutive duplicates of list elements into sublists.
 * If a list contains repeated elements they should be placed in separate sublists.
 */
object P09 {

  def pack[E](list: List[E]): List[List[E]] = {

    var list2: List[E] = list

    var result: List[List[E]] = List()
    var dups: List[E] = List()

    while (list2.nonEmpty) {
      val head = list2.head
      list2 = list2.tail

      if (dups.isEmpty || dups.head == head) { // extend current list
        dups = dups :+ head
      } else { // start new list
        result = result :+ dups
        dups = List(head)
      }
    }

    if (dups.nonEmpty) result :+ dups else result
  }
}
