This is a libling!

## adding this libling as dependency

In your sbt project:

In `project/plugins.sbt`

    resolvers += Resolver.bintrayIvyRepo("jastice","sbt-plugins")
    resolvers += Resolver.bintrayRepo("jastice","maven")

    addSbtPlugin("libling" % "sbt-hackling" % "0.4.0")

In `build.sbt`

    // version as commit hash
    sourceDependencies += Dependency(
        HashVersion("<git commit hash>"), 
        Repositories(uri("<git repository uri>")))

    // version as tag or branch name
    sourceDependencies += Dependency(
        NameVersion("<git tag or branch>"), 
        Repositories(uri("<git repository uri>")))

## structure

A libling is deliberately simple and inflexible. For now.

These things will be copied into a project when the libling is added as a dependency by default

    README.md
        project description and basic docs
    /doc
        additional markdown documentation
    /src
        your Scala library code goes here
    /libling
        libling metadata, generated
    
These things are included in the template, but not included as dependency by default:

    build.sbt
    /project
        the ususal sbt stuff
    /test
        your tests are in here
    
