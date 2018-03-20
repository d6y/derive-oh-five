# What am I doing wrong? I'd expect the code to compile under both version of Scala

I'm trying to use Circe auto derivation for a case class.
I'd expect the code to compile under both versions of Scala, but it does not with 2.12.5



# With Scala Version 2.12.5

```
sbt
[info] Loading settings from sbt-updates.sbt,sonatype.sbt ...
[info] Loading global plugins from /Users/richard/.sbt/1.0/plugins
[info] Loading settings from coursier.sbt ...
[info] Loading project definition from /Users/richard/Developer/derive-oh-five/project
[info] Loading settings from build.sbt ...
[info] Set current project to derive-oh-five (in build file:/Users/richard/Developer/derive-oh-five/)
[info] sbt server started at local:///Users/richard/.sbt/1.0/server/ff0741127de6d9bbb0bf/sock
sbt:derive-oh-five> clean
[success] Total time: 0 s, completed 20 Mar 2018, 20:40:05
sbt:derive-oh-five> compile
[info] Compiling 1 Scala source to /Users/richard/Developer/derive-oh-five/target/scala-2.12/classes ...
[error] /Users/richard/Developer/derive-oh-five/src/main/scala/main.scala:9:27: could not find implicit value for parameter encoder: io.circe.Encoder[Main.Person]
[error]     println(Person("bob").asJson)
[error]                           ^
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 5 s, completed 20 Mar 2018, 20:40:13
sbt:derive-oh-five> show scalaVersion
[info] 2.12.5
sbt:derive-oh-five> exit
[info] shutting down server
```

# With Scala Version 2.12.4

```
$ sbt
[info] Loading settings from sbt-updates.sbt,sonatype.sbt ...
[info] Loading global plugins from /Users/richard/.sbt/1.0/plugins
[info] Loading settings from coursier.sbt ...
[info] Loading project definition from /Users/richard/Developer/derive-oh-five/project
[info] Updating ProjectRef(uri("file:/Users/richard/Developer/derive-oh-five/project/"), "derive-oh-five-build")...
[info] Done updating.
[info] Loading settings from build.sbt ...
[info] Set current project to derive-oh-five (in build file:/Users/richard/Developer/derive-oh-five/)
[info] sbt server started at local:///Users/richard/.sbt/1.0/server/ff0741127de6d9bbb0bf/sock
sbt:derive-oh-five> run
[info] Compiling 1 Scala source to /Users/richard/Developer/derive-oh-five/target/scala-2.12/classes ...
[info] Done compiling.
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.google.protobuf.UnsafeUtil (file:/Users/richard/.sbt/boot/scala-2.12.4/org.scala-sbt/sbt/1.1.1/protobuf-java-3.3.1.jar) to field java.nio.Buffer.address
WARNING: Please consider reporting this to the maintainers of com.google.protobuf.UnsafeUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
[info] Packaging /Users/richard/Developer/derive-oh-five/target/scala-2.12/derive-oh-five_2.12-0.1.0-SNAPSHOT.jar ...
[info] Done packaging.
[info] Running Main
{
  "name" : "bob"
}
[success] Total time: 4 s, completed 20 Mar 2018, 20:39:04
sbt:derive-oh-five> show scalaVersion
[info] 2.12.4
sbt:derive-oh-five> exit
[info] shutting down server
```

