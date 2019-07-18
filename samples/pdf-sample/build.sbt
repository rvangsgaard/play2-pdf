name := "pdf-sample"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.0"

libraryDependencies ++= Seq(
  javaWs,
  guice,
  "it.innove" % "play2-pdf" % "1.9.2-SNAPSHOT",
  "com.squareup.okhttp3" % "okhttp" % "4.0.1"
)


resolvers ++= Seq(
  "Sonatype snapshot" at "https://oss.sonatype.org/content/repositories/snapshots"
)