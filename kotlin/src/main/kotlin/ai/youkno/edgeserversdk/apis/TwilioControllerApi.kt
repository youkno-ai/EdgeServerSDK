package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.SmsVerification
import ai.youkno.edgeserversdk.models.UserAuth

interface TwilioControllerApi {
    /**
     * GET api/v1/twilio/access_token
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserAuth]>
     */
    @GET("api/v1/twilio/access_token")
    fun getApiV1TwilioAccessToken(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserAuth>

    /**
     * POST api/v1/twilio/phone/send_token
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param body 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/twilio/phone/send_token")
    fun postApiV1TwilioPhoneSendToken(@Body body: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/twilio/phone/verify_token
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param smsVerification 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @POST("api/v1/twilio/phone/verify_token")
    fun postApiV1TwilioPhoneVerifyToken(@Body smsVerification: SmsVerification, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/twilio/sms/reply/{state}
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param state 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @POST("api/v1/twilio/sms/reply/{state}")
    fun postApiV1TwilioSmsReplyByState(@Path("state") state: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/twilio/voice/{state}
     * 
     * 
     * Responses:
     *  - 0: default response
     *
     * @param state 
     * @param phone 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @FormUrlEncoded
    @POST("api/v1/twilio/voice/{state}")
    fun postApiV1TwilioVoiceByState(@Path("state") state: kotlin.String, @Field("phone") phone: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * POST api/v1/twilio/webhook_callback
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/twilio/webhook_callback")
    fun postApiV1TwilioWebhookCallback(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
