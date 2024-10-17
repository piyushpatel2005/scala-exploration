ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "3.0.0"

lazy val root = (project in file ("."))
  .settings(
    name := "scala-exploration"
  ).aggregate(core, zioExploration)

lazy val core = (project in file("core")).settings(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.9" % Test
  )
)
lazy val zioExploration = (project in file("zio-exploration"))
  .dependsOn(core)

