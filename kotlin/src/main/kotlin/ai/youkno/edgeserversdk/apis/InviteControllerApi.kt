package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CreateBountyInviteRequest
import ai.youkno.edgeserversdk.models.CreateCompanyInviteRequest
import ai.youkno.edgeserversdk.models.CreateGroupInviteRequest
import ai.youkno.edgeserversdk.models.CreatePlatformInviteRequest
import ai.youkno.edgeserversdk.models.GetInviteLinkRequest
import ai.youkno.edgeserversdk.models.InvitesRolesResult
import ai.youkno.edgeserversdk.models.PageUserInvite
import ai.youkno.edgeserversdk.models.SendInvitesRequest
import ai.youkno.edgeserversdk.models.SendInvitesResponse
import ai.youkno.edgeserversdk.models.UserInvite

interface InviteControllerApi {
    /**
     * DELETE api/v1/invites/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/invites/{inviteId}")
    fun cancelInvite(@Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

    /**
     * POST api/v1/invites/bounty/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param createBountyInviteRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @POST("api/v1/invites/bounty/{bountyId}")
    fun createInviteForBounty(@Path("bountyId") bountyId: kotlin.String, @Body createBountyInviteRequest: CreateBountyInviteRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>

    /**
     * POST api/v1/invites/company/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param createCompanyInviteRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @POST("api/v1/invites/company/{companyId}")
    fun createInviteForCompany(@Path("companyId") companyId: kotlin.String, @Body createCompanyInviteRequest: CreateCompanyInviteRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>

    /**
     * POST api/v1/invites/group/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param createGroupInviteRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @POST("api/v1/invites/group/{groupId}")
    fun createInviteForGroup(@Path("groupId") groupId: kotlin.String, @Body createGroupInviteRequest: CreateGroupInviteRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>

    /**
     * POST api/v1/invites/platform
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createPlatformInviteRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @POST("api/v1/invites/platform")
    fun createInviteForPlatform(@Body createPlatformInviteRequest: CreatePlatformInviteRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>

    /**
     * PUT api/v1/invites/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param userInvite 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/invites/{inviteId}")
    fun editInviteLink1(@Path("inviteId") inviteId: kotlin.String, @Body userInvite: UserInvite, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/invites/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @GET("api/v1/invites/{inviteId}")
    fun getInviteLink1(@Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>

    /**
     * GET api/v1/invites/deals/{dealId}/invites/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param dealId 
     * @param inviteId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @GET("api/v1/invites/deals/{dealId}/invites/{inviteId}")
    fun getInviteLink2(@Path("dealId") dealId: kotlin.String, @Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>


    /**
    * enum for parameter statuses
    */
    enum class StatusesGetInvites(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageUserInvite]>
     */
    @GET("api/v1/invites")
    fun getInvites(@Query("companyId") companyId: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Query("statuses") statuses: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageUserInvite>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageUserInvite]>
     */
    @GET("api/v1/invites/bounty/{bountyId}")
    fun getInvitesForBounty(@Path("bountyId") bountyId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageUserInvite>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageUserInvite]>
     */
    @GET("api/v1/invites/company/{companyId}")
    fun getInvitesForCompany(@Path("companyId") companyId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageUserInvite>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageUserInvite]>
     */
    @GET("api/v1/invites/group/{groupId}")
    fun getInvitesForGroup(@Path("groupId") groupId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageUserInvite>

    /**
     * GET api/v1/invites/platform
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageUserInvite]>
     */
    @GET("api/v1/invites/platform")
    fun getInvitesForPlatform(@Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageUserInvite>

    /**
     * POST api/v1/invites/link
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param getInviteLinkRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @POST("api/v1/invites/link")
    fun getLink(@Body getInviteLinkRequest: GetInviteLinkRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>

    /**
     * GET api/v1/invites/roles
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[InvitesRolesResult]>
     */
    @GET("api/v1/invites/roles")
    fun inviteRoles(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<InvitesRolesResult>

    /**
     * POST api/v1/invites
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param sendInvitesRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SendInvitesResponse]>
     */
    @Deprecated("This api was deprecated")
    @POST("api/v1/invites")
    fun sendInvite(@Body sendInvitesRequest: SendInvitesRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SendInvitesResponse>

    /**
     * POST api/v1/invites/{inviteId}/resend
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/invites/{inviteId}/resend")
    fun sendInvite1(@Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

}
