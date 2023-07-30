
# Multi-project build
---

This is a super basic example of a multi-project build.

In the top level, we have a `settings.gradle` file that specifies what projects are part of the build.
In each sub-project, we have a `build.gradle` file that defines the project.

In each project, we've defined a task called `compile`.

Run:
```
$ gradle compile
```
