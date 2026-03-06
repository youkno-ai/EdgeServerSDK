package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAuditLogResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCannedResponseResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataFollowResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataGetFiltersResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataLeaderboardResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataListPromotionsResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataLookupResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataMemberDeletePermissionResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataReferralCodeResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataResolveAttachmentResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataResponseListResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserInfoResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserPrivateInfo
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataValidateAddressResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelGeoIPInfo
import ai.youkno.edgeserversdk.models.CoedgeappservermodelTags
import ai.youkno.edgeserversdk.models.CoedgeappserverrestmodelNotification

interface ApiControllerApi {

    /**
    * enum for parameter entityType
    */
    enum class EntityTypeDeleteApiV1EntitiesByEntityTypeByEntityIdTags(val value: kotlin.String) {
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
     * @param coedgeappservermodelTags 
     * @param reason  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/entities/{entity_type}/{entity_id}/tags")
    fun deleteApiV1EntitiesByEntityTypeByEntityIdTags(@Path("entity_id") entityId: kotlin.String, @Path("entity_type") entityType: kotlin.String, @Body coedgeappservermodelTags: CoedgeappservermodelTags, @Query("reason") reason: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/")
    fun getApiV1(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/attachments/resolve
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataResolveAttachmentResult]>
     */
    @GET("api/v1/attachments/resolve")
    fun getApiV1AttachmentsResolve(@Query("url") url: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataResolveAttachmentResult>

    /**
     * GET api/v1/download/sample/products
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param origin  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/download/sample/products")
    fun getApiV1DownloadSampleProducts(@Header("Origin") origin: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataLeaderboardResult]>
     */
    @GET("api/v1/entities/{bounty_id}/leaderboard")
    fun getApiV1EntitiesByBountyIdLeaderboard(@Path("bounty_id") bountyId: kotlin.String, @Query("exclude_anon") excludeAnon: kotlin.Boolean? = false, @Query("include_next_activities") includeNextActivities: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataLeaderboardResult>


    /**
    * enum for parameter entityType
    */
    enum class EntityTypeGetApiV1EntitiesByEntityTypeByEntityIdTagsHistory(val value: kotlin.String) {
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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataAuditLogResult]>
     */
    @GET("api/v1/entities/{entity_type}/{entity_id}/tags/history")
    fun getApiV1EntitiesByEntityTypeByEntityIdTagsHistory(@Path("entity_id") entityId: kotlin.String, @Path("entity_type") entityType: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataAuditLogResult>

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
     * @param zone  (optional)
     * @param clientId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataGetFiltersResult]>
     */
    @GET("api/v1/filters/{listId}")
    fun getApiV1FiltersByListid(@Path("listId") listId: kotlin.String, @Query("q") q: kotlin.String? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("zone") zone: kotlin.String? = null, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataGetFiltersResult>

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelGeoIPInfo]>
     */
    @GET("api/v1/geoip")
    fun getApiV1Geoip(@Header("X-Client-Geo-Location") xClientGeoLocation: kotlin.String? = null, @Header("X-Client-Geo-LatLng") xClientGeoLatLng: kotlin.String? = null, @Header("X-Client-RTT") xClientRTT: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelGeoIPInfo>


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetApiV1LookupsByLookupType(val value: kotlin.String) {
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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataLookupResult]>
     */
    @GET("api/v1/lookups/{lookup_type}")
    fun getApiV1LookupsByLookupType(@Path("lookup_type") lookupType: kotlin.String, @Query("q") q: kotlin.String? = null, @Query("limit") limit: kotlin.String? = null, @Query("query") query: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("searchMode") searchMode: SearchModeGetApiV1LookupsByLookupType? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataLookupResult>

    /**
     * GET api/v1/permission/{groupId}/delete_member/{memberId}
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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataMemberDeletePermissionResult]>
     */
    @GET("api/v1/permission/{groupId}/delete_member/{memberId}")
    fun getApiV1PermissionByGroupidDeleteMemberByMemberid(@Path("groupId") groupId: kotlin.String, @Path("memberId") memberId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataMemberDeletePermissionResult>

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataListPromotionsResult]>
     */
    @GET("api/v1/promotions")
    fun getApiV1Promotions(@Query("entityType") entityType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("bountyType") bountyType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("length") length: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataListPromotionsResult>

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCannedResponseResult]>
     */
    @GET("api/v1/replies/smart")
    fun getApiV1RepliesSmart(@Query("bountyId") bountyId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("bountyType") bountyType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("chatType") chatType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("version") version: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCannedResponseResult>


    /**
    * enum for parameter responseStates
    */
    enum class ResponseStatesGetApiV1ResponsesByBountyType(val value: kotlin.String) {
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
    enum class SearchModeGetApiV1ResponsesByBountyType(val value: kotlin.String) {
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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataResponseListResult]>
     */
    @GET("api/v1/responses/{bounty_type}")
    fun getApiV1ResponsesByBountyType(@Path("bounty_type") bountyType: kotlin.String, @Query("userId") userId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("country") country: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("responseStates") responseStates: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("gender") gender: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = null, @Query("length") length: kotlin.Int? = null, @Query("order") order: kotlin.String? = null, @Query("searchMode") searchMode: SearchModeGetApiV1ResponsesByBountyType? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataResponseListResult>

    /**
     * GET api/v1/user/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserInfoResult]>
     */
    @GET("api/v1/user/info")
    fun getApiV1UserInfo(@Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserInfoResult>

    /**
     * GET api/v1/users/{user_id}/private
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserPrivateInfo]>
     */
    @GET("api/v1/users/{user_id}/private")
    fun getApiV1UsersByUserIdPrivate(@Path("user_id") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserPrivateInfo>

    /**
     * GET api/v1/users/{userId}/followers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataFollowResult]>
     */
    @GET("api/v1/users/{userId}/followers")
    fun getApiV1UsersByUseridFollowers(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataFollowResult>

    /**
     * GET api/v1/users/{userId}/following
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataFollowResult]>
     */
    @GET("api/v1/users/{userId}/following")
    fun getApiV1UsersByUseridFollowing(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataFollowResult>

    /**
     * POST api/v1/addresses/validate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataValidateAddressResult]>
     */
    @POST("api/v1/addresses/validate")
    fun postApiV1AddressesValidate(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataValidateAddressResult>


    /**
    * enum for parameter entityType
    */
    enum class EntityTypePostApiV1EntitiesByEntityTypeByEntityIdTags(val value: kotlin.String) {
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
     * @param coedgeappservermodelTags 
     * @param reason  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/entities/{entity_type}/{entity_id}/tags")
    fun postApiV1EntitiesByEntityTypeByEntityIdTags(@Path("entity_id") entityId: kotlin.String, @Path("entity_type") entityType: kotlin.String, @Body coedgeappservermodelTags: CoedgeappservermodelTags, @Query("reason") reason: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/notify
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestmodelNotification 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/notify")
    fun postApiV1Notify(@Body coedgeappserverrestmodelNotification: CoedgeappserverrestmodelNotification, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/referrals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataReferralCodeResult]>
     */
    @POST("api/v1/referrals")
    fun postApiV1Referrals(@Query("code") code: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataReferralCodeResult>

}
