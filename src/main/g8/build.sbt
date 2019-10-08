name := "$name$"

organization := "$organization$"

scalaVersion := "$scalaVersion$"

version := "$version$"

libraryDependencies++=Seq(
  "com.typesafe.akka" %% "akka-stream" % "2.5.25",
  "com.typesafe.akka" %% "akka-stream-kafka" % "1.0.5"
)
