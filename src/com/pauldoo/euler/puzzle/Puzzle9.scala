package com.pauldoo.euler.puzzle

object Puzzle9 extends Puzzle {

  def answer() = {
    (for (
      a <- 1 to 1000 / 3;
      b <- (a + 1) to (1000 - a - 1) / 2;
      val c = 1000 - a - b if a * a + b * b == c * c
    ) yield a * b * c).head
  }
}