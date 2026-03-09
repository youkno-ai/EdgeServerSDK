package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.EdgeApiDataEmailSettings
import ai.youkno.edgeserversdk.models.EdgeApiDataEmailTemplate
import ai.youkno.edgeserversdk.models.EdgeApiDataSendTestEmailReq
import ai.youkno.edgeserversdk.models.EdgeApiDataSendTestEmailResp

interface AlertsControllerApi {
    /**
     * DELETE api/v1/alerts/companies/{companyId}/order/{bountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param bountyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/alerts/companies/{companyId}/order/{bountyId}")
    fun deleteApiV1AlertsCompaniesByCompanyidOrderByBountyid(@Path("companyId") companyId: kotlin.String, @Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/alerts/{companyId}/email/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataEmailSettings]>
     */
    @GET("api/v1/alerts/{companyId}/email/settings")
    fun getApiV1AlertsByCompanyidEmailSettings(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataEmailSettings>

    /**
     * GET api/v1/alerts/{companyId}/email/template
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param templateType 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataEmailTemplate]>
     */
    @GET("api/v1/alerts/{companyId}/email/template")
    fun getApiV1AlertsByCompanyidEmailTemplate(@Path("companyId") companyId: kotlin.String, @Query("templateType") templateType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataEmailTemplate>

    /**
     * GET api/v1/alerts/email/defaultTemplate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param templateType 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataEmailTemplate]>
     */
    @GET("api/v1/alerts/email/defaultTemplate")
    fun getApiV1AlertsEmailDefaulttemplate(@Query("templateType") templateType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataEmailTemplate>

    /**
     * POST api/v1/alerts/{companyId}/email/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param edgeApiDataEmailSettings 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/alerts/{companyId}/email/settings")
    fun postApiV1AlertsByCompanyidEmailSettings(@Path("companyId") companyId: kotlin.String, @Body edgeApiDataEmailSettings: EdgeApiDataEmailSettings, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/alerts/{companyId}/email/template
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param edgeApiDataEmailTemplate 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/alerts/{companyId}/email/template")
    fun postApiV1AlertsByCompanyidEmailTemplate(@Path("companyId") companyId: kotlin.String, @Body edgeApiDataEmailTemplate: EdgeApiDataEmailTemplate, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/alerts/{companyId}/email/test
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param edgeApiDataSendTestEmailReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataSendTestEmailResp]>
     */
    @POST("api/v1/alerts/{companyId}/email/test")
    fun postApiV1AlertsByCompanyidEmailTest(@Path("companyId") companyId: kotlin.String, @Body edgeApiDataSendTestEmailReq: EdgeApiDataSendTestEmailReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataSendTestEmailResp>

}
