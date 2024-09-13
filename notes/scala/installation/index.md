# Scala Installation

Scala runs on JVM. So, it needs Java to be installed on your system. Make sure you have Java installed on your system before installing Scala.

## Installing Java

If you don't have Java JDK installed, you can follow these steps to install Java on your system.
You can download required Java JDK from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use OpenJDK form [here](https://adoptium.net/temurin/releases/). In these tutorials, I have installed Java 17 in my system.

Once you've downloaded, you will have to set `JAVA_HOME` environment variable in your system. On Windows, you can easily set it by following these steps:

1. In the context menu, you can search for `Environment Variables`.
2. Click on `Environment Variables`.
3. Under `System variables`, click on `New`.
4. Enter `JAVA_HOME` as variable name and path to your Java JDK as variable value. For example, `C:\Program Files\Java\jdk-17`. In this case, I have installed JDK at this location.
5. Click `OK`.
6. Now, you can verify if Java is installed correctly by running `java -version` in your terminal.
7. You should see the version of Java installed.
8. You may also need to add `bin` directory of Java to your `PATH` variable. For example, `%JAVA_HOME%\bin`.

On UNIX based systems, you can set `JAVA_HOME` in your `.bashrc` or `.bash_profile` file.

```bash
export JAVA_HOME=/path/to/your/java/jdk
export PATH=$PATH:$JAVA_HOME/bin
```

## Installing Scala

There are different ways in which you can get Scala. One of them is to install Scala from the official website. You can download Scala from [here](https://www.scala-lang.org/download/). In these tutorials, I am using Scala version 3.0.0. The version of Java and Scala that you install may vary and sometimes choosing incorrect version can cause issues. You can find the JDK compatibility for Scala [here](https://docs.scala-lang.org/overviews/jdk-compatibility/overview.html).

## Scala using SBT

Another alternative is to install SBT (Simple Build Tool). This can be used to build Scala projects. You can download SBT from [here](https://www.scala-sbt.org/download.html). You can follow the instructions on the website to install SBT on your system.

Once installed, you can run `sbt -version` to verify if SBT is installed correctly. With `sbt` installed, you can simply run `sbt console` to start Scala REPL.

In the initial tutorials, I will be using Scala REPL or Scala worksheets to demonstrate Scala syntax. This can be very useful to quickly play with Scala code and learn the basic syntax. If you're using Intellij IDEA, you can also create a Scala project and start writing Scala code. You might need to install `Scala` plugin in Intellij IDEA to work with Scala.


