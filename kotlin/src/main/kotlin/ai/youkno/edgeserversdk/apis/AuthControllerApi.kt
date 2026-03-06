package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappserverauthAuthTokens
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAuthControllerExchangeRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAuthControllerLogoutRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAuthControllerRefreshRequest

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
     * @param coedgeappserverrestcontrollerAuthControllerExchangeRequest  (optional)
     * @return [Call]<[CoedgeappserverauthAuthTokens]>
     */
    @POST("api/v1/auth/exchange")
    fun postApiV1AuthExchange(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body coedgeappserverrestcontrollerAuthControllerExchangeRequest: CoedgeappserverrestcontrollerAuthControllerExchangeRequest? = null): Call<CoedgeappserverauthAuthTokens>

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
     * @param coedgeappserverrestcontrollerAuthControllerLogoutRequest  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/auth/logout")
    fun postApiV1AuthLogout(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body coedgeappserverrestcontrollerAuthControllerLogoutRequest: CoedgeappserverrestcontrollerAuthControllerLogoutRequest? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param coedgeappserverrestcontrollerAuthControllerRefreshRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverauthAuthTokens]>
     */
    @POST("api/v1/auth/refresh")
    fun postApiV1AuthRefresh(@Body coedgeappserverrestcontrollerAuthControllerRefreshRequest: CoedgeappserverrestcontrollerAuthControllerRefreshRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverauthAuthTokens>

}
