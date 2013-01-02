package com.pauldoo.euler.puzzle
import java.math.BigInteger
import com.pauldoo.euler.common.Summations._;

object Puzzle1 extends Puzzle {
  def answer(): BigInt = {
    val range = 0 until 1000;
    sum(range by 3) + sum(range by 5) - sum(range by 15);
  }
}