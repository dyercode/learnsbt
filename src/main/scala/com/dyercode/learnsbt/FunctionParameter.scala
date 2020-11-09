package com.dyercode.learnsbt

object FunctionParameter {
  // To take a function as a parameter you have to declare the function signature as the type
  def callFunction(f: () => Any): Any = f()

  // function returns type any

  // Type parameters can be used to return the same type as the function
  def callFunctionReturnType[T](f: () => T): T = f()

  def filterInterestingThings(
      interestingThings: List[InterestingThing],
      filters: InterestingThingFilter*
  ): List[InterestingThing] = {

    def matchAllFilters(thing: InterestingThing) = filters.forall(_(thing))

    interestingThings.filter(matchAllFilters) //apply lots of sugar

    // filters.foldLeft(interestingThings) {
    // (accumulator: List[InterestingThing], filter: InterestingThingFilter) =>
    // accumulator.filter(filter)
    // }
  }

  def function(functionScope: String): String = {
    def closure = {
      functionScope
    }

    closure
  }

  def closureIncrementer(number: Int): Int = {
    var functionScopeNumber = number

    //Convention says to require parens when the method causes side effects
    def closure(): Unit = functionScopeNumber = functionScopeNumber + 1

    closure()
    closure()
    functionScopeNumber
  }
}
