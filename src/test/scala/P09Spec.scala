package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P09Spec extends UnitSpec with ListTestRunner[Int, List[List[Int]]] {

  "P09" should "pack duplicates of elements" in {
    test(List(1,1,1,1, 2, 3,3, 1,1, 4, 5,5,5,5)) should equal (
      List(
        List(1,1,1,1), List(2), List(3,3), List(1,1), List(4), List(5,5,5,5)
      ))
  }

  "P09" should "not pack a list that doesn't have duplicates" in {
    test(List(1,2,3,4,5)) should equal (
      List(List(1),List(2),List(3),List(4),List(5)
    ))
  }

  "P09" should "not fail with empty lists" in {
    test(List()) should equal (List())
    test(Nil) should equal (List())
  }

  override def test(list: List[Int]): List[List[Int]] = P09.pack(list)
}

