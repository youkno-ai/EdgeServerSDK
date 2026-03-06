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
    fun create1(@Body ticket: Ticket, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NewId>

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
    fun getAllByAppUserId(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Ticket>>

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
    fun getAllByStatus(@Path("eventId") eventId: kotlin.String, @Path("status") status: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Ticket>>

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
    fun getAvailableTickets(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Ticket>>

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
    fun getById2(@Path("ticketId") ticketId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Ticket>

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
    fun getTicketScansByTicketId(@Path("ticketId") ticketId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<TicketScan>>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/tickets/{ticketId}/scan")
    fun scanTicket(@Path("ticketId") ticketId: kotlin.String, @Body ticketScan: TicketScan, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

}
