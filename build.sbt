name := "scala-hello-world"
organization := "com.example"
version := "1.0"

scalaVersion := "2.11.8"

resolvers += "jlupin-central" at "http://support.jlupin.com/maven2/"

libraryDependencies += "org.springframework" % "spring-context" % "4.3.9.RELEASE" % "provided"
libraryDependencies += "com.jlupin" % "jlupin-client-assembly" % "1.4.1.0-RC4" % "provided"
