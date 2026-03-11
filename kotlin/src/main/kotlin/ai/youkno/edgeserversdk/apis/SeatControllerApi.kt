package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.NewId
import ai.youkno.edgeserversdk.models.Seat

interface SeatControllerApi {
    /**
     * DELETE api/v1/seats/{seatId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param seatId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/seats/{seatId}")
    fun deleteApiV1SeatsBySeatid(@Path("seatId") seatId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/seats/{seatId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param seatId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Seat]>
     */
    @GET("api/v1/seats/{seatId}")
    fun getApiV1SeatsBySeatid(@Path("seatId") seatId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Seat>

    /**
     * GET api/v1/seats/byEventId/{eventId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Seat>]>
     */
    @GET("api/v1/seats/byEventId/{eventId}")
    fun getApiV1SeatsByeventidByEventid(@Path("eventId") eventId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Seat>>

    /**
     * GET api/v1/seats/byUserId/{userId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Seat>]>
     */
    @GET("api/v1/seats/byUserId/{userId}")
    fun getApiV1SeatsByuseridByUserid(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Seat>>

    /**
     * PATCH api/v1/seats/{seatId}/reserve
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param seatId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PATCH("api/v1/seats/{seatId}/reserve")
    fun patchApiV1SeatsBySeatidReserve(@Path("seatId") seatId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/seats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param seat 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/seats")
    fun postApiV1Seats(@Body seat: Seat, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NewId>

    /**
     * POST api/v1/seats/{seatId}/buy
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param seatId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/seats/{seatId}/buy")
    fun postApiV1SeatsBySeatidBuy(@Path("seatId") seatId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NewId>

}
