package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.BiletePage
import ai.youkno.edgeserversdk.models.TicketDetails

interface BileteControllerApi {
    /**
     * GET api/v1/tmp/bilete/callbacks/buy
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticketCount  (optional)
     * @param totalAmount  (optional)
     * @param userEmail  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/tmp/bilete/callbacks/buy")
    fun buyCallback(@Query("ticketCount") ticketCount: kotlin.Int? = null, @Query("totalAmount") totalAmount: kotlin.Double? = null, @Query("userEmail") userEmail: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

    /**
     * GET api/v1/bilete/callbacks/buy
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param ticketCount  (optional)
     * @param totalAmount  (optional)
     * @param userEmail  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @GET("api/v1/bilete/callbacks/buy")
    fun buyCallback1(@Query("ticketCount") ticketCount: kotlin.Int? = null, @Query("totalAmount") totalAmount: kotlin.Double? = null, @Query("userEmail") userEmail: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

    /**
     * GET api/v1/tmp/bilete/details
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[TicketDetails]>
     */
    @GET("api/v1/tmp/bilete/details")
    fun getTicketDetails(@Query("url") url: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<TicketDetails>

    /**
     * GET api/v1/bilete/details
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[TicketDetails]>
     */
    @GET("api/v1/bilete/details")
    fun getTicketDetails1(@Query("url") url: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<TicketDetails>

    /**
     * GET api/v1/bilete
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param email  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BiletePage]>
     */
    @GET("api/v1/bilete")
    fun getTickets(@Query("email") email: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BiletePage>

    /**
     * GET api/v1/tmp/bilete
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param email  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BiletePage]>
     */
    @GET("api/v1/tmp/bilete")
    fun getTickets1(@Query("email") email: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BiletePage>

}
