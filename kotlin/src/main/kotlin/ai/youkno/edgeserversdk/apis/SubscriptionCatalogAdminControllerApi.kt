package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CreateFamilyRequest
import ai.youkno.edgeserversdk.models.CreateTierRequest
import ai.youkno.edgeserversdk.models.SetActiveRequest
import ai.youkno.edgeserversdk.models.SubscriptionCatalogAdminView
import ai.youkno.edgeserversdk.models.SubscriptionCatalogSummaryView
import ai.youkno.edgeserversdk.models.SubscriptionCatalogValidationView
import ai.youkno.edgeserversdk.models.SubscriptionTierAdminView
import ai.youkno.edgeserversdk.models.UpdateFamilyRequest
import ai.youkno.edgeserversdk.models.UpdateTierRequest

interface SubscriptionCatalogAdminControllerApi {
    /**
     * GET api/v1/admin/subscription-catalogs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<SubscriptionCatalogSummaryView>]>
     */
    @GET("api/v1/admin/subscription-catalogs")
    fun getApiV1AdminSubscriptionCatalogs(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<SubscriptionCatalogSummaryView>>

    /**
     * GET api/v1/admin/subscription-catalogs/{subscriptionBountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogAdminView]>
     */
    @GET("api/v1/admin/subscription-catalogs/{subscriptionBountyId}")
    fun getApiV1AdminSubscriptionCatalogsBySubscriptionbountyid(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogAdminView>

    /**
     * GET api/v1/admin/subscription-catalogs/{subscriptionBountyId}/validate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogValidationView]>
     */
    @GET("api/v1/admin/subscription-catalogs/{subscriptionBountyId}/validate")
    fun getApiV1AdminSubscriptionCatalogsBySubscriptionbountyidValidate(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogValidationView>

    /**
     * GET api/v1/admin/subscription-catalogs/tiers/{tierBountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param tierBountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionTierAdminView]>
     */
    @GET("api/v1/admin/subscription-catalogs/tiers/{tierBountyId}")
    fun getApiV1AdminSubscriptionCatalogsTiersByTierbountyid(@Path("tierBountyId") tierBountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionTierAdminView>

    /**
     * GET api/v1/admin/subscription-catalogs/validate-all
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<SubscriptionCatalogValidationView>]>
     */
    @GET("api/v1/admin/subscription-catalogs/validate-all")
    fun getApiV1AdminSubscriptionCatalogsValidateAll(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<SubscriptionCatalogValidationView>>

    /**
     * POST api/v1/admin/subscription-catalogs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createFamilyRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogAdminView]>
     */
    @POST("api/v1/admin/subscription-catalogs")
    fun postApiV1AdminSubscriptionCatalogs(@Body createFamilyRequest: CreateFamilyRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogAdminView>

    /**
     * POST api/v1/admin/subscription-catalogs/{subscriptionBountyId}/set-active
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param setActiveRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogAdminView]>
     */
    @POST("api/v1/admin/subscription-catalogs/{subscriptionBountyId}/set-active")
    fun postApiV1AdminSubscriptionCatalogsBySubscriptionbountyidSetActive(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Body setActiveRequest: SetActiveRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogAdminView>

    /**
     * POST api/v1/admin/subscription-catalogs/{subscriptionBountyId}/tiers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param createTierRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionTierAdminView]>
     */
    @POST("api/v1/admin/subscription-catalogs/{subscriptionBountyId}/tiers")
    fun postApiV1AdminSubscriptionCatalogsBySubscriptionbountyidTiers(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Body createTierRequest: CreateTierRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionTierAdminView>

    /**
     * POST api/v1/admin/subscription-catalogs/tiers/{tierBountyId}/set-active
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param tierBountyId 
     * @param setActiveRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionTierAdminView]>
     */
    @POST("api/v1/admin/subscription-catalogs/tiers/{tierBountyId}/set-active")
    fun postApiV1AdminSubscriptionCatalogsTiersByTierbountyidSetActive(@Path("tierBountyId") tierBountyId: kotlin.String, @Body setActiveRequest: SetActiveRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionTierAdminView>

    /**
     * PUT api/v1/admin/subscription-catalogs/{subscriptionBountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param updateFamilyRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogAdminView]>
     */
    @PUT("api/v1/admin/subscription-catalogs/{subscriptionBountyId}")
    fun putApiV1AdminSubscriptionCatalogsBySubscriptionbountyid(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Body updateFamilyRequest: UpdateFamilyRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogAdminView>

    /**
     * PUT api/v1/admin/subscription-catalogs/tiers/{tierBountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param tierBountyId 
     * @param updateTierRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionTierAdminView]>
     */
    @PUT("api/v1/admin/subscription-catalogs/tiers/{tierBountyId}")
    fun putApiV1AdminSubscriptionCatalogsTiersByTierbountyid(@Path("tierBountyId") tierBountyId: kotlin.String, @Body updateTierRequest: UpdateTierRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionTierAdminView>

}
