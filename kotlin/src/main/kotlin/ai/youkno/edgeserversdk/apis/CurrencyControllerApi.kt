package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.PageCurrencyReportRecord

interface CurrencyControllerApi {
    /**
     * PUT api/v1/currencies/{code}/cancel
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/currencies/{code}/cancel")
    fun cancelCurrency(@Path("code") code: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageCurrencyReportRecord]>
     */
    @GET("api/v1/currencies/{code}/report")
    fun getCurrencyReport(@Path("code") code: kotlin.String, @Query("order") order: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 20, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageCurrencyReportRecord>

}
