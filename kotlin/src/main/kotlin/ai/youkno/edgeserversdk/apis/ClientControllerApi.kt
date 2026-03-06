package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelBaseSettingsShopSettings
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBaseSettingsShopSettingsChemicalInfoDisplayConfig
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBounty
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAuditLogResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataChatRoomResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCompanyListResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCreateClientRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCreateClientResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCreateUpdateLocationDto
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataErrorResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataLocationResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataLocationsResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataModerationDictionary
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataModerationReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBountyProductZone
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataInventoryArea
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPushNotificationCampaignRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataRecommendationsStatsResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSalesStatisticsResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSentiment
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUpdateClientLoginsRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUpdateClientRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUpdateSettingsReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelFilter
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPrivateCompanySettingsPointOfSaleInfoLocationInfo
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerClientControllerAssignClientRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerClientControllerAssignClientResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestmodelUserAuth
import ai.youkno.edgeserversdk.models.CoedgeappserverserviceCompanyInkOpReservationStatisticsResult
import ai.youkno.edgeserversdk.models.CoedgeappserverserviceUserOpListResult
import ai.youkno.edgeserversdk.models.CoedgeappserverservicemodelNotificationCampaign

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCompanyListResult]>
     */
    @GET("api/v1/clients")
    fun getApiV1Clients(@Query("countryCodes") countryCodes: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("clientIds") clientIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("orgType") orgType: OrgTypeGetApiV1Clients? = null, @Query("start") start: kotlin.Int? = null, @Query("length") length: kotlin.Int? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchMode") searchMode: SearchModeGetApiV1Clients? = null, @Query("status") status: StatusGetApiV1Clients? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCompanyListResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUpdateClientRequest]>
     */
    @GET("api/v1/clients/{client}")
    fun getApiV1ClientsByClient(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUpdateClientRequest>

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
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/clients/{client}/approvals")
    fun getApiV1ClientsByClientApprovals(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<CoedgeappservermodelBountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<CoedgeappservermodelFilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: CoedgeappservermodelFilterDateRange? = null, @Query("expiresRange") expiresRange: CoedgeappservermodelFilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

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
     * @return [Call]<[kotlin.collections.List<CoedgeappserverservicemodelNotificationCampaign>]>
     */
    @GET("api/v1/clients/{client}/campaign/pn")
    fun getApiV1ClientsByClientCampaignPn(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappserverservicemodelNotificationCampaign>>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataInventoryArea]>
     */
    @GET("api/v1/clients/{client}/inventoryAreas")
    fun getApiV1ClientsByClientInventoryareas(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataInventoryArea>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataLocationResult]>
     */
    @GET("api/v1/clients/{client}/location")
    fun getApiV1ClientsByClientLocation(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataLocationResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataLocationsResult]>
     */
    @GET("api/v1/clients/{client}/locations")
    fun getApiV1ClientsByClientLocations(@Path("client") client: kotlin.String, @Query("onlyOnline") onlyOnline: kotlin.Boolean? = null, @Query("deliveryZipcode") deliveryZipcode: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataLocationsResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataModerationReq]>
     */
    @GET("api/v1/clients/{client}/moderation")
    fun getApiV1ClientsByClientModeration(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataModerationReq>

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
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelEdgeApiDataSentiment>]>
     */
    @GET("api/v1/clients/{client}/moderation/dictionary")
    fun getApiV1ClientsByClientModerationDictionary(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelEdgeApiDataSentiment>>

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
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/clients/{client}/orders")
    fun getApiV1ClientsByClientOrders(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<CoedgeappservermodelBountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<CoedgeappservermodelFilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: CoedgeappservermodelFilterDateRange? = null, @Query("expiresRange") expiresRange: CoedgeappservermodelFilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

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
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @GET("api/v1/clients/{client}/orders/{order_id}")
    fun getApiV1ClientsByClientOrdersByOrderId(@Path("client") client: kotlin.String, @Path("order_id") orderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

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
     * @return [Call]<[CoedgeappservermodelBaseSettingsShopSettingsChemicalInfoDisplayConfig]>
     */
    @GET("api/v1/clients/{client}/productChemicals")
    fun getApiV1ClientsByClientProductchemicals(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBaseSettingsShopSettingsChemicalInfoDisplayConfig>

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
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto>]>
     */
    @GET("api/v1/clients/{client}/productCustomChemicals")
    fun getApiV1ClientsByClientProductcustomchemicals(@Path("client") client: kotlin.String, @Query("categoryPath") categoryPath: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto>>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataRecommendationsStatsResponse]>
     */
    @GET("api/v1/clients/{client}/recommendation/{bountyId}/stats")
    fun getApiV1ClientsByClientRecommendationByBountyidStats(@Path("client") client: kotlin.String, @Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataRecommendationsStatsResponse>

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
     * @return [Call]<[CoedgeappserverserviceCompanyInkOpReservationStatisticsResult]>
     */
    @GET("api/v1/clients/{client}/reservations/statistics")
    fun getApiV1ClientsByClientReservationsStatistics(@Path("client") client: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<CoedgeappservermodelBountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<CoedgeappservermodelFilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: CoedgeappservermodelFilterDateRange? = null, @Query("expiresRange") expiresRange: CoedgeappservermodelFilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceCompanyInkOpReservationStatisticsResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSalesStatisticsResult]>
     */
    @GET("api/v1/clients/{client}/sales/statistics")
    fun getApiV1ClientsByClientSalesStatistics(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSalesStatisticsResult>

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
     * @return [Call]<[CoedgeappservermodelBaseSettingsShopSettings]>
     */
    @GET("api/v1/clients/{client}/settings/shopSettings")
    fun getApiV1ClientsByClientSettingsShopsettings(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBaseSettingsShopSettings>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataChatRoomResult]>
     */
    @GET("api/v1/clients/{client}/supportChats")
    fun getApiV1ClientsByClientSupportchats(@Path("client") client: kotlin.String, @Query("status") status: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataChatRoomResult>

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
     * @return [Call]<[CoedgeappserverrestmodelUserAuth]>
     */
    @GET("api/v1/clients/{client}/users/{user}/auth")
    fun getApiV1ClientsByClientUsersByUserAuth(@Path("client") client: kotlin.String, @Path("user") user: kotlin.String, @Header("Authorization") authorization: kotlin.String? = null, @Query("deviceId") deviceId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("deviceSecret") deviceSecret: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestmodelUserAuth>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataAuditLogResult]>
     */
    @GET("api/v1/clients/{clientId}/settings/shopSettings/audit_logs")
    fun getApiV1ClientsByClientidSettingsShopsettingsAuditLogs(@Path("clientId") clientId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataAuditLogResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBountyProductZone]>
     */
    @GET("api/v1/clients/{clientId}/zones")
    fun getApiV1ClientsByClientidZones(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBountyProductZone>

    /**
     * PATCH api/v1/clients/{client}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param coedgeappservermodelEdgeApiDataUpdateClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PATCH("api/v1/clients/{client}")
    fun patchApiV1ClientsByClient(@Path("client") client: kotlin.String, @Body coedgeappservermodelEdgeApiDataUpdateClientRequest: CoedgeappservermodelEdgeApiDataUpdateClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>


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
     * @param coedgeappservermodelBaseSettingsShopSettings 
     * @param patch  (optional, default to false)
     * @param posType  (optional, default to ALLEAVES)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PATCH("api/v1/clients/{client}/settings/shopSettings")
    fun patchApiV1ClientsByClientSettingsShopsettings(@Path("client") client: kotlin.String, @Body coedgeappservermodelBaseSettingsShopSettings: CoedgeappservermodelBaseSettingsShopSettings, @Query("patch") patch: kotlin.Boolean? = false, @Query("posType") posType: PosTypePatchApiV1ClientsByClientSettingsShopsettings? = PosTypePatchApiV1ClientsByClientSettingsShopsettings.ALLEAVES, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param coedgeappservermodelEdgeApiDataCreateClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCreateClientResult]>
     */
    @POST("api/v1/clients")
    fun postApiV1Clients(@Body coedgeappservermodelEdgeApiDataCreateClientRequest: CoedgeappservermodelEdgeApiDataCreateClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCreateClientResult>

    /**
     * POST api/v1/clients/{client}/campaign/pn
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param coedgeappservermodelEdgeApiDataPushNotificationCampaignRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverservicemodelNotificationCampaign]>
     */
    @POST("api/v1/clients/{client}/campaign/pn")
    fun postApiV1ClientsByClientCampaignPn(@Path("client") client: kotlin.String, @Body coedgeappservermodelEdgeApiDataPushNotificationCampaignRequest: CoedgeappservermodelEdgeApiDataPushNotificationCampaignRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverservicemodelNotificationCampaign>

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
     * @param coedgeappservermodelEdgeApiDataModerationReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/clients/{client}/moderation")
    fun postApiV1ClientsByClientModeration(@Path("client") client: kotlin.String, @Body coedgeappservermodelEdgeApiDataModerationReq: CoedgeappservermodelEdgeApiDataModerationReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/clients/{client}/productChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param coedgeappservermodelBaseSettingsShopSettingsChemicalInfoDisplayConfig 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/clients/{client}/productChemicals")
    fun postApiV1ClientsByClientProductchemicals(@Path("client") client: kotlin.String, @Body coedgeappservermodelBaseSettingsShopSettingsChemicalInfoDisplayConfig: CoedgeappservermodelBaseSettingsShopSettingsChemicalInfoDisplayConfig, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/clients/{client}/productCustomChemicals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param coedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto]>
     */
    @POST("api/v1/clients/{client}/productCustomChemicals")
    fun postApiV1ClientsByClientProductcustomchemicals(@Path("client") client: kotlin.String, @Body coedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto: CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto>

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
     * @param coedgeappserverrestcontrollerClientControllerAssignClientRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerClientControllerAssignClientResponse]>
     */
    @POST("api/v1/clients/{clientId}/assign")
    fun postApiV1ClientsByClientidAssign(@Path("clientId") clientId: kotlin.String, @Body coedgeappserverrestcontrollerClientControllerAssignClientRequest: CoedgeappserverrestcontrollerClientControllerAssignClientRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerClientControllerAssignClientResponse>

    /**
     * POST api/v1/clients/{clientId}/locations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelEdgeApiDataCreateUpdateLocationDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPrivateCompanySettingsPointOfSaleInfoLocationInfo]>
     */
    @POST("api/v1/clients/{clientId}/locations")
    fun postApiV1ClientsByClientidLocations(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelEdgeApiDataCreateUpdateLocationDto: CoedgeappservermodelEdgeApiDataCreateUpdateLocationDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPrivateCompanySettingsPointOfSaleInfoLocationInfo>

    /**
     * PUT api/v1/clients/{client}/logins
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param coedgeappservermodelEdgeApiDataUpdateClientLoginsRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/clients/{client}/logins")
    fun putApiV1ClientsByClientLogins(@Path("client") client: kotlin.String, @Body coedgeappservermodelEdgeApiDataUpdateClientLoginsRequest: CoedgeappservermodelEdgeApiDataUpdateClientLoginsRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/clients/{client}/moderation/dictionary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param coedgeappservermodelEdgeApiDataModerationDictionary 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelEdgeApiDataSentiment>]>
     */
    @PUT("api/v1/clients/{client}/moderation/dictionary")
    fun putApiV1ClientsByClientModerationDictionary(@Path("client") client: kotlin.String, @Body coedgeappservermodelEdgeApiDataModerationDictionary: CoedgeappservermodelEdgeApiDataModerationDictionary, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelEdgeApiDataSentiment>>

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
     * @param coedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto]>
     */
    @PUT("api/v1/clients/{client}/productCustomChemicals")
    fun putApiV1ClientsByClientProductcustomchemicals(@Path("client") client: kotlin.String, @Query("id") id: kotlin.String, @Query("currentCategoryPath") currentCategoryPath: kotlin.String, @Body coedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto: CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCustomChemicalInfoByCategoryConfigDto>

    /**
     * PUT api/v1/clients/{client}/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param coedgeappservermodelEdgeApiDataUpdateSettingsReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/clients/{client}/settings")
    fun putApiV1ClientsByClientSettings(@Path("client") client: kotlin.String, @Body coedgeappservermodelEdgeApiDataUpdateSettingsReq: CoedgeappservermodelEdgeApiDataUpdateSettingsReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param coedgeappservermodelEdgeApiDataCreateUpdateLocationDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPrivateCompanySettingsPointOfSaleInfoLocationInfo]>
     */
    @PUT("api/v1/clients/locations/{clientId}")
    fun putApiV1ClientsLocationsByClientid(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelEdgeApiDataCreateUpdateLocationDto: CoedgeappservermodelEdgeApiDataCreateUpdateLocationDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPrivateCompanySettingsPointOfSaleInfoLocationInfo>

}
