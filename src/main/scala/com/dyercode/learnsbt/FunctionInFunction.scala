package com.dyercode.learnsbt

object FunctionInFunction {
  val initialNumberHolder: Int => Boolean = (x: Int) => false

  def addNumber(
      number: Int,
      existingHolder: NumberHolder = initialNumberHolder
  ): NumberHolder = { (checkNumber: Int) =>
    (checkNumber == number) || existingHolder(checkNumber)
  }
}
