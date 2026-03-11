package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AdminActionResult
import ai.youkno.edgeserversdk.models.ReasonRequest
import ai.youkno.edgeserversdk.models.RepairRequest
import ai.youkno.edgeserversdk.models.SubscriptionAdminView
import ai.youkno.edgeserversdk.models.SubscriptionDriftReportView
import ai.youkno.edgeserversdk.models.SubscriptionEntitlementDiffView
import ai.youkno.edgeserversdk.models.SubscriptionWebhookHistoryView
import ai.youkno.edgeserversdk.models.UserSubscriptionAdminView

interface SubscriptionAdminControllerApi {
    /**
     * GET api/v1/admin/subscriptions/{subscriptionId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionAdminView]>
     */
    @GET("api/v1/admin/subscriptions/{subscriptionId}")
    fun getApiV1AdminSubscriptionsBySubscriptionid(@Path("subscriptionId") subscriptionId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionAdminView>

    /**
     * GET api/v1/admin/subscriptions/{subscriptionId}/entitlements/diff
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionEntitlementDiffView]>
     */
    @GET("api/v1/admin/subscriptions/{subscriptionId}/entitlements/diff")
    fun getApiV1AdminSubscriptionsBySubscriptionidEntitlementsDiff(@Path("subscriptionId") subscriptionId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionEntitlementDiffView>

    /**
     * GET api/v1/admin/subscriptions/{subscriptionId}/health
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionDriftReportView]>
     */
    @GET("api/v1/admin/subscriptions/{subscriptionId}/health")
    fun getApiV1AdminSubscriptionsBySubscriptionidHealth(@Path("subscriptionId") subscriptionId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionDriftReportView>

    /**
     * GET api/v1/admin/subscriptions/{subscriptionId}/webhooks
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param limit  (optional, default to 100)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionWebhookHistoryView]>
     */
    @GET("api/v1/admin/subscriptions/{subscriptionId}/webhooks")
    fun getApiV1AdminSubscriptionsBySubscriptionidWebhooks(@Path("subscriptionId") subscriptionId: java.util.UUID, @Query("limit") limit: kotlin.Int? = 100, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionWebhookHistoryView>

    /**
     * GET api/v1/admin/users/{userId}/subscriptions
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserSubscriptionAdminView]>
     */
    @GET("api/v1/admin/users/{userId}/subscriptions")
    fun getApiV1AdminUsersByUseridSubscriptions(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserSubscriptionAdminView>

    /**
     * POST api/v1/admin/subscriptions/{subscriptionId}/cancel-immediately
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param reasonRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AdminActionResult]>
     */
    @POST("api/v1/admin/subscriptions/{subscriptionId}/cancel-immediately")
    fun postApiV1AdminSubscriptionsBySubscriptionidCancelImmediately(@Path("subscriptionId") subscriptionId: java.util.UUID, @Body reasonRequest: ReasonRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AdminActionResult>

    /**
     * POST api/v1/admin/subscriptions/{subscriptionId}/entitlements/rebuild
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param repairRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AdminActionResult]>
     */
    @POST("api/v1/admin/subscriptions/{subscriptionId}/entitlements/rebuild")
    fun postApiV1AdminSubscriptionsBySubscriptionidEntitlementsRebuild(@Path("subscriptionId") subscriptionId: java.util.UUID, @Body repairRequest: RepairRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AdminActionResult>

    /**
     * POST api/v1/admin/subscriptions/{subscriptionId}/entitlements/sync
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param reasonRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AdminActionResult]>
     */
    @POST("api/v1/admin/subscriptions/{subscriptionId}/entitlements/sync")
    fun postApiV1AdminSubscriptionsBySubscriptionidEntitlementsSync(@Path("subscriptionId") subscriptionId: java.util.UUID, @Body reasonRequest: ReasonRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AdminActionResult>

    /**
     * POST api/v1/admin/subscriptions/{subscriptionId}/reconcile-from-stripe
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param repairRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AdminActionResult]>
     */
    @POST("api/v1/admin/subscriptions/{subscriptionId}/reconcile-from-stripe")
    fun postApiV1AdminSubscriptionsBySubscriptionidReconcileFromStripe(@Path("subscriptionId") subscriptionId: java.util.UUID, @Body repairRequest: RepairRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AdminActionResult>

    /**
     * POST api/v1/admin/subscriptions/{subscriptionId}/refresh-stripe-linkage
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param repairRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AdminActionResult]>
     */
    @POST("api/v1/admin/subscriptions/{subscriptionId}/refresh-stripe-linkage")
    fun postApiV1AdminSubscriptionsBySubscriptionidRefreshStripeLinkage(@Path("subscriptionId") subscriptionId: java.util.UUID, @Body repairRequest: RepairRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AdminActionResult>

    /**
     * POST api/v1/admin/subscriptions/{subscriptionId}/reverse-cancel
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param reasonRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AdminActionResult]>
     */
    @POST("api/v1/admin/subscriptions/{subscriptionId}/reverse-cancel")
    fun postApiV1AdminSubscriptionsBySubscriptionidReverseCancel(@Path("subscriptionId") subscriptionId: java.util.UUID, @Body reasonRequest: ReasonRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AdminActionResult>

    /**
     * POST api/v1/admin/users/{userId}/subscriptions/entitlements/rebuild
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param repairRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AdminActionResult]>
     */
    @POST("api/v1/admin/users/{userId}/subscriptions/entitlements/rebuild")
    fun postApiV1AdminUsersByUseridSubscriptionsEntitlementsRebuild(@Path("userId") userId: kotlin.String, @Body repairRequest: RepairRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AdminActionResult>

    /**
     * POST api/v1/admin/webhooks/stripe/{stripeEventId}/replay
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param stripeEventId 
     * @param reasonRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AdminActionResult]>
     */
    @POST("api/v1/admin/webhooks/stripe/{stripeEventId}/replay")
    fun postApiV1AdminWebhooksStripeByStripeeventidReplay(@Path("stripeEventId") stripeEventId: kotlin.String, @Body reasonRequest: ReasonRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AdminActionResult>

}
