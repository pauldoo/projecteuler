package com.pauldoo.euler.common

object Naturals {
  def integersFrom(n: BigInt): Stream[BigInt] = n #:: integersFrom(n + 1);
}
