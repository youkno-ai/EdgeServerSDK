package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Geofences
import ai.youkno.edgeserversdk.models.GeofencesResp
import ai.youkno.edgeserversdk.models.PageGeofencesResp

interface GeofencesControllerApi {
    /**
     * POST api/v1/geofences
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param geofences 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[GeofencesResp]>
     */
    @POST("api/v1/geofences")
    fun createGeofences(@Body geofences: Geofences, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<GeofencesResp>

    /**
     * DELETE api/v1/geofences/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/geofences/{bountyId}")
    fun deleteGeofences(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * GET api/v1/geofences
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param ignoreCache  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageGeofencesResp]>
     */
    @GET("api/v1/geofences")
    fun getAllGeofences(@Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageGeofencesResp>

    /**
     * GET api/v1/geofences/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[GeofencesResp]>
     */
    @GET("api/v1/geofences/{bountyId}")
    fun getGeofences(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<GeofencesResp>

    /**
     * PUT api/v1/geofences/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param geofences 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[GeofencesResp]>
     */
    @PUT("api/v1/geofences/{bountyId}")
    fun updateGeofences(@Path("bountyId") bountyId: kotlin.String, @Body geofences: Geofences, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<GeofencesResp>

}
