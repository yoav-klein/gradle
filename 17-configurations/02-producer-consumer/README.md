# Understanding Configurations
---

In this project, we have the following structure:
1. `tcp-client` - a library, no dependencies
2. `http-client` - a library, no dependneices
3. `http-client-wrapper` - a library that depends on `tcp-client` as implementation, and on `http-client` as `api`.
4. `app` - application consuming `http-client-wrapper`

If you run `gradle dependencies` in `app`, you'll see that:
1. `http-client-wrapper`, `tcp-client` and `http-client` are in the `runtimeClasspath`.
2. `http-client-wrapper` and `http-client` are in the `compileClasspath`