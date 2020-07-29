## How to deploy a single, executable Jar file

### Checking the current scala version of my computer.
`nagaraju@nagarajU:~/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run$ scala
Welcome to Scala 2.11.12 (OpenJDK 64-Bit Server VM, Java 1.8.0_252).
Type in expressions for evaluation. Or try :help.
scala> `

### Using sbt-assembly
Add the following by creating assembly.sbt in the foler project.

`addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")`

Now run sbt assembly to create your single, executable JAR file:
- Go to the current project folder

`$ sbt assembly`

The above command will create jar file in the target/{scala verision}/some.jar

### Now let use discuss how to run the Application different ways.

### Run the Application in command prompt.
`
nagaraju@nagarajU:~/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/target/scala-2.11$ java -jar scala-jar-run-assembly-0.1.jar 
Hello World !
`
### If we have multiple Main Classes and to run in command prompt then we have to add the following for required Main Class.
- Step 1: Add the following line to check the working of the Application.
mainClass in (Compile, run) := Some("com.tpb.custom.HelloWorldTwo")
- Step 2: Check the Applicaiton with : > sbt clean compile run

`nagaraju@nagarajU:~/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run$ sbt clean compile run
[info] welcome to sbt 1.3.13 (Private Build Java 1.8.0_252)
[info] loading settings for project scala-jar-run-build from assembly.sbt ...
[info] loading project definition from /home/nagaraju/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/project
[info] loading settings for project scala-jar-run from build.sbt ...
[info] set current project to scala-jar-run (in build file:/home/nagaraju/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/)
[info] Executing in batch mode. For better performance use sbt's shell
[success] Total time: 1 s, completed 29 Jul, 2020 4:56:07 PM
[info] Compiling 2 Scala sources to /home/nagaraju/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/target/scala-2.13/classes ...
[success] Total time: 6 s, completed 29 Jul, 2020 4:56:13 PM
[warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list
[info] running com.tpb.custom.HelloWorldTwo 
Hello World Two !
[success] Total time: 0 s, completed 29 Jul, 2020 4:56:14 PM
nagaraju@nagarajU:~/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run$ 
`
### If we have multiple Main Classes and to run as jar file then we have to add the following for required Main Class.
- Step 1: Add the following line to check the working of the Application.

    `mainClass in assembly := Some("com.tpb.custom.HelloWorldTwo")`
- Step 2: Check the applicaiton with 

    `: > sbt clean assembly`
    
The above commond will create jar file in target/{scalaverison}/XXXX.jar
- Step 3: Run the Jar file 

`nagaraju@nagarajU:~/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run$ sbt clean assembly
[info] welcome to sbt 1.3.13 (Private Build Java 1.8.0_252)
[info] loading settings for project scala-jar-run-build from assembly.sbt ...
[info] loading project definition from /home/nagaraju/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/project
[info] loading settings for project scala-jar-run from build.sbt ...
[info] set current project to scala-jar-run (in build file:/home/nagaraju/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/)
[success] Total time: 0 s, completed 29 Jul, 2020 4:59:04 PM
[info] Compiling 2 Scala sources to /home/nagaraju/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/target/scala-2.13/classes ...
[warn] Multiple main classes detected.  Run 'show discoveredMainClasses' to see the list
[info] Including: scala-library-2.13.3.jar
[info] Checking every *.class/*.jar file's SHA-1.
[info] Merging files...
[warn] Merging 'NOTICE' with strategy 'rename'
[warn] Merging 'LICENSE' with strategy 'rename'
[warn] Merging 'META-INF/MANIFEST.MF' with strategy 'discard'
[warn] Strategy 'discard' was applied to a file
[warn] Strategy 'rename' was applied to 2 files
[info] SHA-1: e77885c7e952814ddccf028ecccbeb01fb5f7700
[success] Total time: 9 s, completed 29 Jul, 2020 4:59:13 PM
nagaraju@nagarajU:~/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run$ cd target/scala-2.13/
nagaraju@nagarajU:~/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/target/scala-2.13$ java -jar scala-jar-run-assembly-0.1.jar 
Hello World Two !
nagaraju@nagarajU:~/Technology/Repository/theprogrammersbook/scalaTutorial/scala-jar-run/target/scala-2.13$ 
`


