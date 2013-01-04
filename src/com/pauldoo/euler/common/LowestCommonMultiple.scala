package com.pauldoo.euler.common

object LowestCommonMultiple {
  def lowestCommonMultiple(values: Seq[BigInt]): BigInt = {
    val primeFactorisations: Seq[List[Int]] = values.map(Primes.primeFactorPowers);
    val resultPrimeFactorisation: List[Int] = primeFactorisations.reduce(maxLists);
    Primes.primeFactorPowersToNumber(resultPrimeFactorisation);
  }

  private def maxLists(t: List[Int], u: List[Int]) = t.zipAll(u, 0, 0).map { e => e._1.max(e._2) };
}