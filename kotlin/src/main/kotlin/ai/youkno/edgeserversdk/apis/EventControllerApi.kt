package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataNewId
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEvent

interface EventControllerApi {
    /**
     * DELETE api/v1/acts/events/{eventId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/acts/events/{eventId}")
    fun deleteApiV1ActsEventsByEventid(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/acts/events
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelEvent>]>
     */
    @GET("api/v1/acts/events")
    fun getApiV1ActsEvents(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelEvent>>

    /**
     * GET api/v1/acts/events/{eventId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEvent]>
     */
    @GET("api/v1/acts/events/{eventId}")
    fun getApiV1ActsEventsByEventid(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEvent>

    /**
     * GET api/v1/acts/events/{venueId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param venueId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelEvent>]>
     */
    @GET("api/v1/acts/events/{venueId}")
    fun getApiV1ActsEventsByVenueid(@Path("venueId") venueId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelEvent>>

    /**
     * PATCH api/v1/acts/events/{eventId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param coedgeappservermodelEvent 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEvent]>
     */
    @PATCH("api/v1/acts/events/{eventId}")
    fun patchApiV1ActsEventsByEventid(@Path("eventId") eventId: kotlin.String, @Body coedgeappservermodelEvent: CoedgeappservermodelEvent, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEvent>

    /**
     * POST api/v1/acts/events
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelEvent 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataNewId]>
     */
    @POST("api/v1/acts/events")
    fun postApiV1ActsEvents(@Body coedgeappservermodelEvent: CoedgeappservermodelEvent, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataNewId>

}
