lazy val root = (project in file("."))
  .settings(
    name := "TaskoneUnittest",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"
  )


