package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AiBadgeBadgeGeneratorInput
import ai.youkno.edgeserversdk.models.AiStickersStickerCollectionGeneratorInput
import ai.youkno.edgeserversdk.models.RestControllerAIControllerAiGeneratedEntitiesStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerBadgeGeneratorStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerBountyGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerBountyGenerationStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerCategoryGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerCategoryGeneratorStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerCategoryTreeGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerCategoryTreeGeneratorStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerChatSimulationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerChatSimulationStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerCompanyBatchGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerCompanyBatchGenerationStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerDemoFeedSeedingCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerDemoFeedSeedingStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerMenuGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerMenuGeneratorStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerProductGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerProductGeneratorStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartBadgeGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartBountyGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartBountyGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartCategoryGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartCategoryGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartCategoryTreeGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartCategoryTreeGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartChatSimulationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartChatSimulationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartCompanyBatchGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartCompanyBatchGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartDemoFeedSeedingRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartDemoFeedSeedingResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartFullCatalogGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartFullCatalogGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartMenuGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartMenuGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartProductGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartProductGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartStickerGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartUserAvatarGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartUserAvatarGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartUserBatchGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartUserBatchGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartUserCoverGenerationRequest
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStartUserCoverGenerationResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStickerCollectionGeneratorStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerStickerGeneratorMeta
import ai.youkno.edgeserversdk.models.RestControllerAIControllerUserAvatarGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerUserAvatarGenerationStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerUserBatchGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerUserBatchGenerationStatus
import ai.youkno.edgeserversdk.models.RestControllerAIControllerUserCoverGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.RestControllerAIControllerUserCoverGenerationStatus

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
     * @return [Call]<[RestControllerAIControllerBadgeGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/badge/{companyId}")
    fun getApiV1AiGenerateBadgeByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerBadgeGeneratorStatus>

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
     * @return [Call]<[RestControllerAIControllerBountyGenerationStatus]>
     */
    @GET("api/v1/ai/generate/bounty/{jobId}")
    fun getApiV1AiGenerateBountyByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerBountyGenerationStatus>

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
     * @return [Call]<[RestControllerAIControllerCategoryGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/categories/{companyId}")
    fun getApiV1AiGenerateCategoriesByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerCategoryGeneratorStatus>

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
     * @return [Call]<[RestControllerAIControllerCategoryTreeGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/category-tree/{companyId}")
    fun getApiV1AiGenerateCategoryTreeByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerCategoryTreeGeneratorStatus>

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
     * @return [Call]<[RestControllerAIControllerChatSimulationStatus]>
     */
    @GET("api/v1/ai/generate/chat/simulate/{jobId}")
    fun getApiV1AiGenerateChatSimulateByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerChatSimulationStatus>

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
     * @return [Call]<[RestControllerAIControllerCompanyBatchGenerationStatus]>
     */
    @GET("api/v1/ai/generate/companies/batch/{jobId}")
    fun getApiV1AiGenerateCompaniesBatchByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerCompanyBatchGenerationStatus>

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
     * @return [Call]<[RestControllerAIControllerDemoFeedSeedingStatus]>
     */
    @GET("api/v1/ai/generate/demo-feed/{jobId}")
    fun getApiV1AiGenerateDemoFeedByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerDemoFeedSeedingStatus>

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
     * @return [Call]<[RestControllerAIControllerMenuGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/menu/{companyId}")
    fun getApiV1AiGenerateMenuByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerMenuGeneratorStatus>

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
     * @return [Call]<[RestControllerAIControllerProductGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/products/{companyId}")
    fun getApiV1AiGenerateProductsByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerProductGeneratorStatus>

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
     * @return [Call]<[RestControllerAIControllerAiGeneratedEntitiesStatus]>
     */
    @GET("api/v1/ai/generate/provenance/{jobId}")
    fun getApiV1AiGenerateProvenanceByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerAiGeneratedEntitiesStatus>

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
     * @return [Call]<[RestControllerAIControllerStickerCollectionGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/stickers/{bountyId}")
    fun getApiV1AiGenerateStickersByBountyid(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStickerCollectionGeneratorStatus>

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
     * @return [Call]<[RestControllerAIControllerStickerGeneratorMeta]>
     */
    @GET("api/v1/ai/generate/stickers/meta")
    fun getApiV1AiGenerateStickersMeta(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStickerGeneratorMeta>

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
     * @return [Call]<[RestControllerAIControllerUserAvatarGenerationStatus]>
     */
    @GET("api/v1/ai/generate/user-avatar/{jobId}")
    fun getApiV1AiGenerateUserAvatarByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerUserAvatarGenerationStatus>

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
     * @return [Call]<[RestControllerAIControllerUserCoverGenerationStatus]>
     */
    @GET("api/v1/ai/generate/user-cover/{jobId}")
    fun getApiV1AiGenerateUserCoverByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerUserCoverGenerationStatus>

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
     * @return [Call]<[RestControllerAIControllerUserBatchGenerationStatus]>
     */
    @GET("api/v1/ai/generate/users/batch/{jobId}")
    fun getApiV1AiGenerateUsersBatchByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerUserBatchGenerationStatus>

    /**
     * POST api/v1/ai/generate/badge
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param aiBadgeBadgeGeneratorInput 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartBadgeGenerationResponse]>
     */
    @POST("api/v1/ai/generate/badge")
    fun postApiV1AiGenerateBadge(@Body aiBadgeBadgeGeneratorInput: AiBadgeBadgeGeneratorInput, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartBadgeGenerationResponse>

    /**
     * POST api/v1/ai/generate/bounty
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartBountyGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartBountyGenerationResponse]>
     */
    @POST("api/v1/ai/generate/bounty")
    fun postApiV1AiGenerateBounty(@Body restControllerAIControllerStartBountyGenerationRequest: RestControllerAIControllerStartBountyGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartBountyGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerBountyGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/bounty/{jobId}/cleanup")
    fun postApiV1AiGenerateBountyByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerBountyGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/catalog
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartFullCatalogGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartFullCatalogGenerationResponse]>
     */
    @POST("api/v1/ai/generate/catalog")
    fun postApiV1AiGenerateCatalog(@Body restControllerAIControllerStartFullCatalogGenerationRequest: RestControllerAIControllerStartFullCatalogGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartFullCatalogGenerationResponse>

    /**
     * POST api/v1/ai/generate/categories
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartCategoryGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartCategoryGenerationResponse]>
     */
    @POST("api/v1/ai/generate/categories")
    fun postApiV1AiGenerateCategories(@Body restControllerAIControllerStartCategoryGenerationRequest: RestControllerAIControllerStartCategoryGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartCategoryGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerCategoryGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/categories/{jobId}/cleanup")
    fun postApiV1AiGenerateCategoriesByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerCategoryGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/category-tree
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartCategoryTreeGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartCategoryTreeGenerationResponse]>
     */
    @POST("api/v1/ai/generate/category-tree")
    fun postApiV1AiGenerateCategoryTree(@Body restControllerAIControllerStartCategoryTreeGenerationRequest: RestControllerAIControllerStartCategoryTreeGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartCategoryTreeGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerCategoryTreeGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/category-tree/{jobId}/cleanup")
    fun postApiV1AiGenerateCategoryTreeByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerCategoryTreeGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/chat/simulate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartChatSimulationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartChatSimulationResponse]>
     */
    @POST("api/v1/ai/generate/chat/simulate")
    fun postApiV1AiGenerateChatSimulate(@Body restControllerAIControllerStartChatSimulationRequest: RestControllerAIControllerStartChatSimulationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartChatSimulationResponse>

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
     * @return [Call]<[RestControllerAIControllerChatSimulationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/chat/simulate/{jobId}/cleanup")
    fun postApiV1AiGenerateChatSimulateByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerChatSimulationCleanupResponse>

    /**
     * POST api/v1/ai/generate/companies/batch
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartCompanyBatchGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartCompanyBatchGenerationResponse]>
     */
    @POST("api/v1/ai/generate/companies/batch")
    fun postApiV1AiGenerateCompaniesBatch(@Body restControllerAIControllerStartCompanyBatchGenerationRequest: RestControllerAIControllerStartCompanyBatchGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartCompanyBatchGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerCompanyBatchGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/companies/batch/{jobId}/cleanup")
    fun postApiV1AiGenerateCompaniesBatchByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerCompanyBatchGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/demo-feed
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartDemoFeedSeedingRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartDemoFeedSeedingResponse]>
     */
    @POST("api/v1/ai/generate/demo-feed")
    fun postApiV1AiGenerateDemoFeed(@Body restControllerAIControllerStartDemoFeedSeedingRequest: RestControllerAIControllerStartDemoFeedSeedingRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartDemoFeedSeedingResponse>

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
     * @return [Call]<[RestControllerAIControllerDemoFeedSeedingCleanupResponse]>
     */
    @POST("api/v1/ai/generate/demo-feed/{jobId}/cleanup")
    fun postApiV1AiGenerateDemoFeedByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerDemoFeedSeedingCleanupResponse>

    /**
     * POST api/v1/ai/generate/menu
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartMenuGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartMenuGenerationResponse]>
     */
    @POST("api/v1/ai/generate/menu")
    fun postApiV1AiGenerateMenu(@Body restControllerAIControllerStartMenuGenerationRequest: RestControllerAIControllerStartMenuGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartMenuGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerMenuGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/menu/{jobId}/cleanup")
    fun postApiV1AiGenerateMenuByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerMenuGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/products
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartProductGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartProductGenerationResponse]>
     */
    @POST("api/v1/ai/generate/products")
    fun postApiV1AiGenerateProducts(@Body restControllerAIControllerStartProductGenerationRequest: RestControllerAIControllerStartProductGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartProductGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerProductGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/products/{jobId}/cleanup")
    fun postApiV1AiGenerateProductsByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerProductGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/stickers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param aiStickersStickerCollectionGeneratorInput 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartStickerGenerationResponse]>
     */
    @POST("api/v1/ai/generate/stickers")
    fun postApiV1AiGenerateStickers(@Body aiStickersStickerCollectionGeneratorInput: AiStickersStickerCollectionGeneratorInput, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartStickerGenerationResponse>

    /**
     * POST api/v1/ai/generate/user-avatar
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartUserAvatarGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartUserAvatarGenerationResponse]>
     */
    @POST("api/v1/ai/generate/user-avatar")
    fun postApiV1AiGenerateUserAvatar(@Body restControllerAIControllerStartUserAvatarGenerationRequest: RestControllerAIControllerStartUserAvatarGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartUserAvatarGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerUserAvatarGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/user-avatar/{jobId}/cleanup")
    fun postApiV1AiGenerateUserAvatarByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerUserAvatarGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/user-cover
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartUserCoverGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartUserCoverGenerationResponse]>
     */
    @POST("api/v1/ai/generate/user-cover")
    fun postApiV1AiGenerateUserCover(@Body restControllerAIControllerStartUserCoverGenerationRequest: RestControllerAIControllerStartUserCoverGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartUserCoverGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerUserCoverGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/user-cover/{jobId}/cleanup")
    fun postApiV1AiGenerateUserCoverByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerUserCoverGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/users/batch
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerAIControllerStartUserBatchGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerAIControllerStartUserBatchGenerationResponse]>
     */
    @POST("api/v1/ai/generate/users/batch")
    fun postApiV1AiGenerateUsersBatch(@Body restControllerAIControllerStartUserBatchGenerationRequest: RestControllerAIControllerStartUserBatchGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerStartUserBatchGenerationResponse>

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
     * @return [Call]<[RestControllerAIControllerUserBatchGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/users/batch/{jobId}/cleanup")
    fun postApiV1AiGenerateUsersBatchByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerAIControllerUserBatchGenerationCleanupResponse>

}
