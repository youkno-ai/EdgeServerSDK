package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.PaymentSummaryResp

interface OpenPaymentControllerApi {
    /**
     * POST api/v1/open/payments/{paymentId}/pay
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
     * @return [Call]<[PaymentSummaryResp]>
     */
    @POST("api/v1/open/payments/{paymentId}/pay")
    fun payPointsOnlyPayment(@Path("paymentId") paymentId: kotlin.String, @Body body: kotlin.Any, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PaymentSummaryResp>

}
