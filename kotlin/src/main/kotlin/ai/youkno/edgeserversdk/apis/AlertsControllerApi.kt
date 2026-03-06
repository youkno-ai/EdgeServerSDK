package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.EmailSettings
import ai.youkno.edgeserversdk.models.EmailTemplate
import ai.youkno.edgeserversdk.models.SendTestEmailReq
import ai.youkno.edgeserversdk.models.SendTestEmailResp

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/alerts/companies/{companyId}/order/{bountyId}")
    fun deleteOrderAlert(@Path("companyId") companyId: kotlin.String, @Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

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
     * @return [Call]<[EmailTemplate]>
     */
    @GET("api/v1/alerts/{companyId}/email/template")
    fun getActiveEmailTemplate(@Path("companyId") companyId: kotlin.String, @Query("templateType") templateType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EmailTemplate>

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
     * @return [Call]<[EmailTemplate]>
     */
    @GET("api/v1/alerts/email/defaultTemplate")
    fun getDefaultEmailTemplate(@Query("templateType") templateType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EmailTemplate>

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
     * @return [Call]<[EmailSettings]>
     */
    @GET("api/v1/alerts/{companyId}/email/settings")
    fun getEmailSettings(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EmailSettings>

    /**
     * POST api/v1/alerts/{companyId}/email/template
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param emailTemplate 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/alerts/{companyId}/email/template")
    fun saveEmailTemplate(@Path("companyId") companyId: kotlin.String, @Body emailTemplate: EmailTemplate, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * POST api/v1/alerts/{companyId}/email/test
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param sendTestEmailReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SendTestEmailResp]>
     */
    @POST("api/v1/alerts/{companyId}/email/test")
    fun sendTestEmail(@Path("companyId") companyId: kotlin.String, @Body sendTestEmailReq: SendTestEmailReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SendTestEmailResp>

    /**
     * POST api/v1/alerts/{companyId}/email/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param emailSettings 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/alerts/{companyId}/email/settings")
    fun setEmailSettings(@Path("companyId") companyId: kotlin.String, @Body emailSettings: EmailSettings, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

}
