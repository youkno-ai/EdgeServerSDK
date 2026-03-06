package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AccessBountyContentReq
import ai.youkno.edgeserversdk.models.AccessBountyContentResult
import ai.youkno.edgeserversdk.models.Advert
import ai.youkno.edgeserversdk.models.AllowedIntegrationsResponse
import ai.youkno.edgeserversdk.models.Attachment
import ai.youkno.edgeserversdk.models.Availability
import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.BountyInfoResult
import ai.youkno.edgeserversdk.models.BountyResponse
import ai.youkno.edgeserversdk.models.BountyResponseRequest
import ai.youkno.edgeserversdk.models.BountyResponseResponse
import ai.youkno.edgeserversdk.models.Budget
import ai.youkno.edgeserversdk.models.BusinessTypesResp
import ai.youkno.edgeserversdk.models.Category
import ai.youkno.edgeserversdk.models.ClientGuessResult
import ai.youkno.edgeserversdk.models.ClientInfo
import ai.youkno.edgeserversdk.models.Comment
import ai.youkno.edgeserversdk.models.CommentResp
import ai.youkno.edgeserversdk.models.CompanyInfo
import ai.youkno.edgeserversdk.models.CurrenciesResponse
import ai.youkno.edgeserversdk.models.ExchangeTokenResp
import ai.youkno.edgeserversdk.models.ExplainSelfLinkResp
import ai.youkno.edgeserversdk.models.Filter
import ai.youkno.edgeserversdk.models.GetFiltersResult
import ai.youkno.edgeserversdk.models.InviteInfoResult
import ai.youkno.edgeserversdk.models.KioskEntryPointResult
import ai.youkno.edgeserversdk.models.LikeRequest
import ai.youkno.edgeserversdk.models.ListResult
import ai.youkno.edgeserversdk.models.LocationGuessResult
import ai.youkno.edgeserversdk.models.LocationsResult
import ai.youkno.edgeserversdk.models.LookupResult
import ai.youkno.edgeserversdk.models.OrderPaymentResult
import ai.youkno.edgeserversdk.models.OrderResponse
import ai.youkno.edgeserversdk.models.OrderUpdate
import ai.youkno.edgeserversdk.models.PageAccessBountyContentResult
import ai.youkno.edgeserversdk.models.PageBounty
import ai.youkno.edgeserversdk.models.PageComment
import ai.youkno.edgeserversdk.models.PageFilter
import ai.youkno.edgeserversdk.models.PageKioskInfo
import ai.youkno.edgeserversdk.models.PageLocationInfo
import ai.youkno.edgeserversdk.models.PayOrderReq
import ai.youkno.edgeserversdk.models.PickupOrdersResult
import ai.youkno.edgeserversdk.models.PlaceBidReq
import ai.youkno.edgeserversdk.models.PointCurrency
import ai.youkno.edgeserversdk.models.Policy
import ai.youkno.edgeserversdk.models.ProductExtras
import ai.youkno.edgeserversdk.models.ResponseChanges
import ai.youkno.edgeserversdk.models.Reward
import ai.youkno.edgeserversdk.models.SectionsResult
import ai.youkno.edgeserversdk.models.ShopSettings
import ai.youkno.edgeserversdk.models.StatesResult
import ai.youkno.edgeserversdk.models.SurveyAnswers
import ai.youkno.edgeserversdk.models.SurveyBundleResp
import ai.youkno.edgeserversdk.models.UserEarningsResult
import ai.youkno.edgeserversdk.models.UserProfileEx

import ai.youkno.edgeserversdk.models.*

interface OpenControllerApi {
    /**
     * POST api/v1/open/bounties/{bountyId}/content/access
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param accessBountyContentReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AccessBountyContentResult]>
     */
    @POST("api/v1/open/bounties/{bountyId}/content/access")
    fun accessBountyContent(@Path("bountyId") bountyId: kotlin.String, @Body accessBountyContentReq: AccessBountyContentReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AccessBountyContentResult>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ExchangeTokenResp]>
     */
    @GET("api/v1/open/tokens/{currencyFrom}/exchange")
    fun calculateExchange(@Path("currencyFrom") currencyFrom: kotlin.String, @Query("amountFrom") amountFrom: kotlin.Long, @Query("currencyTo") currencyTo: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ExchangeTokenResp>

    /**
     * PUT api/v1/open/reservations/{bountyId}/cancel
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/open/reservations/{bountyId}/cancel")
    fun cancelReservation(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/open/email/confirm
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param token 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/open/email/confirm")
    fun confirmEmail(@Query("token") token: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * DELETE api/v1/open/comments/{commentId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param commentId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/open/comments/{commentId}")
    fun deleteComment(@Path("commentId") commentId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * PUT api/v1/open/comments/{commentId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param commentId 
     * @param comment 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CommentResp]>
     */
    @PUT("api/v1/open/comments/{commentId}")
    fun editComment(@Path("commentId") commentId: kotlin.String, @Body comment: Comment, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CommentResp>

    /**
     * GET api/v1/open/selfLinks/explain
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ExplainSelfLinkResp]>
     */
    @GET("api/v1/open/selfLinks/explain")
    fun explainSelfLink(@Query("url") url: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ExplainSelfLinkResp>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Bounty]>
     */
    @GET("api/v1/open/bounty_fetch/{bounty_id}")
    fun fetchBounty(@Path("bounty_id") bountyId: kotlin.String, @Query("fetchFromFb") fetchFromFb: kotlin.Boolean? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("format") format: kotlin.String? = null, @Query("bounty_type") bountyType: kotlin.String? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Bounty>

    /**
     * GET api/v1/open/bounties/{bountyId}/content/access/status
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param includSubbounties  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageAccessBountyContentResult]>
     */
    @GET("api/v1/open/bounties/{bountyId}/content/access/status")
    fun getAccessBountyContentStatus(@Path("bountyId") bountyId: kotlin.String, @Query("includSubbounties") includSubbounties: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageAccessBountyContentResult>


    /**
    * enum for parameter targetApp
    */
    enum class TargetAppGetAds(val value: kotlin.String) {
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
    enum class BannerTypeGetAds(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Advert>]>
     */
    @GET("api/v1/open/adverts/{targetApp}/{bannerType}")
    fun getAds(@Path("targetApp") targetApp: kotlin.String, @Path("bannerType") bannerType: kotlin.String, @Query("locationCompanyId") locationCompanyId: kotlin.String? = null, @Query("locationPin") locationPin: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Advert>>

    /**
     * GET api/v1/open/currencies
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CurrenciesResponse]>
     */
    @GET("api/v1/open/currencies")
    fun getAllowedCurrencies(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CurrenciesResponse>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Attachment]>
     */
    @GET("api/v1/open/attachments/{anchorType}/{anchorId}/{attachmentId}")
    fun getAttachment(@Path("anchorType") anchorType: kotlin.String, @Path("anchorId") anchorId: kotlin.String, @Path("attachmentId") attachmentId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Attachment>


    /**
    * enum for parameter reservationAttribute
    */
    enum class ReservationAttributeGetAvailability(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Availability]>
     */
    @GET("api/v1/open/reservations/availability")
    fun getAvailability(@Query("date") date: kotlin.Long, @Query("partySize") partySize: kotlin.Int, @Query("restaurantId") restaurantId: kotlin.Int? = null, @Query("forwardMinutes") forwardMinutes: kotlin.Int? = 30, @Query("backwardMinutes") backwardMinutes: kotlin.Int? = 30, @Query("includeCcResults") includeCcResults: kotlin.Boolean? = true, @Query("includeExperiences") includeExperiences: kotlin.Boolean? = true, @Query("reservationAttribute") reservationAttribute: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Availability>

    /**
     * GET api/v1/open/bounties/{bounty_id}/budget_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Budget]>
     */
    @GET("api/v1/open/bounties/{bounty_id}/budget_new")
    fun getBountyBudget(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Budget>

    /**
     * GET api/v1/open/bounties/{bounty_id}/budget
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Reward]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/open/bounties/{bounty_id}/budget")
    fun getBountyBudgetOld(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Reward>

    /**
     * GET api/v1/open/bounties/{bounty_id}/budget_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Reward]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/open/bounties/{bounty_id}/budget_old")
    fun getBountyBudgetOld1(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Reward>

    /**
     * GET api/v1/open/bounties/{bounty_id}/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyInfoResult]>
     */
    @GET("api/v1/open/bounties/{bounty_id}/info")
    fun getBountyInfo(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyInfoResult>

    /**
     * GET api/v1/open/selfonboarding/businessTypes
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BusinessTypesResp]>
     */
    @GET("api/v1/open/selfonboarding/businessTypes")
    fun getBusinessTypes(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BusinessTypesResp>

    /**
     * POST api/v1/open/campaigns
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param pageFilter 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @POST("api/v1/open/campaigns")
    fun getCampaigns(@Body pageFilter: PageFilter, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>

    /**
     * GET api/v1/open/bounties/{bounty_id}/activities/chain
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/open/bounties/{bounty_id}/activities/chain")
    fun getCampaignsChain(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>

    /**
     * POST api/v1/open/campaigns/sections
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param pageFilter 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SectionsResult]>
     */
    @POST("api/v1/open/campaigns/sections")
    fun getCampaignsSections(@Body pageFilter: PageFilter, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SectionsResult>


    /**
    * enum for parameter categoryType
    */
    enum class CategoryTypeGetCategoriesWithBountyFilter(val value: kotlin.String) {
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
     * @param marketModeAsEnum  (optional)
     * @param effectiveCategoryCodes  (optional)
     * @param sortTypeAsEnum  (optional)
     * @param clientId  (optional)
     * @param category  (optional)
     * @param tag  (optional)
     * @param q  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Category]>
     */
    @GET("api/v1/open/categories/{category_type}")
    fun getCategoriesWithBountyFilter(@Path("category_type") categoryType: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: DateRange? = null, @Query("expiresRange") expiresRange: DateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("marketModeAsEnum") marketModeAsEnum: kotlin.String? = null, @Query("effectiveCategoryCodes") effectiveCategoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("sortTypeAsEnum") sortTypeAsEnum: kotlin.String? = null, @Query("clientId") clientId: kotlin.String? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("q") q: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Category>

    /**
     * GET api/v1/open/clients/{client_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ClientInfo]>
     */
    @GET("api/v1/open/clients/{client_id}")
    fun getClientInfo(@Path("client_id") clientId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ClientInfo>

    /**
     * GET api/v1/open/comments/{commentId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param commentId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CommentResp]>
     */
    @GET("api/v1/open/comments/{commentId}")
    fun getComment(@Path("commentId") commentId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CommentResp>

    /**
     * GET api/v1/open/company/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param url 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CompanyInfo]>
     */
    @GET("api/v1/open/company/info")
    fun getCompanyInfoByUrl(@Query("url") url: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CompanyInfo>

    /**
     * GET api/v1/open/currency/{code}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PointCurrency]>
     */
    @GET("api/v1/open/currency/{code}")
    fun getCustomCurrency(@Path("code") code: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PointCurrency>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageComment]>
     */
    @GET("api/v1/open/comments/{entityType}/{entityId}")
    fun getEntityComments(@Path("entityId") entityId: kotlin.String, @Path("entityType") entityType: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageComment>

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
     * @param q  (optional)
     * @param clientId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[GetFiltersResult]>
     */
    @GET("api/v1/open/filters/{list_id}")
    fun getFilters(@Path("list_id") listId: kotlin.String, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("q") q: kotlin.String? = null, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<GetFiltersResult>

    /**
     * GET api/v1/open/locations/guess
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[LocationGuessResult]>
     */
    @GET("api/v1/open/locations/guess")
    fun getGuessLocations(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<LocationGuessResult>

    /**
     * GET api/v1/open/invites/{inviteId}/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[InviteInfoResult]>
     */
    @GET("api/v1/open/invites/{inviteId}/info")
    fun getInviteInfo(@Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<InviteInfoResult>

    /**
     * GET api/v1/open/companies/{companyId}/kiosks
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageKioskInfo]>
     */
    @GET("api/v1/open/companies/{companyId}/kiosks")
    fun getKiosks(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageKioskInfo>

    /**
     * GET api/v1/open/locations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deliveryZipcode  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[LocationsResult]>
     */
    @GET("api/v1/open/locations")
    fun getLocations(@Query("deliveryZipcode") deliveryZipcode: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<LocationsResult>

    /**
     * GET api/v1/open/companies/{companyId}/locations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageLocationInfo]>
     */
    @GET("api/v1/open/companies/{companyId}/locations")
    fun getLocationsInfo(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageLocationInfo>


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetLookups(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[LookupResult]>
     */
    @GET("api/v1/open/lookups/{lookup_type}")
    fun getLookups(@Path("lookup_type") lookupType: kotlin.String, @Query("q") q: kotlin.String? = null, @Query("limit") limit: kotlin.String? = null, @Query("query") query: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("searchMode") searchMode: SearchModeGetLookups? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<LookupResult>

    /**
     * GET api/v1/open/orders/{bountyId}/receipt
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param redirectUrl 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/open/orders/{bountyId}/receipt")
    fun getOrderReceipt(@Path("bountyId") bountyId: kotlin.String, @Query("redirectUrl") redirectUrl: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<PickupOrdersResult>]>
     */
    @GET("api/v1/open/pickup_orders/{client}")
    fun getPickupOrdersQty(@Path("client") client: kotlin.String, @Query("pickup_date") pickupDate: kotlin.String, @Query("delivery_method") deliveryMethod: kotlin.String? = "PICKUP", @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<PickupOrdersResult>>

    /**
     * GET api/v1/open/products/{productId}/extras
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param productId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ProductExtras]>
     */
    @GET("api/v1/open/products/{productId}/extras")
    fun getProductExtras(@Path("productId") productId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ProductExtras>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/open/products/recommendations")
    fun getProductRecomendations(@Query("actionVerb") actionVerb: kotlin.String? = null, @Query("actionObjectType") actionObjectType: kotlin.String? = null, @Query("actionObjectId") actionObjectId: kotlin.String? = null, @Query("actionSearchQuery") actionSearchQuery: kotlin.String? = null, @Query("actionRecommendationToken") actionRecommendationToken: kotlin.String? = null, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>

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
     * @param marketModeAsEnum  (optional)
     * @param effectiveCategoryCodes  (optional)
     * @param sortTypeAsEnum  (optional)
     * @param category  (optional)
     * @param tag  (optional)
     * @param q  (optional)
     * @param start  (optional)
     * @param length  (optional)
     * @param ignoreCache  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/open/products")
    fun getProducts(@Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: DateRange? = null, @Query("expiresRange") expiresRange: DateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("marketModeAsEnum") marketModeAsEnum: kotlin.String? = null, @Query("effectiveCategoryCodes") effectiveCategoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("sortTypeAsEnum") sortTypeAsEnum: kotlin.String? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("q") q: kotlin.String? = null, @Query("start") start: kotlin.Int? = null, @Query("length") length: kotlin.Int? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>

    /**
     * GET api/v1/open/report/content/types
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/open/report/content/types")
    fun getReportTypes(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param marketModeAsEnum  (optional)
     * @param effectiveCategoryCodes  (optional)
     * @param sortTypeAsEnum  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/open/reservations")
    fun getReservations(@Query("order") order: kotlin.String? = null, @Query("orderPickupDateFrom") orderPickupDateFrom: kotlin.Long? = null, @Query("orderPickupDateTo") orderPickupDateTo: kotlin.Long? = null, @Query("orderDeliveryMethods") orderDeliveryMethods: kotlin.collections.List<kotlin.String>? = null, @Query("calendarEventDateFrom") calendarEventDateFrom: kotlin.Long? = null, @Query("calendarEventDateTo") calendarEventDateTo: kotlin.Long? = null, @Query("marketMode") marketMode: kotlin.String? = null, @Query("merchantId") merchantId: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("ownerId") ownerId: kotlin.String? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("bountyCreatorId") bountyCreatorId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("minQuantity") minQuantity: kotlin.Double? = null, @Query("userStatuses") userStatuses: kotlin.collections.List<kotlin.String>? = null, @Query("bountyIds") bountyIds: kotlin.collections.List<kotlin.String>? = null, @Query("inviterIds") inviterIds: kotlin.collections.List<kotlin.String>? = null, @Query("productId") productId: kotlin.String? = null, @Query("applicantId") applicantId: kotlin.String? = null, @Query("bountyResponseId") bountyResponseId: kotlin.String? = null, @Query("withPriceTag") withPriceTag: kotlin.Boolean? = null, @Query("minPrice") minPrice: java.math.BigDecimal? = null, @Query("maxPrice") maxPrice: java.math.BigDecimal? = null, @Query("minThc") minThc: kotlin.Int? = null, @Query("maxThc") maxThc: kotlin.Int? = null, @Query("withFreeDelivery") withFreeDelivery: kotlin.Boolean? = null, @Query("responseState") responseState: kotlin.String? = null, @Query("countries") countries: kotlin.collections.List<kotlin.String>? = null, @Query("genders") genders: kotlin.collections.List<kotlin.String>? = null, @Query("age") age: kotlin.Int? = null, @Query("languages") languages: kotlin.collections.List<kotlin.String>? = null, @Query("withCertificates") withCertificates: kotlin.Boolean? = null, @Query("responseStates") responseStates: kotlin.collections.List<kotlin.String>? = null, @Query("categories") categories: kotlin.collections.List<BountyCategory>? = null, @Query("categoryCodes") categoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("tags") tags: kotlin.collections.List<kotlin.String>? = null, @Query("trustedTags") trustedTags: kotlin.collections.List<kotlin.String>? = null, @Query("extras") extras: kotlin.collections.List<FilterVal>? = null, @Query("lookups") lookups: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null, @Query("listId") listId: kotlin.String? = null, @Query("groupId") groupId: kotlin.String? = null, @Query("loadStrategy") loadStrategy: kotlin.String? = null, @Query("loadDirection") loadDirection: kotlin.String? = null, @Query("postedAt") postedAt: kotlin.Long? = null, @Query("sublistIds") sublistIds: kotlin.collections.List<kotlin.String>? = null, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("searchFields") searchFields: kotlin.collections.Set<kotlin.String>? = null, @Query("skipAgeFilter") skipAgeFilter: kotlin.Boolean? = null, @Query("skipCountryFilter") skipCountryFilter: kotlin.Boolean? = null, @Query("shared") shared: kotlin.Boolean? = null, @Query("searchMode") searchMode: kotlin.String? = null, @Query("bountyStates") bountyStates: kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: kotlin.collections.List<kotlin.String>? = null, @Query("email") email: kotlin.collections.List<kotlin.String>? = null, @Query("roles") roles: kotlin.collections.List<kotlin.String>? = null, @Query("includeAllUsers") includeAllUsers: kotlin.Boolean? = null, @Query("profiled") profiled: kotlin.Boolean? = null, @Query("payPeriod") payPeriod: kotlin.String? = null, @Query("includeBlacklisted") includeBlacklisted: kotlin.Boolean? = null, @Query("inviteCodes") inviteCodes: kotlin.collections.List<kotlin.String>? = null, @Query("defaultApp") defaultApp: kotlin.Boolean? = null, @Query("locations") locations: kotlin.collections.List<kotlin.String>? = null, @Query("rewardCurrency") rewardCurrency: kotlin.String? = null, @Query("hasPointsReward") hasPointsReward: kotlin.Boolean? = null, @Query("scheduledRange") scheduledRange: DateRange? = null, @Query("expiresRange") expiresRange: DateRange? = null, @Query("scheme") scheme: kotlin.collections.List<kotlin.String>? = null, @Query("showByLinkVisibility") showByLinkVisibility: kotlin.Boolean? = null, @Query("section") section: kotlin.String? = null, @Query("bountyTypes") bountyTypes: kotlin.collections.List<kotlin.String>? = null, @Query("reservationCreatedFrom") reservationCreatedFrom: kotlin.Long? = null, @Query("reservationCreatedTo") reservationCreatedTo: kotlin.Long? = null, @Query("restaurantId") restaurantId: kotlin.collections.List<kotlin.String>? = null, @Query("reservationStatus") reservationStatus: kotlin.collections.List<kotlin.String>? = null, @Query("creatorIds") creatorIds: kotlin.collections.List<kotlin.String>? = null, @Query("partySizeFrom") partySizeFrom: kotlin.Int? = null, @Query("partySizeTo") partySizeTo: kotlin.Int? = null, @Query("ghostEmail") ghostEmail: kotlin.String? = null, @Query("ghostPhone") ghostPhone: kotlin.String? = null, @Query("supportGroupId") supportGroupId: kotlin.String? = null, @Query("entityOwnerId") entityOwnerId: kotlin.collections.List<kotlin.String>? = null, @Query("publisherText") publisherText: kotlin.String? = null, @Query("publisherName") publisherName: kotlin.String? = null, @Query("publisherId") publisherId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("visibility") visibility: kotlin.String? = null, @Query("voucherStates") voucherStates: kotlin.collections.List<kotlin.String>? = null, @Query("voucherIds") voucherIds: kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("newsPriority") newsPriority: kotlin.String? = null, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Query("marketModeAsEnum") marketModeAsEnum: kotlin.String? = null, @Query("effectiveCategoryCodes") effectiveCategoryCodes: kotlin.collections.List<kotlin.String>? = null, @Query("sortTypeAsEnum") sortTypeAsEnum: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>

    /**
     * GET api/v1/open/restaurants
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[LocationsResult]>
     */
    @GET("api/v1/open/restaurants")
    fun getRestaurants(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<LocationsResult>

    /**
     * GET api/v1/open/settings/shopSettings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShopSettings]>
     */
    @GET("api/v1/open/settings/shopSettings")
    fun getShopSettings1(@Query("companyId") companyId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShopSettings>

    /**
     * GET api/v1/open/states/{client_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param administrative  (optional, default to false)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[StatesResult]>
     */
    @GET("api/v1/open/states/{client_id}")
    fun getStates(@Path("client_id") clientId: kotlin.String, @Query("administrative") administrative: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<StatesResult>

    /**
     * GET api/v1/open/surveys/{bountyId}/answer
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SurveyAnswers]>
     */
    @GET("api/v1/open/surveys/{bountyId}/answer")
    fun getSurveyAnswers(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SurveyAnswers>

    /**
     * GET api/v1/open/surveys/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SurveyBundleResp]>
     */
    @GET("api/v1/open/surveys/{bountyId}")
    fun getSurveyBundle(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SurveyBundleResp>

    /**
     * GET api/v1/open/users/{user_id}/earnings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserEarningsResult]>
     */
    @GET("api/v1/open/users/{user_id}/earnings")
    fun getUserEarnings(@Path("user_id") userId: kotlin.String, @Query("bounty_id") bountyId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserEarningsResult>

    /**
     * GET api/v1/open/{user_id}/orders/{order_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param orderId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Bounty]>
     */
    @GET("api/v1/open/{user_id}/orders/{order_id}")
    fun getUserOrder1(@Path("user_id") userId: kotlin.String, @Path("order_id") orderId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Bounty>

    /**
     * GET api/v1/open/users/{user_id}/profile
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserProfileEx]>
     */
    @GET("api/v1/open/users/{user_id}/profile")
    fun getUserProfile1(@Path("user_id") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserProfileEx>


    /**
    * enum for parameter searchDirection
    */
    enum class SearchDirectionGetUserStream(val value: kotlin.String) {
        @Json(name = "UP") UP("UP"),
        @Json(name = "DOWN") DOWN("DOWN")
    }


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetUserStream(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }


    /**
    * enum for parameter strategy
    */
    enum class StrategyGetUserStream(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageBounty]>
     */
    @GET("api/v1/open/user/stream/{listId}")
    fun getUserStream(@Path("listId") listId: kotlin.String, @Query("user_id") userId: kotlin.String? = null, @Query("group_id") groupId: kotlin.String? = null, @Query("company_id") companyId: kotlin.String? = null, @Query("posted_at") postedAt: kotlin.Long? = null, @Query("search_direction") searchDirection: SearchDirectionGetUserStream? = SearchDirectionGetUserStream.DOWN, @Query("search_mode") searchMode: SearchModeGetUserStream? = null, @Query("strategy") strategy: StrategyGetUserStream? = StrategyGetUserStream.FULL, @Query("order") order: kotlin.String? = null, @Query("displayScreen") displayScreen: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Query("ignoreCache") ignoreCache: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageBounty>

    /**
     * GET api/v1/open/{user_id}/suborders/{parent_order_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param parentOrderId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/open/{user_id}/suborders/{parent_order_id}")
    fun getUserSubOrders(@Path("user_id") userId: kotlin.String, @Path("parent_order_id") parentOrderId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>


    /**
    * enum for parameter policyType
    */
    enum class PolicyTypeGetVendorPolicies(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, Policy>]>
     */
    @GET("api/v1/open/vendor/{userId}/policy")
    fun getVendorPolicies(@Path("userId") userId: kotlin.String, @Query("policyType") policyType: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.Map<kotlin.String, Policy>>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ClientGuessResult]>
     */
    @GET("api/v1/open/clients/guess")
    fun guessClientInfo(@Query("url") url: kotlin.String, @Query("clientId") clientId: kotlin.String? = null, @Query("kiosk") kiosk: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ClientGuessResult>

    /**
     * GET api/v1/open/integrations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AllowedIntegrationsResponse]>
     */
    @GET("api/v1/open/integrations")
    fun integrations(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AllowedIntegrationsResponse>

    /**
     * GET api/v1/open/meta/tablet/entrypoint
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param test  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[KioskEntryPointResult]>
     */
    @GET("api/v1/open/meta/tablet/entrypoint")
    fun kioskEntryPoint(@Query("test") test: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<KioskEntryPointResult>

    /**
     * POST api/v1/open/{entityType}/{entityId}/like
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityType 
     * @param entityId 
     * @param likeRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/open/{entityType}/{entityId}/like")
    fun like(@Path("entityType") entityType: kotlin.String, @Path("entityId") entityId: kotlin.String, @Body likeRequest: LikeRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/open/orders/{orderId}/pay
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderId 
     * @param payOrderReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[OrderResponse]>
     */
    @POST("api/v1/open/orders/{orderId}/pay")
    fun payOrder(@Path("orderId") orderId: kotlin.String, @Body payOrderReq: PayOrderReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<OrderResponse>

    /**
     * POST api/v1/open/bounty/{bountyId}/bid
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param placeBidReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyResponseResponse]>
     */
    @POST("api/v1/open/bounty/{bountyId}/bid")
    fun placeBid(@Path("bountyId") bountyId: kotlin.String, @Body placeBidReq: PlaceBidReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyResponseResponse>

    /**
     * POST api/v1/open/comments/{commentId}/promote
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param commentId 
     * @param comment 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CommentResp]>
     */
    @POST("api/v1/open/comments/{commentId}/promote")
    fun promoteComment(@Path("commentId") commentId: kotlin.String, @Body comment: Comment, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CommentResp>

    /**
     * POST api/v1/open/comments
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param comment 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CommentResp]>
     */
    @POST("api/v1/open/comments")
    fun publishComment(@Body comment: Comment, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CommentResp>

    /**
     * POST api/v1/open/bounty/{bountyId}/response
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param bountyResponse 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyResponseResponse]>
     */
    @POST("api/v1/open/bounty/{bountyId}/response")
    fun publishResponse(@Path("bountyId") bountyId: kotlin.String, @Body bountyResponse: BountyResponse, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyResponseResponse>

    /**
     * POST api/v1/open/surveys/{bountyId}/answer
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param surveyAnswers 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SurveyAnswers]>
     */
    @POST("api/v1/open/surveys/{bountyId}/answer")
    fun publishSurveyAnswers(@Path("bountyId") bountyId: kotlin.String, @Body surveyAnswers: SurveyAnswers, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SurveyAnswers>

    /**
     * POST api/v1/open/bounty/{bountyId}/quick_claim
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param bountyResponseRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyResponseResponse]>
     */
    @POST("api/v1/open/bounty/{bountyId}/quick_claim")
    fun quickClaim(@Path("bountyId") bountyId: kotlin.String, @Body bountyResponseRequest: BountyResponseRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyResponseResponse>

    /**
     * PATCH api/v1/open/orders/{orderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderId 
     * @param orderUpdate 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[OrderResponse]>
     */
    @PATCH("api/v1/open/orders/{orderId}")
    fun updateOrder2(@Path("orderId") orderId: kotlin.String, @Body orderUpdate: OrderUpdate, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<OrderResponse>

    /**
     * POST api/v1/open/orders/{orderId}/payment/result
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderId 
     * @param orderPaymentResult 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/open/orders/{orderId}/payment/result")
    fun updateOrderPayment(@Path("orderId") orderId: kotlin.String, @Body orderPaymentResult: OrderPaymentResult, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

    /**
     * POST api/v1/open/orders/{orderId}/status/{status}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param orderId 
     * @param status 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/open/orders/{orderId}/status/{status}")
    fun updateOrderStatus(@Path("orderId") orderId: kotlin.String, @Path("status") status: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

    /**
     * PUT api/v1/open/bounty/{bountyId}/response/{responseId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param responseId 
     * @param responseChanges 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyResponseResponse]>
     */
    @PUT("api/v1/open/bounty/{bountyId}/response/{responseId}")
    fun updateResponse(@Path("bountyId") bountyId: kotlin.String, @Path("responseId") responseId: kotlin.String, @Body responseChanges: ResponseChanges, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyResponseResponse>

}
