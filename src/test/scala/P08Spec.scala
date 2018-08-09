package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P08Spec extends UnitSpec with ListTestRunner[Int, List[Int]] {

  "P08" should "return the same as the input when input has no dups" in {
    test(List(0,1,2,3)) should equal (List(0,1,2,3))
  }

  "P08" should "remove dups and compress" in {
    test(List(0,1,1,1,1,2,3)) should equal (List(0,1,2,3))
    test(List(0,1,1,1,1,2,3,3,3,3)) should equal (List(0,1,2,3))
    test(List(0,0,0,1,1,1,1,2,3)) should equal (List(0,1,2,3))
  }

  override def test(list: List[Int]): List[Int] = {
    P08.compress(list)
  }
}

