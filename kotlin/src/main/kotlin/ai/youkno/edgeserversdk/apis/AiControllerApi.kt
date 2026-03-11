package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AiGeneratedEntitiesStatus
import ai.youkno.edgeserversdk.models.BadgeGeneratorInput
import ai.youkno.edgeserversdk.models.BadgeGeneratorStatus
import ai.youkno.edgeserversdk.models.BountyGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.BountyGenerationStatus
import ai.youkno.edgeserversdk.models.CategoryGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CategoryGeneratorStatus
import ai.youkno.edgeserversdk.models.CategoryTreeGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CategoryTreeGeneratorStatus
import ai.youkno.edgeserversdk.models.ChatSimulationCleanupResponse
import ai.youkno.edgeserversdk.models.ChatSimulationStatus
import ai.youkno.edgeserversdk.models.CompanyBatchGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CompanyBatchGenerationStatus
import ai.youkno.edgeserversdk.models.DemoFeedSeedingCleanupResponse
import ai.youkno.edgeserversdk.models.DemoFeedSeedingStatus
import ai.youkno.edgeserversdk.models.MenuGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.MenuGeneratorStatus
import ai.youkno.edgeserversdk.models.ProductGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.ProductGeneratorStatus
import ai.youkno.edgeserversdk.models.StartBadgeGenerationResponse
import ai.youkno.edgeserversdk.models.StartBountyGenerationRequest
import ai.youkno.edgeserversdk.models.StartBountyGenerationResponse
import ai.youkno.edgeserversdk.models.StartCategoryGenerationRequest
import ai.youkno.edgeserversdk.models.StartCategoryGenerationResponse
import ai.youkno.edgeserversdk.models.StartCategoryTreeGenerationRequest
import ai.youkno.edgeserversdk.models.StartCategoryTreeGenerationResponse
import ai.youkno.edgeserversdk.models.StartChatSimulationRequest
import ai.youkno.edgeserversdk.models.StartChatSimulationResponse
import ai.youkno.edgeserversdk.models.StartCompanyBatchGenerationRequest
import ai.youkno.edgeserversdk.models.StartCompanyBatchGenerationResponse
import ai.youkno.edgeserversdk.models.StartDemoFeedSeedingRequest
import ai.youkno.edgeserversdk.models.StartDemoFeedSeedingResponse
import ai.youkno.edgeserversdk.models.StartFullCatalogGenerationRequest
import ai.youkno.edgeserversdk.models.StartFullCatalogGenerationResponse
import ai.youkno.edgeserversdk.models.StartMenuGenerationRequest
import ai.youkno.edgeserversdk.models.StartMenuGenerationResponse
import ai.youkno.edgeserversdk.models.StartProductGenerationRequest
import ai.youkno.edgeserversdk.models.StartProductGenerationResponse
import ai.youkno.edgeserversdk.models.StartStickerGenerationResponse
import ai.youkno.edgeserversdk.models.StartUserAvatarGenerationRequest
import ai.youkno.edgeserversdk.models.StartUserAvatarGenerationResponse
import ai.youkno.edgeserversdk.models.StartUserBatchGenerationRequest
import ai.youkno.edgeserversdk.models.StartUserBatchGenerationResponse
import ai.youkno.edgeserversdk.models.StartUserCoverGenerationRequest
import ai.youkno.edgeserversdk.models.StartUserCoverGenerationResponse
import ai.youkno.edgeserversdk.models.StickerCollectionGeneratorInput
import ai.youkno.edgeserversdk.models.StickerCollectionGeneratorStatus
import ai.youkno.edgeserversdk.models.StickerGeneratorMeta
import ai.youkno.edgeserversdk.models.UserAvatarGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.UserAvatarGenerationStatus
import ai.youkno.edgeserversdk.models.UserBatchGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.UserBatchGenerationStatus
import ai.youkno.edgeserversdk.models.UserCoverGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.UserCoverGenerationStatus

interface AiControllerApi {
    /**
     * GET api/v1/ai/generate/badge/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BadgeGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/badge/{companyId}")
    fun getApiV1AiGenerateBadgeByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BadgeGeneratorStatus>

    /**
     * GET api/v1/ai/generate/bounty/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BountyGenerationStatus]>
     */
    @GET("api/v1/ai/generate/bounty/{jobId}")
    fun getApiV1AiGenerateBountyByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyGenerationStatus>

    /**
     * GET api/v1/ai/generate/categories/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CategoryGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/categories/{companyId}")
    fun getApiV1AiGenerateCategoriesByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CategoryGeneratorStatus>

    /**
     * GET api/v1/ai/generate/category-tree/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CategoryTreeGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/category-tree/{companyId}")
    fun getApiV1AiGenerateCategoryTreeByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CategoryTreeGeneratorStatus>

    /**
     * GET api/v1/ai/generate/chat/simulate/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ChatSimulationStatus]>
     */
    @GET("api/v1/ai/generate/chat/simulate/{jobId}")
    fun getApiV1AiGenerateChatSimulateByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ChatSimulationStatus>

    /**
     * GET api/v1/ai/generate/companies/batch/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CompanyBatchGenerationStatus]>
     */
    @GET("api/v1/ai/generate/companies/batch/{jobId}")
    fun getApiV1AiGenerateCompaniesBatchByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CompanyBatchGenerationStatus>

    /**
     * GET api/v1/ai/generate/demo-feed/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[DemoFeedSeedingStatus]>
     */
    @GET("api/v1/ai/generate/demo-feed/{jobId}")
    fun getApiV1AiGenerateDemoFeedByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<DemoFeedSeedingStatus>

    /**
     * GET api/v1/ai/generate/menu/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[MenuGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/menu/{companyId}")
    fun getApiV1AiGenerateMenuByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<MenuGeneratorStatus>

    /**
     * GET api/v1/ai/generate/products/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ProductGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/products/{companyId}")
    fun getApiV1AiGenerateProductsByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ProductGeneratorStatus>

    /**
     * GET api/v1/ai/generate/provenance/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AiGeneratedEntitiesStatus]>
     */
    @GET("api/v1/ai/generate/provenance/{jobId}")
    fun getApiV1AiGenerateProvenanceByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AiGeneratedEntitiesStatus>

    /**
     * GET api/v1/ai/generate/stickers/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StickerCollectionGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/stickers/{bountyId}")
    fun getApiV1AiGenerateStickersByBountyid(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StickerCollectionGeneratorStatus>

    /**
     * GET api/v1/ai/generate/stickers/meta
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StickerGeneratorMeta]>
     */
    @GET("api/v1/ai/generate/stickers/meta")
    fun getApiV1AiGenerateStickersMeta(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StickerGeneratorMeta>

    /**
     * GET api/v1/ai/generate/user-avatar/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserAvatarGenerationStatus]>
     */
    @GET("api/v1/ai/generate/user-avatar/{jobId}")
    fun getApiV1AiGenerateUserAvatarByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserAvatarGenerationStatus>

    /**
     * GET api/v1/ai/generate/user-cover/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserCoverGenerationStatus]>
     */
    @GET("api/v1/ai/generate/user-cover/{jobId}")
    fun getApiV1AiGenerateUserCoverByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserCoverGenerationStatus>

    /**
     * GET api/v1/ai/generate/users/batch/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserBatchGenerationStatus]>
     */
    @GET("api/v1/ai/generate/users/batch/{jobId}")
    fun getApiV1AiGenerateUsersBatchByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserBatchGenerationStatus>

    /**
     * POST api/v1/ai/generate/badge
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param badgeGeneratorInput 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartBadgeGenerationResponse]>
     */
    @POST("api/v1/ai/generate/badge")
    fun postApiV1AiGenerateBadge(@Body badgeGeneratorInput: BadgeGeneratorInput, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartBadgeGenerationResponse>

    /**
     * POST api/v1/ai/generate/bounty
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startBountyGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartBountyGenerationResponse]>
     */
    @POST("api/v1/ai/generate/bounty")
    fun postApiV1AiGenerateBounty(@Body startBountyGenerationRequest: StartBountyGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartBountyGenerationResponse>

    /**
     * POST api/v1/ai/generate/bounty/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BountyGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/bounty/{jobId}/cleanup")
    fun postApiV1AiGenerateBountyByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BountyGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/catalog
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startFullCatalogGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartFullCatalogGenerationResponse]>
     */
    @POST("api/v1/ai/generate/catalog")
    fun postApiV1AiGenerateCatalog(@Body startFullCatalogGenerationRequest: StartFullCatalogGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartFullCatalogGenerationResponse>

    /**
     * POST api/v1/ai/generate/categories
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startCategoryGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartCategoryGenerationResponse]>
     */
    @POST("api/v1/ai/generate/categories")
    fun postApiV1AiGenerateCategories(@Body startCategoryGenerationRequest: StartCategoryGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartCategoryGenerationResponse>

    /**
     * POST api/v1/ai/generate/categories/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CategoryGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/categories/{jobId}/cleanup")
    fun postApiV1AiGenerateCategoriesByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CategoryGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/category-tree
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startCategoryTreeGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartCategoryTreeGenerationResponse]>
     */
    @POST("api/v1/ai/generate/category-tree")
    fun postApiV1AiGenerateCategoryTree(@Body startCategoryTreeGenerationRequest: StartCategoryTreeGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartCategoryTreeGenerationResponse>

    /**
     * POST api/v1/ai/generate/category-tree/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CategoryTreeGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/category-tree/{jobId}/cleanup")
    fun postApiV1AiGenerateCategoryTreeByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CategoryTreeGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/chat/simulate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startChatSimulationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartChatSimulationResponse]>
     */
    @POST("api/v1/ai/generate/chat/simulate")
    fun postApiV1AiGenerateChatSimulate(@Body startChatSimulationRequest: StartChatSimulationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartChatSimulationResponse>

    /**
     * POST api/v1/ai/generate/chat/simulate/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ChatSimulationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/chat/simulate/{jobId}/cleanup")
    fun postApiV1AiGenerateChatSimulateByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ChatSimulationCleanupResponse>

    /**
     * POST api/v1/ai/generate/companies/batch
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startCompanyBatchGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartCompanyBatchGenerationResponse]>
     */
    @POST("api/v1/ai/generate/companies/batch")
    fun postApiV1AiGenerateCompaniesBatch(@Body startCompanyBatchGenerationRequest: StartCompanyBatchGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartCompanyBatchGenerationResponse>

    /**
     * POST api/v1/ai/generate/companies/batch/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CompanyBatchGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/companies/batch/{jobId}/cleanup")
    fun postApiV1AiGenerateCompaniesBatchByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CompanyBatchGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/demo-feed
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startDemoFeedSeedingRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartDemoFeedSeedingResponse]>
     */
    @POST("api/v1/ai/generate/demo-feed")
    fun postApiV1AiGenerateDemoFeed(@Body startDemoFeedSeedingRequest: StartDemoFeedSeedingRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartDemoFeedSeedingResponse>

    /**
     * POST api/v1/ai/generate/demo-feed/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[DemoFeedSeedingCleanupResponse]>
     */
    @POST("api/v1/ai/generate/demo-feed/{jobId}/cleanup")
    fun postApiV1AiGenerateDemoFeedByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<DemoFeedSeedingCleanupResponse>

    /**
     * POST api/v1/ai/generate/menu
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startMenuGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartMenuGenerationResponse]>
     */
    @POST("api/v1/ai/generate/menu")
    fun postApiV1AiGenerateMenu(@Body startMenuGenerationRequest: StartMenuGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartMenuGenerationResponse>

    /**
     * POST api/v1/ai/generate/menu/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[MenuGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/menu/{jobId}/cleanup")
    fun postApiV1AiGenerateMenuByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<MenuGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/products
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startProductGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartProductGenerationResponse]>
     */
    @POST("api/v1/ai/generate/products")
    fun postApiV1AiGenerateProducts(@Body startProductGenerationRequest: StartProductGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartProductGenerationResponse>

    /**
     * POST api/v1/ai/generate/products/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ProductGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/products/{jobId}/cleanup")
    fun postApiV1AiGenerateProductsByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ProductGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/stickers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param stickerCollectionGeneratorInput 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartStickerGenerationResponse]>
     */
    @POST("api/v1/ai/generate/stickers")
    fun postApiV1AiGenerateStickers(@Body stickerCollectionGeneratorInput: StickerCollectionGeneratorInput, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartStickerGenerationResponse>

    /**
     * POST api/v1/ai/generate/user-avatar
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startUserAvatarGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartUserAvatarGenerationResponse]>
     */
    @POST("api/v1/ai/generate/user-avatar")
    fun postApiV1AiGenerateUserAvatar(@Body startUserAvatarGenerationRequest: StartUserAvatarGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartUserAvatarGenerationResponse>

    /**
     * POST api/v1/ai/generate/user-avatar/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserAvatarGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/user-avatar/{jobId}/cleanup")
    fun postApiV1AiGenerateUserAvatarByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserAvatarGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/user-cover
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startUserCoverGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartUserCoverGenerationResponse]>
     */
    @POST("api/v1/ai/generate/user-cover")
    fun postApiV1AiGenerateUserCover(@Body startUserCoverGenerationRequest: StartUserCoverGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartUserCoverGenerationResponse>

    /**
     * POST api/v1/ai/generate/user-cover/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserCoverGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/user-cover/{jobId}/cleanup")
    fun postApiV1AiGenerateUserCoverByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserCoverGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/users/batch
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param startUserBatchGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartUserBatchGenerationResponse]>
     */
    @POST("api/v1/ai/generate/users/batch")
    fun postApiV1AiGenerateUsersBatch(@Body startUserBatchGenerationRequest: StartUserBatchGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartUserBatchGenerationResponse>

    /**
     * POST api/v1/ai/generate/users/batch/{jobId}/cleanup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param force  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserBatchGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/users/batch/{jobId}/cleanup")
    fun postApiV1AiGenerateUsersBatchByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserBatchGenerationCleanupResponse>

}
