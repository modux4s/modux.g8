enablePlugins(ModuxPlugin)

ThisBuild / scalaVersion := "2.12.10"
ThisBuild / version := "$version$"
ThisBuild / organization := "$organization$"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "$name;format="normalize"$",
    moduxOpenAPIVersion := 3,
  )

