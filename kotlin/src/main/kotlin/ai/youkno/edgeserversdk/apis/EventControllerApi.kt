package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Event
import ai.youkno.edgeserversdk.models.NewId

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
     * @return [Call]<[kotlin.collections.List<Event>]>
     */
    @GET("api/v1/acts/events")
    fun getApiV1ActsEvents(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Event>>

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
     * @return [Call]<[Event]>
     */
    @GET("api/v1/acts/events/{eventId}")
    fun getApiV1ActsEventsByEventid(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Event>

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
     * @return [Call]<[kotlin.collections.List<Event>]>
     */
    @GET("api/v1/acts/events/{venueId}")
    fun getApiV1ActsEventsByVenueid(@Path("venueId") venueId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Event>>

    /**
     * PATCH api/v1/acts/events/{eventId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param event 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Event]>
     */
    @PATCH("api/v1/acts/events/{eventId}")
    fun patchApiV1ActsEventsByEventid(@Path("eventId") eventId: kotlin.String, @Body event: Event, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Event>

    /**
     * POST api/v1/acts/events
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param event 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/acts/events")
    fun postApiV1ActsEvents(@Body event: Event, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NewId>

}
