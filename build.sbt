val scala3Version = "3.5.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "geo-rest-scala-zio",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
"dev.zio" %% "zio" % "2.0.0",
      "dev.zio" %% "zio-json" % "2.0.0",
      "dev.zio" %% "zio-http" % "2.0.0"
    ),

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
  )
