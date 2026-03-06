package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.BroadcastToken

interface BroadcastControllerApi {
    /**
     * GET api/v1/broadcast/{stream_id}/token
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param streamId 
     * @param type 
     * @param expireDate  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BroadcastToken]>
     */
    @GET("api/v1/broadcast/{stream_id}/token")
    fun getBroadcastToken(@Path("stream_id") streamId: kotlin.String, @Query("type") type: kotlin.String, @Query("expireDate") expireDate: kotlin.Long? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BroadcastToken>

}
