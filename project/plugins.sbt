addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.5.0")

resolvers += "repo.codahale.com" at "http://repo.codahale.com"

libraryDependencies += "com.codahale" % "jerkson_2.9.1" % "0.5.0"

libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.2.9"