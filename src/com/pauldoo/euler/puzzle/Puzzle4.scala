package com.pauldoo.euler.puzzle

object Puzzle4 extends Puzzle {
  def isPalindrome(s: String): Boolean = {
    s.reverse.mkString == s;
  }

  def answer() = {
    val allPalindromes = for (
      i <- 100 to 999;
      j <- 100 to 999;
      val p = i * j if isPalindrome(p.toString())
    ) yield p;
    allPalindromes.sortWith(_ > _).head;
  }
}