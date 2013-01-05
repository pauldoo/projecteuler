package com.pauldoo.euler.puzzle
import com.pauldoo.euler.common.Naturals.positiveNaturals
import com.pauldoo.euler.common.Summations.sumOfSquares
import com.pauldoo.euler.common.Summations.sum

object Puzzle6 extends Puzzle {
  def answer() = {
    def square(n: BigInt) = n * n;
    square(sum(1 to 100)) - sumOfSquares(100);
  }
}