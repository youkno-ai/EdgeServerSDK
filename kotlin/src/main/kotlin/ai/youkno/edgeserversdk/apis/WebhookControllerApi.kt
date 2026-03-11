package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.WebhookDeliveryDetailDto
import ai.youkno.edgeserversdk.models.WebhookDlqBulkRetryRequestDto
import ai.youkno.edgeserversdk.models.WebhookDlqBulkRetryResultDto
import ai.youkno.edgeserversdk.models.WebhookDlqDetailDto
import ai.youkno.edgeserversdk.models.WebhookEndpointDetailDto
import ai.youkno.edgeserversdk.models.WebhookEndpointHealthDetailDto
import ai.youkno.edgeserversdk.models.WebhookReplayRangeRequestDto
import ai.youkno.edgeserversdk.models.WebhookReplayResultDto
import ai.youkno.edgeserversdk.models.WebhookResendDeliveryResultDto
import ai.youkno.edgeserversdk.models.WebhookRotateSecretResultDto
import ai.youkno.edgeserversdk.models.WebhookTenantHealthSummaryDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookDeliverySummaryDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookDlqSummaryDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookEndpointHealthSummaryDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookEndpointSummaryDto

interface WebhookControllerApi {
    /**
     * GET api/v1/webhooks/deliveries/{deliveryId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deliveryId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookDeliveryDetailDto]>
     */
    @GET("api/v1/webhooks/deliveries/{deliveryId}")
    fun getApiV1WebhooksDeliveriesByDeliveryid(@Path("deliveryId") deliveryId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookDeliveryDetailDto>

    /**
     * GET api/v1/webhooks/dlq
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param endpointId  (optional)
     * @param deadReason  (optional)
     * @param eventType  (optional)
     * @param from  (optional)
     * @param to  (optional)
     * @param limit  (optional, default to 50)
     * @param offset  (optional, default to 0)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhooksWebhookDlqSummaryDto]>
     */
    @GET("api/v1/webhooks/dlq")
    fun getApiV1WebhooksDlq(@Query("endpointId") endpointId: java.util.UUID? = null, @Query("deadReason") deadReason: kotlin.String? = null, @Query("eventType") eventType: kotlin.String? = null, @Query("from") from: kotlin.String? = null, @Query("to") to: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = 50, @Query("offset") offset: kotlin.Int? = 0, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookDlqSummaryDto>

    /**
     * GET api/v1/webhooks/dlq/{deliveryId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deliveryId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookDlqDetailDto]>
     */
    @GET("api/v1/webhooks/dlq/{deliveryId}")
    fun getApiV1WebhooksDlqByDeliveryid(@Path("deliveryId") deliveryId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookDlqDetailDto>

    /**
     * GET api/v1/webhooks/endpoints
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhooksWebhookEndpointSummaryDto]>
     */
    @GET("api/v1/webhooks/endpoints")
    fun getApiV1WebhooksEndpoints(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookEndpointSummaryDto>

    /**
     * GET api/v1/webhooks/endpoints/{endpointId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param endpointId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookEndpointDetailDto]>
     */
    @GET("api/v1/webhooks/endpoints/{endpointId}")
    fun getApiV1WebhooksEndpointsByEndpointid(@Path("endpointId") endpointId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookEndpointDetailDto>

    /**
     * GET api/v1/webhooks/endpoints/{endpointId}/deliveries
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param endpointId 
     * @param status  (optional)
     * @param deadOnly  (optional, default to false)
     * @param eventType  (optional)
     * @param limit  (optional, default to 50)
     * @param offset  (optional, default to 0)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhooksWebhookDeliverySummaryDto]>
     */
    @GET("api/v1/webhooks/endpoints/{endpointId}/deliveries")
    fun getApiV1WebhooksEndpointsByEndpointidDeliveries(@Path("endpointId") endpointId: java.util.UUID, @Query("status") status: kotlin.String? = null, @Query("deadOnly") deadOnly: kotlin.Boolean? = false, @Query("eventType") eventType: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = 50, @Query("offset") offset: kotlin.Int? = 0, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookDeliverySummaryDto>

    /**
     * GET api/v1/webhooks/health/endpoints
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param enabled  (optional)
     * @param circuitState  (optional)
     * @param limit  (optional, default to 50)
     * @param offset  (optional, default to 0)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhooksWebhookEndpointHealthSummaryDto]>
     */
    @GET("api/v1/webhooks/health/endpoints")
    fun getApiV1WebhooksHealthEndpoints(@Query("enabled") enabled: kotlin.Boolean? = null, @Query("circuitState") circuitState: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = 50, @Query("offset") offset: kotlin.Int? = 0, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookEndpointHealthSummaryDto>

    /**
     * GET api/v1/webhooks/health/endpoints/{endpointId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param endpointId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookEndpointHealthDetailDto]>
     */
    @GET("api/v1/webhooks/health/endpoints/{endpointId}")
    fun getApiV1WebhooksHealthEndpointsByEndpointid(@Path("endpointId") endpointId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookEndpointHealthDetailDto>

    /**
     * GET api/v1/webhooks/health/summary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookTenantHealthSummaryDto]>
     */
    @GET("api/v1/webhooks/health/summary")
    fun getApiV1WebhooksHealthSummary(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookTenantHealthSummaryDto>

    /**
     * POST api/v1/webhooks/deliveries/{deliveryId}/resend
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deliveryId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookResendDeliveryResultDto]>
     */
    @POST("api/v1/webhooks/deliveries/{deliveryId}/resend")
    fun postApiV1WebhooksDeliveriesByDeliveryidResend(@Path("deliveryId") deliveryId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookResendDeliveryResultDto>

    /**
     * POST api/v1/webhooks/dlq/{deliveryId}/retry
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param deliveryId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookResendDeliveryResultDto]>
     */
    @POST("api/v1/webhooks/dlq/{deliveryId}/retry")
    fun postApiV1WebhooksDlqByDeliveryidRetry(@Path("deliveryId") deliveryId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookResendDeliveryResultDto>

    /**
     * POST api/v1/webhooks/dlq/retry
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param webhookDlqBulkRetryRequestDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookDlqBulkRetryResultDto]>
     */
    @POST("api/v1/webhooks/dlq/retry")
    fun postApiV1WebhooksDlqRetry(@Body webhookDlqBulkRetryRequestDto: WebhookDlqBulkRetryRequestDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookDlqBulkRetryResultDto>

    /**
     * POST api/v1/webhooks/endpoints/{endpointId}/rotate-secret
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param endpointId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookRotateSecretResultDto]>
     */
    @POST("api/v1/webhooks/endpoints/{endpointId}/rotate-secret")
    fun postApiV1WebhooksEndpointsByEndpointidRotateSecret(@Path("endpointId") endpointId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookRotateSecretResultDto>

    /**
     * POST api/v1/webhooks/replay
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param webhookReplayRangeRequestDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookReplayResultDto]>
     */
    @POST("api/v1/webhooks/replay")
    fun postApiV1WebhooksReplay(@Body webhookReplayRangeRequestDto: WebhookReplayRangeRequestDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookReplayResultDto>

    /**
     * POST api/v1/webhooks/replay/endpoints/{endpointId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param endpointId 
     * @param webhookReplayRangeRequestDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookReplayResultDto]>
     */
    @POST("api/v1/webhooks/replay/endpoints/{endpointId}")
    fun postApiV1WebhooksReplayEndpointsByEndpointid(@Path("endpointId") endpointId: java.util.UUID, @Body webhookReplayRangeRequestDto: WebhookReplayRangeRequestDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookReplayResultDto>

    /**
     * POST api/v1/webhooks/replay/event-log/{eventLogId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventLogId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookReplayResultDto]>
     */
    @POST("api/v1/webhooks/replay/event-log/{eventLogId}")
    fun postApiV1WebhooksReplayEventLogByEventlogid(@Path("eventLogId") eventLogId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookReplayResultDto>

    /**
     * POST api/v1/webhooks/replay/event-log/{eventLogId}/endpoints/{endpointId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param eventLogId 
     * @param endpointId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhookReplayResultDto]>
     */
    @POST("api/v1/webhooks/replay/event-log/{eventLogId}/endpoints/{endpointId}")
    fun postApiV1WebhooksReplayEventLogByEventlogidEndpointsByEndpointid(@Path("eventLogId") eventLogId: java.util.UUID, @Path("endpointId") endpointId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhookReplayResultDto>

}
