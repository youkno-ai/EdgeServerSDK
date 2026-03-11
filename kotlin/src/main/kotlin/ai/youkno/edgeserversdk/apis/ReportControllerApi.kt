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
     * GET api/v1/reports/meta
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param authorization  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ReportsMetadata]>
     */
    @GET("api/v1/reports/meta")
    fun getApiV1ReportsMeta(@Header("Authorization") authorization: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ReportsMetadata>

    /**
     * POST api/v1/reports/download
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param downloadReportRequest 
     * @param authorization  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/reports/download")
    fun postApiV1ReportsDownload(@Body downloadReportRequest: DownloadReportRequest, @Header("Authorization") authorization: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
