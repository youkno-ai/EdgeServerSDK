package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AuthAuthTokens
import ai.youkno.edgeserversdk.models.RestControllerAuthControllerExchangeRequest
import ai.youkno.edgeserversdk.models.RestControllerAuthControllerLogoutRequest
import ai.youkno.edgeserversdk.models.RestControllerAuthControllerRefreshRequest

interface AuthControllerApi {
    /**
     * POST api/v1/auth/exchange
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @param restControllerAuthControllerExchangeRequest  (optional)
     * @return [Call]<[AuthAuthTokens]>
     */
    @POST("api/v1/auth/exchange")
    fun postApiV1AuthExchange(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body restControllerAuthControllerExchangeRequest: RestControllerAuthControllerExchangeRequest? = null): Call<AuthAuthTokens>

    /**
     * POST api/v1/auth/logout
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @param restControllerAuthControllerLogoutRequest  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/auth/logout")
    fun postApiV1AuthLogout(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body restControllerAuthControllerLogoutRequest: RestControllerAuthControllerLogoutRequest? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/auth/logout-all
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/auth/logout-all")
    fun postApiV1AuthLogoutAll(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/auth/refresh
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAuthControllerRefreshRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AuthAuthTokens]>
     */
    @POST("api/v1/auth/refresh")
    fun postApiV1AuthRefresh(@Body restControllerAuthControllerRefreshRequest: RestControllerAuthControllerRefreshRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AuthAuthTokens>

}
