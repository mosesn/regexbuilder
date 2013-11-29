package com.mosesn

package object regexbuilder {
  val digit = Regex("\\d")
  val nonDigit = Regex("\\D")
  val whitespace = Regex("\\s")
  val nonWhitespace = Regex("\\S")
  val word = Regex("\\w")
  val nonWord = Regex("\\W")
  val any =  Regex(".")
}
