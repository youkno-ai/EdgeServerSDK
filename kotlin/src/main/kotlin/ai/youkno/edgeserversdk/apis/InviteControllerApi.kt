package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUserInvite
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerInviteControllerCreateBountyInviteRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerInviteControllerCreateCompanyInviteRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerInviteControllerCreateGroupInviteRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerInviteControllerCreatePlatformInviteRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerInviteControllerGetInviteLinkRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerInviteControllerInvitesRolesResult
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerInviteControllerSendInvitesRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerInviteControllerSendInvitesResponse

interface InviteControllerApi {
    /**
     * DELETE api/v1/invites/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/invites/{inviteId}")
    fun deleteApiV1InvitesByInviteid(@Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>


    /**
    * enum for parameter statuses
    */
    enum class StatusesGetApiV1Invites(val value: kotlin.String) {
        @Json(name = "PENDING") PENDING("PENDING"),
        @Json(name = "CANCELED") CANCELED("CANCELED"),
        @Json(name = "DELETED") DELETED("DELETED"),
        @Json(name = "VOIDED") VOIDED("VOIDED"),
        @Json(name = "ACCEPTED") ACCEPTED("ACCEPTED"),
        @Json(name = "DECLINED") DECLINED("DECLINED"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/invites
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId  (optional)
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param statuses  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite]>
     */
    @GET("api/v1/invites")
    fun getApiV1Invites(@Query("companyId") companyId: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Query("statuses") statuses: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite>

    /**
     * GET api/v1/invites/bounty/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite]>
     */
    @GET("api/v1/invites/bounty/{bountyId}")
    fun getApiV1InvitesBountyByBountyid(@Path("bountyId") bountyId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite>

    /**
     * GET api/v1/invites/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @GET("api/v1/invites/{inviteId}")
    fun getApiV1InvitesByInviteid(@Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

    /**
     * GET api/v1/invites/company/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite]>
     */
    @GET("api/v1/invites/company/{companyId}")
    fun getApiV1InvitesCompanyByCompanyid(@Path("companyId") companyId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite>

    /**
     * GET api/v1/invites/deals/{dealId}/invites/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param dealId 
     * @param inviteId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @GET("api/v1/invites/deals/{dealId}/invites/{inviteId}")
    fun getApiV1InvitesDealsByDealidInvitesByInviteid(@Path("dealId") dealId: kotlin.String, @Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

    /**
     * GET api/v1/invites/group/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite]>
     */
    @GET("api/v1/invites/group/{groupId}")
    fun getApiV1InvitesGroupByGroupid(@Path("groupId") groupId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite>

    /**
     * GET api/v1/invites/platform
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite]>
     */
    @GET("api/v1/invites/platform")
    fun getApiV1InvitesPlatform(@Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserInvite>

    /**
     * GET api/v1/invites/roles
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerInviteControllerInvitesRolesResult]>
     */
    @GET("api/v1/invites/roles")
    fun getApiV1InvitesRoles(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerInviteControllerInvitesRolesResult>

    /**
     * POST api/v1/invites
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerInviteControllerSendInvitesRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerInviteControllerSendInvitesResponse]>
     */
    @Deprecated("This api was deprecated")
    @POST("api/v1/invites")
    fun postApiV1Invites(@Body coedgeappserverrestcontrollerInviteControllerSendInvitesRequest: CoedgeappserverrestcontrollerInviteControllerSendInvitesRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerInviteControllerSendInvitesResponse>

    /**
     * POST api/v1/invites/bounty/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappserverrestcontrollerInviteControllerCreateBountyInviteRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @POST("api/v1/invites/bounty/{bountyId}")
    fun postApiV1InvitesBountyByBountyid(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappserverrestcontrollerInviteControllerCreateBountyInviteRequest: CoedgeappserverrestcontrollerInviteControllerCreateBountyInviteRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

    /**
     * POST api/v1/invites/{inviteId}/resend
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/invites/{inviteId}/resend")
    fun postApiV1InvitesByInviteidResend(@Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * POST api/v1/invites/company/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param coedgeappserverrestcontrollerInviteControllerCreateCompanyInviteRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @POST("api/v1/invites/company/{companyId}")
    fun postApiV1InvitesCompanyByCompanyid(@Path("companyId") companyId: kotlin.String, @Body coedgeappserverrestcontrollerInviteControllerCreateCompanyInviteRequest: CoedgeappserverrestcontrollerInviteControllerCreateCompanyInviteRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

    /**
     * POST api/v1/invites/group/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param coedgeappserverrestcontrollerInviteControllerCreateGroupInviteRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @POST("api/v1/invites/group/{groupId}")
    fun postApiV1InvitesGroupByGroupid(@Path("groupId") groupId: kotlin.String, @Body coedgeappserverrestcontrollerInviteControllerCreateGroupInviteRequest: CoedgeappserverrestcontrollerInviteControllerCreateGroupInviteRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

    /**
     * POST api/v1/invites/link
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerInviteControllerGetInviteLinkRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @POST("api/v1/invites/link")
    fun postApiV1InvitesLink(@Body coedgeappserverrestcontrollerInviteControllerGetInviteLinkRequest: CoedgeappserverrestcontrollerInviteControllerGetInviteLinkRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

    /**
     * POST api/v1/invites/platform
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerInviteControllerCreatePlatformInviteRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @POST("api/v1/invites/platform")
    fun postApiV1InvitesPlatform(@Body coedgeappserverrestcontrollerInviteControllerCreatePlatformInviteRequest: CoedgeappserverrestcontrollerInviteControllerCreatePlatformInviteRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

    /**
     * PUT api/v1/invites/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param coedgeappservermodelUserInvite 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/invites/{inviteId}")
    fun putApiV1InvitesByInviteid(@Path("inviteId") inviteId: kotlin.String, @Body coedgeappservermodelUserInvite: CoedgeappservermodelUserInvite, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
