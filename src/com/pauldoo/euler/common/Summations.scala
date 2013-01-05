package com.pauldoo.euler.common

object Summations {
  def sum(range: Range): BigInt = {
    // TODO: Replace with Range.sum(..) ?
    val actualLast = range.head + range.step * (range.length - 1);
    ((range.head + actualLast) * (range.length)) / 2;
  }

  // Sum of k^2 for k = 0 to n
  def sumOfSquares(n: BigInt): BigInt = {
    (n * (n + 1) * (2 * n + 1)) / 6;
  }
}