addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.6")

addSbtPlugin("com.github.sbt" % "sbt-native-packager" % "1.9.11")

addSbtPlugin("com.lightbend.sbt" % "sbt-javaagent" % "0.1.6")

libraryDependencies ++= Seq(
  "com.thesamet.scalapb.zio-grpc" %% "zio-grpc-codegen" % "0.6.0-rc6",
  "com.thesamet.scalapb" %% "compilerplugin" % "0.11.13"
)
