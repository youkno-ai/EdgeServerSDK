package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.BaseSettingsShopSettings
import ai.youkno.edgeserversdk.models.BaseSettingsShopSettingsChemicalInfoDisplayConfig
import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.EdgeApiDataAuditLogResult
import ai.youkno.edgeserversdk.models.EdgeApiDataChatRoomResult
import ai.youkno.edgeserversdk.models.EdgeApiDataCompanyListResult
import ai.youkno.edgeserversdk.models.EdgeApiDataCreateClientRequest
import ai.youkno.edgeserversdk.models.EdgeApiDataCreateClientResult
import ai.youkno.edgeserversdk.models.EdgeApiDataCreateUpdateLocationDto
import ai.youkno.edgeserversdk.models.EdgeApiDataCustomChemicalInfoByCategoryConfigDto
import ai.youkno.edgeserversdk.models.EdgeApiDataErrorResult
import ai.youkno.edgeserversdk.models.EdgeApiDataLocationResult
import ai.youkno.edgeserversdk.models.EdgeApiDataLocationsResult
import ai.youkno.edgeserversdk.models.EdgeApiDataModerationDictionary
import ai.youkno.edgeserversdk.models.EdgeApiDataModerationReq
import ai.youkno.edgeserversdk.models.EdgeApiDataPageBountyProductZone
import ai.youkno.edgeserversdk.models.EdgeApiDataPageEdgeApiDataInventoryArea
import ai.youkno.edgeserversdk.models.EdgeApiDataPushNotificationCampaignRequest
import ai.youkno.edgeserversdk.models.EdgeApiDataRecommendationsStatsResponse
import ai.youkno.edgeserversdk.models.EdgeApiDataSalesStatisticsResult
import ai.youkno.edgeserversdk.models.EdgeApiDataSentiment
import ai.youkno.edgeserversdk.models.EdgeApiDataUpdateClientLoginsRequest
import ai.youkno.edgeserversdk.models.EdgeApiDataUpdateClientRequest
import ai.youkno.edgeserversdk.models.EdgeApiDataUpdateSettingsReq
import ai.youkno.edgeserversdk.models.Filter
import ai.youkno.edgeserversdk.models.NotificationCampaign
import ai.youkno.edgeserversdk.models.PrivateCompanySettingsPointOfSaleInfoLocationInfo
import ai.youkno.edgeserversdk.models.RestControllerClientControllerAssignClientRequest
import ai.youkno.edgeserversdk.models.RestControllerClientControllerAssignClientResponse
import ai.youkno.edgeserversdk.models.RestModelUserAuth
import ai.youkno.edgeserversdk.models.ServiceCompanyInkOpReservationStatisticsResult
import ai.youkno.edgeserversdk.models.ServiceUserOpListResult

import ai.youkno.edgeserversdk.models.*

interface ClientControllerApi {
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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/clients/{client}/productCustomChemicals")
    fun deleteApiV1ClientsByClientProductcustomchemicals(@Path("client") client: kotlin.String, @Query("id") id: kotlin.String, @Query("categoryPath") categoryPath: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/clients/{clientId}")
    fun deleteApiV1ClientsByClientid(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>


    /**
    * enum for parameter orgType
    */
    enum class OrgTypeGetApiV1Clients(val value: kotlin.String) {
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
    enum class SearchModeGetApiV1Clients(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }


    /**
    * enum for parameter status
    */
    enum class StatusGetApiV1Clients(val value: kotlin.String) {
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
     * @return [Call]<[EdgeApiDataCompanyListResult]>
     */
    @GET("api/v1/clients")
    fun getApiV1Clients(@Query("countryCodes") countryCodes: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("clientIds") clientIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("orgType") orgType: OrgTypeGetApiV1Clients? = null, @Query("start") start: kotlin.Int? = null, @Query("length") length: kotlin.Int? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchMode") searchMode: SearchModeGetApiV1Clients? = null, @Query("status") status: StatusGetApiV1Clients? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataCompanyListResult>

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
     * @return [Call]<[EdgeApiDataUpdateClientRequest]>
     */
    @GET("api/v1/clients/{client}")
    fun getApiV1ClientsByClient(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataUpdateClientRequest>

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
     * @param merchantIds  (optional)
     * @param zone  (optional)
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
     * @return [Call]<[ServiceUserOpListResult]>
     */
    @GET("api/v1/clients/{client}/approvals")
    fun getApiV1ClientsByClientApprovals(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.collections.Set<kotlin.String>? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: FilterDateRange? = null, @Query("expiresRange") expiresRange: FilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ServiceUserOpListResult>

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
    fun getApiV1ClientsByClientCampaignPn(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<NotificationCampaign>>

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
     * @return [Call]<[EdgeApiDataPageEdgeApiDataInventoryArea]>
     */
    @GET("api/v1/clients/{client}/inventoryAreas")
    fun getApiV1ClientsByClientInventoryareas(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageEdgeApiDataInventoryArea>

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
     * @return [Call]<[EdgeApiDataLocationResult]>
     */
    @GET("api/v1/clients/{client}/location")
    fun getApiV1ClientsByClientLocation(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataLocationResult>

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
     * @return [Call]<[EdgeApiDataLocationsResult]>
     */
    @GET("api/v1/clients/{client}/locations")
    fun getApiV1ClientsByClientLocations(@Path("client") client: kotlin.String, @Query("onlyOnline") onlyOnline: kotlin.Boolean? = null, @Query("deliveryZipcode") deliveryZipcode: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataLocationsResult>

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
     * @return [Call]<[EdgeApiDataModerationReq]>
     */
    @GET("api/v1/clients/{client}/moderation")
    fun getApiV1ClientsByClientModeration(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataModerationReq>

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
     * @return [Call]<[kotlin.collections.List<EdgeApiDataSentiment>]>
     */
    @GET("api/v1/clients/{client}/moderation/dictionary")
    fun getApiV1ClientsByClientModerationDictionary(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<EdgeApiDataSentiment>>

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
     * @param merchantIds  (optional)
     * @param zone  (optional)
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
     * @return [Call]<[ServiceUserOpListResult]>
     */
    @GET("api/v1/clients/{client}/orders")
    fun getApiV1ClientsByClientOrders(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.collections.Set<kotlin.String>? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: FilterDateRange? = null, @Query("expiresRange") expiresRange: FilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ServiceUserOpListResult>

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
    fun getApiV1ClientsByClientOrdersByOrderId(@Path("client") client: kotlin.String, @Path("order_id") orderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

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
     * @return [Call]<[BaseSettingsShopSettingsChemicalInfoDisplayConfig]>
     */
    @GET("api/v1/clients/{client}/productChemicals")
    fun getApiV1ClientsByClientProductchemicals(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BaseSettingsShopSettingsChemicalInfoDisplayConfig>

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
     * @return [Call]<[kotlin.collections.List<EdgeApiDataCustomChemicalInfoByCategoryConfigDto>]>
     */
    @GET("api/v1/clients/{client}/productCustomChemicals")
    fun getApiV1ClientsByClientProductcustomchemicals(@Path("client") client: kotlin.String, @Query("categoryPath") categoryPath: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<EdgeApiDataCustomChemicalInfoByCategoryConfigDto>>

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
     * @return [Call]<[EdgeApiDataRecommendationsStatsResponse]>
     */
    @GET("api/v1/clients/{client}/recommendation/{bountyId}/stats")
    fun getApiV1ClientsByClientRecommendationByBountyidStats(@Path("client") client: kotlin.String, @Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataRecommendationsStatsResponse>

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
     * @param merchantIds  (optional)
     * @param zone  (optional)
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
     * @return [Call]<[ServiceCompanyInkOpReservationStatisticsResult]>
     */
    @GET("api/v1/clients/{client}/reservations/statistics")
    fun getApiV1ClientsByClientReservationsStatistics(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("merchantIds") merchantIds: kotlin.collections.Set<kotlin.String>? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: FilterDateRange? = null, @Query("expiresRange") expiresRange: FilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ServiceCompanyInkOpReservationStatisticsResult>

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
     * @return [Call]<[EdgeApiDataSalesStatisticsResult]>
     */
    @GET("api/v1/clients/{client}/sales/statistics")
    fun getApiV1ClientsByClientSalesStatistics(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataSalesStatisticsResult>

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
     * @return [Call]<[BaseSettingsShopSettings]>
     */
    @GET("api/v1/clients/{client}/settings/shopSettings")
    fun getApiV1ClientsByClientSettingsShopsettings(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BaseSettingsShopSettings>

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
     * @return [Call]<[EdgeApiDataChatRoomResult]>
     */
    @GET("api/v1/clients/{client}/supportChats")
    fun getApiV1ClientsByClientSupportchats(@Path("client") client: kotlin.String, @Query("status") status: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataChatRoomResult>

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
     * @return [Call]<[RestModelUserAuth]>
     */
    @GET("api/v1/clients/{client}/users/{user}/auth")
    fun getApiV1ClientsByClientUsersByUserAuth(@Path("client") client: kotlin.String, @Path("user") user: kotlin.String, @Header("Authorization") authorization: kotlin.String? = null, @Query("deviceId") deviceId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("deviceSecret") deviceSecret: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestModelUserAuth>

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
     * @return [Call]<[EdgeApiDataAuditLogResult]>
     */
    @GET("api/v1/clients/{clientId}/settings/shopSettings/audit_logs")
    fun getApiV1ClientsByClientidSettingsShopsettingsAuditLogs(@Path("clientId") clientId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataAuditLogResult>

    /**
     * GET api/v1/clients/{clientId}/zones
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPageBountyProductZone]>
     */
    @GET("api/v1/clients/{clientId}/zones")
    fun getApiV1ClientsByClientidZones(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageBountyProductZone>

    /**
     * PATCH api/v1/clients/{client}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param edgeApiDataUpdateClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PATCH("api/v1/clients/{client}")
    fun patchApiV1ClientsByClient(@Path("client") client: kotlin.String, @Body edgeApiDataUpdateClientRequest: EdgeApiDataUpdateClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>


    /**
    * enum for parameter posType
    */
    enum class PosTypePatchApiV1ClientsByClientSettingsShopsettings(val value: kotlin.String) {
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
     * @param baseSettingsShopSettings 
     * @param patch  (optional, default to false)
     * @param posType  (optional, default to ALLEAVES)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PATCH("api/v1/clients/{client}/settings/shopSettings")
    fun patchApiV1ClientsByClientSettingsShopsettings(@Path("client") client: kotlin.String, @Body baseSettingsShopSettings: BaseSettingsShopSettings, @Query("patch") patch: kotlin.Boolean? = false, @Query("posType") posType: PosTypePatchApiV1ClientsByClientSettingsShopsettings? = PosTypePatchApiV1ClientsByClientSettingsShopsettings.ALLEAVES, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param edgeApiDataCreateClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataCreateClientResult]>
     */
    @POST("api/v1/clients")
    fun postApiV1Clients(@Body edgeApiDataCreateClientRequest: EdgeApiDataCreateClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataCreateClientResult>

    /**
     * POST api/v1/clients/{client}/campaign/pn
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param edgeApiDataPushNotificationCampaignRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[NotificationCampaign]>
     */
    @POST("api/v1/clients/{client}/campaign/pn")
    fun postApiV1ClientsByClientCampaignPn(@Path("client") client: kotlin.String, @Body edgeApiDataPushNotificationCampaignRequest: EdgeApiDataPushNotificationCampaignRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NotificationCampaign>

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
    fun postApiV1ClientsByClientDevices(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/clients/{client}/moderation
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param edgeApiDataModerationReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/clients/{client}/moderation")
    fun postApiV1ClientsByClientModeration(@Path("client") client: kotlin.String, @Body edgeApiDataModerationReq: EdgeApiDataModerationReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/clients/{client}/productChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param baseSettingsShopSettingsChemicalInfoDisplayConfig 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/clients/{client}/productChemicals")
    fun postApiV1ClientsByClientProductchemicals(@Path("client") client: kotlin.String, @Body baseSettingsShopSettingsChemicalInfoDisplayConfig: BaseSettingsShopSettingsChemicalInfoDisplayConfig, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/clients/{client}/productCustomChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param edgeApiDataCustomChemicalInfoByCategoryConfigDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataCustomChemicalInfoByCategoryConfigDto]>
     */
    @POST("api/v1/clients/{client}/productCustomChemicals")
    fun postApiV1ClientsByClientProductcustomchemicals(@Path("client") client: kotlin.String, @Body edgeApiDataCustomChemicalInfoByCategoryConfigDto: EdgeApiDataCustomChemicalInfoByCategoryConfigDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataCustomChemicalInfoByCategoryConfigDto>

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
    fun postApiV1ClientsByClientProducts(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/clients/{client}/sync/{component}")
    fun postApiV1ClientsByClientSyncByComponent(@Path("client") client: kotlin.String, @Path("component") component: kotlin.String, @Query("updatedAfter") updatedAfter: java.time.OffsetDateTime? = null, @Query("syncFromLastUpdatedDate") syncFromLastUpdatedDate: kotlin.Boolean? = true, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
    fun postApiV1ClientsByClientTransactions(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

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
    fun postApiV1ClientsByClientUsers(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/clients/{clientId}/assign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param restControllerClientControllerAssignClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerClientControllerAssignClientResponse]>
     */
    @POST("api/v1/clients/{clientId}/assign")
    fun postApiV1ClientsByClientidAssign(@Path("clientId") clientId: kotlin.String, @Body restControllerClientControllerAssignClientRequest: RestControllerClientControllerAssignClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerClientControllerAssignClientResponse>

    /**
     * POST api/v1/clients/{clientId}/locations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param edgeApiDataCreateUpdateLocationDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PrivateCompanySettingsPointOfSaleInfoLocationInfo]>
     */
    @POST("api/v1/clients/{clientId}/locations")
    fun postApiV1ClientsByClientidLocations(@Path("clientId") clientId: kotlin.String, @Body edgeApiDataCreateUpdateLocationDto: EdgeApiDataCreateUpdateLocationDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PrivateCompanySettingsPointOfSaleInfoLocationInfo>

    /**
     * PUT api/v1/clients/{client}/logins
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param edgeApiDataUpdateClientLoginsRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/clients/{client}/logins")
    fun putApiV1ClientsByClientLogins(@Path("client") client: kotlin.String, @Body edgeApiDataUpdateClientLoginsRequest: EdgeApiDataUpdateClientLoginsRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/clients/{client}/moderation/dictionary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param edgeApiDataModerationDictionary 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<EdgeApiDataSentiment>]>
     */
    @PUT("api/v1/clients/{client}/moderation/dictionary")
    fun putApiV1ClientsByClientModerationDictionary(@Path("client") client: kotlin.String, @Body edgeApiDataModerationDictionary: EdgeApiDataModerationDictionary, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<EdgeApiDataSentiment>>

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
     * @param edgeApiDataCustomChemicalInfoByCategoryConfigDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataCustomChemicalInfoByCategoryConfigDto]>
     */
    @PUT("api/v1/clients/{client}/productCustomChemicals")
    fun putApiV1ClientsByClientProductcustomchemicals(@Path("client") client: kotlin.String, @Query("id") id: kotlin.String, @Query("currentCategoryPath") currentCategoryPath: kotlin.String, @Body edgeApiDataCustomChemicalInfoByCategoryConfigDto: EdgeApiDataCustomChemicalInfoByCategoryConfigDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataCustomChemicalInfoByCategoryConfigDto>

    /**
     * PUT api/v1/clients/{client}/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param edgeApiDataUpdateSettingsReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/clients/{client}/settings")
    fun putApiV1ClientsByClientSettings(@Path("client") client: kotlin.String, @Body edgeApiDataUpdateSettingsReq: EdgeApiDataUpdateSettingsReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/clients/{clientId}/restore")
    fun putApiV1ClientsByClientidRestore(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/clients/locations/{clientId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param edgeApiDataCreateUpdateLocationDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PrivateCompanySettingsPointOfSaleInfoLocationInfo]>
     */
    @PUT("api/v1/clients/locations/{clientId}")
    fun putApiV1ClientsLocationsByClientid(@Path("clientId") clientId: kotlin.String, @Body edgeApiDataCreateUpdateLocationDto: EdgeApiDataCreateUpdateLocationDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PrivateCompanySettingsPointOfSaleInfoLocationInfo>

}
