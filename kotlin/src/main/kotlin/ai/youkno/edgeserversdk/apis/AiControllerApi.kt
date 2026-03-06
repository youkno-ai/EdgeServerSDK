package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappserveraibadgeBadgeGeneratorInput
import ai.youkno.edgeserversdk.models.CoedgeappserveraistickersStickerCollectionGeneratorInput
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerAiGeneratedEntitiesStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerBadgeGeneratorStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerBountyGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerBountyGenerationStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerCategoryGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerCategoryGeneratorStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerCategoryTreeGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerCategoryTreeGeneratorStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerChatSimulationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerChatSimulationStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerCompanyBatchGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerCompanyBatchGenerationStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerDemoFeedSeedingCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerDemoFeedSeedingStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerMenuGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerMenuGeneratorStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerProductGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerProductGeneratorStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartBadgeGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartBountyGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartBountyGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartCategoryGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartCategoryGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartCategoryTreeGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartCategoryTreeGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartChatSimulationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartChatSimulationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartCompanyBatchGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartCompanyBatchGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartDemoFeedSeedingRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartDemoFeedSeedingResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartFullCatalogGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartFullCatalogGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartMenuGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartMenuGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartProductGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartProductGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartStickerGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartUserAvatarGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartUserAvatarGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartUserBatchGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartUserBatchGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartUserCoverGenerationRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStartUserCoverGenerationResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStickerCollectionGeneratorStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerStickerGeneratorMeta
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerUserAvatarGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerUserAvatarGenerationStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerUserBatchGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerUserBatchGenerationStatus
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerUserCoverGenerationCleanupResponse
import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerAIControllerUserCoverGenerationStatus

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerBadgeGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/badge/{companyId}")
    fun getApiV1AiGenerateBadgeByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerBadgeGeneratorStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerBountyGenerationStatus]>
     */
    @GET("api/v1/ai/generate/bounty/{jobId}")
    fun getApiV1AiGenerateBountyByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerBountyGenerationStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerCategoryGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/categories/{companyId}")
    fun getApiV1AiGenerateCategoriesByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerCategoryGeneratorStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerCategoryTreeGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/category-tree/{companyId}")
    fun getApiV1AiGenerateCategoryTreeByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerCategoryTreeGeneratorStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerChatSimulationStatus]>
     */
    @GET("api/v1/ai/generate/chat/simulate/{jobId}")
    fun getApiV1AiGenerateChatSimulateByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerChatSimulationStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerCompanyBatchGenerationStatus]>
     */
    @GET("api/v1/ai/generate/companies/batch/{jobId}")
    fun getApiV1AiGenerateCompaniesBatchByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerCompanyBatchGenerationStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerDemoFeedSeedingStatus]>
     */
    @GET("api/v1/ai/generate/demo-feed/{jobId}")
    fun getApiV1AiGenerateDemoFeedByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerDemoFeedSeedingStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerMenuGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/menu/{companyId}")
    fun getApiV1AiGenerateMenuByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerMenuGeneratorStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerProductGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/products/{companyId}")
    fun getApiV1AiGenerateProductsByCompanyid(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerProductGeneratorStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerAiGeneratedEntitiesStatus]>
     */
    @GET("api/v1/ai/generate/provenance/{jobId}")
    fun getApiV1AiGenerateProvenanceByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerAiGeneratedEntitiesStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStickerCollectionGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/stickers/{bountyId}")
    fun getApiV1AiGenerateStickersByBountyid(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStickerCollectionGeneratorStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStickerGeneratorMeta]>
     */
    @GET("api/v1/ai/generate/stickers/meta")
    fun getApiV1AiGenerateStickersMeta(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStickerGeneratorMeta>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerUserAvatarGenerationStatus]>
     */
    @GET("api/v1/ai/generate/user-avatar/{jobId}")
    fun getApiV1AiGenerateUserAvatarByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerUserAvatarGenerationStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerUserCoverGenerationStatus]>
     */
    @GET("api/v1/ai/generate/user-cover/{jobId}")
    fun getApiV1AiGenerateUserCoverByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerUserCoverGenerationStatus>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerUserBatchGenerationStatus]>
     */
    @GET("api/v1/ai/generate/users/batch/{jobId}")
    fun getApiV1AiGenerateUsersBatchByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerUserBatchGenerationStatus>

    /**
     * POST api/v1/ai/generate/badge
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserveraibadgeBadgeGeneratorInput 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartBadgeGenerationResponse]>
     */
    @POST("api/v1/ai/generate/badge")
    fun postApiV1AiGenerateBadge(@Body coedgeappserveraibadgeBadgeGeneratorInput: CoedgeappserveraibadgeBadgeGeneratorInput, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartBadgeGenerationResponse>

    /**
     * POST api/v1/ai/generate/bounty
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartBountyGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartBountyGenerationResponse]>
     */
    @POST("api/v1/ai/generate/bounty")
    fun postApiV1AiGenerateBounty(@Body coedgeappserverrestcontrollerAIControllerStartBountyGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartBountyGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartBountyGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerBountyGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/bounty/{jobId}/cleanup")
    fun postApiV1AiGenerateBountyByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerBountyGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/catalog
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartFullCatalogGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartFullCatalogGenerationResponse]>
     */
    @POST("api/v1/ai/generate/catalog")
    fun postApiV1AiGenerateCatalog(@Body coedgeappserverrestcontrollerAIControllerStartFullCatalogGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartFullCatalogGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartFullCatalogGenerationResponse>

    /**
     * POST api/v1/ai/generate/categories
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartCategoryGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartCategoryGenerationResponse]>
     */
    @POST("api/v1/ai/generate/categories")
    fun postApiV1AiGenerateCategories(@Body coedgeappserverrestcontrollerAIControllerStartCategoryGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartCategoryGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartCategoryGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerCategoryGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/categories/{jobId}/cleanup")
    fun postApiV1AiGenerateCategoriesByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerCategoryGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/category-tree
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartCategoryTreeGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartCategoryTreeGenerationResponse]>
     */
    @POST("api/v1/ai/generate/category-tree")
    fun postApiV1AiGenerateCategoryTree(@Body coedgeappserverrestcontrollerAIControllerStartCategoryTreeGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartCategoryTreeGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartCategoryTreeGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerCategoryTreeGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/category-tree/{jobId}/cleanup")
    fun postApiV1AiGenerateCategoryTreeByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerCategoryTreeGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/chat/simulate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartChatSimulationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartChatSimulationResponse]>
     */
    @POST("api/v1/ai/generate/chat/simulate")
    fun postApiV1AiGenerateChatSimulate(@Body coedgeappserverrestcontrollerAIControllerStartChatSimulationRequest: CoedgeappserverrestcontrollerAIControllerStartChatSimulationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartChatSimulationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerChatSimulationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/chat/simulate/{jobId}/cleanup")
    fun postApiV1AiGenerateChatSimulateByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerChatSimulationCleanupResponse>

    /**
     * POST api/v1/ai/generate/companies/batch
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartCompanyBatchGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartCompanyBatchGenerationResponse]>
     */
    @POST("api/v1/ai/generate/companies/batch")
    fun postApiV1AiGenerateCompaniesBatch(@Body coedgeappserverrestcontrollerAIControllerStartCompanyBatchGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartCompanyBatchGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartCompanyBatchGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerCompanyBatchGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/companies/batch/{jobId}/cleanup")
    fun postApiV1AiGenerateCompaniesBatchByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerCompanyBatchGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/demo-feed
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartDemoFeedSeedingRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartDemoFeedSeedingResponse]>
     */
    @POST("api/v1/ai/generate/demo-feed")
    fun postApiV1AiGenerateDemoFeed(@Body coedgeappserverrestcontrollerAIControllerStartDemoFeedSeedingRequest: CoedgeappserverrestcontrollerAIControllerStartDemoFeedSeedingRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartDemoFeedSeedingResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerDemoFeedSeedingCleanupResponse]>
     */
    @POST("api/v1/ai/generate/demo-feed/{jobId}/cleanup")
    fun postApiV1AiGenerateDemoFeedByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerDemoFeedSeedingCleanupResponse>

    /**
     * POST api/v1/ai/generate/menu
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartMenuGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartMenuGenerationResponse]>
     */
    @POST("api/v1/ai/generate/menu")
    fun postApiV1AiGenerateMenu(@Body coedgeappserverrestcontrollerAIControllerStartMenuGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartMenuGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartMenuGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerMenuGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/menu/{jobId}/cleanup")
    fun postApiV1AiGenerateMenuByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerMenuGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/products
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartProductGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartProductGenerationResponse]>
     */
    @POST("api/v1/ai/generate/products")
    fun postApiV1AiGenerateProducts(@Body coedgeappserverrestcontrollerAIControllerStartProductGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartProductGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartProductGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerProductGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/products/{jobId}/cleanup")
    fun postApiV1AiGenerateProductsByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerProductGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/stickers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserveraistickersStickerCollectionGeneratorInput 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartStickerGenerationResponse]>
     */
    @POST("api/v1/ai/generate/stickers")
    fun postApiV1AiGenerateStickers(@Body coedgeappserveraistickersStickerCollectionGeneratorInput: CoedgeappserveraistickersStickerCollectionGeneratorInput, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartStickerGenerationResponse>

    /**
     * POST api/v1/ai/generate/user-avatar
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartUserAvatarGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartUserAvatarGenerationResponse]>
     */
    @POST("api/v1/ai/generate/user-avatar")
    fun postApiV1AiGenerateUserAvatar(@Body coedgeappserverrestcontrollerAIControllerStartUserAvatarGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartUserAvatarGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartUserAvatarGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerUserAvatarGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/user-avatar/{jobId}/cleanup")
    fun postApiV1AiGenerateUserAvatarByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerUserAvatarGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/user-cover
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartUserCoverGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartUserCoverGenerationResponse]>
     */
    @POST("api/v1/ai/generate/user-cover")
    fun postApiV1AiGenerateUserCover(@Body coedgeappserverrestcontrollerAIControllerStartUserCoverGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartUserCoverGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartUserCoverGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerUserCoverGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/user-cover/{jobId}/cleanup")
    fun postApiV1AiGenerateUserCoverByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerUserCoverGenerationCleanupResponse>

    /**
     * POST api/v1/ai/generate/users/batch
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappserverrestcontrollerAIControllerStartUserBatchGenerationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerStartUserBatchGenerationResponse]>
     */
    @POST("api/v1/ai/generate/users/batch")
    fun postApiV1AiGenerateUsersBatch(@Body coedgeappserverrestcontrollerAIControllerStartUserBatchGenerationRequest: CoedgeappserverrestcontrollerAIControllerStartUserBatchGenerationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerStartUserBatchGenerationResponse>

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
     * @return [Call]<[CoedgeappserverrestcontrollerAIControllerUserBatchGenerationCleanupResponse]>
     */
    @POST("api/v1/ai/generate/users/batch/{jobId}/cleanup")
    fun postApiV1AiGenerateUsersBatchByJobidCleanup(@Path("jobId") jobId: java.util.UUID, @Query("force") force: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerAIControllerUserBatchGenerationCleanupResponse>

}
