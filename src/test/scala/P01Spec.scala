package org.p99.scala

import org.scalatest.Matchers._

class P01Spec extends UnitSpec with ListTestRunner[Int, Int] {

  "P01" should "return the last element of list" in {
    test(List(0)) should equal (0)
    test(List(0,1,2,3,4)) should equal (4)
  }

  "P01" should "produce an Exception with empty inputs" in {
    intercept[NoSuchElementException] {
      test(List())
    }

    intercept[NoSuchElementException] {
      test(Nil)
    }
  }

  override def test(list: List[Int]): Int = P01.last(list)
}
