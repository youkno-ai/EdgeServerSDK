package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPaymentMethodInfo
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPaymentMethodInfo

interface PaymentMethodsControllerApi {
    /**
     * DELETE api/v1/payments/methods/{paymentMethodId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param paymentMethodId 
     * @param companyId  (optional)
     * @param liveMode  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/payments/methods/{paymentMethodId}")
    fun deleteApiV1PaymentsMethodsByPaymentmethodid(@Path("paymentMethodId") paymentMethodId: kotlin.String, @Query("companyId") companyId: kotlin.String? = null, @Query("liveMode") liveMode: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * GET api/v1/payments/methods
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId  (optional)
     * @param liveMode  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPaymentMethodInfo]>
     */
    @GET("api/v1/payments/methods")
    fun getApiV1PaymentsMethods(@Query("companyId") companyId: kotlin.String? = null, @Query("liveMode") liveMode: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPaymentMethodInfo>

    /**
     * GET api/v1/payments/methods/{paymentMethodId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param paymentMethodId 
     * @param companyId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPaymentMethodInfo]>
     */
    @GET("api/v1/payments/methods/{paymentMethodId}")
    fun getApiV1PaymentsMethodsByPaymentmethodid(@Path("paymentMethodId") paymentMethodId: kotlin.String, @Query("companyId") companyId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPaymentMethodInfo>

    /**
     * GET api/v1/payments/methods/default
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId  (optional)
     * @param offSession  (optional, default to false)
     * @param liveMode  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPaymentMethodInfo]>
     */
    @GET("api/v1/payments/methods/default")
    fun getApiV1PaymentsMethodsDefault(@Query("companyId") companyId: kotlin.String? = null, @Query("offSession") offSession: kotlin.Boolean? = false, @Query("liveMode") liveMode: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPaymentMethodInfo>

    /**
     * POST api/v1/payments/methods/{paymentMethodId}/default
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param paymentMethodId 
     * @param companyId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPaymentMethodInfo]>
     */
    @POST("api/v1/payments/methods/{paymentMethodId}/default")
    fun postApiV1PaymentsMethodsByPaymentmethodidDefault(@Path("paymentMethodId") paymentMethodId: kotlin.String, @Query("companyId") companyId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPaymentMethodInfo>

}
