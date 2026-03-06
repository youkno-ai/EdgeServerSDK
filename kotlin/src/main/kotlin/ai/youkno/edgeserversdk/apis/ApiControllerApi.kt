package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AuditLogResult
import ai.youkno.edgeserversdk.models.CannedResponseResult
import ai.youkno.edgeserversdk.models.FollowResult
import ai.youkno.edgeserversdk.models.GeoIPInfo
import ai.youkno.edgeserversdk.models.GetFiltersResult
import ai.youkno.edgeserversdk.models.LeaderboardResult
import ai.youkno.edgeserversdk.models.ListPromotionsResult
import ai.youkno.edgeserversdk.models.LookupResult
import ai.youkno.edgeserversdk.models.MemberDeletePermissionResult
import ai.youkno.edgeserversdk.models.Notification
import ai.youkno.edgeserversdk.models.ReferralCodeResult
import ai.youkno.edgeserversdk.models.ResolveAttachmentResult
import ai.youkno.edgeserversdk.models.ResponseListResult
import ai.youkno.edgeserversdk.models.Tags
import ai.youkno.edgeserversdk.models.UserInfoResult
import ai.youkno.edgeserversdk.models.UserPrivateInfo
import ai.youkno.edgeserversdk.models.ValidateAddressResult

interface ApiControllerApi {

    /**
    * enum for parameter entityType
    */
    enum class EntityTypeAddTags(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN"),
        @Json(name = "USER") USER("USER"),
        @Json(name = "BOUNTY") BOUNTY("BOUNTY"),
        @Json(name = "RESPONSE") RESPONSE("RESPONSE"),
        @Json(name = "COMMENT") COMMENT("COMMENT"),
        @Json(name = "CHAT") CHAT("CHAT"),
        @Json(name = "MESSAGE") MESSAGE("MESSAGE"),
        @Json(name = "ATTACHMENT") ATTACHMENT("ATTACHMENT"),
        @Json(name = "PUSH_NOTIFICATION") PUSH_NOTIFICATION("PUSH_NOTIFICATION"),
        @Json(name = "ADDRESS") ADDRESS("ADDRESS"),
        @Json(name = "SEAT") SEAT("SEAT"),
        @Json(name = "EVENT") EVENT("EVENT"),
        @Json(name = "VENUE") VENUE("VENUE"),
        @Json(name = "TICKET") TICKET("TICKET"),
        @Json(name = "CATEGORY") CATEGORY("CATEGORY"),
        @Json(name = "SYSTEM") SYSTEM("SYSTEM")
    }

    /**
     * POST api/v1/entities/{entity_type}/{entity_id}/tags
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityId 
     * @param entityType 
     * @param tags 
     * @param reason  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/entities/{entity_type}/{entity_id}/tags")
    fun addTags(@Path("entity_id") entityId: kotlin.String, @Path("entity_type") entityType: kotlin.String, @Body tags: Tags, @Query("reason") reason: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * OPTIONS api/v1/<*>
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param origin  (optional)
     * @param accessControlRequestMethod  (optional)
     * @param accessControlRequestHeaders  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @OPTIONS("api/v1/*")
    fun apiOptions(@Header("Origin") origin: kotlin.String? = null, @Header("Access-Control-Request-Method") accessControlRequestMethod: kotlin.String? = null, @Header("Access-Control-Request-Headers") accessControlRequestHeaders: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/permission/{groupId}/delete_member/{memberId}
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
     * @return [Call]<[MemberDeletePermissionResult]>
     */
    @GET("api/v1/permission/{groupId}/delete_member/{memberId}")
    fun deleteMember(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<MemberDeletePermissionResult>


    /**
    * enum for parameter entityType
    */
    enum class EntityTypeDeleteTag(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN"),
        @Json(name = "USER") USER("USER"),
        @Json(name = "BOUNTY") BOUNTY("BOUNTY"),
        @Json(name = "RESPONSE") RESPONSE("RESPONSE"),
        @Json(name = "COMMENT") COMMENT("COMMENT"),
        @Json(name = "CHAT") CHAT("CHAT"),
        @Json(name = "MESSAGE") MESSAGE("MESSAGE"),
        @Json(name = "ATTACHMENT") ATTACHMENT("ATTACHMENT"),
        @Json(name = "PUSH_NOTIFICATION") PUSH_NOTIFICATION("PUSH_NOTIFICATION"),
        @Json(name = "ADDRESS") ADDRESS("ADDRESS"),
        @Json(name = "SEAT") SEAT("SEAT"),
        @Json(name = "EVENT") EVENT("EVENT"),
        @Json(name = "VENUE") VENUE("VENUE"),
        @Json(name = "TICKET") TICKET("TICKET"),
        @Json(name = "CATEGORY") CATEGORY("CATEGORY"),
        @Json(name = "SYSTEM") SYSTEM("SYSTEM")
    }

    /**
     * DELETE api/v1/entities/{entity_type}/{entity_id}/tags
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityId 
     * @param entityType 
     * @param tags 
     * @param reason  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/entities/{entity_type}/{entity_id}/tags")
    fun deleteTag(@Path("entity_id") entityId: kotlin.String, @Path("entity_type") entityType: kotlin.String, @Body tags: Tags, @Query("reason") reason: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/download/sample/products
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param origin  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/download/sample/products")
    fun downloadProduct(@Header("Origin") origin: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/filters/{listId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param listId 
     * @param q  (optional)
     * @param category  (optional)
     * @param tag  (optional)
     * @param clientId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[GetFiltersResult]>
     */
    @GET("api/v1/filters/{listId}")
    fun getFilters1(@Path("listId") listId: kotlin.String, @Query("q") q: kotlin.String? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<GetFiltersResult>

    /**
     * GET api/v1/users/{userId}/followers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[FollowResult]>
     */
    @GET("api/v1/users/{userId}/followers")
    fun getFollowerUsers(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<FollowResult>

    /**
     * GET api/v1/users/{userId}/following
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[FollowResult]>
     */
    @GET("api/v1/users/{userId}/following")
    fun getFollowingUsers(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<FollowResult>

    /**
     * GET api/v1/geoip
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xClientGeoLocation  (optional)
     * @param xClientGeoLatLng  (optional)
     * @param xClientRTT  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[GeoIPInfo]>
     */
    @GET("api/v1/geoip")
    fun getGeoIp(@Header("X-Client-Geo-Location") xClientGeoLocation: kotlin.String? = null, @Header("X-Client-Geo-LatLng") xClientGeoLatLng: kotlin.String? = null, @Header("X-Client-RTT") xClientRTT: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<GeoIPInfo>

    /**
     * GET api/v1/entities/{bounty_id}/leaderboard
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param excludeAnon  (optional, default to false)
     * @param includeNextActivities  (optional, default to false)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[LeaderboardResult]>
     */
    @GET("api/v1/entities/{bounty_id}/leaderboard")
    fun getLeaderboard(@Path("bounty_id") bountyId: kotlin.String, @Query("exclude_anon") excludeAnon: kotlin.Boolean? = false, @Query("include_next_activities") includeNextActivities: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<LeaderboardResult>


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetLookUps(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }

    /**
     * GET api/v1/lookups/{lookup_type}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param lookupType 
     * @param q  (optional)
     * @param limit  (optional)
     * @param query  (optional)
     * @param searchMode  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[LookupResult]>
     */
    @GET("api/v1/lookups/{lookup_type}")
    fun getLookUps(@Path("lookup_type") lookupType: kotlin.String, @Query("q") q: kotlin.String? = null, @Query("limit") limit: kotlin.String? = null, @Query("query") query: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("searchMode") searchMode: SearchModeGetLookUps? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<LookupResult>

    /**
     * GET api/v1/users/{user_id}/private
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserPrivateInfo]>
     */
    @GET("api/v1/users/{user_id}/private")
    fun getPrivateInfo(@Path("user_id") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserPrivateInfo>

    /**
     * GET api/v1/promotions
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityType  (optional)
     * @param bountyType  (optional)
     * @param start  (optional)
     * @param length  (optional)
     * @param ignoreCache  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListPromotionsResult]>
     */
    @GET("api/v1/promotions")
    fun getPromotions(@Query("entityType") entityType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("bountyType") bountyType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("length") length: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListPromotionsResult>


    /**
    * enum for parameter responseStates
    */
    enum class ResponseStatesGetResponseList(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "DRAFT") DRAFT("DRAFT"),
        @Json(name = "APPROVAL") APPROVAL("APPROVAL"),
        @Json(name = "PENDING") PENDING("PENDING"),
        @Json(name = "ACTIVE") ACTIVE("ACTIVE"),
        @Json(name = "ACKED") ACKED("ACKED"),
        @Json(name = "PROGRESSING") PROGRESSING("PROGRESSING"),
        @Json(name = "ACCEPTED") ACCEPTED("ACCEPTED"),
        @Json(name = "REFUSED") REFUSED("REFUSED"),
        @Json(name = "PAYING") PAYING("PAYING"),
        @Json(name = "PAID") PAID("PAID"),
        @Json(name = "RETRACTED") RETRACTED("RETRACTED"),
        @Json(name = "REJECTED") REJECTED("REJECTED"),
        @Json(name = "DELETED") DELETED("DELETED"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetResponseList(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }

    /**
     * GET api/v1/responses/{bounty_type}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyType 
     * @param userId  (optional)
     * @param bountyId  (optional)
     * @param searchCriteria  (optional)
     * @param country  (optional)
     * @param responseStates  (optional)
     * @param gender  (optional)
     * @param start  (optional)
     * @param length  (optional)
     * @param order  (optional)
     * @param searchMode  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ResponseListResult]>
     */
    @GET("api/v1/responses/{bounty_type}")
    fun getResponseList(@Path("bounty_type") bountyType: kotlin.String, @Query("userId") userId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("country") country: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("responseStates") responseStates: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("gender") gender: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = null, @Query("length") length: kotlin.Int? = null, @Query("order") order: kotlin.String? = null, @Query("searchMode") searchMode: SearchModeGetResponseList? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ResponseListResult>


    /**
    * enum for parameter entityType
    */
    enum class EntityTypeGetTagsHistory(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN"),
        @Json(name = "USER") USER("USER"),
        @Json(name = "BOUNTY") BOUNTY("BOUNTY"),
        @Json(name = "RESPONSE") RESPONSE("RESPONSE"),
        @Json(name = "COMMENT") COMMENT("COMMENT"),
        @Json(name = "CHAT") CHAT("CHAT"),
        @Json(name = "MESSAGE") MESSAGE("MESSAGE"),
        @Json(name = "ATTACHMENT") ATTACHMENT("ATTACHMENT"),
        @Json(name = "PUSH_NOTIFICATION") PUSH_NOTIFICATION("PUSH_NOTIFICATION"),
        @Json(name = "ADDRESS") ADDRESS("ADDRESS"),
        @Json(name = "SEAT") SEAT("SEAT"),
        @Json(name = "EVENT") EVENT("EVENT"),
        @Json(name = "VENUE") VENUE("VENUE"),
        @Json(name = "TICKET") TICKET("TICKET"),
        @Json(name = "CATEGORY") CATEGORY("CATEGORY"),
        @Json(name = "SYSTEM") SYSTEM("SYSTEM")
    }

    /**
     * GET api/v1/entities/{entity_type}/{entity_id}/tags/history
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityId 
     * @param entityType 
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 10)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AuditLogResult]>
     */
    @GET("api/v1/entities/{entity_type}/{entity_id}/tags/history")
    fun getTagsHistory(@Path("entity_id") entityId: kotlin.String, @Path("entity_type") entityType: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AuditLogResult>

    /**
     * GET api/v1/user/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInfoResult]>
     */
    @GET("api/v1/user/info")
    fun getUserPin(@Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInfoResult>

    /**
     * POST api/v1/notify
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param notification 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/notify")
    fun notify(@Body notification: Notification, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/referrals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ReferralCodeResult]>
     */
    @POST("api/v1/referrals")
    fun postReferral(@Query("code") code: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ReferralCodeResult>

    /**
     * GET api/v1/attachments/resolve
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ResolveAttachmentResult]>
     */
    @GET("api/v1/attachments/resolve")
    fun resolveAttachments(@Query("url") url: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ResolveAttachmentResult>

    /**
     * GET api/v1/
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/")
    fun root(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/replies/smart
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId  (optional)
     * @param bountyType  (optional)
     * @param chatType  (optional)
     * @param version  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CannedResponseResult]>
     */
    @GET("api/v1/replies/smart")
    fun smartReplies(@Query("bountyId") bountyId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("bountyType") bountyType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("chatType") chatType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("version") version: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CannedResponseResult>

    /**
     * POST api/v1/addresses/validate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ValidateAddressResult]>
     */
    @POST("api/v1/addresses/validate")
    fun validateAddress(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ValidateAddressResult>

}
