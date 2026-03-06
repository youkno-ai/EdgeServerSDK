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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Badge]>
     */
    @POST("api/v1/badges/defs/{badgeCode}/assign")
    fun assignBadge(@Path("badgeCode") badgeCode: kotlin.String, @Body assignBadgeReq: AssignBadgeReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Badge>

    /**
     * DELETE api/v1/badges/{badgeCode}/{holderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeCode 
     * @param holderId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/badges/{badgeCode}/{holderId}")
    fun deleteBadge(@Path("badgeCode") badgeCode: kotlin.String, @Path("holderId") holderId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * DELETE api/v1/badges/defs/{badgeCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeCode 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/badges/defs/{badgeCode}")
    fun deleteBadgeDef(@Path("badgeCode") badgeCode: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/badges/defs/{badgeCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeCode 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BadgeDef]>
     */
    @GET("api/v1/badges/defs/{badgeCode}")
    fun getBadgeDef(@Path("badgeCode") badgeCode: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BadgeDef>

    /**
     * GET api/v1/badges/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeDefType  (optional, default to "badge")
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageBadgeDef]>
     */
    @GET("api/v1/badges/defs")
    fun getBadgesDefs(@Query("badgeDefType") badgeDefType: kotlin.String? = "badge", @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageBadgeDef>

    /**
     * POST api/v1/badges/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeDef 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BadgeDef]>
     */
    @POST("api/v1/badges/defs")
    fun saveBadgeDef(@Body badgeDef: BadgeDef, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BadgeDef>

}
