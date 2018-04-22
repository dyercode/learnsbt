import sbt._
import Keys._

object Dependencies {
    val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

    val learnSbtDependencies = Seq(scalaTest % "test")
}