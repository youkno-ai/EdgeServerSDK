package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataCurrencyReportRecord

interface CurrencyControllerApi {
    /**
     * GET api/v1/currencies/{code}/report
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param order  (optional)
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 20)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataCurrencyReportRecord]>
     */
    @GET("api/v1/currencies/{code}/report")
    fun getApiV1CurrenciesByCodeReport(@Path("code") code: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelEdgeApiDataCurrencyReportRecord>

    /**
     * PUT api/v1/currencies/{code}/cancel
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/currencies/{code}/cancel")
    fun putApiV1CurrenciesByCodeCancel(@Path("code") code: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
