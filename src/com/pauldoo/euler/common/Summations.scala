package com.pauldoo.euler.common

object Summations {
  def sum(range: Range): BigInt = {
    val actualLast = range.first + range.step * (range.length - 1);
    ((range.first + actualLast) * (range.length)) / 2;
  }
}