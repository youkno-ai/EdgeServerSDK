package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataDetectedLanguageResultJavautilListJavautilListCoedgeappserverthirdpartiesGoogleTranslateAPIDetectedDataDetection
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataTranslateTextResult

interface SupportControllerApi {
    /**
     * GET api/v1/detect
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param text 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataDetectedLanguageResultJavautilListJavautilListCoedgeappserverthirdpartiesGoogleTranslateAPIDetectedDataDetection]>
     */
    @GET("api/v1/detect")
    fun getApiV1Detect(@Query("text") text: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataDetectedLanguageResultJavautilListJavautilListCoedgeappserverthirdpartiesGoogleTranslateAPIDetectedDataDetection>

    /**
     * GET api/v1/translate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param source 
     * @param target 
     * @param text 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataTranslateTextResult]>
     */
    @GET("api/v1/translate")
    fun getApiV1Translate(@Query("source") source: kotlin.String, @Query("target") target: kotlin.String, @Query("text") text: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataTranslateTextResult>

}
