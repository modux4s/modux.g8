enablePlugins(ModuxPlugin)

ThisBuild / scalaVersion := "2.12.13"
ThisBuild / version := "$version$"
ThisBuild / organization := "$organization$"

lazy val root = (project in file("."))
  .settings(
    name := "$name;format="normalize"$",
    moduxOpenAPIVersion := 3,
  )

