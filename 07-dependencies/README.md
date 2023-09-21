# Dependencies
---

This multi-project demonstrates how to use dependencies in Gradle projects.

We have the following structure: The `app` project is an application - a consumer - 
which uses the `http-client-wrapper` library, which is another project.

The `http-client-wrapper` uses 2 libraries: `http-client` and `tcp-client`, but in different ways.
The constructor of HttpClientWrapper takes an instance of HttpClient, so the consumer (app) needs 
to create an instance of HttpClient - in other words, it needs to know the HttpClient class. So
the `http-client` dependency of `http-client-wrapper` is of type `api`.

However, the use in `tcp-client` is done internally, so the app project need not be exposed to it.
In other words, it is an _implemenation_ dependency, so it's part of the `implementation` configuration.
