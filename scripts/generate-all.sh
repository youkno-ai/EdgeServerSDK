#!/usr/bin/env bash
set -euo pipefail

VERSION="${1:-latest}"

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
TMP_DIR="/tmp/edge-sdk-gen"
GEN_CLI="npx --yes @openapitools/openapi-generator-cli@2.23.3"

if [[ -f "$ROOT_DIR/.env.local" ]]; then
  set -a
  # shellcheck disable=SC1091
  source "$ROOT_DIR/.env.local"
  set +a
fi

cd "$ROOT_DIR"

./scripts/fetch-openapi.sh "$VERSION"
EFFECTIVE_VERSION="$(jq -r '.version // empty' spec/version-metadata.json)"
if [[ -z "$EFFECTIVE_VERSION" ]]; then
  EFFECTIVE_VERSION="$VERSION"
fi

mkdir -p "$TMP_DIR"

# TypeScript generation
rm -rf ts/src
mkdir -p ts/src
rm -rf "$TMP_DIR/ts"
$GEN_CLI generate \
  -g typescript-fetch \
  -i spec/openapi.json \
  -o "$TMP_DIR/ts" \
  --skip-validate-spec \
  -c ts/openapi-generator-config.yml

rsync -a --delete \
  --include='*/' \
  --include='*.ts' \
  --exclude='*' \
  "$TMP_DIR/ts/" ts/src/

./scripts/postprocess-ts.sh

# Kotlin generation
rm -rf kotlin/src/main/kotlin
mkdir -p kotlin/src/main/kotlin
rm -rf "$TMP_DIR/kotlin"
$GEN_CLI generate \
  -g kotlin \
  -i spec/openapi.json \
  -o "$TMP_DIR/kotlin" \
  --skip-validate-spec \
  -c kotlin/openapi-generator-config.yml

if [[ -d "$TMP_DIR/kotlin/src/main/kotlin" ]]; then
  cp -R "$TMP_DIR/kotlin/src/main/kotlin/." kotlin/src/main/kotlin/
fi

./scripts/postprocess-kotlin.sh

# Swift generation (OpenAPI Generator swift5)
cp spec/openapi.json swift/openapi.json
rm -rf swift/Sources/BelongSDK
mkdir -p swift/Sources/BelongSDK
rm -rf "$TMP_DIR/swift"
$GEN_CLI generate \
  -g swift5 \
  -i swift/openapi.json \
  -o "$TMP_DIR/swift" \
  --skip-validate-spec \
  -c swift/openapi-generator-cli-config.yml

if [[ -d "$TMP_DIR/swift/Sources/BelongSDK" ]]; then
  cp -R "$TMP_DIR/swift/Sources/BelongSDK/." swift/Sources/BelongSDK/
else
  # Fallback for templates that emit top-level Swift files.
  find "$TMP_DIR/swift" -maxdepth 1 -type f -name '*.swift' -exec cp {} swift/Sources/BelongSDK/ \;
fi

./scripts/postprocess-swift.sh

# Align package versions
node -e "const fs=require('fs');const p='ts/package.json';const d=JSON.parse(fs.readFileSync(p));d.version=process.argv[1];fs.writeFileSync(p,JSON.stringify(d,null,2)+'\\n');" "$EFFECTIVE_VERSION"

sed -i.bak "s/^VERSION=.*/VERSION=$EFFECTIVE_VERSION/" kotlin/gradle.properties && rm -f kotlin/gradle.properties.bak
sed -i.bak "s/^let sdkVersion = \".*\"/let sdkVersion = \"$EFFECTIVE_VERSION\"/" swift/Package.swift && rm -f swift/Package.swift.bak

echo "Generated TypeScript, Kotlin, and Swift SDKs for version $EFFECTIVE_VERSION"
