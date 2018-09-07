package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P19Spec extends UnitSpec {
  "P19" should "rotate to the right" in {
    val input = List(1,2,3,4,5,6)
    P19.rotate(0, input) should equal (List(1,2,3,4,5,6))
    P19.rotate(1, input) should equal (List(2,3,4,5,6,1))
    P19.rotate(2, input) should equal (List(3,4,5,6,1,2))
    P19.rotate(3, input) should equal (List(4,5,6,1,2,3))
    P19.rotate(7, input) should equal (List(2,3,4,5,6,1))
  }

  "P19" should "rotate to the left" in {
    val input = List(1,2,3,4,5,6)
    P19.rotate(0, input) should equal (List(1,2,3,4,5,6))
    P19.rotate(-1, input) should equal (List(6,1,2,3,4,5))
    P19.rotate(-2, input) should equal (List(5,6,1,2,3,4))
    P19.rotate(-3, input) should equal (List(4,5,6,1,2,3))
  }
}

