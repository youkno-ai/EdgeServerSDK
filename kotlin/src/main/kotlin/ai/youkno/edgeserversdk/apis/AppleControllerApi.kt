package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json


interface AppleControllerApi {
    /**
     * POST api/v1/apple/auth/callback
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code  (optional)
     * @param state  (optional)
     * @param idToken  (optional)
     * @param user  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/apple/auth/callback")
    fun authCallback(@Query("code") code: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Query("id_token") idToken: kotlin.String? = null, @Query("user") user: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * GET api/v1/apple/transaction/{transactionId}/process
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param transactionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @GET("api/v1/apple/transaction/{transactionId}/process")
    fun processTransaction(@Path("transactionId") transactionId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

}
