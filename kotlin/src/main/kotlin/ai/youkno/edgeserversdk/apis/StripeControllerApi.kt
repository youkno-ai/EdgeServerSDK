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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StripeConfigResponse]>
     */
    @GET("api/v1/stripe/config")
    fun config(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StripeConfigResponse>

    /**
     * GET api/v1/stripe/connect
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param redirectUrl  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StripeConnectResponse]>
     */
    @GET("api/v1/stripe/connect")
    fun connect(@Query("redirectUrl") redirectUrl: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StripeConnectResponse>

    /**
     * POST api/v1/stripe/payments/{paymentId}/payment-intent
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param paymentId 
     * @param body 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CreatePaymentIntentResponse]>
     */
    @POST("api/v1/stripe/payments/{paymentId}/payment-intent")
    fun createPaymentIntent(@Path("paymentId") paymentId: kotlin.String, @Body body: kotlin.Any, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CreatePaymentIntentResponse>

    /**
     * POST api/v1/stripe/setup-intent
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @param createSetupIntentRequest  (optional)
     * @return [Call]<[CreateSetupIntentResponse]>
     */
    @POST("api/v1/stripe/setup-intent")
    fun createSetupIntent(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body createSetupIntentRequest: CreateSetupIntentRequest? = null): Call<CreateSetupIntentResponse>

    /**
     * GET api/v1/stripe/account
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StripeAccountResponse]>
     */
    @GET("api/v1/stripe/account")
    fun getConnectedAccount(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StripeAccountResponse>

    /**
     * POST api/v1/stripe/webhook_callback
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param stripeSignature 
     * @param body 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/stripe/webhook_callback")
    fun stripeWebhookCallback(@Header("Stripe-Signature") stripeSignature: kotlin.String, @Body body: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

}
