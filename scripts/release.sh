#!/usr/bin/env bash
set -euo pipefail

VERSION="${1:-}"
if [[ -z "$VERSION" ]]; then
  echo "Usage: $0 <VERSION>" >&2
  exit 1
fi

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$ROOT_DIR"

./scripts/generate-all.sh "$VERSION"
EFFECTIVE_VERSION="$(awk -F= '/^VERSION=/{print $2}' kotlin/gradle.properties | tr -d '[:space:]')"
if [[ -z "$EFFECTIVE_VERSION" ]]; then
  EFFECTIVE_VERSION="$VERSION"
fi

git add ts kotlin swift scripts README.md bitbucket-pipelines.yml .gitignore LICENSE

git commit -m "SDK release $EFFECTIVE_VERSION"
git tag "sdk-$EFFECTIVE_VERSION"
git tag "$EFFECTIVE_VERSION"

git push
git push origin "sdk-$EFFECTIVE_VERSION"
git push origin "$EFFECTIVE_VERSION"

echo "Released SDK version $EFFECTIVE_VERSION"
