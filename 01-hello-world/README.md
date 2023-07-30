# Hello world
---

Demonstrates the definition of tasks in a gradle build script.

The code in the `tasks.register() {}` blocks (which is not in the `doLast` and `doFirst` blocks)
is executed in the configuration phase.

Code in the `settings.gradle` file is executed during initialization phase.

Code in the `doFirst` and `doLast` blocks is executed in execution phase.
