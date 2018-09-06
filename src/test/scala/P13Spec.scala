package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P13Spec extends UnitSpec with ListTestRunner[Int, List[(Int, Int)]] {

  "P13" should "do run-length encoding" in {
    test(List(1,1,1,1, 2, 3,3, 1,1, 4, 5,5,5,5)) should equal (
      List((4,1), (1,2), (2,3), (2,1), (1,4), (4,5))
    )

    test(List(1,2,3,4,5)) should equal (
      List((1,1), (1,2), (1,3), (1,4), (1,5))
    )
  }

  override def test(list: List[Int]): List[(Int, Int)] = P13.encodeDirect(list)
}

