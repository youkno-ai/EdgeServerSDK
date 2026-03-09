package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.RestControllerStripeControllerCreateSetupIntentRequest
import ai.youkno.edgeserversdk.models.RestControllerStripeControllerCreateSubscriptionCheckoutSessionRequest
import ai.youkno.edgeserversdk.models.RestControllerStripeControllerCreateSubscriptionCheckoutSessionResponse
import ai.youkno.edgeserversdk.models.RestControllerStripeControllerStripeAccountResponse
import ai.youkno.edgeserversdk.models.RestControllerStripeControllerStripeConfigResponse
import ai.youkno.edgeserversdk.models.RestControllerStripeControllerStripeConnectResponse
import ai.youkno.edgeserversdk.models.ServiceStripeServiceCreatePaymentIntentResponse
import ai.youkno.edgeserversdk.models.ServiceStripeServiceCreateSetupIntentResponse

interface StripeControllerApi {
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
     * @return [Call]<[RestControllerStripeControllerStripeAccountResponse]>
     */
    @GET("api/v1/stripe/account")
    fun getApiV1StripeAccount(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerStripeControllerStripeAccountResponse>

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
     * @return [Call]<[RestControllerStripeControllerStripeConfigResponse]>
     */
    @GET("api/v1/stripe/config")
    fun getApiV1StripeConfig(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerStripeControllerStripeConfigResponse>

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
     * @return [Call]<[RestControllerStripeControllerStripeConnectResponse]>
     */
    @GET("api/v1/stripe/connect")
    fun getApiV1StripeConnect(@Query("redirectUrl") redirectUrl: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerStripeControllerStripeConnectResponse>

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
     * @return [Call]<[ServiceStripeServiceCreatePaymentIntentResponse]>
     */
    @POST("api/v1/stripe/payments/{paymentId}/payment-intent")
    fun postApiV1StripePaymentsByPaymentidPaymentIntent(@Path("paymentId") paymentId: kotlin.String, @Body body: kotlin.Any, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ServiceStripeServiceCreatePaymentIntentResponse>

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
     * @param restControllerStripeControllerCreateSetupIntentRequest  (optional)
     * @return [Call]<[ServiceStripeServiceCreateSetupIntentResponse]>
     */
    @POST("api/v1/stripe/setup-intent")
    fun postApiV1StripeSetupIntent(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body restControllerStripeControllerCreateSetupIntentRequest: RestControllerStripeControllerCreateSetupIntentRequest? = null): Call<ServiceStripeServiceCreateSetupIntentResponse>

    /**
     * POST api/v1/stripe/subscriptions/checkout-session
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param restControllerStripeControllerCreateSubscriptionCheckoutSessionRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[RestControllerStripeControllerCreateSubscriptionCheckoutSessionResponse]>
     */
    @POST("api/v1/stripe/subscriptions/checkout-session")
    fun postApiV1StripeSubscriptionsCheckoutSession(@Body restControllerStripeControllerCreateSubscriptionCheckoutSessionRequest: RestControllerStripeControllerCreateSubscriptionCheckoutSessionRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<RestControllerStripeControllerCreateSubscriptionCheckoutSessionResponse>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/stripe/webhook_callback")
    fun postApiV1StripeWebhookCallback(@Header("Stripe-Signature") stripeSignature: kotlin.String, @Body body: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
