package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataEmailSettings
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataEmailTemplate
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSendTestEmailReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSendTestEmailResp

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataEmailSettings]>
     */
    @GET("api/v1/alerts/{companyId}/email/settings")
    fun getApiV1AlertsByCompanyidEmailSettings(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataEmailSettings>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataEmailTemplate]>
     */
    @GET("api/v1/alerts/{companyId}/email/template")
    fun getApiV1AlertsByCompanyidEmailTemplate(@Path("companyId") companyId: kotlin.String, @Query("templateType") templateType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataEmailTemplate>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataEmailTemplate]>
     */
    @GET("api/v1/alerts/email/defaultTemplate")
    fun getApiV1AlertsEmailDefaulttemplate(@Query("templateType") templateType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataEmailTemplate>

    /**
     * POST api/v1/alerts/{companyId}/email/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param coedgeappservermodelEdgeApiDataEmailSettings 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/alerts/{companyId}/email/settings")
    fun postApiV1AlertsByCompanyidEmailSettings(@Path("companyId") companyId: kotlin.String, @Body coedgeappservermodelEdgeApiDataEmailSettings: CoedgeappservermodelEdgeApiDataEmailSettings, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/alerts/{companyId}/email/template
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param coedgeappservermodelEdgeApiDataEmailTemplate 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/alerts/{companyId}/email/template")
    fun postApiV1AlertsByCompanyidEmailTemplate(@Path("companyId") companyId: kotlin.String, @Body coedgeappservermodelEdgeApiDataEmailTemplate: CoedgeappservermodelEdgeApiDataEmailTemplate, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/alerts/{companyId}/email/test
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param coedgeappservermodelEdgeApiDataSendTestEmailReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSendTestEmailResp]>
     */
    @POST("api/v1/alerts/{companyId}/email/test")
    fun postApiV1AlertsByCompanyidEmailTest(@Path("companyId") companyId: kotlin.String, @Body coedgeappservermodelEdgeApiDataSendTestEmailReq: CoedgeappservermodelEdgeApiDataSendTestEmailReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSendTestEmailResp>

}
