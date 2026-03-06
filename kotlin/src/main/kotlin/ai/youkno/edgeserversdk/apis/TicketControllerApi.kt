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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/tickets")
    fun create1(@Body ticket: Ticket, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<NewId>

    /**
     * GET api/v1/tickets/byUserId/{userId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Ticket>]>
     */
    @GET("api/v1/tickets/byUserId/{userId}")
    fun getAllByAppUserId(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Ticket>>

    /**
     * GET api/v1/tickets/byEventId/{eventId}/byStatus/{status}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param status 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Ticket>]>
     */
    @GET("api/v1/tickets/byEventId/{eventId}/byStatus/{status}")
    fun getAllByStatus(@Path("eventId") eventId: kotlin.String, @Path("status") status: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Ticket>>

    /**
     * GET api/v1/tickets/byEventId/{eventId}/available
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Ticket>]>
     */
    @GET("api/v1/tickets/byEventId/{eventId}/available")
    fun getAvailableTickets(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Ticket>>

    /**
     * GET api/v1/tickets/{ticketId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticketId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Ticket]>
     */
    @GET("api/v1/tickets/{ticketId}")
    fun getById2(@Path("ticketId") ticketId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Ticket>

    /**
     * GET api/v1/tickets/{ticketId}/scans
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticketId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<TicketScan>]>
     */
    @GET("api/v1/tickets/{ticketId}/scans")
    fun getTicketScansByTicketId(@Path("ticketId") ticketId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<TicketScan>>

    /**
     * POST api/v1/tickets/{ticketId}/scan
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticketId 
     * @param ticketScan 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/tickets/{ticketId}/scan")
    fun scanTicket(@Path("ticketId") ticketId: kotlin.String, @Body ticketScan: TicketScan, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

}
