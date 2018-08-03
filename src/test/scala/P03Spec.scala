package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P03Spec extends UnitSpec {
  import P03.nth

  "P03" should "work with non-empty list, n less than list's length" in {
    nth(0, List(0,1,2,3)) should equal (0)
    nth(1, List(0,1,2,3)) should equal (1)
    nth(2, List(0,1,2,3)) should equal (2)
    nth(3, List(0,1,2,3)) should equal (3)
  }

  "P03" should "produce an Exception when n >= list.size" in {
    interceptAll {
      nth(1, List(0))
    }
  }
}
