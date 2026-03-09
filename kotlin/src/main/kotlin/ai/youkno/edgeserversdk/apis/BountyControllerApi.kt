package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.BountyChanges
import ai.youkno.edgeserversdk.models.BountyResponse
import ai.youkno.edgeserversdk.models.BountyTermsContentAccessRule
import ai.youkno.edgeserversdk.models.EdgeApiDataAnswerCallResult
import ai.youkno.edgeserversdk.models.EdgeApiDataBountyRecipientResp
import ai.youkno.edgeserversdk.models.EdgeApiDataBountySectionResult
import ai.youkno.edgeserversdk.models.EdgeApiDataBountyStatisticsResult
import ai.youkno.edgeserversdk.models.EdgeApiDataBountyStatisticsResultOld
import ai.youkno.edgeserversdk.models.EdgeApiDataColorSchemeResult
import ai.youkno.edgeserversdk.models.EdgeApiDataFeedbackReportResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPageBounty
import ai.youkno.edgeserversdk.models.EdgeApiDataPageListsListDef
import ai.youkno.edgeserversdk.models.EdgeApiDataPlaceCallResult
import ai.youkno.edgeserversdk.models.EdgeApiDataSponsorshipRequest
import ai.youkno.edgeserversdk.models.EdgeApiDataSubBountiesResp
import ai.youkno.edgeserversdk.models.EdgeApiDataUpdateBountyStateReq
import ai.youkno.edgeserversdk.models.RestControllerBountyControllerActivateMenuRequest
import ai.youkno.edgeserversdk.models.RestControllerBountyControllerPaymentSummary
import ai.youkno.edgeserversdk.models.RestControllerBountyControllerShareLinkResult
import ai.youkno.edgeserversdk.models.ShoppingCartOrderSummary
import ai.youkno.edgeserversdk.models.UserInvite

interface BountyControllerApi {
    /**
     * DELETE api/v1/bounties/{bountyId}/delete
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
    @DELETE("api/v1/bounties/{bountyId}/delete")
    fun deleteApiV1BountiesByBountyidDelete(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/bounties/{bounty_id}/statistics
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataBountyStatisticsResultOld]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{bounty_id}/statistics")
    fun getApiV1BountiesByBountyIdStatistics(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataBountyStatisticsResultOld>

    /**
     * GET api/v1/bounties/{bounty_id}/statistics_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataBountyStatisticsResult]>
     */
    @GET("api/v1/bounties/{bounty_id}/statistics_new")
    fun getApiV1BountiesByBountyIdStatisticsNew(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataBountyStatisticsResult>

    /**
     * GET api/v1/bounties/{bounty_id}/statistics_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataBountyStatisticsResultOld]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{bounty_id}/statistics_old")
    fun getApiV1BountiesByBountyIdStatisticsOld(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataBountyStatisticsResultOld>

    /**
     * GET api/v1/bounties/{bountyId}/content/access
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BountyTermsContentAccessRule]>
     */
    @GET("api/v1/bounties/{bountyId}/content/access")
    fun getApiV1BountiesByBountyidContentAccess(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyTermsContentAccessRule>

    /**
     * GET api/v1/bounties/{bountyId}/feedback/report
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param answeredFrom  (optional)
     * @param answeredTo  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataFeedbackReportResp]>
     */
    @GET("api/v1/bounties/{bountyId}/feedback/report")
    fun getApiV1BountiesByBountyidFeedbackReport(@Path("bountyId") bountyId: kotlin.String, @Query("answeredFrom") answeredFrom: kotlin.Long? = null, @Query("answeredTo") answeredTo: kotlin.Long? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataFeedbackReportResp>

    /**
     * GET api/v1/bounties/{bountyId}/nextWinner
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BountyResponse]>
     */
    @GET("api/v1/bounties/{bountyId}/nextWinner")
    fun getApiV1BountiesByBountyidNextwinner(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyResponse>

    /**
     * GET api/v1/bounties/{bountyId}/payment-summary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerBountyControllerPaymentSummary]>
     */
    @GET("api/v1/bounties/{bountyId}/payment-summary")
    fun getApiV1BountiesByBountyidPaymentSummary(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerBountyControllerPaymentSummary>

    /**
     * GET api/v1/bounties/{bountyId}/recipient
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataBountyRecipientResp]>
     */
    @GET("api/v1/bounties/{bountyId}/recipient")
    fun getApiV1BountiesByBountyidRecipient(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataBountyRecipientResp>

    /**
     * GET api/v1/bounties/{bountyId}/share
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerBountyControllerShareLinkResult]>
     */
    @GET("api/v1/bounties/{bountyId}/share")
    fun getApiV1BountiesByBountyidShare(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerBountyControllerShareLinkResult>

    /**
     * GET api/v1/bounties/{bountyId}/shares
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerBountyControllerShareLinkResult]>
     */
    @GET("api/v1/bounties/{bountyId}/shares")
    fun getApiV1BountiesByBountyidShares(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerBountyControllerShareLinkResult>

    /**
     * GET api/v1/bounties/{dealId}/inviteLinks/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param dealId 
     * @param inviteId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserInvite]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{dealId}/inviteLinks/{inviteId}")
    fun getApiV1BountiesByDealidInvitelinksByInviteid(@Path("dealId") dealId: kotlin.String, @Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserInvite>

    /**
     * GET api/v1/bounties/{parent_id}/subbounties
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param parentId 
     * @param inbound  (optional, default to false)
     * @param outbound  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataSubBountiesResp]>
     */
    @GET("api/v1/bounties/{parent_id}/subbounties")
    fun getApiV1BountiesByParentIdSubbounties(@Path("parent_id") parentId: kotlin.String, @Query("inbound") inbound: kotlin.Boolean? = false, @Query("outbound") outbound: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataSubBountiesResp>

    /**
     * GET api/v1/bounties/colorSchemes
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataColorSchemeResult]>
     */
    @GET("api/v1/bounties/colorSchemes")
    fun getApiV1BountiesColorschemes(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataColorSchemeResult>

    /**
     * GET api/v1/bounties/menus/active
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param merchantId  (optional)
     * @param clientId  (optional)
     * @param zone  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPageBounty]>
     */
    @GET("api/v1/bounties/menus/active")
    fun getApiV1BountiesMenusActive(@Query("merchantId") merchantId: kotlin.String? = null, @Query("clientId") clientId: kotlin.String? = null, @Query("zone") zone: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageBounty>

    /**
     * GET api/v1/bounties/publish/lists
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPageListsListDef]>
     */
    @GET("api/v1/bounties/publish/lists")
    fun getApiV1BountiesPublishLists(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageListsListDef>

    /**
     * GET api/v1/bounties/sections
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param type  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataBountySectionResult]>
     */
    @GET("api/v1/bounties/sections")
    fun getApiV1BountiesSections(@Query("type") type: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataBountySectionResult>

    /**
     * POST api/v1/bounties/{bountyId}/calls/answer
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param roomId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataAnswerCallResult]>
     */
    @POST("api/v1/bounties/{bountyId}/calls/answer")
    fun postApiV1BountiesByBountyidCallsAnswer(@Path("bountyId") bountyId: kotlin.String, @Query("roomId") roomId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataAnswerCallResult>

    /**
     * POST api/v1/bounties/{bountyId}/calls/place
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPlaceCallResult]>
     */
    @POST("api/v1/bounties/{bountyId}/calls/place")
    fun postApiV1BountiesByBountyidCallsPlace(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPlaceCallResult>

    /**
     * POST api/v1/bounties/{bountyId}/closeAuction
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @POST("api/v1/bounties/{bountyId}/closeAuction")
    fun postApiV1BountiesByBountyidCloseauction(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * POST api/v1/bounties/{bountyId}/drawLottery
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BountyResponse]>
     */
    @POST("api/v1/bounties/{bountyId}/drawLottery")
    fun postApiV1BountiesByBountyidDrawlottery(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyResponse>

    /**
     * POST api/v1/bounties/{bountyId}/menu/activate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param deactivateOthers  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @param restControllerBountyControllerActivateMenuRequest  (optional)
     * @return [Call]<[Bounty]>
     */
    @POST("api/v1/bounties/{bountyId}/menu/activate")
    fun postApiV1BountiesByBountyidMenuActivate(@Path("bountyId") bountyId: kotlin.String, @Query("deactivateOthers") deactivateOthers: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body restControllerBountyControllerActivateMenuRequest: RestControllerBountyControllerActivateMenuRequest? = null): Call<Bounty>

    /**
     * POST api/v1/bounties/{bountyId}/nextWinner
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BountyResponse]>
     */
    @POST("api/v1/bounties/{bountyId}/nextWinner")
    fun postApiV1BountiesByBountyidNextwinner(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyResponse>

    /**
     * POST api/v1/bounties/{bountyId}/notifyOnStart
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
    @POST("api/v1/bounties/{bountyId}/notifyOnStart")
    fun postApiV1BountiesByBountyidNotifyonstart(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/bounties/{bountyId}/participate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param awaitDistribution  (optional, default to true)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/bounties/{bountyId}/participate")
    fun postApiV1BountiesByBountyidParticipate(@Path("bountyId") bountyId: kotlin.String, @Query("awaitDistribution") awaitDistribution: kotlin.Boolean? = true, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/bounties/{bountyId}/sponsorships/{avatarId}/accept
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param avatarId 
     * @param edgeApiDataSponsorshipRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/bounties/{bountyId}/sponsorships/{avatarId}/accept")
    fun postApiV1BountiesByBountyidSponsorshipsByAvataridAccept(@Path("bountyId") bountyId: kotlin.String, @Path("avatarId") avatarId: kotlin.String, @Body edgeApiDataSponsorshipRequest: EdgeApiDataSponsorshipRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/bounties/{bountyId}/sponsorships/{avatarId}/reject
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param avatarId 
     * @param edgeApiDataSponsorshipRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ShoppingCartOrderSummary]>
     */
    @POST("api/v1/bounties/{bountyId}/sponsorships/{avatarId}/reject")
    fun postApiV1BountiesByBountyidSponsorshipsByAvataridReject(@Path("bountyId") bountyId: kotlin.String, @Path("avatarId") avatarId: kotlin.String, @Body edgeApiDataSponsorshipRequest: EdgeApiDataSponsorshipRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShoppingCartOrderSummary>

    /**
     * POST api/v1/bounties/{bountyId}/unparticipate
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
    @POST("api/v1/bounties/{bountyId}/unparticipate")
    fun postApiV1BountiesByBountyidUnparticipate(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/bounties/publish
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bounty 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @POST("api/v1/bounties/publish")
    fun postApiV1BountiesPublish(@Body bounty: Bounty, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * PUT api/v1/bounties/{bountyId}/content/access
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param bountyTermsContentAccessRule 
     * @param refreshPin  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BountyTermsContentAccessRule]>
     */
    @PUT("api/v1/bounties/{bountyId}/content/access")
    fun putApiV1BountiesByBountyidContentAccess(@Path("bountyId") bountyId: kotlin.String, @Body bountyTermsContentAccessRule: BountyTermsContentAccessRule, @Query("refreshPin") refreshPin: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyTermsContentAccessRule>

    /**
     * PUT api/v1/bounties/{bountyId}/flags
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param featured  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/bounties/{bountyId}/flags")
    fun putApiV1BountiesByBountyidFlags(@Path("bountyId") bountyId: kotlin.String, @Query("featured") featured: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/bounties/{bountyId}/update
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param bountyChanges 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @PUT("api/v1/bounties/{bountyId}/update")
    fun putApiV1BountiesByBountyidUpdate(@Path("bountyId") bountyId: kotlin.String, @Body bountyChanges: BountyChanges, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * PUT api/v1/bounties/{bountyId}/update/state
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param edgeApiDataUpdateBountyStateReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/bounties/{bountyId}/update/state")
    fun putApiV1BountiesByBountyidUpdateState(@Path("bountyId") bountyId: kotlin.String, @Body edgeApiDataUpdateBountyStateReq: EdgeApiDataUpdateBountyStateReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
