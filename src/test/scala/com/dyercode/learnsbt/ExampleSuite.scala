package com.dyercode.learnsbt

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must

class ExampleSuite extends AnyFunSuite with must.Matchers {

  test("an example must be made") {
    new Example() mustBe an[Example]
  }

}
