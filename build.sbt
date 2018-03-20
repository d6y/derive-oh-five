inThisBuild(Seq(
  organization := "com.dallaway",
  scalaVersion := "2.12.5"
))

scalacOptions := Seq(
  "-feature",
  "-Xfatal-warnings",
  "-deprecation",
  "-unchecked",
  "-Ypartial-unification"
)

val circeVersion = "0.9.2"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
)

