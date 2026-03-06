package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Group
import ai.youkno.edgeserversdk.models.GroupSearchResult
import ai.youkno.edgeserversdk.models.Member
import ai.youkno.edgeserversdk.models.PageGroupSearchResult
import ai.youkno.edgeserversdk.models.PageMember
import ai.youkno.edgeserversdk.models.PageUser
import ai.youkno.edgeserversdk.models.UpdateMemberRolesReq

interface GroupControllerApi {
    /**
     * DELETE api/v1/groups/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/groups/{groupId}")
    fun deleteApiV1GroupsByGroupid(@Path("groupId") groupId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * DELETE api/v1/groups/{groupId}/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/groups/{groupId}/members/{memberId}")
    fun deleteApiV1GroupsByGroupidMembersByMemberid(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * DELETE api/v1/groups/support/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param memberId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/groups/support/members/{memberId}")
    fun deleteApiV1GroupsSupportMembersByMemberid(@Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/groups
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageGroupSearchResult]>
     */
    @GET("api/v1/groups")
    fun getApiV1Groups(@Query("clientId") clientId: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageGroupSearchResult>

    /**
     * GET api/v1/groups/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[GroupSearchResult]>
     */
    @GET("api/v1/groups/{groupId}")
    fun getApiV1GroupsByGroupid(@Path("groupId") groupId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<GroupSearchResult>

    /**
     * GET api/v1/groups/{groupId}/candidates
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param query  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageUser]>
     */
    @GET("api/v1/groups/{groupId}/candidates")
    fun getApiV1GroupsByGroupidCandidates(@Path("groupId") groupId: kotlin.String, @Query("query") query: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageUser>


    /**
    * enum for parameter state
    */
    enum class StateGetApiV1GroupsByGroupidMembers(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "PENDING") PENDING("PENDING"),
        @Json(name = "ACTIVE") ACTIVE("ACTIVE"),
        @Json(name = "REJECTED") REJECTED("REJECTED"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/groups/{groupId}/members
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param query  (optional)
     * @param state  (optional, default to ACTIVE)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 50)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageMember]>
     */
    @GET("api/v1/groups/{groupId}/members")
    fun getApiV1GroupsByGroupidMembers(@Path("groupId") groupId: kotlin.String, @Query("query") query: kotlin.String? = null, @Query("state") state: StateGetApiV1GroupsByGroupidMembers? = StateGetApiV1GroupsByGroupidMembers.ACTIVE, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageMember>

    /**
     * GET api/v1/groups/{groupId}/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Member]>
     */
    @GET("api/v1/groups/{groupId}/members/{memberId}")
    fun getApiV1GroupsByGroupidMembersByMemberid(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Member>

    /**
     * POST api/v1/groups
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param group 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Group]>
     */
    @POST("api/v1/groups")
    fun postApiV1Groups(@Body group: Group, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Group>

    /**
     * POST api/v1/groups/{groupId}/members/{memberId}/accept
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/groups/{groupId}/members/{memberId}/accept")
    fun postApiV1GroupsByGroupidMembersByMemberidAccept(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/groups/{groupId}/members/{memberId}/reject
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/groups/{groupId}/members/{memberId}/reject")
    fun postApiV1GroupsByGroupidMembersByMemberidReject(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/groups/{groupId}/members/{memberId}/roles
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param updateMemberRolesReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Member]>
     */
    @POST("api/v1/groups/{groupId}/members/{memberId}/roles")
    fun postApiV1GroupsByGroupidMembersByMemberidRoles(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Body updateMemberRolesReq: UpdateMemberRolesReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Member>

    /**
     * PUT api/v1/groups/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param group 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Group]>
     */
    @PUT("api/v1/groups/{groupId}")
    fun putApiV1GroupsByGroupid(@Path("groupId") groupId: kotlin.String, @Body group: Group, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Group>

    /**
     * PUT api/v1/groups/{groupId}/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Member]>
     */
    @PUT("api/v1/groups/{groupId}/members/{memberId}")
    fun putApiV1GroupsByGroupidMembersByMemberid(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Member>

    /**
     * PUT api/v1/groups/support/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param memberId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Member]>
     */
    @PUT("api/v1/groups/support/members/{memberId}")
    fun putApiV1GroupsSupportMembersByMemberid(@Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Member>

}
