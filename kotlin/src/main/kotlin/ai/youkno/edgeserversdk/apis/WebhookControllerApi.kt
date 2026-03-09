package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.EdgeApiDataPageWebhooksWebhookDeliverySummaryDto
import ai.youkno.edgeserversdk.models.EdgeApiDataPageWebhooksWebhookDlqSummaryDto
import ai.youkno.edgeserversdk.models.EdgeApiDataPageWebhooksWebhookEndpointHealthSummaryDto
import ai.youkno.edgeserversdk.models.EdgeApiDataPageWebhooksWebhookEndpointSummaryDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookDeliveryDetailDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookDlqBulkRetryRequestDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookDlqBulkRetryResultDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookDlqDetailDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookEndpointDetailDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookEndpointHealthDetailDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookReplayRangeRequestDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookReplayResultDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookResendDeliveryResultDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookRotateSecretResultDto
import ai.youkno.edgeserversdk.models.WebhooksWebhookTenantHealthSummaryDto

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
     * @return [Call]<[WebhooksWebhookDeliveryDetailDto]>
     */
    @GET("api/v1/webhooks/deliveries/{deliveryId}")
    fun getApiV1WebhooksDeliveriesByDeliveryid(@Path("deliveryId") deliveryId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookDeliveryDetailDto>

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
     * @return [Call]<[EdgeApiDataPageWebhooksWebhookDlqSummaryDto]>
     */
    @GET("api/v1/webhooks/dlq")
    fun getApiV1WebhooksDlq(@Query("endpointId") endpointId: java.util.UUID? = null, @Query("deadReason") deadReason: kotlin.String? = null, @Query("eventType") eventType: kotlin.String? = null, @Query("from") from: kotlin.String? = null, @Query("to") to: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = 50, @Query("offset") offset: kotlin.Int? = 0, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageWebhooksWebhookDlqSummaryDto>

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
     * @return [Call]<[WebhooksWebhookDlqDetailDto]>
     */
    @GET("api/v1/webhooks/dlq/{deliveryId}")
    fun getApiV1WebhooksDlqByDeliveryid(@Path("deliveryId") deliveryId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookDlqDetailDto>

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
     * @return [Call]<[EdgeApiDataPageWebhooksWebhookEndpointSummaryDto]>
     */
    @GET("api/v1/webhooks/endpoints")
    fun getApiV1WebhooksEndpoints(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageWebhooksWebhookEndpointSummaryDto>

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
     * @return [Call]<[WebhooksWebhookEndpointDetailDto]>
     */
    @GET("api/v1/webhooks/endpoints/{endpointId}")
    fun getApiV1WebhooksEndpointsByEndpointid(@Path("endpointId") endpointId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookEndpointDetailDto>

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
     * @return [Call]<[EdgeApiDataPageWebhooksWebhookDeliverySummaryDto]>
     */
    @GET("api/v1/webhooks/endpoints/{endpointId}/deliveries")
    fun getApiV1WebhooksEndpointsByEndpointidDeliveries(@Path("endpointId") endpointId: java.util.UUID, @Query("status") status: kotlin.String? = null, @Query("deadOnly") deadOnly: kotlin.Boolean? = false, @Query("eventType") eventType: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = 50, @Query("offset") offset: kotlin.Int? = 0, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageWebhooksWebhookDeliverySummaryDto>

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
     * @return [Call]<[EdgeApiDataPageWebhooksWebhookEndpointHealthSummaryDto]>
     */
    @GET("api/v1/webhooks/health/endpoints")
    fun getApiV1WebhooksHealthEndpoints(@Query("enabled") enabled: kotlin.Boolean? = null, @Query("circuitState") circuitState: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = 50, @Query("offset") offset: kotlin.Int? = 0, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageWebhooksWebhookEndpointHealthSummaryDto>

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
     * @return [Call]<[WebhooksWebhookEndpointHealthDetailDto]>
     */
    @GET("api/v1/webhooks/health/endpoints/{endpointId}")
    fun getApiV1WebhooksHealthEndpointsByEndpointid(@Path("endpointId") endpointId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookEndpointHealthDetailDto>

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
     * @return [Call]<[WebhooksWebhookTenantHealthSummaryDto]>
     */
    @GET("api/v1/webhooks/health/summary")
    fun getApiV1WebhooksHealthSummary(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookTenantHealthSummaryDto>

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
     * @return [Call]<[WebhooksWebhookResendDeliveryResultDto]>
     */
    @POST("api/v1/webhooks/deliveries/{deliveryId}/resend")
    fun postApiV1WebhooksDeliveriesByDeliveryidResend(@Path("deliveryId") deliveryId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookResendDeliveryResultDto>

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
     * @return [Call]<[WebhooksWebhookResendDeliveryResultDto]>
     */
    @POST("api/v1/webhooks/dlq/{deliveryId}/retry")
    fun postApiV1WebhooksDlqByDeliveryidRetry(@Path("deliveryId") deliveryId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookResendDeliveryResultDto>

    /**
     * POST api/v1/webhooks/dlq/retry
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param webhooksWebhookDlqBulkRetryRequestDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhooksWebhookDlqBulkRetryResultDto]>
     */
    @POST("api/v1/webhooks/dlq/retry")
    fun postApiV1WebhooksDlqRetry(@Body webhooksWebhookDlqBulkRetryRequestDto: WebhooksWebhookDlqBulkRetryRequestDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookDlqBulkRetryResultDto>

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
     * @return [Call]<[WebhooksWebhookRotateSecretResultDto]>
     */
    @POST("api/v1/webhooks/endpoints/{endpointId}/rotate-secret")
    fun postApiV1WebhooksEndpointsByEndpointidRotateSecret(@Path("endpointId") endpointId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookRotateSecretResultDto>

    /**
     * POST api/v1/webhooks/replay
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param webhooksWebhookReplayRangeRequestDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhooksWebhookReplayResultDto]>
     */
    @POST("api/v1/webhooks/replay")
    fun postApiV1WebhooksReplay(@Body webhooksWebhookReplayRangeRequestDto: WebhooksWebhookReplayRangeRequestDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookReplayResultDto>

    /**
     * POST api/v1/webhooks/replay/endpoints/{endpointId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param endpointId 
     * @param webhooksWebhookReplayRangeRequestDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebhooksWebhookReplayResultDto]>
     */
    @POST("api/v1/webhooks/replay/endpoints/{endpointId}")
    fun postApiV1WebhooksReplayEndpointsByEndpointid(@Path("endpointId") endpointId: java.util.UUID, @Body webhooksWebhookReplayRangeRequestDto: WebhooksWebhookReplayRangeRequestDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookReplayResultDto>

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
     * @return [Call]<[WebhooksWebhookReplayResultDto]>
     */
    @POST("api/v1/webhooks/replay/event-log/{eventLogId}")
    fun postApiV1WebhooksReplayEventLogByEventlogid(@Path("eventLogId") eventLogId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookReplayResultDto>

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
     * @return [Call]<[WebhooksWebhookReplayResultDto]>
     */
    @POST("api/v1/webhooks/replay/event-log/{eventLogId}/endpoints/{endpointId}")
    fun postApiV1WebhooksReplayEventLogByEventlogidEndpointsByEndpointid(@Path("eventLogId") eventLogId: java.util.UUID, @Path("endpointId") endpointId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebhooksWebhookReplayResultDto>

}
