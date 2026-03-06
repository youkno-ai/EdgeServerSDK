package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Input
import ai.youkno.edgeserversdk.models.StartStickerGenerationResponse
import ai.youkno.edgeserversdk.models.StickerCollectionGeneratorStatus
import ai.youkno.edgeserversdk.models.StickerGeneratorMeta

interface AiControllerApi {
    /**
     * POST api/v1/ai/generate/stickers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param input 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StartStickerGenerationResponse]>
     */
    @POST("api/v1/ai/generate/stickers")
    fun generateStickers(@Body input: Input, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StartStickerGenerationResponse>

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
    fun getGenerateStickersStatus(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StickerCollectionGeneratorStatus>

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
    fun meta(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StickerGeneratorMeta>

}
