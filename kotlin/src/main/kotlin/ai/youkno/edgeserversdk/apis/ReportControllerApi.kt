package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.DownloadReportRequest
import ai.youkno.edgeserversdk.models.ReportsMetadata

interface ReportControllerApi {
    /**
     * POST api/v1/reports/download
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param downloadReportRequest 
     * @param authorization  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/reports/download")
    fun downloadReport(@Body downloadReportRequest: DownloadReportRequest, @Header("Authorization") authorization: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/reports/meta
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param authorization  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ReportsMetadata]>
     */
    @GET("api/v1/reports/meta")
    fun getReportsMetadata(@Header("Authorization") authorization: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ReportsMetadata>

}
