package com.dyercode.learnsbt

import org.scalatest.{FunSuite, MustMatchers}

class ExampleSuite extends FunSuite with MustMatchers {

  test("an example must be made") {
    new Example() mustBe an [Example]
  }

}
