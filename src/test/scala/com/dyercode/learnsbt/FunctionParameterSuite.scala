package com.dyercode.learnsbt

import org.scalatest.FunSuite
import org.scalatest.MustMatchers

class FunctionParameterSuite extends FunSuite with MustMatchers {

  val bauble = new InterestingThing(name = "Bauble", number = 3, shiny = true)
  val mine = new InterestingThing(name = "My Thing", number = 11, shiny = true)
  val box = new InterestingThing(name = "Box", number = 3, shiny = false)
  val interestingThings = List(bauble, mine, box)
  val trulyShinyFilter: InterestingThingFilter = InterestingThingFilters.shinyFilter(true)
  val goesToElevenFilter: InterestingThingFilter = InterestingThingFilters.numberFilter((x: Int) => x == 11)

  test("a method can take a function as an argument") {
    val fishMaker = () => "fish"
    FunctionParameter.callFunction(fishMaker) mustBe "fish"
  }

  // Scala won't let us do this, we have to be specific with the amount of arguments
  /*
    test("a method cannot take a function with the wrong signature") {
      val wrongFunction = (x,y) => "fish"
      FunctionParameter.callFunction(fishMaker) mustBe "fish"
    }
  */

  test("we can create a function and use that function to pass to another function to do something useful") {
    FunctionParameter.filterInterestingThings(interestingThings, trulyShinyFilter) must equal(List(bauble, mine))

  }

  test("we can send a number of functions in and use them all") {
    val filtered = FunctionParameter.filterInterestingThings(
      interestingThings,
      trulyShinyFilter,
      goesToElevenFilter
    )
    filtered mustBe List(mine)
  }

  test("closures can use variables from the surrounding scope") {
    val input = "functionString"
    FunctionParameter.function(input) mustBe input
  }

  test("closures can modify variables from the surrounding scope") {
    FunctionParameter.closureIncrementer(1) mustBe 3
  }
}
