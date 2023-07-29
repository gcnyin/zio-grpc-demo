Compile / PB.targets := Seq(
  scalapb.gen(grpc = true) -> (Compile / sourceManaged).value,
  scalapb.zio_grpc.ZioCodeGenerator -> (Compile / sourceManaged).value
)

lazy val root = (project in file("."))
  .enablePlugins(JavaServerAppPackaging, JavaAgent)
  .settings(
    name := "zio-grpc-demo",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.13.11",
    run / fork := true,
    libraryDependencies ++= Seq(
      "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
      "io.grpc" % "grpc-netty" % "1.53.0",
      "ch.qos.logback" % "logback-classic" % "1.4.8"
    ),
    javaAgents += "io.opentelemetry.javaagent" % "opentelemetry-javaagent" % "1.28.0"
  )
