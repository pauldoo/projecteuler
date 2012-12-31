package com.pauldoo.euler.puzzle
import java.math.BigInteger

object Puzzle1 extends Puzzle {
  def sum(range: Range): BigInt = {
    val actualLast = range.first + range.step * (range.length - 1);
    ((range.first + actualLast) * (range.length)) / 2;
  }

  def answer(): BigInt = {
    val range = 0 until 1000;
    sum(range by 3) + sum(range by 5) - sum(range by 15);
  }
}