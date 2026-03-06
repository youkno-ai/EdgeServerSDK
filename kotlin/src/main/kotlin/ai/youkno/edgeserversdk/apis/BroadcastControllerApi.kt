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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BroadcastToken]>
     */
    @GET("api/v1/broadcast/{stream_id}/token")
    fun getBroadcastToken(@Path("stream_id") streamId: kotlin.String, @Query("type") type: kotlin.String, @Query("expireDate") expireDate: kotlin.Long? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BroadcastToken>

}
