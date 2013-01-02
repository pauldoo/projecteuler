package com.pauldoo.euler.puzzle
import scala.math.BigInt
import com.pauldoo.euler.common.Fibonacci._

object Puzzle2 extends Puzzle {
  def answer(): BigInt = {
    fibonacci.takeWhile(_ <= 4000000).filter(_ % 2 == 0).reduce(_ + _);
  }
}