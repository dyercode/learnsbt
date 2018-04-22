package com.dyercode.learnsbt

import org.scalatest.{MustMatchers, FunSuite}
import com.dyercode.learnsbt.FunctionInFunction._

class FunctionInFunctionSuite extends FunSuite with MustMatchers {

  test("a function can take a function and return a function that uses that function") {

    initialNumberHolder(4) mustBe false

    val addedOnceNumberHolder: NumberHolder = addNumber(4)
    addedOnceNumberHolder(4) mustBe true

    val addedTwiceNumberHolder: NumberHolder = addNumber(5, addedOnceNumberHolder)
    addedTwiceNumberHolder(4) mustBe true
    addedTwiceNumberHolder(5) mustBe true
  }

}
