package org.p99.scala

import org.scalatest.Matchers._
import org.scalatest._

class P12Spec extends UnitSpec with ListTestRunner[(Int, Int), List[Int]] {

  "P12" should "decode run-length encoded list" in {
    test(List((4,1), (1,2), (2,3), (2,1), (1,4), (4,5))) should equal (
      List(1,1,1,1,2,3,3,1,1,4,5,5,5,5)
    )

    test(List((1,1), (1,2), (1,3), (1,4), (1,5))) should equal (
      List(1,2,3,4,5)
    )
  }

  override def test(list: List[(Int, Int)]): List[Int] = P12.decode(list)
}

