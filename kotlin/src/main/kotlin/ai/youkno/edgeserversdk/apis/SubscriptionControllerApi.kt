package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.ChangeSubscriptionTierResult
import ai.youkno.edgeserversdk.models.RestControllerSubscriptionControllerAdminCancelSubscriptionRequest
import ai.youkno.edgeserversdk.models.RestControllerSubscriptionControllerChangeSubscriptionTierRequest
import ai.youkno.edgeserversdk.models.RestControllerSubscriptionControllerStartSubscriptionCheckoutRequest
import ai.youkno.edgeserversdk.models.ServiceSubscriptionsSubscriptionEntitlementSyncServiceSyncResult
import ai.youkno.edgeserversdk.models.StartSubscriptionCheckoutResult
import ai.youkno.edgeserversdk.models.SubscriptionCatalogPageView
import ai.youkno.edgeserversdk.models.SubscriptionCatalogView
import ai.youkno.edgeserversdk.models.SubscriptionMutationResult
import ai.youkno.edgeserversdk.models.UserSubscriptionView

interface SubscriptionControllerApi {
    /**
     * GET api/v1/subscriptions/catalog
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<SubscriptionCatalogView>]>
     */
    @GET("api/v1/subscriptions/catalog")
    fun getApiV1SubscriptionsCatalog(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<SubscriptionCatalogView>>

    /**
     * GET api/v1/subscriptions/catalog/{subscriptionBountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogView]>
     */
    @GET("api/v1/subscriptions/catalog/{subscriptionBountyId}")
    fun getApiV1SubscriptionsCatalogBySubscriptionbountyid(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogView>

    /**
     * GET api/v1/subscriptions/catalog/code/{code}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogView]>
     */
    @GET("api/v1/subscriptions/catalog/code/{code}")
    fun getApiV1SubscriptionsCatalogCodeByCode(@Path("code") code: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogView>

    /**
     * GET api/v1/subscriptions/me
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<UserSubscriptionView>]>
     */
    @GET("api/v1/subscriptions/me")
    fun getApiV1SubscriptionsMe(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<UserSubscriptionView>>

    /**
     * GET api/v1/subscriptions/me/{subscriptionBountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserSubscriptionView]>
     */
    @GET("api/v1/subscriptions/me/{subscriptionBountyId}")
    fun getApiV1SubscriptionsMeBySubscriptionbountyid(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserSubscriptionView>

    /**
     * GET api/v1/subscriptions/me/catalog/{subscriptionBountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogPageView]>
     */
    @GET("api/v1/subscriptions/me/catalog/{subscriptionBountyId}")
    fun getApiV1SubscriptionsMeCatalogBySubscriptionbountyid(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogPageView>

    /**
     * POST api/v1/subscriptions/admin/{subscriptionId}/cancel-immediately
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @param restControllerSubscriptionControllerAdminCancelSubscriptionRequest  (optional)
     * @return [Call]<[SubscriptionMutationResult]>
     */
    @POST("api/v1/subscriptions/admin/{subscriptionId}/cancel-immediately")
    fun postApiV1SubscriptionsAdminBySubscriptionidCancelImmediately(@Path("subscriptionId") subscriptionId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body restControllerSubscriptionControllerAdminCancelSubscriptionRequest: RestControllerSubscriptionControllerAdminCancelSubscriptionRequest? = null): Call<SubscriptionMutationResult>

    /**
     * POST api/v1/subscriptions/admin/{subscriptionId}/rebuild-entitlements
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ServiceSubscriptionsSubscriptionEntitlementSyncServiceSyncResult]>
     */
    @POST("api/v1/subscriptions/admin/{subscriptionId}/rebuild-entitlements")
    fun postApiV1SubscriptionsAdminBySubscriptionidRebuildEntitlements(@Path("subscriptionId") subscriptionId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ServiceSubscriptionsSubscriptionEntitlementSyncServiceSyncResult>

    /**
     * POST api/v1/subscriptions/admin/users/{userId}/rebuild-entitlements
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<ServiceSubscriptionsSubscriptionEntitlementSyncServiceSyncResult>]>
     */
    @POST("api/v1/subscriptions/admin/users/{userId}/rebuild-entitlements")
    fun postApiV1SubscriptionsAdminUsersByUseridRebuildEntitlements(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<ServiceSubscriptionsSubscriptionEntitlementSyncServiceSyncResult>>

    /**
     * POST api/v1/subscriptions/me/{subscriptionId}/cancel-at-period-end
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionMutationResult]>
     */
    @POST("api/v1/subscriptions/me/{subscriptionId}/cancel-at-period-end")
    fun postApiV1SubscriptionsMeBySubscriptionidCancelAtPeriodEnd(@Path("subscriptionId") subscriptionId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionMutationResult>

    /**
     * POST api/v1/subscriptions/me/{subscriptionId}/change-tier
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param restControllerSubscriptionControllerChangeSubscriptionTierRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ChangeSubscriptionTierResult]>
     */
    @POST("api/v1/subscriptions/me/{subscriptionId}/change-tier")
    fun postApiV1SubscriptionsMeBySubscriptionidChangeTier(@Path("subscriptionId") subscriptionId: java.util.UUID, @Body restControllerSubscriptionControllerChangeSubscriptionTierRequest: RestControllerSubscriptionControllerChangeSubscriptionTierRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ChangeSubscriptionTierResult>

    /**
     * POST api/v1/subscriptions/me/{subscriptionId}/reverse-cancel
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionMutationResult]>
     */
    @POST("api/v1/subscriptions/me/{subscriptionId}/reverse-cancel")
    fun postApiV1SubscriptionsMeBySubscriptionidReverseCancel(@Path("subscriptionId") subscriptionId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionMutationResult>

    /**
     * POST api/v1/subscriptions/me/checkout
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerSubscriptionControllerStartSubscriptionCheckoutRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartSubscriptionCheckoutResult]>
     */
    @POST("api/v1/subscriptions/me/checkout")
    fun postApiV1SubscriptionsMeCheckout(@Body restControllerSubscriptionControllerStartSubscriptionCheckoutRequest: RestControllerSubscriptionControllerStartSubscriptionCheckoutRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartSubscriptionCheckoutResult>

}
