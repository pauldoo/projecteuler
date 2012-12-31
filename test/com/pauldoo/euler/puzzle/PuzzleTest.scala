package com.pauldoo.euler.puzzle
import org.scalatest.FunSuite

trait PuzzleTest extends FunSuite {
  def expectedAnswer: BigInt;
  def puzzle: Puzzle;

  test("Answer") {
    val actualAnswer = puzzle.answer();
    expect(expectedAnswer) {
      actualAnswer;
    }
  }
}