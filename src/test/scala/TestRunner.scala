package org.p99.scala

trait ListTestRunner[E, R] {
  def test(list: List[E]): R
}
