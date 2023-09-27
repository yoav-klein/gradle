# Files dependency
---
This builds on the `Flat directory repository` example.

Here we use, instead of a _Module dependency_, a _Files dependency_. We use the `Project.files` method for this.

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

