import sbt._
import Keys._

object Dependencies {
    val scalaTest = "org.scalatest" %% "scalatest" % "2.2.2"

    val learnSbtDependencies = Seq(scalaTest % "test")
}