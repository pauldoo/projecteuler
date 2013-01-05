package com.pauldoo.euler.common

object Naturals {
  def integersFrom[A](n: A)(implicit numeric: Integral[A]): Stream[A] =
    n #:: integersFrom(numeric.plus(n, numeric.one));
}
