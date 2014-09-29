import bintray.Keys._

organization := "arimitsu.sf"

name := "circleci-test"

version := "0.0.2-002"

scalaVersion := "2.11.2"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.6"

crossScalaVersions := Seq("2.10.4", "2.11.2")

publishMavenStyle := true

Seq(bintraySettings:_*)

repository in bintray := {
  if (version.value.matches("^[0-9]\\.[0-9]*\\.[0-9]*$")) "releases" else "snapshots"
}

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

