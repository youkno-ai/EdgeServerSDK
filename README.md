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
- `ts/`: TypeScript SDK package (`@belong/sdk`)
- `kotlin/`: Kotlin SDK and Maven Central publishing setup (`is.belong:edge-server-sdk`)
- `swift/`: SwiftPM package (`BelongSDK`)
- `bitbucket-pipelines.yml`: tag-triggered release pipeline (`sdk-*`)

## Local workflow

1. Generate all SDKs for a version:

```bash
./scripts/generate-all.sh 1.20.2271
./scripts/generate-all.sh latest
```

2. Build packages:

```bash
(cd ts && npm ci && npm run build)
(cd kotlin && gradle build)
(cd swift && swift build)
```

3. Release (commit + tag):

```bash
./scripts/release.sh 1.20.2271
```

This creates two tags:
- `sdk-1.20.2271` (Bitbucket pipeline trigger)
- `1.20.2271` (SwiftPM-compatible semver tag)

## Publishing

- npm: `@belong/sdk` published by pipeline using `NPM_TOKEN`
- Maven Central: `is.belong:edge-server-sdk` published by Gradle (`SONATYPE_*`, `SIGNING_*`)
- SwiftPM: distributed by semver tag `<VERSION>`

## Required tools

- Bash, `curl`, `jq`
- Node.js 20+
- Java 21+
- Gradle 8+
- Swift 5.9+ (for local Swift validation)
