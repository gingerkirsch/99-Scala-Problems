package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P06Spec extends UnitSpec with ListTestRunner[Int, Boolean] {

  "P06" should "return true on palindromic lists" in {
    test(List(1)) should equal (true)
    test(List(0,1,0)) should equal (true)
    test(List(0,0)) should equal (true)
    test(List(0,1,1,0)) should equal (true)
  }

  "P06" should "return false on non-palindromic lists" in {
    test(List(0,1)) should equal (false)
    test(List(0,1,2,3)) should equal (false)
    test(List(0,1,0,1)) should equal (false)
  }

  "P06" should "return true on empty lists" in {
    test(List()) should equal (true)
    test(Nil) should equal (true)
  }

  override def test(list: List[Int]): Boolean = P06.isPalindrome(list)
}

