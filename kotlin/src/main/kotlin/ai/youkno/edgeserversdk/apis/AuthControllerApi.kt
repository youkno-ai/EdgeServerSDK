package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AuthTokens
import ai.youkno.edgeserversdk.models.ExchangeRequest
import ai.youkno.edgeserversdk.models.LogoutRequest
import ai.youkno.edgeserversdk.models.RefreshRequest

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
     * @param exchangeRequest  (optional)
     * @return [Call]<[AuthTokens]>
     */
    @POST("api/v1/auth/exchange")
    fun postApiV1AuthExchange(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body exchangeRequest: ExchangeRequest? = null): Call<AuthTokens>

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
     * @param logoutRequest  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/auth/logout")
    fun postApiV1AuthLogout(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body logoutRequest: LogoutRequest? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param refreshRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AuthTokens]>
     */
    @POST("api/v1/auth/refresh")
    fun postApiV1AuthRefresh(@Body refreshRequest: RefreshRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AuthTokens>

}
