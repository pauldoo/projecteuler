package com.pauldoo.euler.common
import com.pauldoo.euler.common.Naturals.positiveNaturals;

object Primes {
  val primes: Stream[BigInt] = seive(positiveNaturals.drop(1));

  def primeFactors(n: BigInt): Stream[BigInt] = primeFactorsImp(n, primes);

  private def seive(list: Stream[BigInt]): Stream[BigInt] = {
    val head = list.head;
    head #:: seive(list.tail.filter(_ % head != 0));
  }

  private def primeFactorsImp(n: BigInt, primes: Stream[BigInt]): Stream[BigInt] = {
    assert(n >= 1);
    if (n == 1) {
      Stream.Empty
    } else {
      val remainingPrimes = primes.dropWhile(n % _ != 0);
      val factor = remainingPrimes.head;
      factor #:: primeFactorsImp(n / factor, remainingPrimes);
    }
  }
}