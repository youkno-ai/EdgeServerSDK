package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AnswerCallResult
import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.BountyChanges
import ai.youkno.edgeserversdk.models.BountyRecipientResp
import ai.youkno.edgeserversdk.models.BountyResponse
import ai.youkno.edgeserversdk.models.BountySectionResult
import ai.youkno.edgeserversdk.models.BountyStatisticsResult
import ai.youkno.edgeserversdk.models.BountyStatisticsResultOld
import ai.youkno.edgeserversdk.models.ColorSchemeResult
import ai.youkno.edgeserversdk.models.ContentAccessRule
import ai.youkno.edgeserversdk.models.FeedbackReportResp
import ai.youkno.edgeserversdk.models.OrderSummary
import ai.youkno.edgeserversdk.models.PageListDef
import ai.youkno.edgeserversdk.models.PaymentSummary
import ai.youkno.edgeserversdk.models.PlaceCallResult
import ai.youkno.edgeserversdk.models.ShareLinkResult
import ai.youkno.edgeserversdk.models.SponsorshipRequest
import ai.youkno.edgeserversdk.models.SubBountiesResp
import ai.youkno.edgeserversdk.models.UpdateBountyStateReq
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
     * @return [Call]<[BountyStatisticsResultOld]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{bounty_id}/statistics")
    fun getApiV1BountiesByBountyIdStatistics(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyStatisticsResultOld>

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
     * @return [Call]<[BountyStatisticsResult]>
     */
    @GET("api/v1/bounties/{bounty_id}/statistics_new")
    fun getApiV1BountiesByBountyIdStatisticsNew(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyStatisticsResult>

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
     * @return [Call]<[BountyStatisticsResultOld]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{bounty_id}/statistics_old")
    fun getApiV1BountiesByBountyIdStatisticsOld(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyStatisticsResultOld>

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
     * @return [Call]<[ContentAccessRule]>
     */
    @GET("api/v1/bounties/{bountyId}/content/access")
    fun getApiV1BountiesByBountyidContentAccess(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ContentAccessRule>

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
     * @return [Call]<[FeedbackReportResp]>
     */
    @GET("api/v1/bounties/{bountyId}/feedback/report")
    fun getApiV1BountiesByBountyidFeedbackReport(@Path("bountyId") bountyId: kotlin.String, @Query("answeredFrom") answeredFrom: kotlin.Long? = null, @Query("answeredTo") answeredTo: kotlin.Long? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<FeedbackReportResp>

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
     * @return [Call]<[PaymentSummary]>
     */
    @GET("api/v1/bounties/{bountyId}/payment-summary")
    fun getApiV1BountiesByBountyidPaymentSummary(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PaymentSummary>

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
     * @return [Call]<[BountyRecipientResp]>
     */
    @GET("api/v1/bounties/{bountyId}/recipient")
    fun getApiV1BountiesByBountyidRecipient(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyRecipientResp>

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
     * @return [Call]<[ShareLinkResult]>
     */
    @GET("api/v1/bounties/{bountyId}/share")
    fun getApiV1BountiesByBountyidShare(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShareLinkResult>

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
     * @return [Call]<[ShareLinkResult]>
     */
    @GET("api/v1/bounties/{bountyId}/shares")
    fun getApiV1BountiesByBountyidShares(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShareLinkResult>

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
     * @return [Call]<[SubBountiesResp]>
     */
    @GET("api/v1/bounties/{parent_id}/subbounties")
    fun getApiV1BountiesByParentIdSubbounties(@Path("parent_id") parentId: kotlin.String, @Query("inbound") inbound: kotlin.Boolean? = false, @Query("outbound") outbound: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubBountiesResp>

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
     * @return [Call]<[ColorSchemeResult]>
     */
    @GET("api/v1/bounties/colorSchemes")
    fun getApiV1BountiesColorschemes(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ColorSchemeResult>

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
     * @return [Call]<[PageListDef]>
     */
    @GET("api/v1/bounties/publish/lists")
    fun getApiV1BountiesPublishLists(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageListDef>

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
     * @return [Call]<[BountySectionResult]>
     */
    @GET("api/v1/bounties/sections")
    fun getApiV1BountiesSections(@Query("type") type: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountySectionResult>

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
     * @return [Call]<[AnswerCallResult]>
     */
    @POST("api/v1/bounties/{bountyId}/calls/answer")
    fun postApiV1BountiesByBountyidCallsAnswer(@Path("bountyId") bountyId: kotlin.String, @Query("roomId") roomId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AnswerCallResult>

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
     * @return [Call]<[PlaceCallResult]>
     */
    @POST("api/v1/bounties/{bountyId}/calls/place")
    fun postApiV1BountiesByBountyidCallsPlace(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PlaceCallResult>

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
     * @param sponsorshipRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/bounties/{bountyId}/sponsorships/{avatarId}/accept")
    fun postApiV1BountiesByBountyidSponsorshipsByAvataridAccept(@Path("bountyId") bountyId: kotlin.String, @Path("avatarId") avatarId: kotlin.String, @Body sponsorshipRequest: SponsorshipRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/bounties/{bountyId}/sponsorships/{avatarId}/reject
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param avatarId 
     * @param sponsorshipRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[OrderSummary]>
     */
    @POST("api/v1/bounties/{bountyId}/sponsorships/{avatarId}/reject")
    fun postApiV1BountiesByBountyidSponsorshipsByAvataridReject(@Path("bountyId") bountyId: kotlin.String, @Path("avatarId") avatarId: kotlin.String, @Body sponsorshipRequest: SponsorshipRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<OrderSummary>

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
     * @param contentAccessRule 
     * @param refreshPin  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ContentAccessRule]>
     */
    @PUT("api/v1/bounties/{bountyId}/content/access")
    fun putApiV1BountiesByBountyidContentAccess(@Path("bountyId") bountyId: kotlin.String, @Body contentAccessRule: ContentAccessRule, @Query("refreshPin") refreshPin: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ContentAccessRule>

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
     * @param updateBountyStateReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/bounties/{bountyId}/update/state")
    fun putApiV1BountiesByBountyidUpdateState(@Path("bountyId") bountyId: kotlin.String, @Body updateBountyStateReq: UpdateBountyStateReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
