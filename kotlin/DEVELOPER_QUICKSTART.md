# Kotlin SDK Developer Quickstart

This guide helps you start with `ai.youkno:edge-server-sdk` and understand how the Kotlin SDK is organized.

## Add Dependency

```kotlin
repositories {
  mavenCentral()
}

dependencies {
  implementation("ai.youkno:edge-server-sdk:1.20.2271")
}
```

## Minimal Usage

```kotlin
import ai.youkno.edgeserversdk.EdgeSdkClientFactory
import ai.youkno.edgeserversdk.EdgeSdkClientOptions
import ai.youkno.edgeserversdk.apis.OpenControllerApi

val options = EdgeSdkClientOptions(
  baseUrl = "https://<your-edge-server-host>/",
  bearerToken = "<jwt-token>",
  xEdgeAgent = "android-app",
  xEdgeState = "prod",
  xEdgeClientId = "<client-id>"
)

val openApi = EdgeSdkClientFactory.createService<OpenControllerApi>(options)
val response = openApi.getProducts(start = 0, length = 20).execute()

if (response.isSuccessful) {
  println(response.body())
} else {
  println("HTTP ${response.code()} ${response.errorBody()?.string()}")
}
```

Important:
- `baseUrl` should end with `/`.
- Generated default base URL is `http://localhost`.
- Prefer `EdgeSdkClientFactory` so JWT and `X-edge-*` headers are set once for all calls.

## SDK Organization

Key packages under `ai.youkno.edgeserversdk`:
- root package helper: `EdgeSdkClientFactory` + `EdgeSdkClientOptions` for SDK-level setup.
- `apis` - Retrofit interfaces grouped by controller (for example `OpenControllerApi`).
- `models` - request/response data classes.
- `infrastructure` - `ApiClient`, serializer, adapters, retrofit/okhttp plumbing.
- `auth` - auth interceptors (for example `ApiKeyAuth` for JWT header).

## Request/Response Patterns

- API methods return Retrofit `Call<T>`.
- Use `.execute()` (blocking) or your coroutine adapter pattern.
- Optional headers can be passed per call: `xEdgeAgent`, `xEdgeState`, `xEdgeClientId`.

## Local Build

```bash
make build-kotlin
```

Regenerate SDK sources:

```bash
make generate
make generate VERSION=1.20.2271
```
