package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AnalyticsInfoResult

interface GoogleControllerApi {
    /**
     * GET api/v1/google/{companyId}/analytics_info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AnalyticsInfoResult]>
     */
    @GET("api/v1/google/{companyId}/analytics_info")
    fun getAnalyticsInfo(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AnalyticsInfoResult>

}
