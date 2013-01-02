package com.pauldoo.euler.puzzle
import scala.math.BigInt

object Puzzle2 extends Puzzle {
  val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 };

  def answer(): BigInt = {
    fibs.takeWhile(_ <= 4000000).filter(_ % 2 == 0).reduce(_ + _);
  }
}