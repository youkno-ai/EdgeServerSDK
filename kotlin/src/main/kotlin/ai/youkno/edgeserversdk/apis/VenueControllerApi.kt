package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.NewId
import ai.youkno.edgeserversdk.models.Venue

interface VenueControllerApi {
    /**
     * DELETE api/v1/venues/{venueId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param venueId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/venues/{venueId}")
    fun deleteApiV1VenuesByVenueid(@Path("venueId") venueId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/venues
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Venue>]>
     */
    @GET("api/v1/venues")
    fun getApiV1Venues(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Venue>>

    /**
     * GET api/v1/venues/{venueId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param venueId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Venue]>
     */
    @GET("api/v1/venues/{venueId}")
    fun getApiV1VenuesByVenueid(@Path("venueId") venueId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Venue>

    /**
     * GET api/v1/venues/byCompany/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Venue>]>
     */
    @GET("api/v1/venues/byCompany/{companyId}")
    fun getApiV1VenuesBycompanyByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Venue>>

    /**
     * PATCH api/v1/venues/{venueId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param venueId 
     * @param venue 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Venue]>
     */
    @PATCH("api/v1/venues/{venueId}")
    fun patchApiV1VenuesByVenueid(@Path("venueId") venueId: kotlin.String, @Body venue: Venue, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Venue>

    /**
     * POST api/v1/venues
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param venue 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/venues")
    fun postApiV1Venues(@Body venue: Venue, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NewId>

}
