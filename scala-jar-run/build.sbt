name := "scala-jar-run"

version := "0.1"

scalaVersion := "2.13.3"

mainClass in (Compile, run) := Some("com.tpb.custom.HelloWorldTwo")

mainClass in assembly := Some("com.tpb.custom.HelloWorldTwo")
