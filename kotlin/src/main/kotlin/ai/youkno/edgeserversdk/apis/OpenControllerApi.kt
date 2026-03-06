package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessBountyContentResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelAttachmentsAttachment
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBaseSettingsPolicy
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBaseSettingsShopSettings
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBounty
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBountyBudget
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBountyResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelClientInfo
import ai.youkno.edgeserversdk.models.CoedgeappservermodelComment
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAccessBountyContentReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAdvertsResultAdvert
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAllowedIntegrationsResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataBountyInfoResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataBountyResponseRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataBountyResponseResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataBusinessTypesResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCategory
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataClientGuessResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCommentResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCurrenciesResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataExchangeTokenResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataExplainSelfLinkResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataGetFiltersResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataKioskEntryPointResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataLikeRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataLocationGuessResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataLocationsResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataLookupResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataOrderPaymentResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataOrderResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataOrderUpdate
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessBountyContentResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelComment
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPrivateCompanySettingsPointOfSaleInfoLocationInfo
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappserverserviceUserHandleKioskInfo
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPayOrderReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPickupOrdersResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPlaceBidReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataProductExtras
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSurveyAnswers
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSurveyBundleResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserEarningsResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserProfileEx
import ai.youkno.edgeserversdk.models.CoedgeappservermodelFilter
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPageFilter
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPointCurrency
import ai.youkno.edgeserversdk.models.CoedgeappservermodelResponseChanges
import ai.youkno.edgeserversdk.models.CoedgeappservermodelReward
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerOpenControllerInviteInfoResult
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerOpenControllerStatesResult
import ai.youkno.edgeserversdk.models.CoedgeappserverserviceUserOpListResult
import ai.youkno.edgeserversdk.models.CoedgeappserverserviceUserOpSectionsResult
import ai.youkno.edgeserversdk.models.CoedgeappserverthirdpartiesCompanyInfoAgentCompanyInfo
import ai.youkno.edgeserversdk.models.CoedgeappserverthirdpartiesopentableConsumerAPIAPIAvailability

import ai.youkno.edgeserversdk.models.*

interface OpenControllerApi {
    /**
     * DELETE api/v1/open/comments/{commentId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param commentId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/open/comments/{commentId}")
    fun deleteApiV1OpenCommentsByCommentid(@Path("commentId") commentId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>


    /**
    * enum for parameter targetApp
    */
    enum class TargetAppGetApiV1OpenAdvertsByTargetappByBannertype(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "ANDROID") ANDROID("ANDROID"),
        @Json(name = "IOS") IOS("IOS"),
        @Json(name = "WEB") WEB("WEB"),
        @Json(name = "JOIN_WEB") JOIN_WEB("JOIN_WEB"),
        @Json(name = "SERVER") SERVER("SERVER"),
        @Json(name = "SHOP") SHOP("SHOP"),
        @Json(name = "KIOSK") KIOSK("KIOSK"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }


    /**
    * enum for parameter bannerType
    */
    enum class BannerTypeGetApiV1OpenAdvertsByTargetappByBannertype(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "HERO") HERO("HERO"),
        @Json(name = "HIGHLIGHTS") HIGHLIGHTS("HIGHLIGHTS"),
        @Json(name = "RECOMMENDATIONS") RECOMMENDATIONS("RECOMMENDATIONS"),
        @Json(name = "SPECIALS") SPECIALS("SPECIALS"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/open/adverts/{targetApp}/{bannerType}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param targetApp 
     * @param bannerType 
     * @param locationCompanyId  (optional)
     * @param locationPin  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelEdgeApiDataAdvertsResultAdvert>]>
     */
    @GET("api/v1/open/adverts/{targetApp}/{bannerType}")
    fun getApiV1OpenAdvertsByTargetappByBannertype(@Path("targetApp") targetApp: kotlin.String, @Path("bannerType") bannerType: kotlin.String, @Query("locationCompanyId") locationCompanyId: kotlin.String? = null, @Query("locationPin") locationPin: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelEdgeApiDataAdvertsResultAdvert>>

    /**
     * GET api/v1/open/attachments/{anchorType}/{anchorId}/{attachmentId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param anchorType 
     * @param anchorId 
     * @param attachmentId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAttachmentsAttachment]>
     */
    @GET("api/v1/open/attachments/{anchorType}/{anchorId}/{attachmentId}")
    fun getApiV1OpenAttachmentsByAnchortypeByAnchoridByAttachmentid(@Path("anchorType") anchorType: kotlin.String, @Path("anchorId") anchorId: kotlin.String, @Path("attachmentId") attachmentId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAttachmentsAttachment>

    /**
     * GET api/v1/open/bounties/{bounty_id}/activities/chain
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/open/bounties/{bounty_id}/activities/chain")
    fun getApiV1OpenBountiesByBountyIdActivitiesChain(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

    /**
     * GET api/v1/open/bounties/{bounty_id}/budget
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelReward]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/open/bounties/{bounty_id}/budget")
    fun getApiV1OpenBountiesByBountyIdBudget(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelReward>

    /**
     * GET api/v1/open/bounties/{bounty_id}/budget_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBountyBudget]>
     */
    @GET("api/v1/open/bounties/{bounty_id}/budget_new")
    fun getApiV1OpenBountiesByBountyIdBudgetNew(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBountyBudget>

    /**
     * GET api/v1/open/bounties/{bounty_id}/budget_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelReward]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/open/bounties/{bounty_id}/budget_old")
    fun getApiV1OpenBountiesByBountyIdBudgetOld(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelReward>

    /**
     * GET api/v1/open/bounties/{bounty_id}/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyInfoResult]>
     */
    @GET("api/v1/open/bounties/{bounty_id}/info")
    fun getApiV1OpenBountiesByBountyIdInfo(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyInfoResult>

    /**
     * GET api/v1/open/bounties/{bountyId}/content/access/status
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param includSubbounties  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessBountyContentResult]>
     */
    @GET("api/v1/open/bounties/{bountyId}/content/access/status")
    fun getApiV1OpenBountiesByBountyidContentAccessStatus(@Path("bountyId") bountyId: kotlin.String, @Query("includSubbounties") includSubbounties: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessBountyContentResult>

    /**
     * GET api/v1/open/bounty_fetch/{bounty_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param fetchFromFb  (optional)
     * @param creatorId  (optional)
     * @param format  (optional)
     * @param bountyType  (optional)
     * @param tag  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @GET("api/v1/open/bounty_fetch/{bounty_id}")
    fun getApiV1OpenBountyFetchByBountyId(@Path("bounty_id") bountyId: kotlin.String, @Query("fetchFromFb") fetchFromFb: kotlin.Boolean? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("format") format: kotlin.String? = null, @Query("bounty_type") bountyType: kotlin.String? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * GET api/v1/open/{user_id}/orders/{order_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param orderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @GET("api/v1/open/{user_id}/orders/{order_id}")
    fun getApiV1OpenByUserIdOrdersByOrderId(@Path("user_id") userId: kotlin.String, @Path("order_id") orderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * GET api/v1/open/{user_id}/suborders/{parent_order_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param parentOrderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/open/{user_id}/suborders/{parent_order_id}")
    fun getApiV1OpenByUserIdSubordersByParentOrderId(@Path("user_id") userId: kotlin.String, @Path("parent_order_id") parentOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>


    /**
    * enum for parameter categoryType
    */
    enum class CategoryTypeGetApiV1OpenCategoriesByCategoryType(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "QUESTION") QUESTION("QUESTION"),
        @Json(name = "THREAD") THREAD("THREAD"),
        @Json(name = "TALENT_SEARCH") TALENT_SEARCH("TALENT_SEARCH"),
        @Json(name = "TALENT_RECOMMENDATION") TALENT_RECOMMENDATION("TALENT_RECOMMENDATION"),
        @Json(name = "TMOB_CHALLENGE") TMOB_CHALLENGE("TMOB_CHALLENGE"),
        @Json(name = "TMOB_COACHING") TMOB_COACHING("TMOB_COACHING"),
        @Json(name = "ORDER") ORDER("ORDER"),
        @Json(name = "REALESTATE_CUSTOMER") REALESTATE_CUSTOMER("REALESTATE_CUSTOMER"),
        @Json(name = "REALESTATE_RECOMMENDATION") REALESTATE_RECOMMENDATION("REALESTATE_RECOMMENDATION"),
        @Json(name = "SURVEY") SURVEY("SURVEY"),
        @Json(name = "CLASSIFIED") CLASSIFIED("CLASSIFIED"),
        @Json(name = "PRODUCT") PRODUCT("PRODUCT"),
        @Json(name = "MENU") MENU("MENU"),
        @Json(name = "BUNDLE") BUNDLE("BUNDLE"),
        @Json(name = "STORY") STORY("STORY"),
        @Json(name = "SCORE") SCORE("SCORE"),
        @Json(name = "SERIES") SERIES("SERIES"),
        @Json(name = "CHECKLIST") CHECKLIST("CHECKLIST"),
        @Json(name = "SUPPORT") SUPPORT("SUPPORT"),
        @Json(name = "AI_BOT") AI_BOT("AI_BOT"),
        @Json(name = "DEAL") DEAL("DEAL"),
        @Json(name = "PROMOTION") PROMOTION("PROMOTION"),
        @Json(name = "AUTOSUGGESTION") AUTOSUGGESTION("AUTOSUGGESTION"),
        @Json(name = "APPROVAL") APPROVAL("APPROVAL"),
        @Json(name = "MCQ") MCQ("MCQ"),
        @Json(name = "FUNDING") FUNDING("FUNDING"),
        @Json(name = "AUCTION") AUCTION("AUCTION"),
        @Json(name = "ROLEPLAY") ROLEPLAY("ROLEPLAY"),
        @Json(name = "PRIVATE_LISTING") PRIVATE_LISTING("PRIVATE_LISTING"),
        @Json(name = "QUEST") QUEST("QUEST"),
        @Json(name = "LIVE_STREAM") LIVE_STREAM("LIVE_STREAM"),
        @Json(name = "ALBUM") ALBUM("ALBUM"),
        @Json(name = "NEWS") NEWS("NEWS"),
        @Json(name = "BANNER") BANNER("BANNER"),
        @Json(name = "MATCH") MATCH("MATCH"),
        @Json(name = "CONTEST") CONTEST("CONTEST"),
        @Json(name = "TRIVIA") TRIVIA("TRIVIA"),
        @Json(name = "LOTTERY") LOTTERY("LOTTERY"),
        @Json(name = "BADGE_COLLECTION") BADGE_COLLECTION("BADGE_COLLECTION"),
        @Json(name = "RAFFLE") RAFFLE("RAFFLE"),
        @Json(name = "CALENDAR_EVENT") CALENDAR_EVENT("CALENDAR_EVENT"),
        @Json(name = "CURRENCY") CURRENCY("CURRENCY"),
        @Json(name = "RESERVATION") RESERVATION("RESERVATION"),
        @Json(name = "QUICK_CLAIM") QUICK_CLAIM("QUICK_CLAIM"),
        @Json(name = "CAMPAIGN") CAMPAIGN("CAMPAIGN"),
        @Json(name = "EXPRESS_CAMPAIGN") EXPRESS_CAMPAIGN("EXPRESS_CAMPAIGN"),
        @Json(name = "GEO_LOCATION") GEO_LOCATION("GEO_LOCATION"),
        @Json(name = "FEEDBACK") FEEDBACK("FEEDBACK"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/open/categories/{category_type}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param categoryType 
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
     * @param clientId  (optional)
     * @param zone  (optional)
     * @param category  (optional)
     * @param tag  (optional)
     * @param q  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCategory]>
     */
    @GET("api/v1/open/categories/{category_type}")
    fun getApiV1OpenCategoriesByCategoryType(@Path("category_type") categoryType: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<CoedgeappservermodelBountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<CoedgeappservermodelFilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: CoedgeappservermodelFilterDateRange? = null, @Query("expiresRange") expiresRange: CoedgeappservermodelFilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("clientId") clientId: kotlin.String? = null, @Query("zone") zoneClient: kotlin.String? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("q") q: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCategory>

    /**
     * GET api/v1/open/clients/{client_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelClientInfo]>
     */
    @GET("api/v1/open/clients/{client_id}")
    fun getApiV1OpenClientsByClientId(@Path("client_id") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelClientInfo>

    /**
     * GET api/v1/open/clients/guess
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url 
     * @param clientId  (optional)
     * @param kiosk  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataClientGuessResult]>
     */
    @GET("api/v1/open/clients/guess")
    fun getApiV1OpenClientsGuess(@Query("url") url: kotlin.String, @Query("clientId") clientId: kotlin.String? = null, @Query("kiosk") kiosk: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataClientGuessResult>

    /**
     * GET api/v1/open/comments/{commentId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param commentId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCommentResp]>
     */
    @GET("api/v1/open/comments/{commentId}")
    fun getApiV1OpenCommentsByCommentid(@Path("commentId") commentId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCommentResp>

    /**
     * GET api/v1/open/comments/{entityType}/{entityId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityId 
     * @param entityType 
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelComment]>
     */
    @GET("api/v1/open/comments/{entityType}/{entityId}")
    fun getApiV1OpenCommentsByEntitytypeByEntityid(@Path("entityId") entityId: kotlin.String, @Path("entityType") entityType: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelComment>

    /**
     * GET api/v1/open/companies/{companyId}/kiosks
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappserverserviceUserHandleKioskInfo]>
     */
    @GET("api/v1/open/companies/{companyId}/kiosks")
    fun getApiV1OpenCompaniesByCompanyidKiosks(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappserverserviceUserHandleKioskInfo>

    /**
     * GET api/v1/open/companies/{companyId}/locations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPrivateCompanySettingsPointOfSaleInfoLocationInfo]>
     */
    @GET("api/v1/open/companies/{companyId}/locations")
    fun getApiV1OpenCompaniesByCompanyidLocations(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPrivateCompanySettingsPointOfSaleInfoLocationInfo>

    /**
     * GET api/v1/open/company/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverthirdpartiesCompanyInfoAgentCompanyInfo]>
     */
    @GET("api/v1/open/company/info")
    fun getApiV1OpenCompanyInfo(@Query("url") url: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverthirdpartiesCompanyInfoAgentCompanyInfo>

    /**
     * GET api/v1/open/currencies
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCurrenciesResponse]>
     */
    @GET("api/v1/open/currencies")
    fun getApiV1OpenCurrencies(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCurrenciesResponse>

    /**
     * GET api/v1/open/currency/{code}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPointCurrency]>
     */
    @GET("api/v1/open/currency/{code}")
    fun getApiV1OpenCurrencyByCode(@Path("code") code: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPointCurrency>

    /**
     * GET api/v1/open/email/confirm
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param token 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/open/email/confirm")
    fun getApiV1OpenEmailConfirm(@Query("token") token: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/open/filters/{list_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param listId 
     * @param tag  (optional)
     * @param category  (optional)
     * @param zone  (optional)
     * @param q  (optional)
     * @param clientId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataGetFiltersResult]>
     */
    @GET("api/v1/open/filters/{list_id}")
    fun getApiV1OpenFiltersByListId(@Path("list_id") listId: kotlin.String, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("zone") zone: kotlin.String? = null, @Query("q") q: kotlin.String? = null, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataGetFiltersResult>

    /**
     * GET api/v1/open/integrations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataAllowedIntegrationsResponse]>
     */
    @GET("api/v1/open/integrations")
    fun getApiV1OpenIntegrations(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataAllowedIntegrationsResponse>

    /**
     * GET api/v1/open/invites/{inviteId}/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerOpenControllerInviteInfoResult]>
     */
    @GET("api/v1/open/invites/{inviteId}/info")
    fun getApiV1OpenInvitesByInviteidInfo(@Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerOpenControllerInviteInfoResult>

    /**
     * GET api/v1/open/locations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deliveryZipcode  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataLocationsResult]>
     */
    @GET("api/v1/open/locations")
    fun getApiV1OpenLocations(@Query("deliveryZipcode") deliveryZipcode: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataLocationsResult>

    /**
     * GET api/v1/open/locations/guess
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataLocationGuessResult]>
     */
    @GET("api/v1/open/locations/guess")
    fun getApiV1OpenLocationsGuess(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataLocationGuessResult>


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetApiV1OpenLookupsByLookupType(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }

    /**
     * GET api/v1/open/lookups/{lookup_type}
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
    @GET("api/v1/open/lookups/{lookup_type}")
    fun getApiV1OpenLookupsByLookupType(@Path("lookup_type") lookupType: kotlin.String, @Query("q") q: kotlin.String? = null, @Query("limit") limit: kotlin.String? = null, @Query("query") query: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("searchMode") searchMode: SearchModeGetApiV1OpenLookupsByLookupType? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataLookupResult>

    /**
     * GET api/v1/open/lookups/countries/{country}/states
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param country 
     * @param administrative  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerOpenControllerStatesResult]>
     */
    @GET("api/v1/open/lookups/countries/{country}/states")
    fun getApiV1OpenLookupsCountriesByCountryStates(@Path("country") country: kotlin.String, @Query("administrative") administrative: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerOpenControllerStatesResult>

    /**
     * GET api/v1/open/meta/tablet/entrypoint
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param test  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataKioskEntryPointResult]>
     */
    @GET("api/v1/open/meta/tablet/entrypoint")
    fun getApiV1OpenMetaTabletEntrypoint(@Query("test") test: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataKioskEntryPointResult>

    /**
     * GET api/v1/open/orders/{bountyId}/receipt
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param redirectUrl 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/open/orders/{bountyId}/receipt")
    fun getApiV1OpenOrdersByBountyidReceipt(@Path("bountyId") bountyId: kotlin.String, @Query("redirectUrl") redirectUrl: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/open/pickup_orders/{client}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param pickupDate 
     * @param deliveryMethod  (optional, default to "PICKUP")
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelEdgeApiDataPickupOrdersResult>]>
     */
    @GET("api/v1/open/pickup_orders/{client}")
    fun getApiV1OpenPickupOrdersByClient(@Path("client") client: kotlin.String, @Query("pickup_date") pickupDate: kotlin.String, @Query("delivery_method") deliveryMethod: kotlin.String? = "PICKUP", @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelEdgeApiDataPickupOrdersResult>>

    /**
     * GET api/v1/open/products
     * 
     * 
     * Responses:
     *  - 200: OK
     *
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
     * @param category  (optional)
     * @param tag  (optional)
     * @param zone  (optional)
     * @param q  (optional)
     * @param start  (optional)
     * @param length  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/open/products")
    fun getApiV1OpenProducts(@Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<CoedgeappservermodelBountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<CoedgeappservermodelFilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: CoedgeappservermodelFilterDateRange? = null, @Query("expiresRange") expiresRange: CoedgeappservermodelFilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("zone") zoneSearch: kotlin.String? = null, @Query("q") q: kotlin.String? = null, @Query("start") start: kotlin.Int? = null, @Query("length") length: kotlin.Int? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

    /**
     * GET api/v1/open/products/{productId}/extras
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param productId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataProductExtras]>
     */
    @GET("api/v1/open/products/{productId}/extras")
    fun getApiV1OpenProductsByProductidExtras(@Path("productId") productId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataProductExtras>

    /**
     * GET api/v1/open/products/recommendations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param actionVerb  (optional)
     * @param actionObjectType  (optional)
     * @param actionObjectId  (optional)
     * @param actionSearchQuery  (optional)
     * @param actionRecommendationToken  (optional)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/open/products/recommendations")
    fun getApiV1OpenProductsRecommendations(@Query("actionVerb") actionVerb: kotlin.String? = null, @Query("actionObjectType") actionObjectType: kotlin.String? = null, @Query("actionObjectId") actionObjectId: kotlin.String? = null, @Query("actionSearchQuery") actionSearchQuery: kotlin.String? = null, @Query("actionRecommendationToken") actionRecommendationToken: kotlin.String? = null, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

    /**
     * GET api/v1/open/report/content/types
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
    @GET("api/v1/open/report/content/types")
    fun getApiV1OpenReportContentTypes(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/open/reservations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
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
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/open/reservations")
    fun getApiV1OpenReservations(@Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("zone") zone: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<CoedgeappservermodelBountyBountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<CoedgeappservermodelFilterFilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: CoedgeappservermodelFilterDateRange? = null, @Query("expiresRange") expiresRange: CoedgeappservermodelFilterDateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>


    /**
    * enum for parameter reservationAttribute
    */
    enum class ReservationAttributeGetApiV1OpenReservationsAvailability(val value: kotlin.String) {
        @Json(name = "HIGHTOP") HIGHTOP("HIGHTOP"),
        @Json(name = "BAR") BAR("BAR"),
        @Json(name = "COUNTER") COUNTER("COUNTER"),
        @Json(name = "OUTDOOR") OUTDOOR("OUTDOOR"),
        @Json(name = "DEFAULT") DEFAULT("DEFAULT")
    }

    /**
     * GET api/v1/open/reservations/availability
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param date 
     * @param partySize 
     * @param restaurantId  (optional)
     * @param forwardMinutes  (optional, default to 30)
     * @param backwardMinutes  (optional, default to 30)
     * @param includeCcResults  (optional, default to true)
     * @param includeExperiences  (optional, default to true)
     * @param reservationAttribute  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverthirdpartiesopentableConsumerAPIAPIAvailability]>
     */
    @GET("api/v1/open/reservations/availability")
    fun getApiV1OpenReservationsAvailability(@Query("date") date: kotlin.Long, @Query("partySize") partySize: kotlin.Int, @Query("restaurantId") restaurantId: kotlin.Int? = null, @Query("forwardMinutes") forwardMinutes: kotlin.Int? = 30, @Query("backwardMinutes") backwardMinutes: kotlin.Int? = 30, @Query("includeCcResults") includeCcResults: kotlin.Boolean? = true, @Query("includeExperiences") includeExperiences: kotlin.Boolean? = true, @Query("reservationAttribute") reservationAttribute: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverthirdpartiesopentableConsumerAPIAPIAvailability>

    /**
     * GET api/v1/open/restaurants
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataLocationsResult]>
     */
    @GET("api/v1/open/restaurants")
    fun getApiV1OpenRestaurants(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataLocationsResult>

    /**
     * GET api/v1/open/selfLinks/explain
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataExplainSelfLinkResp]>
     */
    @GET("api/v1/open/selfLinks/explain")
    fun getApiV1OpenSelflinksExplain(@Query("url") url: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataExplainSelfLinkResp>

    /**
     * GET api/v1/open/selfonboarding/businessTypes
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBusinessTypesResp]>
     */
    @GET("api/v1/open/selfonboarding/businessTypes")
    fun getApiV1OpenSelfonboardingBusinesstypes(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBusinessTypesResp>

    /**
     * GET api/v1/open/settings/shopSettings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBaseSettingsShopSettings]>
     */
    @GET("api/v1/open/settings/shopSettings")
    fun getApiV1OpenSettingsShopsettings(@Query("companyId") companyId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBaseSettingsShopSettings>

    /**
     * GET api/v1/open/states/{client_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param administrative  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerOpenControllerStatesResult]>
     */
    @GET("api/v1/open/states/{client_id}")
    fun getApiV1OpenStatesByClientId(@Path("client_id") clientId: kotlin.String, @Query("administrative") administrative: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerOpenControllerStatesResult>

    /**
     * GET api/v1/open/surveys/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSurveyBundleResp]>
     */
    @GET("api/v1/open/surveys/{bountyId}")
    fun getApiV1OpenSurveysByBountyid(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSurveyBundleResp>

    /**
     * GET api/v1/open/surveys/{bountyId}/answer
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSurveyAnswers]>
     */
    @GET("api/v1/open/surveys/{bountyId}/answer")
    fun getApiV1OpenSurveysByBountyidAnswer(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSurveyAnswers>

    /**
     * GET api/v1/open/tokens/{currencyFrom}/exchange
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param currencyFrom 
     * @param amountFrom 
     * @param currencyTo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataExchangeTokenResp]>
     */
    @GET("api/v1/open/tokens/{currencyFrom}/exchange")
    fun getApiV1OpenTokensByCurrencyfromExchange(@Path("currencyFrom") currencyFrom: kotlin.String, @Query("amountFrom") amountFrom: kotlin.Long, @Query("currencyTo") currencyTo: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataExchangeTokenResp>


    /**
    * enum for parameter searchDirection
    */
    enum class SearchDirectionGetApiV1OpenUserStreamByListid(val value: kotlin.String) {
        @Json(name = "UP") UP("UP"),
        @Json(name = "DOWN") DOWN("DOWN")
    }


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetApiV1OpenUserStreamByListid(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }


    /**
    * enum for parameter strategy
    */
    enum class StrategyGetApiV1OpenUserStreamByListid(val value: kotlin.String) {
        @Json(name = "FULL") FULL("FULL"),
        @Json(name = "SKELETON") SKELETON("SKELETON")
    }

    /**
     * GET api/v1/open/user/stream/{listId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param listId 
     * @param userId  (optional)
     * @param groupId  (optional)
     * @param companyId  (optional)
     * @param postedAt  (optional)
     * @param searchDirection  (optional, default to DOWN)
     * @param searchMode  (optional)
     * @param strategy  (optional, default to FULL)
     * @param order  (optional)
     * @param displayScreen  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param ignoreCache  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty]>
     */
    @GET("api/v1/open/user/stream/{listId}")
    fun getApiV1OpenUserStreamByListid(@Path("listId") listId: kotlin.String, @Query("user_id") userId: kotlin.String? = null, @Query("group_id") groupId: kotlin.String? = null, @Query("company_id") companyId: kotlin.String? = null, @Query("posted_at") postedAt: kotlin.Long? = null, @Query("search_direction") searchDirection: SearchDirectionGetApiV1OpenUserStreamByListid? = SearchDirectionGetApiV1OpenUserStreamByListid.DOWN, @Query("search_mode") searchMode: SearchModeGetApiV1OpenUserStreamByListid? = null, @Query("strategy") strategy: StrategyGetApiV1OpenUserStreamByListid? = StrategyGetApiV1OpenUserStreamByListid.FULL, @Query("order") order: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty>

    /**
     * GET api/v1/open/users/{user_id}/earnings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserEarningsResult]>
     */
    @GET("api/v1/open/users/{user_id}/earnings")
    fun getApiV1OpenUsersByUserIdEarnings(@Path("user_id") userId: kotlin.String, @Query("bounty_id") bountyId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserEarningsResult>

    /**
     * GET api/v1/open/users/{user_id}/profile
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserProfileEx]>
     */
    @GET("api/v1/open/users/{user_id}/profile")
    fun getApiV1OpenUsersByUserIdProfile(@Path("user_id") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserProfileEx>


    /**
    * enum for parameter policyType
    */
    enum class PolicyTypeGetApiV1OpenVendorByUseridPolicy(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "SHIPPING") SHIPPING("SHIPPING"),
        @Json(name = "RETURN") RETURN("RETURN"),
        @Json(name = "REFUND") REFUND("REFUND"),
        @Json(name = "ADDITIONAL") ADDITIONAL("ADDITIONAL"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/open/vendor/{userId}/policy
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param policyType  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, CoedgeappservermodelBaseSettingsPolicy>]>
     */
    @GET("api/v1/open/vendor/{userId}/policy")
    fun getApiV1OpenVendorByUseridPolicy(@Path("userId") userId: kotlin.String, @Query("policyType") policyType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, CoedgeappservermodelBaseSettingsPolicy>>

    /**
     * PATCH api/v1/open/orders/{orderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderId 
     * @param coedgeappservermodelEdgeApiDataOrderUpdate 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataOrderResponse]>
     */
    @PATCH("api/v1/open/orders/{orderId}")
    fun patchApiV1OpenOrdersByOrderid(@Path("orderId") orderId: kotlin.String, @Body coedgeappservermodelEdgeApiDataOrderUpdate: CoedgeappservermodelEdgeApiDataOrderUpdate, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataOrderResponse>

    /**
     * POST api/v1/open/bounties/{bountyId}/content/access
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappservermodelEdgeApiDataAccessBountyContentReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessBountyContentResult]>
     */
    @POST("api/v1/open/bounties/{bountyId}/content/access")
    fun postApiV1OpenBountiesByBountyidContentAccess(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelEdgeApiDataAccessBountyContentReq: CoedgeappservermodelEdgeApiDataAccessBountyContentReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessBountyContentResult>

    /**
     * POST api/v1/open/bounty/{bountyId}/bid
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappservermodelEdgeApiDataPlaceBidReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyResponseResponse]>
     */
    @POST("api/v1/open/bounty/{bountyId}/bid")
    fun postApiV1OpenBountyByBountyidBid(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelEdgeApiDataPlaceBidReq: CoedgeappservermodelEdgeApiDataPlaceBidReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyResponseResponse>

    /**
     * POST api/v1/open/bounty/{bountyId}/quick_claim
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappservermodelEdgeApiDataBountyResponseRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyResponseResponse]>
     */
    @POST("api/v1/open/bounty/{bountyId}/quick_claim")
    fun postApiV1OpenBountyByBountyidQuickClaim(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelEdgeApiDataBountyResponseRequest: CoedgeappservermodelEdgeApiDataBountyResponseRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyResponseResponse>

    /**
     * POST api/v1/open/bounty/{bountyId}/response
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappservermodelBountyResponse 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyResponseResponse]>
     */
    @POST("api/v1/open/bounty/{bountyId}/response")
    fun postApiV1OpenBountyByBountyidResponse(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelBountyResponse: CoedgeappservermodelBountyResponse, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyResponseResponse>

    /**
     * POST api/v1/open/{entityType}/{entityId}/like
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityType 
     * @param entityId 
     * @param coedgeappservermodelEdgeApiDataLikeRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/open/{entityType}/{entityId}/like")
    fun postApiV1OpenByEntitytypeByEntityidLike(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.String, @Body coedgeappservermodelEdgeApiDataLikeRequest: CoedgeappservermodelEdgeApiDataLikeRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/open/campaigns
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelPageFilter 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @POST("api/v1/open/campaigns")
    fun postApiV1OpenCampaigns(@Body coedgeappservermodelPageFilter: CoedgeappservermodelPageFilter, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

    /**
     * POST api/v1/open/campaigns/sections
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelPageFilter 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpSectionsResult]>
     */
    @POST("api/v1/open/campaigns/sections")
    fun postApiV1OpenCampaignsSections(@Body coedgeappservermodelPageFilter: CoedgeappservermodelPageFilter, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpSectionsResult>

    /**
     * POST api/v1/open/comments
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelComment 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCommentResp]>
     */
    @POST("api/v1/open/comments")
    fun postApiV1OpenComments(@Body coedgeappservermodelComment: CoedgeappservermodelComment, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCommentResp>

    /**
     * POST api/v1/open/comments/{commentId}/promote
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param commentId 
     * @param coedgeappservermodelComment 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCommentResp]>
     */
    @POST("api/v1/open/comments/{commentId}/promote")
    fun postApiV1OpenCommentsByCommentidPromote(@Path("commentId") commentId: kotlin.String, @Body coedgeappservermodelComment: CoedgeappservermodelComment, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCommentResp>

    /**
     * POST api/v1/open/orders/{orderId}/pay
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderId 
     * @param coedgeappservermodelEdgeApiDataPayOrderReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataOrderResponse]>
     */
    @POST("api/v1/open/orders/{orderId}/pay")
    fun postApiV1OpenOrdersByOrderidPay(@Path("orderId") orderId: kotlin.String, @Body coedgeappservermodelEdgeApiDataPayOrderReq: CoedgeappservermodelEdgeApiDataPayOrderReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataOrderResponse>

    /**
     * POST api/v1/open/orders/{orderId}/payment/result
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderId 
     * @param coedgeappservermodelEdgeApiDataOrderPaymentResult 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/open/orders/{orderId}/payment/result")
    fun postApiV1OpenOrdersByOrderidPaymentResult(@Path("orderId") orderId: kotlin.String, @Body coedgeappservermodelEdgeApiDataOrderPaymentResult: CoedgeappservermodelEdgeApiDataOrderPaymentResult, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * POST api/v1/open/orders/{orderId}/status/{status}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderId 
     * @param status 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/open/orders/{orderId}/status/{status}")
    fun postApiV1OpenOrdersByOrderidStatusByStatus(@Path("orderId") orderId: kotlin.String, @Path("status") status: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * POST api/v1/open/surveys/{bountyId}/answer
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappservermodelEdgeApiDataSurveyAnswers 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSurveyAnswers]>
     */
    @POST("api/v1/open/surveys/{bountyId}/answer")
    fun postApiV1OpenSurveysByBountyidAnswer(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelEdgeApiDataSurveyAnswers: CoedgeappservermodelEdgeApiDataSurveyAnswers, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSurveyAnswers>

    /**
     * PUT api/v1/open/bounty/{bountyId}/response/{responseId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param responseId 
     * @param coedgeappservermodelResponseChanges 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyResponseResponse]>
     */
    @PUT("api/v1/open/bounty/{bountyId}/response/{responseId}")
    fun putApiV1OpenBountyByBountyidResponseByResponseid(@Path("bountyId") bountyId: kotlin.String, @Path("responseId") responseId: kotlin.String, @Body coedgeappservermodelResponseChanges: CoedgeappservermodelResponseChanges, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyResponseResponse>

    /**
     * PUT api/v1/open/comments/{commentId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param commentId 
     * @param coedgeappservermodelComment 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCommentResp]>
     */
    @PUT("api/v1/open/comments/{commentId}")
    fun putApiV1OpenCommentsByCommentid(@Path("commentId") commentId: kotlin.String, @Body coedgeappservermodelComment: CoedgeappservermodelComment, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCommentResp>

    /**
     * PUT api/v1/open/reservations/{bountyId}/cancel
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/open/reservations/{bountyId}/cancel")
    fun putApiV1OpenReservationsByBountyidCancel(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
