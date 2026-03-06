package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataGeofencesResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataGeofencesResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelGeofences

interface GeofencesControllerApi {
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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/geofences/{bountyId}")
    fun deleteApiV1GeofencesByBountyid(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataGeofencesResp]>
     */
    @GET("api/v1/geofences")
    fun getApiV1Geofences(@Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataGeofencesResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataGeofencesResp]>
     */
    @GET("api/v1/geofences/{bountyId}")
    fun getApiV1GeofencesByBountyid(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataGeofencesResp>

    /**
     * POST api/v1/geofences
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelGeofences 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataGeofencesResp]>
     */
    @POST("api/v1/geofences")
    fun postApiV1Geofences(@Body coedgeappservermodelGeofences: CoedgeappservermodelGeofences, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataGeofencesResp>

    /**
     * PUT api/v1/geofences/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappservermodelGeofences 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataGeofencesResp]>
     */
    @PUT("api/v1/geofences/{bountyId}")
    fun putApiV1GeofencesByBountyid(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelGeofences: CoedgeappservermodelGeofences, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataGeofencesResp>

}
