package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelBounty
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBountyChanges
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBountyResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBountyTermsContentAccessRule
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAnswerCallResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataBountyRecipientResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataBountySectionResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataBountyStatisticsResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataBountyStatisticsResultOld
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataColorSchemeResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataFeedbackReportResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelListsListDef
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPlaceCallResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSponsorshipRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSubBountiesResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUpdateBountyStateReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelShoppingCartOrderSummary
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUserInvite
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerBountyControllerActivateMenuRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerBountyControllerPaymentSummary
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerBountyControllerShareLinkResult

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyStatisticsResultOld]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{bounty_id}/statistics")
    fun getApiV1BountiesByBountyIdStatistics(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyStatisticsResultOld>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyStatisticsResult]>
     */
    @GET("api/v1/bounties/{bounty_id}/statistics_new")
    fun getApiV1BountiesByBountyIdStatisticsNew(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyStatisticsResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyStatisticsResultOld]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{bounty_id}/statistics_old")
    fun getApiV1BountiesByBountyIdStatisticsOld(@Path("bounty_id") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyStatisticsResultOld>

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
     * @return [Call]<[CoedgeappservermodelBountyTermsContentAccessRule]>
     */
    @GET("api/v1/bounties/{bountyId}/content/access")
    fun getApiV1BountiesByBountyidContentAccess(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBountyTermsContentAccessRule>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataFeedbackReportResp]>
     */
    @GET("api/v1/bounties/{bountyId}/feedback/report")
    fun getApiV1BountiesByBountyidFeedbackReport(@Path("bountyId") bountyId: kotlin.String, @Query("answeredFrom") answeredFrom: kotlin.Long? = null, @Query("answeredTo") answeredTo: kotlin.Long? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataFeedbackReportResp>

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
     * @return [Call]<[CoedgeappservermodelBountyResponse]>
     */
    @GET("api/v1/bounties/{bountyId}/nextWinner")
    fun getApiV1BountiesByBountyidNextwinner(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBountyResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerBountyControllerPaymentSummary]>
     */
    @GET("api/v1/bounties/{bountyId}/payment-summary")
    fun getApiV1BountiesByBountyidPaymentSummary(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerBountyControllerPaymentSummary>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountyRecipientResp]>
     */
    @GET("api/v1/bounties/{bountyId}/recipient")
    fun getApiV1BountiesByBountyidRecipient(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountyRecipientResp>

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
     * @return [Call]<[CoedgeappserverrestcontrollerBountyControllerShareLinkResult]>
     */
    @GET("api/v1/bounties/{bountyId}/share")
    fun getApiV1BountiesByBountyidShare(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerBountyControllerShareLinkResult>

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
     * @return [Call]<[CoedgeappserverrestcontrollerBountyControllerShareLinkResult]>
     */
    @GET("api/v1/bounties/{bountyId}/shares")
    fun getApiV1BountiesByBountyidShares(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerBountyControllerShareLinkResult>

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
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/bounties/{dealId}/inviteLinks/{inviteId}")
    fun getApiV1BountiesByDealidInvitelinksByInviteid(@Path("dealId") dealId: kotlin.String, @Path("inviteId") inviteId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSubBountiesResp]>
     */
    @GET("api/v1/bounties/{parent_id}/subbounties")
    fun getApiV1BountiesByParentIdSubbounties(@Path("parent_id") parentId: kotlin.String, @Query("inbound") inbound: kotlin.Boolean? = false, @Query("outbound") outbound: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSubBountiesResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataColorSchemeResult]>
     */
    @GET("api/v1/bounties/colorSchemes")
    fun getApiV1BountiesColorschemes(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataColorSchemeResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty]>
     */
    @GET("api/v1/bounties/menus/active")
    fun getApiV1BountiesMenusActive(@Query("merchantId") merchantId: kotlin.String? = null, @Query("clientId") clientId: kotlin.String? = null, @Query("zone") zone: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelListsListDef]>
     */
    @GET("api/v1/bounties/publish/lists")
    fun getApiV1BountiesPublishLists(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelListsListDef>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataBountySectionResult]>
     */
    @GET("api/v1/bounties/sections")
    fun getApiV1BountiesSections(@Query("type") type: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataBountySectionResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataAnswerCallResult]>
     */
    @POST("api/v1/bounties/{bountyId}/calls/answer")
    fun postApiV1BountiesByBountyidCallsAnswer(@Path("bountyId") bountyId: kotlin.String, @Query("roomId") roomId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataAnswerCallResult>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPlaceCallResult]>
     */
    @POST("api/v1/bounties/{bountyId}/calls/place")
    fun postApiV1BountiesByBountyidCallsPlace(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPlaceCallResult>

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
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @POST("api/v1/bounties/{bountyId}/closeAuction")
    fun postApiV1BountiesByBountyidCloseauction(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

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
     * @return [Call]<[CoedgeappservermodelBountyResponse]>
     */
    @POST("api/v1/bounties/{bountyId}/drawLottery")
    fun postApiV1BountiesByBountyidDrawlottery(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBountyResponse>

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
     * @param coedgeappserverrestcontrollerBountyControllerActivateMenuRequest  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @POST("api/v1/bounties/{bountyId}/menu/activate")
    fun postApiV1BountiesByBountyidMenuActivate(@Path("bountyId") bountyId: kotlin.String, @Query("deactivateOthers") deactivateOthers: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body coedgeappserverrestcontrollerBountyControllerActivateMenuRequest: CoedgeappserverrestcontrollerBountyControllerActivateMenuRequest? = null): Call<CoedgeappservermodelBounty>

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
     * @return [Call]<[CoedgeappservermodelBountyResponse]>
     */
    @POST("api/v1/bounties/{bountyId}/nextWinner")
    fun postApiV1BountiesByBountyidNextwinner(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBountyResponse>

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
     * @param coedgeappservermodelEdgeApiDataSponsorshipRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/bounties/{bountyId}/sponsorships/{avatarId}/accept")
    fun postApiV1BountiesByBountyidSponsorshipsByAvataridAccept(@Path("bountyId") bountyId: kotlin.String, @Path("avatarId") avatarId: kotlin.String, @Body coedgeappservermodelEdgeApiDataSponsorshipRequest: CoedgeappservermodelEdgeApiDataSponsorshipRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/bounties/{bountyId}/sponsorships/{avatarId}/reject
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param avatarId 
     * @param coedgeappservermodelEdgeApiDataSponsorshipRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelShoppingCartOrderSummary]>
     */
    @POST("api/v1/bounties/{bountyId}/sponsorships/{avatarId}/reject")
    fun postApiV1BountiesByBountyidSponsorshipsByAvataridReject(@Path("bountyId") bountyId: kotlin.String, @Path("avatarId") avatarId: kotlin.String, @Body coedgeappservermodelEdgeApiDataSponsorshipRequest: CoedgeappservermodelEdgeApiDataSponsorshipRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShoppingCartOrderSummary>

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
     * @param coedgeappservermodelBounty 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @POST("api/v1/bounties/publish")
    fun postApiV1BountiesPublish(@Body coedgeappservermodelBounty: CoedgeappservermodelBounty, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * PUT api/v1/bounties/{bountyId}/content/access
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappservermodelBountyTermsContentAccessRule 
     * @param refreshPin  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBountyTermsContentAccessRule]>
     */
    @PUT("api/v1/bounties/{bountyId}/content/access")
    fun putApiV1BountiesByBountyidContentAccess(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelBountyTermsContentAccessRule: CoedgeappservermodelBountyTermsContentAccessRule, @Query("refreshPin") refreshPin: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBountyTermsContentAccessRule>

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
     * @param coedgeappservermodelBountyChanges 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @PUT("api/v1/bounties/{bountyId}/update")
    fun putApiV1BountiesByBountyidUpdate(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelBountyChanges: CoedgeappservermodelBountyChanges, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * PUT api/v1/bounties/{bountyId}/update/state
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param coedgeappservermodelEdgeApiDataUpdateBountyStateReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/bounties/{bountyId}/update/state")
    fun putApiV1BountiesByBountyidUpdateState(@Path("bountyId") bountyId: kotlin.String, @Body coedgeappservermodelEdgeApiDataUpdateBountyStateReq: CoedgeappservermodelEdgeApiDataUpdateBountyStateReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
