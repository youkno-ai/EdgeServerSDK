package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappserverrestcontrollerOpenPaymentControllerPaymentSummaryResp

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverrestcontrollerOpenPaymentControllerPaymentSummaryResp]>
     */
    @POST("api/v1/open/payments/{paymentId}/pay")
    fun postApiV1OpenPaymentsByPaymentidPay(@Path("paymentId") paymentId: kotlin.String, @Body body: kotlin.Any, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverrestcontrollerOpenPaymentControllerPaymentSummaryResp>

}
