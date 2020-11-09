import sbt._
import Keys._

object Dependencies {
    val scalaTest = "org.scalatest" %% "scalatest" % "3.2.3"

    val learnSbtDependencies = Seq(scalaTest % "test")
}
