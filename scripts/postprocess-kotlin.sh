#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
KOTLIN_ROOT="$ROOT_DIR/kotlin/src/main/kotlin/ai/youkno/edgeserversdk"

CLIENT_API_FILE="$KOTLIN_ROOT/apis/ClientControllerApi.kt"
OPEN_API_FILE="$KOTLIN_ROOT/apis/OpenControllerApi.kt"
CLIENT_HELPER_FILE="$ROOT_DIR/kotlin/src/main/kotlin/ai/youkno/edgeserversdk/EdgeSdkClientFactory.kt"

[[ -f "$CLIENT_API_FILE" ]] || { echo "Missing $CLIENT_API_FILE" >&2; exit 1; }
[[ -f "$OPEN_API_FILE" ]] || { echo "Missing $OPEN_API_FILE" >&2; exit 1; }

# Create SDK-level client helper for shared defaults.
cat > "$CLIENT_HELPER_FILE" <<'EOF'
package ai.youkno.edgeserversdk

import ai.youkno.edgeserversdk.auth.ApiKeyAuth
import ai.youkno.edgeserversdk.infrastructure.ApiClient
import okhttp3.Interceptor
import okhttp3.OkHttpClient

data class EdgeSdkClientOptions(
    val baseUrl: String,
    val bearerToken: String? = null,
    val xEdgeAgent: String? = null,
    val xEdgeState: String? = null,
    val xEdgeClientId: String? = null
)

object EdgeSdkClientFactory {
    fun createApiClient(options: EdgeSdkClientOptions): ApiClient {
        val headerInterceptor = Interceptor { chain ->
            val builder = chain.request().newBuilder()
            options.xEdgeAgent?.let { builder.addHeader("X-edge-agent", it) }
            options.xEdgeState?.let { builder.addHeader("X-edge-state", it) }
            options.xEdgeClientId?.let { builder.addHeader("X-edge-client-id", it) }
            chain.proceed(builder.build())
        }

        val okHttpBuilder = OkHttpClient.Builder().addInterceptor(headerInterceptor)
        val apiClient = ApiClient(baseUrl = options.baseUrl, okHttpClientBuilder = okHttpBuilder)

        options.bearerToken?.let {
            apiClient.addAuthorization("JWT", ApiKeyAuth("header", "Authorization", "Bearer $it"))
        }

        return apiClient
    }

    inline fun <reified S> createService(options: EdgeSdkClientOptions): S {
        return createApiClient(options).createService(S::class.java)
    }
}
EOF

echo "Applied Kotlin post-generation patches"
