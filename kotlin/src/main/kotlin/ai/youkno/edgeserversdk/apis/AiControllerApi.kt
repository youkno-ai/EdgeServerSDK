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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[StartStickerGenerationResponse]>
     */
    @POST("api/v1/ai/generate/stickers")
    fun generateStickers(@Body input: Input, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<StartStickerGenerationResponse>

    /**
     * GET api/v1/ai/generate/stickers/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param bountyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[StickerCollectionGeneratorStatus]>
     */
    @GET("api/v1/ai/generate/stickers/{bountyId}")
    fun getGenerateStickersStatus(@Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<StickerCollectionGeneratorStatus>

    /**
     * GET api/v1/ai/generate/stickers/meta
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[StickerGeneratorMeta]>
     */
    @GET("api/v1/ai/generate/stickers/meta")
    fun meta(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<StickerGeneratorMeta>

}
