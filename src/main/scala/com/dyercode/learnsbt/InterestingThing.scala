package com.dyercode.learnsbt

class InterestingThing(
                        val name: String,
                        val number: Int,
                        val shiny: Boolean
                        ) {
  def suspicious = !shiny
}


object InterestingThingFilters {
  def shinyFilter(isShiny: Boolean): InterestingThingFilter = {
    (thing: InterestingThing) => thing.shiny == isShiny
  }

  def numberFilter(numericRequirement: Int => Boolean): InterestingThingFilter = {
    (thing: InterestingThing) => numericRequirement(thing.number)
  }
}