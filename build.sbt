name := "kafka-streams"

version := "1.0"

scalaVersion := "2.12.2"

organization in ThisBuild := "org.typelevel"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats" % "0.9.0",
  "com.chuusai" %% "shapeless" % "2.3.2",
  "org.apache.kafka" % "kafka-streams" % "0.10.0.0"
)

scalacOptions ++= Seq(
  "-Ypartial-unification",
  "-language:implicitConversions"
)