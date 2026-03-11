package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.NewId
import ai.youkno.edgeserversdk.models.Ticket
import ai.youkno.edgeserversdk.models.TicketScan

interface TicketControllerApi {
    /**
     * GET api/v1/tickets/{ticketId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticketId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Ticket]>
     */
    @GET("api/v1/tickets/{ticketId}")
    fun getApiV1TicketsByTicketid(@Path("ticketId") ticketId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Ticket>

    /**
     * GET api/v1/tickets/{ticketId}/scans
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticketId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<TicketScan>]>
     */
    @GET("api/v1/tickets/{ticketId}/scans")
    fun getApiV1TicketsByTicketidScans(@Path("ticketId") ticketId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<TicketScan>>

    /**
     * GET api/v1/tickets/byEventId/{eventId}/available
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Ticket>]>
     */
    @GET("api/v1/tickets/byEventId/{eventId}/available")
    fun getApiV1TicketsByeventidByEventidAvailable(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Ticket>>

    /**
     * GET api/v1/tickets/byEventId/{eventId}/byStatus/{status}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param status 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Ticket>]>
     */
    @GET("api/v1/tickets/byEventId/{eventId}/byStatus/{status}")
    fun getApiV1TicketsByeventidByEventidBystatusByStatus(@Path("eventId") eventId: kotlin.String, @Path("status") status: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Ticket>>

    /**
     * GET api/v1/tickets/byUserId/{userId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Ticket>]>
     */
    @GET("api/v1/tickets/byUserId/{userId}")
    fun getApiV1TicketsByuseridByUserid(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Ticket>>

    /**
     * POST api/v1/tickets
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticket 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/tickets")
    fun postApiV1Tickets(@Body ticket: Ticket, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NewId>

    /**
     * POST api/v1/tickets/{ticketId}/scan
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticketId 
     * @param ticketScan 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/tickets/{ticketId}/scan")
    fun postApiV1TicketsByTicketidScan(@Path("ticketId") ticketId: kotlin.String, @Body ticketScan: TicketScan, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
