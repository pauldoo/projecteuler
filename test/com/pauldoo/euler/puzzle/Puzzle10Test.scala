package com.pauldoo.euler.puzzle
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Puzzle10Test extends PuzzleTest {
  def puzzle = Puzzle10;
  def expectedAnswer = BigInt("142913828922");
}