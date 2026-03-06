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
     * POST api/v1/groups/{groupId}/members/{memberId}/accept
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/groups/{groupId}/members/{memberId}/accept")
    fun acceptMemberForGroup(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * PUT api/v1/groups/{groupId}/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Member]>
     */
    @PUT("api/v1/groups/{groupId}/members/{memberId}")
    fun addMemberToGroup(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Member>

    /**
     * PUT api/v1/groups/support/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param memberId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Member]>
     */
    @PUT("api/v1/groups/support/members/{memberId}")
    fun addMemberToSupportGroup(@Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Member>

    /**
     * POST api/v1/groups
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param group 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Group]>
     */
    @POST("api/v1/groups")
    fun createGroup(@Body group: Group, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Group>

    /**
     * DELETE api/v1/groups/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/groups/{groupId}")
    fun deleteGroup(@Path("groupId") groupId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

    /**
     * GET api/v1/groups/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[GroupSearchResult]>
     */
    @GET("api/v1/groups/{groupId}")
    fun getGroup(@Path("groupId") groupId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<GroupSearchResult>

    /**
     * GET api/v1/groups/{groupId}/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Member]>
     */
    @GET("api/v1/groups/{groupId}/members/{memberId}")
    fun getGroupMember(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Member>


    /**
    * enum for parameter state
    */
    enum class StateGetGroupMembers(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageMember]>
     */
    @GET("api/v1/groups/{groupId}/members")
    fun getGroupMembers(@Path("groupId") groupId: kotlin.String, @Query("query") query: kotlin.String? = null, @Query("state") state: StateGetGroupMembers? = StateGetGroupMembers.ACTIVE, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageMember>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageGroupSearchResult]>
     */
    @GET("api/v1/groups")
    fun getGroups(@Query("clientId") clientId: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageGroupSearchResult>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageUser]>
     */
    @GET("api/v1/groups/{groupId}/candidates")
    fun getUserGroupCandidates(@Path("groupId") groupId: kotlin.String, @Query("query") query: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageUser>

    /**
     * POST api/v1/groups/{groupId}/members/{memberId}/reject
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/groups/{groupId}/members/{memberId}/reject")
    fun rejectMemberForGroup(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * DELETE api/v1/groups/{groupId}/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param memberId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/groups/{groupId}/members/{memberId}")
    fun removeMemberFromGroup(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * DELETE api/v1/groups/support/members/{memberId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param memberId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/groups/support/members/{memberId}")
    fun removeMemberFromGroup1(@Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * PUT api/v1/groups/{groupId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param groupId 
     * @param group 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Group]>
     */
    @PUT("api/v1/groups/{groupId}")
    fun updateGroup(@Path("groupId") groupId: kotlin.String, @Body group: Group, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Group>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Member]>
     */
    @POST("api/v1/groups/{groupId}/members/{memberId}/roles")
    fun updateMemberRole(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Body updateMemberRolesReq: UpdateMemberRolesReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Member>

}
