package com.mosesn.regexbuilder

case class Regex(stri: String) {
  def union(other: Regex): Regex = copy(stri = stri + other)
  def intersect(other: Regex): Regex = copy(stri = stri + "&&" + other.boxify)
  def diff(other: Regex): Regex = intersect(other.negate)
  def negate: Regex = copy(stri = "^" + stri)

  def reluctant: Regex = copy(stri = stri + "?")

  def any: Regex = copy(stri = stri + "*")

  def greedy: Regex = copy(stri = stri + "+")

  def exactly(n: Int): Regex = copy(stri = stri + "{" + n + "}")

  def atLeast(n: Int): Regex = copy(stri = stri + "{" + n + ",}")

  def bound(lower: Int, upper: Int): Regex = copy(stri = stri + "{" + lower + "," + upper + "}")

  def boxify: String = "[" + stri + "]"
}

