#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
TS_ROOT="$ROOT_DIR/ts/src/src"

USER_API_FILE="$TS_ROOT/apis/UserControllerApi.ts"
TWILIO_API_FILE="$TS_ROOT/apis/TwilioControllerApi.ts"
BUSINESS_TYPES_FILE="$TS_ROOT/models/BusinessTypesResp.ts"
ENTRYPOINT_FILE="$TS_ROOT/index.ts"
CLIENT_HELPER_FILE="$TS_ROOT/client.ts"

[[ -f "$USER_API_FILE" ]] || { echo "Missing $USER_API_FILE" >&2; exit 1; }
[[ -f "$TWILIO_API_FILE" ]] || { echo "Missing $TWILIO_API_FILE" >&2; exit 1; }
[[ -f "$BUSINESS_TYPES_FILE" ]] || { echo "Missing $BUSINESS_TYPES_FILE" >&2; exit 1; }
[[ -f "$ENTRYPOINT_FILE" ]] || { echo "Missing $ENTRYPOINT_FILE" >&2; exit 1; }

# Fix name collision between model UpdateUserRequest and operation payload type.
perl -0pi -e 's/export interface UpdateUserRequest \{/export interface UpdateUserOperationRequest {/g' "$USER_API_FILE"
perl -0pi -e 's/requestParameters: UpdateUserRequest, initOverrides\?/requestParameters: UpdateUserOperationRequest, initOverrides?/g' "$USER_API_FILE"

# Fix missing helper symbol emitted by generator for Twilio form payload.
perl -0pi -e 's/JSON\.stringify\(stringToJSON\(requestParameters\[\x27paramMap\x27\]\)\)/JSON.stringify(requestParameters[\x27paramMap\x27])/g' "$TWILIO_API_FILE"

# Fix invalid enum type alias emitted in BusinessTypesResp.
perl -0pi -e 's/Array<InnerEnum>/Array<BusinessTypesRespTypesEnum>/g' "$BUSINESS_TYPES_FILE"

# Prevent duplicate export name collisions between API operation payload types and models.
cat > "$ENTRYPOINT_FILE" <<'EOF'
/* tslint:disable */
/* eslint-disable */
export * from './runtime';
export * from './client';
export * as apis from './apis/index';
export * as models from './models/index';
EOF

# Create SDK-level client helper for shared defaults.
cat > "$CLIENT_HELPER_FILE" <<'EOF'
/* tslint:disable */
/* eslint-disable */
import { Configuration, type ConfigurationParameters, type HTTPHeaders } from './runtime';

export interface EdgeSdkClientOptions {
  basePath: string;
  bearerToken?: string;
  xEdgeAgent?: string;
  xEdgeState?: string;
  xEdgeClientId?: string;
  headers?: HTTPHeaders;
}

export function createEdgeConfiguration(options: EdgeSdkClientOptions): Configuration {
  const defaultHeaders: HTTPHeaders = {
    ...(options.xEdgeAgent ? { 'X-edge-agent': options.xEdgeAgent } : {}),
    ...(options.xEdgeState ? { 'X-edge-state': options.xEdgeState } : {}),
    ...(options.xEdgeClientId ? { 'X-edge-client-id': options.xEdgeClientId } : {}),
    ...(options.bearerToken ? { Authorization: `Bearer ${options.bearerToken}` } : {}),
    ...(options.headers ?? {}),
  };

  const parameters: ConfigurationParameters = {
    basePath: options.basePath,
    headers: defaultHeaders,
  };

  return new Configuration(parameters);
}
EOF

echo "Applied TypeScript post-generation patches"
