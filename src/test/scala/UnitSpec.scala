package org.p99.scala

import org.scalatest._

abstract class UnitSpec extends FlatSpec {
  def interceptAll(f: => Any) = intercept[RuntimeException](f)
}
