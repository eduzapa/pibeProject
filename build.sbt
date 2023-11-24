ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "pibeproject",
    idePackagePrefix := Some("com.banco.cuenta")
  )
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.0"
