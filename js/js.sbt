enablePlugins(Example)

libraryDependencies += "com.thoughtworks.binding" %%% "jspromisebinding" % "11.9.0"

libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "11.9.0" % Test

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.10.3")

jsDependencies in Test += RuntimeDOM

inConfig(Test) {
  jsEnv := RhinoJSEnv().value
}
