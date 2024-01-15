# Local Project Constraints
---

Refer to https://docs.gradle.org/current/userguide/java_platform_plugin.html#sec:java_platform_project_constraints

Say you have a Gradle project which consists of many subprojects, and you want to have a platform project
that refers to all the subprojects with their current version, you can have a Platform project as one of the
subprojects. In the `build.gradle`, you can refer to the subprojects, and with this to create a Platform POM.

See in the `myPlatform` project how it's done.
