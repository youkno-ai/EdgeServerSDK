# TypeScript SDK Developer Quickstart

This guide helps you start using `@youkno/sdk` quickly and understand how the SDK is organized.

## Install

```bash
npm install @youkno/sdk
```

## Minimal Usage

```ts
import { createEdgeConfiguration, apis } from "@youkno/sdk";

const config = createEdgeConfiguration({
  basePath: "https://<your-edge-server-host>", // required
  bearerToken: process.env.EDGE_JWT, // optional
  xEdgeAgent: "my-app",
  xEdgeState: "prod",
  xEdgeClientId: "<client-id>",
});

const openApi = new apis.OpenControllerApi(config);
const result = await openApi.getProducts({ start: 0, length: 20 });
console.log(result);
```

Important:
- Set `basePath`. Generated default is `http://localhost`.
- Prefer `createEdgeConfiguration(...)` to set `Authorization`, `X-edge-agent`, `X-edge-state`, and `X-edge-client-id` once.
- You can still override per request when needed.

## SDK Organization

Top-level exports:
- `Configuration` and runtime helpers are exported directly.
- `createEdgeConfiguration` centralizes SDK-level auth/context headers.
- API clients are under `apis`.
- Model types/helpers are under `models`.

Internal layout in this repo:
- `ts/src/src/runtime.ts` - HTTP runtime, auth wiring, middleware support, error types.
- `ts/src/src/client.ts` - SDK-level configuration helper (`createEdgeConfiguration`).
- `ts/src/src/apis/*` - one client class per controller (for example `OpenControllerApi`).
- `ts/src/src/models/*` - request/response model types and JSON converters.
- `ts/dist/*` - built artifacts published to npm.

## Request/Response Patterns

- Most methods use a single request object:
  - `api.getProducts({ start: 0, length: 20 })`
- Methods throw `ResponseError` for non-2xx responses.
- Models include `FromJSON` / `ToJSON` helpers when needed.

## Local Development

```bash
cd ts
npm ci
npm run build
```

Regenerate SDK sources from latest OpenAPI:

```bash
make generate
```

Regenerate for explicit server version:

```bash
make generate VERSION=1.20.2271
```
