# Flat directories
---

In this example we demonstrate how to use flat directory repository.
The concept is simple: you provide a directory path as a repository, and Gradle
will look for JAR files in these directories.

## Usage
Firt, build the JAR file:
```
$ cd lib
$ ./build.sh
```

This builds the `Person.jar` file.

Now, in our build script, the `lib` directory is declared as a flat directory repository.
Then, we declare a dependency with the name `Person`, which corresponds to the name of the Jar file.

```
$ gradle build
$ gradle run
```

