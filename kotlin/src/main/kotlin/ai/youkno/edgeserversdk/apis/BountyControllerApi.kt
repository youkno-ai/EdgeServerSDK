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
     * POST api/v1/bounties/{bountyId}/sponsorships/{avatarId}/accept
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param avatarId 
     * @param sponsorshipRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/bounties/{bountyId}/sponsorships/{avatarId}/accept")
    fun acceptSponsorship(@Path("bountyId") bountyId: kotlin.String, @Path("avatarId") avatarId: kotlin.String, @Body sponsorshipRequest: SponsorshipRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/bounties/{bountyId}/calls/answer
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param roomId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AnswerCallResult]>
     */
    @POST("api/v1/bounties/{bountyId}/calls/answer")
    fun callAnswer(@Path("bountyId") bountyId: kotlin.String, @Query("roomId") roomId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AnswerCallResult>

    /**
     * POST api/v1/bounties/{bountyId}/calls/place
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PlaceCallResult]>
     */
    @POST("api/v1/bounties/{bountyId}/calls/place")
    fun callPlace(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PlaceCallResult>

    /**
     * POST api/v1/bounties/{bountyId}/nextWinner
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyResponse]>
     */
    @POST("api/v1/bounties/{bountyId}/nextWinner")
    fun changeAuctionWinner(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyResponse>

    /**
     * POST api/v1/bounties/{bountyId}/closeAuction
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Bounty]>
     */
    @POST("api/v1/bounties/{bountyId}/closeAuction")
    fun closeAuction(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Bounty>

    /**
     * DELETE api/v1/bounties/{bountyId}/delete
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
    @DELETE("api/v1/bounties/{bountyId}/delete")
    fun deleteBounty(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/bounties/{bountyId}/nextWinner
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyResponse]>
     */
    @GET("api/v1/bounties/{bountyId}/nextWinner")
    fun getAuctionNextWinner(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyResponse>

    /**
     * GET api/v1/bounties/{bountyId}/content/access
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ContentAccessRule]>
     */
    @GET("api/v1/bounties/{bountyId}/content/access")
    fun getBountyContentAccessRule(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ContentAccessRule>

    /**
     * GET api/v1/bounties/{bountyId}/recipient
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyRecipientResp]>
     */
    @GET("api/v1/bounties/{bountyId}/recipient")
    fun getBountyRecipientInfo(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyRecipientResp>

    /**
     * GET api/v1/bounties/{bounty_id}/statistics_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyStatisticsResult]>
     */
    @GET("api/v1/bounties/{bounty_id}/statistics_new")
    fun getCampaignStats(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyStatisticsResult>

    /**
     * GET api/v1/bounties/{bounty_id}/statistics
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyStatisticsResultOld]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{bounty_id}/statistics")
    fun getCampaignStatsOld(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyStatisticsResultOld>

    /**
     * GET api/v1/bounties/{bounty_id}/statistics_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountyStatisticsResultOld]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{bounty_id}/statistics_old")
    fun getCampaignStatsOld1(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountyStatisticsResultOld>

    /**
     * GET api/v1/bounties/sections
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param type  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[BountySectionResult]>
     */
    @GET("api/v1/bounties/sections")
    fun getDefaultBountySections(@Query("type") type: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<BountySectionResult>

    /**
     * GET api/v1/bounties/colorSchemes
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ColorSchemeResult]>
     */
    @GET("api/v1/bounties/colorSchemes")
    fun getDefaultColorSchemes(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ColorSchemeResult>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[FeedbackReportResp]>
     */
    @GET("api/v1/bounties/{bountyId}/feedback/report")
    fun getFeedbackReport(@Path("bountyId") bountyId: kotlin.String, @Query("answeredFrom") answeredFrom: kotlin.Long? = null, @Query("answeredTo") answeredTo: kotlin.Long? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<FeedbackReportResp>

    /**
     * GET api/v1/bounties/{dealId}/inviteLinks/{inviteId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param dealId 
     * @param inviteId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{dealId}/inviteLinks/{inviteId}")
    fun getInviteLink3(@Path("dealId") dealId: kotlin.String, @Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>

    /**
     * GET api/v1/bounties/{bountyId}/payment-summary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PaymentSummary]>
     */
    @GET("api/v1/bounties/{bountyId}/payment-summary")
    fun getPaymentSummary(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PaymentSummary>

    /**
     * GET api/v1/bounties/publish/lists
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageListDef]>
     */
    @GET("api/v1/bounties/publish/lists")
    fun getPostableLists(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageListDef>

    /**
     * GET api/v1/bounties/{bountyId}/shares
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShareLinkResult]>
     */
    @GET("api/v1/bounties/{bountyId}/shares")
    fun getShareLink(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShareLinkResult>

    /**
     * GET api/v1/bounties/{bountyId}/share
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShareLinkResult]>
     */
    @GET("api/v1/bounties/{bountyId}/share")
    fun getShareLink1(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShareLinkResult>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SubBountiesResp]>
     */
    @GET("api/v1/bounties/{parent_id}/subbounties")
    fun getSubBounties(@Path("parent_id") parentId: kotlin.String, @Query("inbound") inbound: kotlin.Boolean? = false, @Query("outbound") outbound: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SubBountiesResp>

    /**
     * POST api/v1/bounties/{bountyId}/notifyOnStart
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
    @POST("api/v1/bounties/{bountyId}/notifyOnStart")
    fun notifyOnStart(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/bounties/{bountyId}/participate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param awaitDistribution  (optional, default to true)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/bounties/{bountyId}/participate")
    fun participateBounty(@Path("bountyId") bountyId: kotlin.String, @Query("awaitDistribution") awaitDistribution: kotlin.Boolean? = true, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/bounties/publish
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bounty 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Bounty]>
     */
    @POST("api/v1/bounties/publish")
    fun publishBounty(@Body bounty: Bounty, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Bounty>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[OrderSummary]>
     */
    @POST("api/v1/bounties/{bountyId}/sponsorships/{avatarId}/reject")
    fun rejectSponsorship(@Path("bountyId") bountyId: kotlin.String, @Path("avatarId") avatarId: kotlin.String, @Body sponsorshipRequest: SponsorshipRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<OrderSummary>

    /**
     * POST api/v1/bounties/{bountyId}/unparticipate
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
    @POST("api/v1/bounties/{bountyId}/unparticipate")
    fun unparticipateBounty(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ContentAccessRule]>
     */
    @PUT("api/v1/bounties/{bountyId}/content/access")
    fun updateAccessBountyContent(@Path("bountyId") bountyId: kotlin.String, @Body contentAccessRule: ContentAccessRule, @Query("refreshPin") refreshPin: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ContentAccessRule>

    /**
     * PUT api/v1/bounties/{bountyId}/update
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param bountyChanges 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Bounty]>
     */
    @PUT("api/v1/bounties/{bountyId}/update")
    fun updateBounty(@Path("bountyId") bountyId: kotlin.String, @Body bountyChanges: BountyChanges, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Bounty>

    /**
     * PUT api/v1/bounties/{bountyId}/update/state
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param updateBountyStateReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/bounties/{bountyId}/update/state")
    fun updateBountyState(@Path("bountyId") bountyId: kotlin.String, @Body updateBountyStateReq: UpdateBountyStateReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * PUT api/v1/bounties/{bountyId}/flags
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param featured  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/bounties/{bountyId}/flags")
    fun updateFeatured(@Path("bountyId") bountyId: kotlin.String, @Query("featured") featured: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

}
