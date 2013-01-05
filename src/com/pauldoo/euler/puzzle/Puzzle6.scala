package com.pauldoo.euler.puzzle
import com.pauldoo.euler.common.Naturals.positiveNaturals

object Puzzle6 extends Puzzle {
  def answer() = {
    val numbers: Seq[BigInt] = positiveNaturals.take(100);
    val square = (n: BigInt) => n * n;
    square(numbers.reduce(_ + _)) - numbers.map(square).reduce(_ + _);
  }
}