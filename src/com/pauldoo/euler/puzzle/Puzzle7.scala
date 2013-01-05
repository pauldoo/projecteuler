package com.pauldoo.euler.puzzle
import com.pauldoo.euler.common.Primes.primes;
import com.pauldoo.euler.common.Naturals

object Puzzle7 extends Puzzle {
  def answer() = {
    primes.drop(10000).first;
  }
}