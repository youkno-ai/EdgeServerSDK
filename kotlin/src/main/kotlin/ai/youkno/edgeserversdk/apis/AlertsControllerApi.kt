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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/alerts/companies/{companyId}/order/{bountyId}")
    fun deleteOrderAlert(@Path("companyId") companyId: kotlin.String, @Path("bountyId") bountyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/alerts/{companyId}/email/template
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param templateType 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[EmailTemplate]>
     */
    @GET("api/v1/alerts/{companyId}/email/template")
    fun getActiveEmailTemplate(@Path("companyId") companyId: kotlin.String, @Query("templateType") templateType: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<EmailTemplate>

    /**
     * GET api/v1/alerts/email/defaultTemplate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param templateType 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[EmailTemplate]>
     */
    @GET("api/v1/alerts/email/defaultTemplate")
    fun getDefaultEmailTemplate(@Query("templateType") templateType: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<EmailTemplate>

    /**
     * GET api/v1/alerts/{companyId}/email/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[EmailSettings]>
     */
    @GET("api/v1/alerts/{companyId}/email/settings")
    fun getEmailSettings(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<EmailSettings>

    /**
     * POST api/v1/alerts/{companyId}/email/template
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param emailTemplate 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/alerts/{companyId}/email/template")
    fun saveEmailTemplate(@Path("companyId") companyId: kotlin.String, @Body emailTemplate: EmailTemplate, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/alerts/{companyId}/email/test
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param sendTestEmailReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SendTestEmailResp]>
     */
    @POST("api/v1/alerts/{companyId}/email/test")
    fun sendTestEmail(@Path("companyId") companyId: kotlin.String, @Body sendTestEmailReq: SendTestEmailReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SendTestEmailResp>

    /**
     * POST api/v1/alerts/{companyId}/email/settings
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param emailSettings 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/alerts/{companyId}/email/settings")
    fun setEmailSettings(@Path("companyId") companyId: kotlin.String, @Body emailSettings: EmailSettings, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

}
