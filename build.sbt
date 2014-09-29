import bintray.Keys._

organization := "arimitsu.sf"

name := "circleci-test"

version := "0.0.1"

scalaVersion := "2.11.2"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.6"

crossScalaVersions := Seq("2.10.4", "2.11.2")

publishMavenStyle := true

seq(bintraySettings:_*)

repository in bintray := ({
	version.value.toString.matches("^[0-9]\\.[0-9]*\\.[0-9]*$") match {
		case true => "releases"
		case _ => "snapshots"
	}
})

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

