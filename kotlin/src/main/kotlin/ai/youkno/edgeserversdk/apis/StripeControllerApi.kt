package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CreatePaymentIntentResponse
import ai.youkno.edgeserversdk.models.CreateSetupIntentRequest
import ai.youkno.edgeserversdk.models.CreateSetupIntentResponse
import ai.youkno.edgeserversdk.models.StripeAccountResponse
import ai.youkno.edgeserversdk.models.StripeConfigResponse
import ai.youkno.edgeserversdk.models.StripeConnectResponse

interface StripeControllerApi {
    /**
     * GET api/v1/stripe/config
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[StripeConfigResponse]>
     */
    @GET("api/v1/stripe/config")
    fun config(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<StripeConfigResponse>

    /**
     * GET api/v1/stripe/connect
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param redirectUrl  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[StripeConnectResponse]>
     */
    @GET("api/v1/stripe/connect")
    fun connect(@Query("redirectUrl") redirectUrl: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<StripeConnectResponse>

    /**
     * POST api/v1/stripe/payments/{paymentId}/payment-intent
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param paymentId 
     * @param body 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CreatePaymentIntentResponse]>
     */
    @POST("api/v1/stripe/payments/{paymentId}/payment-intent")
    fun createPaymentIntent(@Path("paymentId") paymentId: kotlin.String, @Body body: kotlin.Any, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CreatePaymentIntentResponse>

    /**
     * POST api/v1/stripe/setup-intent
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @param createSetupIntentRequest  (optional)
     * @return [Call]<[CreateSetupIntentResponse]>
     */
    @POST("api/v1/stripe/setup-intent")
    fun createSetupIntent(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null, @Body createSetupIntentRequest: CreateSetupIntentRequest? = null): Call<CreateSetupIntentResponse>

    /**
     * GET api/v1/stripe/account
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[StripeAccountResponse]>
     */
    @GET("api/v1/stripe/account")
    fun getConnectedAccount(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<StripeAccountResponse>

    /**
     * POST api/v1/stripe/webhook_callback
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param stripeSignature 
     * @param body 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/stripe/webhook_callback")
    fun stripeWebhookCallback(@Header("Stripe-Signature") stripeSignature: kotlin.String, @Body body: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

}
