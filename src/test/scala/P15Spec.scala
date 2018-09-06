package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P15Spec extends UnitSpec with ListTestRunner[Int, List[Int]] {

  "P15" should "add two more elements" in {
    test(List(1,2,3)) should equal (List(1,1,1,2,2,2,3,3,3))
    test(List(1)) should equal (List(1,1,1))
    test(List(1,1)) should equal (List(1,1,1,1,1,1))
    test(Nil) should equal (Nil)
  }

  override def test(list: List[Int]): List[Int] = P15.duplicateN(3, list)
}

