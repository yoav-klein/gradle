# Publications
---

This builds on the `06-dependencies` example. But here, instead of using project dependencies
to define the dependencies between the subprojects, we publish each library individually to a repository,
and consume them from there.

So each project is a standalone project - no `settings.gradle` in the root directory.

The projects `tcp-client`, `http-client` and `http-client-wrapper` all publish to a Maven repository,
which in this case is a local filesystem repository (for convenience).

Additionally, the `http-client-wrapper`, which consumes `tcp-client` and `http-client`, defines this
location as a repository, so it can consume from there.

Then, the `app` project consumes all the dependencies from this repository also.

