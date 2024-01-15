# Platform
---

Gradle Platforms is the equivalent of Maven BOMs.

## Producer
---
In the `producer` directory we have a `java-platform` kind of project. A platform project is a project
without any source code. It's only used to declare versions of dependencies. After publishing this project,
you'll have a POM file which is equivalent to what a Maven BOM will produce, i.e. a POM file with `<dependncyManagement>`
in which all the recommended versions are listed.

## Consumer
---
On the consumer side, we declare the platform project as a dependency. Then, we consume some (in this case one)
artifacts that are included in the platform project. We don't specify the version, as it is specified in the platform project
already.

