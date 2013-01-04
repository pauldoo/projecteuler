package com.pauldoo.euler.puzzle
import com.pauldoo.euler.common.Primes
import com.pauldoo.euler.common.LowestCommonMultiple.lowestCommonMultiple
import java.math.BigInteger

object Puzzle5 extends Puzzle {
  def answer(): BigInt = {
    lowestCommonMultiple(Range(1, 20).map{n => new BigInt(BigInteger.valueOf(n))});
  }
}