# Swift SDK Developer Quickstart

This guide helps you start with `BelongSDK` quickly and understand the Swift SDK structure.

## Add Package (SwiftPM)

```swift
.package(url: "https://github.com/youkno-ai/EdgeServerSDK.git", from: "1.20.2271")
```

Then add product dependency:

```swift
.product(name: "BelongSDK", package: "EdgeServerSDK")
```

## Minimal Usage

```swift
import BelongSDK

func fetchProducts() async {
  EdgeSDKClient.configure(
    EdgeSDKClientOptions(
      basePath: "https://<your-edge-server-host>",
      bearerToken: "<jwt-token>",
      xEdgeAgent: "ios-app",
      xEdgeState: "prod",
      xEdgeClientId: "<client-id>"
    )
  )

  do {
    let result = try await OpenControllerAPI.getProducts(
      start: 0,
      length: 20
    )
    print(result)
  } catch {
    print("SDK call failed:", error)
  }
}
```

Important:
- Use `EdgeSDKClient.configure(...)` once at startup to set base URL, auth, and `X-edge-*` headers globally.
- Generated default base URL is `http://localhost` if you skip configuration.

## SDK Organization

Main layout:
- `Sources/BelongSDK/APIs/` - generated API groups (for example `OpenControllerAPI`).
- `Sources/BelongSDK/Models/` - request/response model types.
- `Sources/BelongSDK/APIs.swift` - global API configuration (`basePath`, headers, request builder).
- `Sources/BelongSDK/EdgeSDKClient.swift` - SDK-level setup helper for base URL + auth + shared headers.
- `Sources/BelongSDK/` - runtime helpers (`Configuration`, encoding helpers, networking support).

## Request/Response Patterns

- Most API methods are static and async (`async throws`).
- For advanced control, use `*WithRequestBuilder(...)` variants and call `.execute()`.

## Local Build

```bash
make build-swift
```

Regenerate SDK sources:

```bash
make generate
make generate VERSION=1.20.2271
```
