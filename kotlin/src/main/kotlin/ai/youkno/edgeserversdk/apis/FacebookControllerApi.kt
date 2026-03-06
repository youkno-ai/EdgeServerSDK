package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappserverthirdpartiesFacebookDeleteUserCallbackResp

interface FacebookControllerApi {
    /**
     * GET api/v1/facebook/status/{state}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state 
     * @param userId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("api/v1/facebook/status/{state}")
    fun getApiV1FacebookStatusByState(@Path("state") state: kotlin.String, @Query("user_id") userId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/facebook/callbacks/deauthorize/{state}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/facebook/callbacks/deauthorize/{state}")
    fun postApiV1FacebookCallbacksDeauthorizeByState(@Path("state") state: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/facebook/callbacks/user-data-deletion/{state}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverthirdpartiesFacebookDeleteUserCallbackResp]>
     */
    @POST("api/v1/facebook/callbacks/user-data-deletion/{state}")
    fun postApiV1FacebookCallbacksUserDataDeletionByState(@Path("state") state: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverthirdpartiesFacebookDeleteUserCallbackResp>

}
