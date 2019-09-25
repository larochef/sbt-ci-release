unmanagedSourceDirectories.in(Compile) +=
  baseDirectory.in(ThisBuild).value.getParentFile /
    "plugin" / "src" / "main" / "scala"
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.0.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.7")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.4.0")
