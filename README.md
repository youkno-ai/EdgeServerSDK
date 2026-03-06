# EdgeServerSDK

Monorepo for generating, building, and publishing Edge Server SDKs from a versioned OpenAPI spec.

## Versioning

SDK version matches server version exactly (example: `1.20.2271`).

## OpenAPI source

Discovery always starts from:

`https://belong-openapi.web.app/api/versions.json`

`scripts/fetch-openapi.sh` resolves the canonical `openapiUrl` from the matching `versions[]` entry (or `latest`), then downloads the spec. It also writes:
- `spec/versions.json` (index snapshot)
- `spec/version-metadata.json` (matched version entry, including `postmanCollectionUrl`, `changelogUrl`, `postmanRunUrl`)

Default fallback template (only if `openapiUrl` is absent):  
`https://belong-openapi.web.app/api/<VERSION>/openapi.json`

You can override URLs via `VERSIONS_INDEX_URL` and `OPENAPI_SPEC_URL_TEMPLATE`.

## Repository layout

- `scripts/`: release automation (`fetch-openapi.sh`, `generate-all.sh`, `release.sh`)
- `spec/openapi.json`: downloaded spec input (ignored by default)
- `ts/`: TypeScript SDK package (`@youkno/sdk`)
- `kotlin/`: Kotlin SDK and Maven Central publishing setup (`ai.youkno:edge-server-sdk`)
- `swift/`: SwiftPM package (`BelongSDK`)
- `bitbucket-pipelines.yml`: tag-triggered release pipeline (`sdk-*`)

## Local workflow

1. Configure local secrets (optional for generate/build, required for publish):

```bash
cp .env.local.example .env.local
```

`scripts/*` and `make` auto-load `.env.local`.

2. Generate all SDKs for a version:

```bash
./scripts/generate-all.sh
./scripts/generate-all.sh 1.20.2271
./scripts/generate-all.sh latest
```

3. Build packages:

```bash
(cd ts && npm ci && npm run build)
(cd kotlin && ./gradlew build)
(cd swift && swift build)
```

4. Release (commit + tag):

```bash
./scripts/release.sh
./scripts/release.sh 1.20.2271
```

This creates two tags:
- `sdk-1.20.2271` (Bitbucket pipeline trigger)
- `1.20.2271` (SwiftPM-compatible semver tag)

## Publishing

- npm: `@youkno/sdk` published by pipeline using `NPM_TOKEN`
- Maven Central: `ai.youkno:edge-server-sdk` published by Gradle (`SONATYPE_*`, `SIGNING_*`)
- SwiftPM: distributed by semver tag `<VERSION>`

### CI secrets and local file alternatives

| CI secret | Local file alternative (`.env.local`) | Notes |
|---|---|---|
| `NPM_TOKEN` | `NPM_TOKEN=...` | Used by `make publish-ts`. |
| `SONATYPE_USERNAME` | `SONATYPE_USERNAME=...` | Used by `make publish-kotlin`. |
| `SONATYPE_PASSWORD` | `SONATYPE_PASSWORD=...` | Used by `make publish-kotlin`. |
| `SIGNING_PASSWORD` | `SIGNING_PASSWORD=...` | Passphrase for GPG key. |
| `SIGNING_KEY` | `SIGNING_KEY=...` or `SIGNING_KEY_FILE=.secrets/maven-signing-key.asc` | `SIGNING_KEY_FILE` is recommended for local use. |

### Make targets

```bash
make help
make fetch VERSION=latest
make generate VERSION=1.20.2271
make build
make publish-ts
make publish-kotlin
make deploy
make release VERSION=1.20.2271
```

## Required tools

- Bash, `curl`, `jq`
- Node.js 20+
- Java 21+ (managed via `jenv`; Makefile uses `jenv prefix 21`)
- Gradle 8+
- Swift 5.9+ (for local Swift validation)
- `swift-openapi-generator` (official Swift SDK code generator, required for `make generate`)
