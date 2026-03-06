package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.DetectedLanguageResultListListDetection
import ai.youkno.edgeserversdk.models.TranslateTextResult

interface SupportControllerApi {
    /**
     * GET api/v1/detect
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param text 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[DetectedLanguageResultListListDetection]>
     */
    @GET("api/v1/detect")
    fun getDetectedLanguage(@Query("text") text: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<DetectedLanguageResultListListDetection>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[TranslateTextResult]>
     */
    @GET("api/v1/translate")
    fun getTranslatedText(@Query("source") source: kotlin.String, @Query("target") target: kotlin.String, @Query("text") text: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<TranslateTextResult>

}
