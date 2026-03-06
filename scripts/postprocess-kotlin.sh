#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
KOTLIN_ROOT="$ROOT_DIR/kotlin/src/main/kotlin/ai/youkno/edgeserversdk"

CLIENT_API_FILE="$KOTLIN_ROOT/apis/ClientControllerApi.kt"
OPEN_API_FILE="$KOTLIN_ROOT/apis/OpenControllerApi.kt"
DEJAVOO_FILE="$KOTLIN_ROOT/models/DejavooTransactionData.kt"

[[ -f "$CLIENT_API_FILE" ]] || { echo "Missing $CLIENT_API_FILE" >&2; exit 1; }
[[ -f "$OPEN_API_FILE" ]] || { echo "Missing $OPEN_API_FILE" >&2; exit 1; }
[[ -f "$DEJAVOO_FILE" ]] || { echo "Missing $DEJAVOO_FILE" >&2; exit 1; }

# Fix duplicate query parameter names emitted in long signatures.
perl -0pi -e 's/(\@Query\("length"\)\s+length:\s+[^,]+,\s+\@Query\("ignoreCache"\)\s+)ignoreCache:/$1ignoreCacheSecondary:/g' "$CLIENT_API_FILE" "$OPEN_API_FILE"

# Fix duplicate property names from differently-cased JSON keys.
perl -0pi -e 's/(\@Json\(name = "LTaxAmount"\)\s+val\s+)ltaxAmount:/${1}ltaxAmountUpper:/g' "$DEJAVOO_FILE"
perl -0pi -e 's/(\@Json\(name = "STaxAmount"\)\s+val\s+)staxAmount:/${1}staxAmountUpper:/g' "$DEJAVOO_FILE"

echo "Applied Kotlin post-generation patches"
