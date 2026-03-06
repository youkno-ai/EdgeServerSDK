package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AssignClientRequest
import ai.youkno.edgeserversdk.models.AssignClientResponse
import ai.youkno.edgeserversdk.models.AuditLogResult
import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.ChatRoomResult
import ai.youkno.edgeserversdk.models.ChemicalInfoDisplayConfig
import ai.youkno.edgeserversdk.models.CompanyListResult
import ai.youkno.edgeserversdk.models.CreateClientRequest
import ai.youkno.edgeserversdk.models.CreateClientResult
import ai.youkno.edgeserversdk.models.CreateUpdateLocationDto
import ai.youkno.edgeserversdk.models.CustomChemicalInfoByCategoryConfigDto
import ai.youkno.edgeserversdk.models.ErrorResult
import ai.youkno.edgeserversdk.models.Filter
import ai.youkno.edgeserversdk.models.ListResult
import ai.youkno.edgeserversdk.models.LocationInfo
import ai.youkno.edgeserversdk.models.LocationResult
import ai.youkno.edgeserversdk.models.LocationsResult
import ai.youkno.edgeserversdk.models.ModerationDictionary
import ai.youkno.edgeserversdk.models.ModerationReq
import ai.youkno.edgeserversdk.models.NotificationCampaign
import ai.youkno.edgeserversdk.models.PageInventoryArea
import ai.youkno.edgeserversdk.models.PushNotificationCampaignRequest
import ai.youkno.edgeserversdk.models.RecommendationsStatsResponse
import ai.youkno.edgeserversdk.models.ReservationStatisticsResult
import ai.youkno.edgeserversdk.models.SalesStatisticsResult
import ai.youkno.edgeserversdk.models.Sentiment
import ai.youkno.edgeserversdk.models.ShopSettings
import ai.youkno.edgeserversdk.models.UpdateClientLoginsRequest
import ai.youkno.edgeserversdk.models.UpdateClientRequest
import ai.youkno.edgeserversdk.models.UpdateSettingsReq
import ai.youkno.edgeserversdk.models.UserAuth

import ai.youkno.edgeserversdk.models.*

interface ClientControllerApi {
    /**
     * POST api/v1/clients/{clientId}/assign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param assignClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AssignClientResponse]>
     */
    @POST("api/v1/clients/{clientId}/assign")
    fun assignClient(@Path("clientId") clientId: kotlin.String, @Body assignClientRequest: AssignClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AssignClientResponse>

    /**
     * GET api/v1/clients/{client}/users/{user}/auth
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param user 
     * @param authorization  (optional)
     * @param deviceId  (optional)
     * @param deviceSecret  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserAuth]>
     */
    @GET("api/v1/clients/{client}/users/{user}/auth")
    fun authClient(@Path("client") client: kotlin.String, @Path("user") user: kotlin.String, @Header("Authorization") authorization: kotlin.String? = null, @Query("deviceId") deviceId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("deviceSecret") deviceSecret: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserAuth>

    /**
     * POST api/v1/clients
     * 
     * 
     * Responses:
     *  - 200: OK
     *  - 400: Bad Request
     *  - 409: Conflict
     *  - 412: Precondition Failed
     *
     * @param createClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CreateClientResult]>
     */
    @POST("api/v1/clients")
    fun createClient(@Body createClientRequest: CreateClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CreateClientResult>

    /**
     * POST api/v1/clients/{client}/productCustomChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param customChemicalInfoByCategoryConfigDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CustomChemicalInfoByCategoryConfigDto]>
     */
    @POST("api/v1/clients/{client}/productCustomChemicals")
    fun createCustomProductChemicalInfos(@Path("client") client: kotlin.String, @Body customChemicalInfoByCategoryConfigDto: CustomChemicalInfoByCategoryConfigDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CustomChemicalInfoByCategoryConfigDto>

    /**
     * POST api/v1/clients/{clientId}/locations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param createUpdateLocationDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[LocationInfo]>
     */
    @POST("api/v1/clients/{clientId}/locations")
    fun createLocation(@Path("clientId") clientId: kotlin.String, @Body createUpdateLocationDto: CreateUpdateLocationDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<LocationInfo>

    /**
     * DELETE api/v1/clients/{clientId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/clients/{clientId}")
    fun deleteClient(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * DELETE api/v1/clients/{client}/productCustomChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param id 
     * @param categoryPath 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/clients/{client}/productCustomChemicals")
    fun deleteCustomProductChemicalInfos(@Path("client") client: kotlin.String, @Query("id") id: kotlin.String, @Query("categoryPath") categoryPath: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * PATCH api/v1/clients/{client}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param updateClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PATCH("api/v1/clients/{client}")
    fun editClient(@Path("client") client: kotlin.String, @Body updateClientRequest: UpdateClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>


    /**
    * enum for parameter posType
    */
    enum class PosTypeEditShopSettings(val value: kotlin.String) {
        @Json(name = "SHOPIFY") SHOPIFY("SHOPIFY"),
        @Json(name = "ALLEAVES") ALLEAVES("ALLEAVES"),
        @Json(name = "MJ_FREEWAY") MJ_FREEWAY("MJ_FREEWAY"),
        @Json(name = "BIOTRACK") BIOTRACK("BIOTRACK")
    }

    /**
     * PATCH api/v1/clients/{client}/settings/shopSettings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param shopSettings 
     * @param patch  (optional, default to false)
     * @param posType  (optional, default to ALLEAVES)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PATCH("api/v1/clients/{client}/settings/shopSettings")
    fun editShopSettings(@Path("client") client: kotlin.String, @Body shopSettings: ShopSettings, @Query("patch") patch: kotlin.Boolean? = false, @Query("posType") posType: PosTypeEditShopSettings? = PosTypeEditShopSettings.ALLEAVES, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * GET api/v1/clients/{client}/approvals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param order  (optional)
     * @param orderPickupDateFrom  (optional)
     * @param orderPickupDateTo  (optional)
     * @param orderDeliveryMethods  (optional)
     * @param calendarEventDateFrom  (optional)
     * @param calendarEventDateTo  (optional)
     * @param marketMode  (optional)
     * @param merchantId  (optional)
     * @param companyId  (optional)
     * @param ownerId  (optional)
     * @param creatorId  (optional)
     * @param bountyCreatorId  (optional)
     * @param userId  (optional)
     * @param displayScreen  (optional)
     * @param minQuantity  (optional)
     * @param userStatuses  (optional)
     * @param bountyIds  (optional)
     * @param inviterIds  (optional)
     * @param productId  (optional)
     * @param applicantId  (optional)
     * @param bountyResponseId  (optional)
     * @param withPriceTag  (optional)
     * @param minPrice  (optional)
     * @param maxPrice  (optional)
     * @param minThc  (optional)
     * @param maxThc  (optional)
     * @param withFreeDelivery  (optional)
     * @param responseState  (optional)
     * @param countries  (optional)
     * @param genders  (optional)
     * @param age  (optional)
     * @param languages  (optional)
     * @param withCertificates  (optional)
     * @param responseStates  (optional)
     * @param categories  (optional)
     * @param categoryCodes  (optional)
     * @param tags  (optional)
     * @param trustedTags  (optional)
     * @param extras  (optional)
     * @param lookups  (optional)
     * @param listId  (optional)
     * @param groupId  (optional)
     * @param loadStrategy  (optional)
     * @param loadDirection  (optional)
     * @param postedAt  (optional)
     * @param sublistIds  (optional)
     * @param searchCriteria  (optional)
     * @param searchFields  (optional)
     * @param skipAgeFilter  (optional)
     * @param skipCountryFilter  (optional)
     * @param shared  (optional)
     * @param searchMode  (optional)
     * @param bountyStates  (optional)
     * @param referralCode  (optional)
     * @param pin  (optional)
     * @param provider  (optional)
     * @param email  (optional)
     * @param roles  (optional)
     * @param includeAllUsers  (optional)
     * @param profiled  (optional)
     * @param payPeriod  (optional)
     * @param includeBlacklisted  (optional)
     * @param inviteCodes  (optional)
     * @param defaultApp  (optional)
     * @param locations  (optional)
     * @param rewardCurrency  (optional)
     * @param hasPointsReward  (optional)
     * @param scheduledRange  (optional)
     * @param expiresRange  (optional)
     * @param scheme  (optional)
     * @param showByLinkVisibility  (optional)
     * @param section  (optional)
     * @param bountyTypes  (optional)
     * @param reservationCreatedFrom  (optional)
     * @param reservationCreatedTo  (optional)
     * @param restaurantId  (optional)
     * @param reservationStatus  (optional)
     * @param creatorIds  (optional)
     * @param partySizeFrom  (optional)
     * @param partySizeTo  (optional)
     * @param ghostEmail  (optional)
     * @param ghostPhone  (optional)
     * @param supportGroupId  (optional)
     * @param entityOwnerId  (optional)
     * @param publisherText  (optional)
     * @param publisherName  (optional)
     * @param publisherId  (optional)
     * @param bountyId  (optional)
     * @param entityType  (optional)
     * @param visibility  (optional)
     * @param voucherStates  (optional)
     * @param voucherIds  (optional)
     * @param excludeWithExpDate  (optional)
     * @param newsPriority  (optional)
     * @param ignoreCache  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/clients/{client}/approvals")
    fun getApprovals1(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: DateRange? = null, @Query("expiresRange") expiresRange: DateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListResult>

    /**
     * GET api/v1/clients/{client}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UpdateClientRequest]>
     */
    @GET("api/v1/clients/{client}")
    fun getClient(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UpdateClientRequest>


    /**
    * enum for parameter orgType
    */
    enum class OrgTypeGetClientList(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "CTRL") CTRL("CTRL"),
        @Json(name = "OPERATIONS") OPERATIONS("OPERATIONS"),
        @Json(name = "VULGUS") VULGUS("VULGUS"),
        @Json(name = "CORPORATE") CORPORATE("CORPORATE"),
        @Json(name = "MERCHANT") MERCHANT("MERCHANT"),
        @Json(name = "CHARITY") CHARITY("CHARITY"),
        @Json(name = "PARTNER") PARTNER("PARTNER"),
        @Json(name = "RESTAURANT") RESTAURANT("RESTAURANT"),
        @Json(name = "NGO") NGO("NGO"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetClientList(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }


    /**
    * enum for parameter status
    */
    enum class StatusGetClientList(val value: kotlin.String) {
        @Json(name = "ACTIVE") ACTIVE("ACTIVE"),
        @Json(name = "INACTIVE") INACTIVE("INACTIVE"),
        @Json(name = "SUSPENDED") SUSPENDED("SUSPENDED"),
        @Json(name = "BLACKLISTED") BLACKLISTED("BLACKLISTED"),
        @Json(name = "TO_BE_DELETED") TO_BE_DELETED("TO_BE_DELETED"),
        @Json(name = "DELETED") DELETED("DELETED"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/clients
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param countryCodes  (optional)
     * @param clientIds  (optional)
     * @param orgType  (optional)
     * @param start  (optional)
     * @param length  (optional)
     * @param searchCriteria  (optional)
     * @param searchMode  (optional)
     * @param status  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CompanyListResult]>
     */
    @GET("api/v1/clients")
    fun getClientList(@Query("countryCodes") countryCodes: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("clientIds") clientIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("orgType") orgType: OrgTypeGetClientList? = null, @Query("start") start: kotlin.Int? = null, @Query("length") length: kotlin.Int? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchMode") searchMode: SearchModeGetClientList? = null, @Query("status") status: StatusGetClientList? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CompanyListResult>

    /**
     * GET api/v1/clients/{client}/moderation/dictionary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Sentiment>]>
     */
    @GET("api/v1/clients/{client}/moderation/dictionary")
    fun getDictionary(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Sentiment>>

    /**
     * GET api/v1/clients/{client}/inventoryAreas
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageInventoryArea]>
     */
    @GET("api/v1/clients/{client}/inventoryAreas")
    fun getInventoryAreas(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageInventoryArea>

    /**
     * GET api/v1/clients/{client}/location
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[LocationResult]>
     */
    @GET("api/v1/clients/{client}/location")
    fun getLocation(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<LocationResult>

    /**
     * GET api/v1/clients/{client}/locations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param onlyOnline  (optional)
     * @param deliveryZipcode  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[LocationsResult]>
     */
    @GET("api/v1/clients/{client}/locations")
    fun getLocations1(@Path("client") client: kotlin.String, @Query("onlyOnline") onlyOnline: kotlin.Boolean? = null, @Query("deliveryZipcode") deliveryZipcode: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<LocationsResult>

    /**
     * GET api/v1/clients/{client}/moderation
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ModerationReq]>
     */
    @GET("api/v1/clients/{client}/moderation")
    fun getModeration(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ModerationReq>

    /**
     * GET api/v1/clients/{client}/orders/{order_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param orderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @GET("api/v1/clients/{client}/orders/{order_id}")
    fun getOrder2(@Path("client") client: kotlin.String, @Path("order_id") orderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * GET api/v1/clients/{client}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param order  (optional)
     * @param orderPickupDateFrom  (optional)
     * @param orderPickupDateTo  (optional)
     * @param orderDeliveryMethods  (optional)
     * @param calendarEventDateFrom  (optional)
     * @param calendarEventDateTo  (optional)
     * @param marketMode  (optional)
     * @param merchantId  (optional)
     * @param companyId  (optional)
     * @param ownerId  (optional)
     * @param creatorId  (optional)
     * @param bountyCreatorId  (optional)
     * @param userId  (optional)
     * @param displayScreen  (optional)
     * @param minQuantity  (optional)
     * @param userStatuses  (optional)
     * @param bountyIds  (optional)
     * @param inviterIds  (optional)
     * @param productId  (optional)
     * @param applicantId  (optional)
     * @param bountyResponseId  (optional)
     * @param withPriceTag  (optional)
     * @param minPrice  (optional)
     * @param maxPrice  (optional)
     * @param minThc  (optional)
     * @param maxThc  (optional)
     * @param withFreeDelivery  (optional)
     * @param responseState  (optional)
     * @param countries  (optional)
     * @param genders  (optional)
     * @param age  (optional)
     * @param languages  (optional)
     * @param withCertificates  (optional)
     * @param responseStates  (optional)
     * @param categories  (optional)
     * @param categoryCodes  (optional)
     * @param tags  (optional)
     * @param trustedTags  (optional)
     * @param extras  (optional)
     * @param lookups  (optional)
     * @param listId  (optional)
     * @param groupId  (optional)
     * @param loadStrategy  (optional)
     * @param loadDirection  (optional)
     * @param postedAt  (optional)
     * @param sublistIds  (optional)
     * @param searchCriteria  (optional)
     * @param searchFields  (optional)
     * @param skipAgeFilter  (optional)
     * @param skipCountryFilter  (optional)
     * @param shared  (optional)
     * @param searchMode  (optional)
     * @param bountyStates  (optional)
     * @param referralCode  (optional)
     * @param pin  (optional)
     * @param provider  (optional)
     * @param email  (optional)
     * @param roles  (optional)
     * @param includeAllUsers  (optional)
     * @param profiled  (optional)
     * @param payPeriod  (optional)
     * @param includeBlacklisted  (optional)
     * @param inviteCodes  (optional)
     * @param defaultApp  (optional)
     * @param locations  (optional)
     * @param rewardCurrency  (optional)
     * @param hasPointsReward  (optional)
     * @param scheduledRange  (optional)
     * @param expiresRange  (optional)
     * @param scheme  (optional)
     * @param showByLinkVisibility  (optional)
     * @param section  (optional)
     * @param bountyTypes  (optional)
     * @param reservationCreatedFrom  (optional)
     * @param reservationCreatedTo  (optional)
     * @param restaurantId  (optional)
     * @param reservationStatus  (optional)
     * @param creatorIds  (optional)
     * @param partySizeFrom  (optional)
     * @param partySizeTo  (optional)
     * @param ghostEmail  (optional)
     * @param ghostPhone  (optional)
     * @param supportGroupId  (optional)
     * @param entityOwnerId  (optional)
     * @param publisherText  (optional)
     * @param publisherName  (optional)
     * @param publisherId  (optional)
     * @param bountyId  (optional)
     * @param entityType  (optional)
     * @param visibility  (optional)
     * @param voucherStates  (optional)
     * @param voucherIds  (optional)
     * @param excludeWithExpDate  (optional)
     * @param newsPriority  (optional)
     * @param ignoreCache  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param ignoreCache  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/clients/{client}/orders")
    fun getOrders(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: DateRange? = null, @Query("expiresRange") expiresRange: DateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Query("ignoreCache") ignoreCacheSecondary: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListResult>

    /**
     * GET api/v1/clients/{client}/productChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ChemicalInfoDisplayConfig]>
     */
    @GET("api/v1/clients/{client}/productChemicals")
    fun getProductChemicalInfos(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ChemicalInfoDisplayConfig>

    /**
     * GET api/v1/clients/{client}/productCustomChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param categoryPath 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CustomChemicalInfoByCategoryConfigDto>]>
     */
    @GET("api/v1/clients/{client}/productCustomChemicals")
    fun getProductCustomChemicalInfos(@Path("client") client: kotlin.String, @Query("categoryPath") categoryPath: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CustomChemicalInfoByCategoryConfigDto>>

    /**
     * GET api/v1/clients/{client}/campaign/pn
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<NotificationCampaign>]>
     */
    @GET("api/v1/clients/{client}/campaign/pn")
    fun getPushNotificationCampaigns(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<NotificationCampaign>>

    /**
     * GET api/v1/clients/{client}/reservations/statistics
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param order  (optional)
     * @param orderPickupDateFrom  (optional)
     * @param orderPickupDateTo  (optional)
     * @param orderDeliveryMethods  (optional)
     * @param calendarEventDateFrom  (optional)
     * @param calendarEventDateTo  (optional)
     * @param marketMode  (optional)
     * @param merchantId  (optional)
     * @param companyId  (optional)
     * @param ownerId  (optional)
     * @param creatorId  (optional)
     * @param bountyCreatorId  (optional)
     * @param userId  (optional)
     * @param displayScreen  (optional)
     * @param minQuantity  (optional)
     * @param userStatuses  (optional)
     * @param bountyIds  (optional)
     * @param inviterIds  (optional)
     * @param productId  (optional)
     * @param applicantId  (optional)
     * @param bountyResponseId  (optional)
     * @param withPriceTag  (optional)
     * @param minPrice  (optional)
     * @param maxPrice  (optional)
     * @param minThc  (optional)
     * @param maxThc  (optional)
     * @param withFreeDelivery  (optional)
     * @param responseState  (optional)
     * @param countries  (optional)
     * @param genders  (optional)
     * @param age  (optional)
     * @param languages  (optional)
     * @param withCertificates  (optional)
     * @param responseStates  (optional)
     * @param categories  (optional)
     * @param categoryCodes  (optional)
     * @param tags  (optional)
     * @param trustedTags  (optional)
     * @param extras  (optional)
     * @param lookups  (optional)
     * @param listId  (optional)
     * @param groupId  (optional)
     * @param loadStrategy  (optional)
     * @param loadDirection  (optional)
     * @param postedAt  (optional)
     * @param sublistIds  (optional)
     * @param searchCriteria  (optional)
     * @param searchFields  (optional)
     * @param skipAgeFilter  (optional)
     * @param skipCountryFilter  (optional)
     * @param shared  (optional)
     * @param searchMode  (optional)
     * @param bountyStates  (optional)
     * @param referralCode  (optional)
     * @param pin  (optional)
     * @param provider  (optional)
     * @param email  (optional)
     * @param roles  (optional)
     * @param includeAllUsers  (optional)
     * @param profiled  (optional)
     * @param payPeriod  (optional)
     * @param includeBlacklisted  (optional)
     * @param inviteCodes  (optional)
     * @param defaultApp  (optional)
     * @param locations  (optional)
     * @param rewardCurrency  (optional)
     * @param hasPointsReward  (optional)
     * @param scheduledRange  (optional)
     * @param expiresRange  (optional)
     * @param scheme  (optional)
     * @param showByLinkVisibility  (optional)
     * @param section  (optional)
     * @param bountyTypes  (optional)
     * @param reservationCreatedFrom  (optional)
     * @param reservationCreatedTo  (optional)
     * @param restaurantId  (optional)
     * @param reservationStatus  (optional)
     * @param creatorIds  (optional)
     * @param partySizeFrom  (optional)
     * @param partySizeTo  (optional)
     * @param ghostEmail  (optional)
     * @param ghostPhone  (optional)
     * @param supportGroupId  (optional)
     * @param entityOwnerId  (optional)
     * @param publisherText  (optional)
     * @param publisherName  (optional)
     * @param publisherId  (optional)
     * @param bountyId  (optional)
     * @param entityType  (optional)
     * @param visibility  (optional)
     * @param voucherStates  (optional)
     * @param voucherIds  (optional)
     * @param excludeWithExpDate  (optional)
     * @param newsPriority  (optional)
     * @param ignoreCache  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ReservationStatisticsResult]>
     */
    @GET("api/v1/clients/{client}/reservations/statistics")
    fun getReservationStatistics(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: DateRange? = null, @Query("expiresRange") expiresRange: DateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ReservationStatisticsResult>

    /**
     * GET api/v1/clients/{client}/sales/statistics
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SalesStatisticsResult]>
     */
    @GET("api/v1/clients/{client}/sales/statistics")
    fun getSalesStatistics(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SalesStatisticsResult>

    /**
     * GET api/v1/clients/{clientId}/settings/shopSettings/audit_logs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AuditLogResult]>
     */
    @GET("api/v1/clients/{clientId}/settings/shopSettings/audit_logs")
    fun getSettingsAuditLogs(@Path("clientId") clientId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AuditLogResult>

    /**
     * GET api/v1/clients/{client}/settings/shopSettings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ShopSettings]>
     */
    @GET("api/v1/clients/{client}/settings/shopSettings")
    fun getShopSettings(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShopSettings>

    /**
     * GET api/v1/clients/{client}/supportChats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param status  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ChatRoomResult]>
     */
    @GET("api/v1/clients/{client}/supportChats")
    fun getSupportChats(@Path("client") client: kotlin.String, @Query("status") status: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ChatRoomResult>

    /**
     * POST api/v1/clients/{client}/campaign/pn
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param pushNotificationCampaignRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[NotificationCampaign]>
     */
    @POST("api/v1/clients/{client}/campaign/pn")
    fun newPushNotificationCampaign(@Path("client") client: kotlin.String, @Body pushNotificationCampaignRequest: PushNotificationCampaignRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NotificationCampaign>

    /**
     * POST api/v1/clients/{client}/devices
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @POST("api/v1/clients/{client}/devices")
    fun postDeviceFile(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/clients/{client}/products
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @POST("api/v1/clients/{client}/products")
    fun postProductFile(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/clients/{client}/transactions
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @POST("api/v1/clients/{client}/transactions")
    fun postTransactionFile(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/clients/{client}/users
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @POST("api/v1/clients/{client}/users")
    fun postUserFile(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * GET api/v1/clients/{client}/recommendation/{bountyId}/stats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RecommendationsStatsResponse]>
     */
    @GET("api/v1/clients/{client}/recommendation/{bountyId}/stats")
    fun recommendationStats(@Path("client") client: kotlin.String, @Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RecommendationsStatsResponse>

    /**
     * PUT api/v1/clients/{clientId}/restore
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PUT("api/v1/clients/{clientId}/restore")
    fun restoreClient(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * POST api/v1/clients/{client}/sync/{component}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param component 
     * @param updatedAfter  (optional)
     * @param syncFromLastUpdatedDate  (optional, default to true)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/clients/{client}/sync/{component}")
    fun resync(@Path("client") client: kotlin.String, @Path("component") component: kotlin.String, @Query("updatedAfter") updatedAfter: java.time.OffsetDateTime? = null, @Query("syncFromLastUpdatedDate") syncFromLastUpdatedDate: kotlin.Boolean? = true, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * POST api/v1/clients/{client}/moderation
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param moderationReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/clients/{client}/moderation")
    fun setModeration(@Path("client") client: kotlin.String, @Body moderationReq: ModerationReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * PUT api/v1/clients/{client}/productCustomChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param id 
     * @param currentCategoryPath 
     * @param customChemicalInfoByCategoryConfigDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CustomChemicalInfoByCategoryConfigDto]>
     */
    @PUT("api/v1/clients/{client}/productCustomChemicals")
    fun updateCustomProductChemicalInfos(@Path("client") client: kotlin.String, @Query("id") id: kotlin.String, @Query("currentCategoryPath") currentCategoryPath: kotlin.String, @Body customChemicalInfoByCategoryConfigDto: CustomChemicalInfoByCategoryConfigDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CustomChemicalInfoByCategoryConfigDto>

    /**
     * PUT api/v1/clients/{client}/moderation/dictionary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param moderationDictionary 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<Sentiment>]>
     */
    @PUT("api/v1/clients/{client}/moderation/dictionary")
    fun updateDictionary(@Path("client") client: kotlin.String, @Body moderationDictionary: ModerationDictionary, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Sentiment>>

    /**
     * PUT api/v1/clients/locations/{clientId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param createUpdateLocationDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[LocationInfo]>
     */
    @PUT("api/v1/clients/locations/{clientId}")
    fun updateLocation(@Path("clientId") clientId: kotlin.String, @Body createUpdateLocationDto: CreateUpdateLocationDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<LocationInfo>

    /**
     * PUT api/v1/clients/{client}/logins
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param updateClientLoginsRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PUT("api/v1/clients/{client}/logins")
    fun updateLogins(@Path("client") client: kotlin.String, @Body updateClientLoginsRequest: UpdateClientLoginsRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * POST api/v1/clients/{client}/productChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param chemicalInfoDisplayConfig 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/clients/{client}/productChemicals")
    fun updateProductChemicalInfos(@Path("client") client: kotlin.String, @Body chemicalInfoDisplayConfig: ChemicalInfoDisplayConfig, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * PUT api/v1/clients/{client}/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param updateSettingsReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PUT("api/v1/clients/{client}/settings")
    fun updateSettings(@Path("client") client: kotlin.String, @Body updateSettingsReq: UpdateSettingsReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

}
