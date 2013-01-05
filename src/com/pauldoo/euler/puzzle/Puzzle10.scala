package com.pauldoo.euler.puzzle
import com.pauldoo.euler.common.Primes.primes

object Puzzle10 extends Puzzle {
  def answer() = {
    primes.takeWhile(_ < 2000000).reduce(_ + _);
  }
}