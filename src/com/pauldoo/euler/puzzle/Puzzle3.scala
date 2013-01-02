package com.pauldoo.euler.puzzle
import java.math.BigInteger
import com.pauldoo.euler.common.Primes.primeFactors;

object Puzzle3 extends Puzzle {
  def answer() = {
    primeFactors(new BigInt(new BigInteger("600851475143"))).last;
  }
}