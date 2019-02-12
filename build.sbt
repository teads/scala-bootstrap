scalaVersion in ThisBuild := "2.12.7"

lazy val root = (project in file("."))
  .settings(name := "ScalaForNoobs")
  .settings(libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test")
