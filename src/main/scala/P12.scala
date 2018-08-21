package org.p99.scala

/* Decode a run-length encoded list.
 * Given a run-length code list generated as specified in problem P10,
 * construct its uncompressed version.
 */
object P12 {

  def decode[E](encoded: List[(Int, E)]): List[E] = {
    encoded.flatMap { case (n, elem) =>
      for (_ <- 0 until n) yield elem
    }
  }

}
