package com.pauldoo.euler.puzzle
import java.math.BigInteger

object Puzzle1 extends Puzzle {

  def answer(): BigInt = {
    val values = for (i <- 1 until 1000 if (i % 3) == 0 || (i % 5) == 0) yield intToBigInt(i);
    values.reduce(_ + _);
  }

  def intToBigInt(v: Long): BigInt = new BigInt(BigInteger.valueOf(v));
}