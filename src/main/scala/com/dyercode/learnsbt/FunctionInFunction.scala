package com.dyercode.learnsbt

object FunctionInFunction {
  val initialNumberHolder: Int => Boolean = (x: Int) => false

  def addNumber(
      number: Int,
      existingHolder: NumberHolder = initialNumberHolder
  ): NumberHolder = { (checkNumber: Int) =>
    if (checkNumber == number) true else existingHolder(checkNumber)
  }
}
