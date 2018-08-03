package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P02Spec extends UnitSpec with ListTestRunner[Int, Int] {

  "P02" should "work with lists that have more than 2 elements" in {
    test(List(0,1)) should equal (0)
    test(List(0,1,2,3,4)) should equal (3)
  }

  "P02" should "produce an Exception with 0-1 elements" in {
    interceptAll {
      test(List())
    }

    interceptAll {
      test(List(0))
    }
  }

  override def test(list: List[Int]): Int = P02.penultimate(list)
}

