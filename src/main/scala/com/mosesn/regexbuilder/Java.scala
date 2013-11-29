package com.mosesn.regexbuilder

object Java {
  val lower = Regex("\\p{javaLowerCase}")
  val upper = Regex("\\p{javaUpperCase}")
  val whitespace = Regex("\\p{javaWhitespace}")
  val mirrored = Regex("\\p{javaMirrored}")
}
