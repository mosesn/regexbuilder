package com.mosesn.regexbuilder

object Ascii {
  val lower = Regex("\\p{Lower}")
  val upper = Regex("\\p{Upper}")
  val ascii = Regex("\\p{Ascii}")
  val alpha = Regex("\\p{Alpha}")
  val digit = Regex("\\p{Digit}")
  val alnum = Regex("\\p{Alnum}")
  val punct = Regex("\\p{Punct}")
  val graph = Regex("\\p{Graph}")
  val print = Regex("\\p{Print}")
  val blank = Regex("\\p{Blank}")
  val cntrl = Regex("\\p{Cntrl}")
  val xDigit = Regex("\\p{XDigit}")
  val space = Regex("\\p{Space}")
}
