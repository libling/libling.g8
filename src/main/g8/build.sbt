name := """$name;format="norm"$"""
scalaVersion := "2.12.2"

// the libling library plugin configures this build as a libling
enablePlugins(HacklingLibraryPlugin)

// choose your test framework (but don't include binary dependencies in compile scope)
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
//libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.9" % "test"

// depend on other liblings
//sourceDependencies += Dependency(
//  Version("<git commit hash>"),
//  Repositories(uri("<git repository uri>")))
