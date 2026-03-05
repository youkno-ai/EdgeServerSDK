#!/usr/bin/env bash
set -euo pipefail

VERSION="${1:-latest}"

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
if [[ -f "$ROOT_DIR/.env.local" ]]; then
  set -a
  # shellcheck disable=SC1091
  source "$ROOT_DIR/.env.local"
  set +a
fi

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
