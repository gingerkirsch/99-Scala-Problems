package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P20Spec extends UnitSpec {

  "P20" should "remove an element and make a tuple" in {
    val input = List(0,1,2,3,4)
    P20.removeAt(0, input) should equal ((List(1,2,3,4), 0))
    P20.removeAt(1, input) should equal ((List(0,2,3,4), 1))
    P20.removeAt(2, input) should equal ((List(0,1,3,4), 2))
    P20.removeAt(4, input) should equal ((List(0,1,2,3), 4))
  }

}

