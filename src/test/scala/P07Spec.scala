package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P07Spec extends UnitSpec with ListTestRunner[Any, List[Int]] {

  "P07" should "flatten 0-depth list" in {
    test(List(0)) should equal (List(0))
    test(List(0,1,2)) should equal (List(0,1,2))
  }

  "P07" should "flatten 1-depth list" in {
    test(List(List(0))) should equal (List(0))
    test(List(List(0), List(1))) should equal (List(0,1))
  }

  "P07" should "flatten mix of 0 or 1 depth list" in {
    test(List(List(0),1,2)) should equal (List(0,1,2))
    test(List(0,List(1),List(2))) should equal (List(0,1,2))
  }

  "P07" should "flatten more complicated list" in {
    test(List(List(1, 1), 2, List(3, List(5, 8)))) should equal (List(1, 1, 2, 3, 5, 8))
  }

  override def test(list: List[Any]): List[Int] = P07.flatten(list)
}
