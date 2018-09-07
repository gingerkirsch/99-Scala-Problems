package org.p99.scala

import org.scalatest._
import org.scalatest.Matchers._

class P23Spec extends UnitSpec {

  "P23" should "create random subset" in {
    val input = List(1,2,3,4,5,6,7)
    val n = 3

    val output1 = P23.randomSelect(n, input)
    val output2 = P23.randomSelect(n, input)

    output1.size should equal (n)
    output2.size should equal (n)

    output1 shouldNot equal (output2)
  }

}

