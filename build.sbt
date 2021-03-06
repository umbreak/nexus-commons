/*
scalafmt: {
  style = defaultWithAlign
  maxColumn = 150
  align.tokens = [
    { code = "=>", owner = "Case" }
    { code = "?", owner = "Case" }
    { code = "extends", owner = "Defn.(Class|Trait|Object)" }
    { code = "//", owner = ".*" }
    { code = "{", owner = "Template" }
    { code = "}", owner = "Template" }
    { code = ":=", owner = "Term.ApplyInfix" }
    { code = "++=", owner = "Term.ApplyInfix" }
    { code = "+=", owner = "Term.ApplyInfix" }
    { code = "%", owner = "Term.ApplyInfix" }
    { code = "%%", owner = "Term.ApplyInfix" }
    { code = "%%%", owner = "Term.ApplyInfix" }
    { code = "->", owner = "Term.ApplyInfix" }
    { code = "?", owner = "Term.ApplyInfix" }
    { code = "<-", owner = "Enumerator.Generator" }
    { code = "?", owner = "Enumerator.Generator" }
    { code = "=", owner = "(Enumerator.Val|Defn.(Va(l|r)|Def|Type))" }
  ]
}
 */

val rdfVersion      = "0.5.2"
val sourcingVersion = "0.20.0"

lazy val rdf          = "ch.epfl.bluebrain.nexus" %% "rdf"           % rdfVersion
lazy val sourcingCore = "ch.epfl.bluebrain.nexus" %% "sourcing-core" % sourcingVersion

val akkaVersion           = "2.6.1"
val akkaManagementVersion = "1.0.5"
val akkaHttpVersion       = "10.1.11"
val akkaHttpCirceVersion  = "1.30.0"
val asmVersion            = "7.2"
val jenaVersion           = "3.13.1"
val blazegraphVersion     = "2.1.5"
val catsVersion           = "2.1.0"
val catsEffectVersion     = "2.0.0"
val circeVersion          = "0.12.3"
val circeGenericVersion   = "0.12.2"
val elasticSearchVersion  = "7.4.2"
val jacksonVersion        = "2.10.1"
val jacksonBindVersion    = "2.10.1"
val kryoVersion           = "1.1.0"
val log4jVersion          = "2.13.0"
val commonsIOVersion      = "1.3.2"
val pureconfigVersion     = "0.12.2"
val scalaLoggingVersion   = "3.9.2"
val scalaTestVersion      = "3.1.0"
val shapelessVersion      = "2.3.3"
val topQuadrantVersion    = "1.3.1"

lazy val akkaActor                 = "com.typesafe.akka"                 %% "akka-actor"                   % akkaVersion
lazy val akkaCluster               = "com.typesafe.akka"                 %% "akka-cluster"                 % akkaVersion
lazy val akkaClusterManagement     = "com.lightbend.akka.management"     %% "akka-management"              % akkaManagementVersion
lazy val akkaClusterManagementHttp = "com.lightbend.akka.management"     %% "akka-management-cluster-http" % akkaManagementVersion
lazy val akkaClusterSharding       = "com.typesafe.akka"                 %% "akka-cluster-sharding"        % akkaVersion
lazy val akkaDistributedData       = "com.typesafe.akka"                 %% "akka-distributed-data"        % akkaVersion
lazy val akkaHttp                  = "com.typesafe.akka"                 %% "akka-http"                    % akkaHttpVersion
lazy val akkaHttpTestKit           = "com.typesafe.akka"                 %% "akka-http-testkit"            % akkaHttpVersion
lazy val akkaHttpCirce             = "de.heikoseeberger"                 %% "akka-http-circe"              % akkaHttpCirceVersion
lazy val akkaHttpCore              = "com.typesafe.akka"                 %% "akka-http-core"               % akkaHttpVersion
lazy val akkaTestKit               = "com.typesafe.akka"                 %% "akka-testkit"                 % akkaVersion
lazy val akkaSlf4j                 = "com.typesafe.akka"                 %% "akka-slf4j"                   % akkaVersion
lazy val akkaStream                = "com.typesafe.akka"                 %% "akka-stream"                  % akkaVersion
lazy val akkaMultiNodeTestKit      = "com.typesafe.akka"                 %% "akka-multi-node-testkit"      % akkaVersion
lazy val asm                       = "org.ow2.asm"                       % "asm"                           % asmVersion
lazy val blazegraph                = "com.blazegraph"                    % "blazegraph-jar"                % blazegraphVersion
lazy val catsCore                  = "org.typelevel"                     %% "cats-core"                    % catsVersion
lazy val catsEffect                = "org.typelevel"                     %% "cats-effect"                  % catsEffectVersion
lazy val circeCore                 = "io.circe"                          %% "circe-core"                   % circeVersion
lazy val circeParser               = "io.circe"                          %% "circe-parser"                 % circeVersion
lazy val circeGenericExtras        = "io.circe"                          %% "circe-generic-extras"         % circeGenericVersion
lazy val commonsIO                 = "org.apache.commons"                % "commons-io"                    % commonsIOVersion
lazy val esCore                    = "org.elasticsearch"                 % "elasticsearch"                 % elasticSearchVersion
lazy val esPainless                = "org.codelibs.elasticsearch.module" % "lang-painless"                 % elasticSearchVersion
lazy val esReindex                 = "org.codelibs.elasticsearch.module" % "reindex"                       % elasticSearchVersion
lazy val esRestClient              = "org.elasticsearch.client"          % "elasticsearch-rest-client"     % elasticSearchVersion
lazy val esTransportClient         = "org.elasticsearch.plugin"          % "transport-netty4-client"       % elasticSearchVersion
lazy val jacksonAnnotations        = "com.fasterxml.jackson.core"        % "jackson-annotations"           % jacksonVersion
lazy val jacksonCore               = "com.fasterxml.jackson.core"        % "jackson-core"                  % jacksonVersion
lazy val jacksonDatabind           = "com.fasterxml.jackson.core"        % "jackson-databind"              % jacksonBindVersion
lazy val jenaArq                   = "org.apache.jena"                   % "jena-arq"                      % jenaVersion
lazy val kryo                      = "io.altoo"                          %% "akka-kryo-serialization"      % kryoVersion
lazy val log4jCore                 = "org.apache.logging.log4j"          % "log4j-core"                    % log4jVersion
lazy val log4jApi                  = "org.apache.logging.log4j"          % "log4j-api"                     % log4jVersion
lazy val pureconfig                = "com.github.pureconfig"             %% "pureconfig"                   % pureconfigVersion
lazy val scalaLogging              = "com.typesafe.scala-logging"        %% "scala-logging"                % scalaLoggingVersion
lazy val scalaTest                 = "org.scalatest"                     %% "scalatest"                    % scalaTestVersion
lazy val shapeless                 = "com.chuusai"                       %% "shapeless"                    % shapelessVersion
lazy val topQuadrantShacl          = "org.topbraid"                      % "shacl"                         % topQuadrantVersion

lazy val test = project
  .in(file("modules/test"))
  .settings(
    name            := "commons-test",
    moduleName      := "commons-test",
    coverageEnabled := false,
    libraryDependencies ++= Seq(
      akkaTestKit,
      akkaClusterSharding,
      catsEffect,
      circeCore,
      circeParser,
      kryo,
      scalaTest
    )
  )

lazy val core = project
  .in(file("modules/core"))
  .dependsOn(test)
  .settings(
    name       := "commons-core",
    moduleName := "commons-core",
    libraryDependencies ++= Seq(
      akkaActor,
      akkaCluster,
      akkaDistributedData,
      akkaHttp,
      akkaHttpCirce,
      catsCore,
      catsEffect,
      circeCore,
      circeGenericExtras,
      scalaLogging,
      pureconfig,
      rdf,
      shapeless,
      sourcingCore,
      topQuadrantShacl,
      akkaHttpTestKit % Test,
      akkaTestKit     % Test,
      akkaSlf4j       % Test,
      kryo            % Test,
      scalaTest       % Test
    )
  )

lazy val elasticSearchClient = project
  .in(file("modules/elastic-client"))
  .dependsOn(core, test % Test)
  .enablePlugins(JmhPlugin)
  .settings(
    name       := "elasticsearch-client",
    moduleName := "elasticsearch-client",
    libraryDependencies ++= Seq(
      akkaStream,
      circeCore,
      akkaSlf4j          % Test,
      asm                % Test,
      circeParser        % Test,
      circeGenericExtras % Test,
      esCore             % Test,
      esPainless         % Test,
      esReindex          % Test,
      esRestClient       % Test,
      esTransportClient  % Test,
      log4jCore          % Test,
      log4jApi           % Test
    ),
    sourceDirectory in Jmh     := (sourceDirectory in Test).value,
    classDirectory in Jmh      := (classDirectory in Test).value,
    dependencyClasspath in Jmh := (dependencyClasspath in Test).value,
    compile in Jmh             := (compile in Jmh).dependsOn(compile in Test).value,
    run in Jmh                 := (run in Jmh).dependsOn(Keys.compile in Jmh).evaluated
  )

lazy val sparqlClient = project
  .in(file("modules/sparql-client"))
  .dependsOn(core, test % Test)
  .enablePlugins(JmhPlugin)
  .settings(
    name       := "sparql-client",
    moduleName := "sparql-client",
    libraryDependencies ++= Seq(
      akkaStream,
      circeCore,
      jenaArq,
      rdf,
      akkaSlf4j          % Test,
      akkaTestKit        % Test,
      circeParser        % Test,
      blazegraph         % Test,
      jacksonAnnotations % Test,
      jacksonCore        % Test,
      jacksonDatabind    % Test,
      scalaTest          % Test
    ),
    sourceDirectory in Jmh     := (sourceDirectory in Test).value,
    classDirectory in Jmh      := (classDirectory in Test).value,
    dependencyClasspath in Jmh := (dependencyClasspath in Test).value,
    compile in Jmh             := (compile in Jmh).dependsOn(compile in Test).value,
    run in Jmh                 := (run in Jmh).dependsOn(Keys.compile in Jmh).evaluated
  )

lazy val kamon = project
  .in(file("modules/kamon"))
  .settings(
    name            := "commons-kamon",
    moduleName      := "commons-kamon",
    coverageEnabled := false,
    libraryDependencies ++= Seq(
      "net.bytebuddy" % "byte-buddy-agent"              % "1.10.3",
      "io.kamon"      % "kanela-agent"                  % "1.0.3",
      "io.kamon"      %% "kamon-status-page"            % "2.0.2",
      "io.kamon"      %% "kamon-instrumentation-common" % "2.0.0",
      "io.kamon"      %% "kamon-executors"              % "2.0.2",
      "io.kamon"      %% "kamon-scala-future"           % "2.0.1",
      "io.kamon"      %% "kamon-akka"                   % "2.0.1",
      "io.kamon"      %% "kamon-logback"                % "2.0.2",
      "io.kamon"      %% "kamon-system-metrics"         % "2.0.1",
      "io.kamon"      %% "kamon-core"                   % "2.0.2",
      "io.kamon"      %% "kamon-akka-http"              % "2.0.2",
      "io.kamon"      %% "kamon-prometheus"             % "2.0.0",
      "io.kamon"      %% "kamon-jaeger"                 % "2.0.0"
    )
  )

lazy val root = project
  .in(file("."))
  .settings(name := "commons", moduleName := "commons")
  .settings(noPublish)
  .aggregate(core, test, elasticSearchClient, sparqlClient, kamon)

lazy val noPublish = Seq(publishLocal := {}, publish := {}, publishArtifact := false)

inThisBuild(
  Seq(
    homepage := Some(url("https://github.com/BlueBrain/nexus-commons")),
    licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scmInfo  := Some(ScmInfo(url("https://github.com/BlueBrain/nexus-commons"), "scm:git:git@github.com:BlueBrain/nexus-commons.git")),
    developers := List(
      Developer("bogdanromanx", "Bogdan Roman", "noreply@epfl.ch", url("https://bluebrain.epfl.ch/")),
      Developer("hygt", "Henry Genet", "noreply@epfl.ch", url("https://bluebrain.epfl.ch/")),
      Developer("umbreak", "Didac Montero Mendez", "noreply@epfl.ch", url("https://bluebrain.epfl.ch/")),
      Developer("wwajerowicz", "Wojtek Wajerowicz", "noreply@epfl.ch", url("https://bluebrain.epfl.ch/"))
    ),
    // These are the sbt-release-early settings to configure
    releaseEarlyWith              := BintrayPublisher,
    releaseEarlyNoGpg             := true,
    releaseEarlyEnableSyncToMaven := false
  )
)

addCommandAlias("review", ";clean;scalafmtSbtCheck;coverage;scapegoat;test;coverageReport;coverageAggregate")
