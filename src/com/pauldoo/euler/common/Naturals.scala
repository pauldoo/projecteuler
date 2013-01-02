package com.pauldoo.euler.common

object Naturals {
  val positiveNaturals: Stream[BigInt] = Stream.cons(1, positiveNaturals.map(_ + 1));
}