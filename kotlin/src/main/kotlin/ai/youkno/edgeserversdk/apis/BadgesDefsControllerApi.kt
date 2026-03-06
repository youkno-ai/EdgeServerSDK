package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AssignBadgeReq
import ai.youkno.edgeserversdk.models.Badge
import ai.youkno.edgeserversdk.models.BadgeDef
import ai.youkno.edgeserversdk.models.PageBadgeDef

interface BadgesDefsControllerApi {
    /**
     * POST api/v1/badges/defs/{badgeCode}/assign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeCode 
     * @param assignBadgeReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Badge]>
     */
    @POST("api/v1/badges/defs/{badgeCode}/assign")
    fun assignBadge(@Path("badgeCode") badgeCode: kotlin.String, @Body assignBadgeReq: AssignBadgeReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Badge>

    /**
     * DELETE api/v1/badges/{badgeCode}/{holderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeCode 
     * @param holderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/badges/{badgeCode}/{holderId}")
    fun deleteBadge(@Path("badgeCode") badgeCode: kotlin.String, @Path("holderId") holderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * DELETE api/v1/badges/defs/{badgeCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeCode 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/badges/defs/{badgeCode}")
    fun deleteBadgeDef(@Path("badgeCode") badgeCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * GET api/v1/badges/defs/{badgeCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeCode 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BadgeDef]>
     */
    @GET("api/v1/badges/defs/{badgeCode}")
    fun getBadgeDef(@Path("badgeCode") badgeCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BadgeDef>

    /**
     * GET api/v1/badges/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeDefType  (optional, default to "badge")
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageBadgeDef]>
     */
    @GET("api/v1/badges/defs")
    fun getBadgesDefs(@Query("badgeDefType") badgeDefType: kotlin.String? = "badge", @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageBadgeDef>

    /**
     * POST api/v1/badges/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BadgeDef]>
     */
    @POST("api/v1/badges/defs")
    fun saveBadgeDef(@Body badgeDef: BadgeDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BadgeDef>

}
