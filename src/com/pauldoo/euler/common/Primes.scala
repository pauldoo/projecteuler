package com.pauldoo.euler.common
import com.pauldoo.euler.common.Naturals.integersFrom

object Primes {
  val primes: Seq[Long] = primeStream(integersFrom(2), Vector.empty);

  private def primeStream(naturals: Stream[Long], knownPrimes: Vector[Long]): Stream[Long] = {
    val n = naturals.head;
    val nIsPrime = knownPrimes.takeWhile { p => (p * p <= n) }.filter { n % _ == 0 }.isEmpty;
    if (nIsPrime) {
      n #:: primeStream(naturals.tail, knownPrimes :+ n);
    } else {
      primeStream(naturals.tail, knownPrimes);
    }
  }

  // Returns a list of the prime factors of 'n'.  Ie, 20 => [2, 5]
  def primeFactors(n: BigInt): List[Long] = {
    primeFactorPowers(n).zip(primes).filter(_._1 > 0).map(_._2);
  }

  // Returns a list of the powers of the prime factors of 'n',  Ie, 20 => [2, 0, 1] (2^2 * 3^0 * 5^1)
  def primeFactorPowers(n: BigInt): List[Int] = primeFactorPowersImp(n, primes);

  // Inverse of primeFactorPowers
  def primeFactorPowersToNumber(powers: List[Int]): BigInt = {
    primes.zip(powers).map(e => BigInt(e._1).pow(e._2)).reduce(_ * _);
  }

  private def primeFactorPowersImp(n: BigInt, primes: Seq[Long]): List[Int] = {
    assert(n >= 1);
    if (n == 1) {
      List.empty;
    } else {
      val factor = primes.head;
      val divAndRem = n /% factor;
      if (divAndRem._2 == 0) {
        addOneToHead(primeFactorPowersImp(divAndRem._1, primes));
      } else {
        0 :: primeFactorPowersImp(n, primes.tail);
      }
    }
  }

  def addOneToHead(stream: List[Int]): List[Int] = {
    stream.headOption match {
      case Some(n) => {
        (n + 1) :: stream.tail;
      }
      case None => {
        // No head, guaranteed no tail either
        1 :: List.empty;
      }
    }
  }
}

