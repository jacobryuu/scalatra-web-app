val ScalatraVersion = "2.8.2"

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / organization := "com.example"

lazy val hello = (project in file("."))
  .settings(
    name := "Scalatra Web App",
    version := "0.1.0",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
      "org.scalatra" %% "scalatra-specs2" % ScalatraVersion % "test",

      "ch.qos.logback" % "logback-classic" % "1.2.11" % "runtime",
      "org.eclipse.jetty" % "jetty-webapp" % "11.0.9" % "container",
      "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided",

      //json
      "org.scalatra" %% "scalatra-json" % "2.8.2",
      "org.json4s" %% "json4s-jackson" % "4.0.5",
      "org.json4s" %% "json4s-native" % "4.0.5",

      //metrics
      "org.scalatra" %% "scalatra-metrics" % ScalatraVersion

      //swagger
//      "org.scalatra" %% "scalatra-swagger" % ScalatraVersion


    ),
  )

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)
