libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.6" % Test

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "11.6.0"

libraryDependencies += "com.github.mpilquist" %%% "simulacrum" % "0.15.0"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)