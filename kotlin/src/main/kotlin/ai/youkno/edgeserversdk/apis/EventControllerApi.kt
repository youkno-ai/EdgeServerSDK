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
     * POST api/v1/acts/events
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param event 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/acts/events")
    fun create3(@Body event: Event, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<NewId>

    /**
     * DELETE api/v1/acts/events/{eventId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/acts/events/{eventId}")
    fun delete2(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/acts/events
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Event>]>
     */
    @GET("api/v1/acts/events")
    fun getAll1(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Event>>

    /**
     * GET api/v1/acts/events/{venueId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param venueId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Event>]>
     */
    @GET("api/v1/acts/events/{venueId}")
    fun getAllByVenueId(@Path("venueId") venueId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Event>>

    /**
     * GET api/v1/acts/events/{eventId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Event]>
     */
    @GET("api/v1/acts/events/{eventId}")
    fun getById1(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Event>

    /**
     * PATCH api/v1/acts/events/{eventId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param event 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Event]>
     */
    @PATCH("api/v1/acts/events/{eventId}")
    fun update1(@Path("eventId") eventId: kotlin.String, @Body event: Event, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Event>

}
