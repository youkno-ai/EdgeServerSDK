#!/usr/bin/env bash
set -euo pipefail

VERSION="${1:-latest}"
VERSIONS_INDEX_URL="${VERSIONS_INDEX_URL:-https://belong-openapi.web.app/api/versions.json}"
OPENAPI_SPEC_URL_TEMPLATE="${OPENAPI_SPEC_URL_TEMPLATE:-https://belong-openapi.web.app/api/<VERSION>/openapi.json}"

if ! command -v jq >/dev/null 2>&1; then
  echo "jq is required" >&2
  exit 1
fi

mkdir -p spec
VERSIONS_JSON="$(mktemp)"
trap 'rm -f "$VERSIONS_JSON"' EXIT

curl -fSL "$VERSIONS_INDEX_URL" -o "$VERSIONS_JSON"

if [[ "$VERSION" == "latest" ]]; then
  RESOLVED_VERSION="$(jq -r '.latest // empty' "$VERSIONS_JSON")"
else
  RESOLVED_VERSION="$VERSION"
fi

if [[ -z "$RESOLVED_VERSION" ]]; then
  echo "Could not resolve version from $VERSIONS_INDEX_URL" >&2
  exit 1
fi

SPEC_URL="$(jq -r --arg v "$RESOLVED_VERSION" '.versions[] | select(.version == $v) | .openapiUrl' "$VERSIONS_JSON" | head -n1)"
if [[ -z "$SPEC_URL" || "$SPEC_URL" == "null" ]]; then
  SPEC_URL="${OPENAPI_SPEC_URL_TEMPLATE/<VERSION>/$RESOLVED_VERSION}"
fi

curl -fSL "$SPEC_URL" -o spec/openapi.json
cp "$VERSIONS_JSON" spec/versions.json
jq -r --arg v "$RESOLVED_VERSION" '.versions[] | select(.version == $v)' "$VERSIONS_JSON" > spec/version-metadata.json

echo "Downloaded OpenAPI spec for version $RESOLVED_VERSION from $SPEC_URL"
