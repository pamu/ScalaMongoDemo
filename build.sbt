name := "ScalaMongoDemo"

version := "1.0.0"

scalaVersion := "2.11.7"

sbtVersion := "0.13.9"

mainClass := Some("Main")

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.mongodb" %% "casbah" % "2.8.2",
  "com.typesafe.play" %% "play-json" % "2.4.0"
)

fork in (Test, run) := true
