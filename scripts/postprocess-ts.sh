#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
TS_ROOT="$ROOT_DIR/ts/src/src"

ENTRYPOINT_FILE="$TS_ROOT/index.ts"
CLIENT_HELPER_FILE="$TS_ROOT/client.ts"

[[ -f "$ENTRYPOINT_FILE" ]] || { echo "Missing $ENTRYPOINT_FILE" >&2; exit 1; }

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
