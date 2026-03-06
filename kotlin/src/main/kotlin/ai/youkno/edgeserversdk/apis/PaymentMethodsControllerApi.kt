package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.PagePaymentMethodInfo
import ai.youkno.edgeserversdk.models.PaymentMethodInfo

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/payments/methods/{paymentMethodId}")
    fun deletePaymentMethod(@Path("paymentMethodId") paymentMethodId: java.util.UUID, @Query("companyId") companyId: kotlin.String? = null, @Query("liveMode") liveMode: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PaymentMethodInfo]>
     */
    @GET("api/v1/payments/methods/default")
    fun getDefaultPaymentMethod(@Query("companyId") companyId: kotlin.String? = null, @Query("offSession") offSession: kotlin.Boolean? = false, @Query("liveMode") liveMode: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PaymentMethodInfo>

    /**
     * GET api/v1/payments/methods/{paymentMethodId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param paymentMethodId 
     * @param companyId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PaymentMethodInfo]>
     */
    @GET("api/v1/payments/methods/{paymentMethodId}")
    fun getPaymentMethod(@Path("paymentMethodId") paymentMethodId: java.util.UUID, @Query("companyId") companyId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PaymentMethodInfo>

    /**
     * GET api/v1/payments/methods
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId  (optional)
     * @param liveMode  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PagePaymentMethodInfo]>
     */
    @GET("api/v1/payments/methods")
    fun getPaymentMethods(@Query("companyId") companyId: kotlin.String? = null, @Query("liveMode") liveMode: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PagePaymentMethodInfo>

    /**
     * POST api/v1/payments/methods/{paymentMethodId}/default
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param paymentMethodId 
     * @param companyId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PaymentMethodInfo]>
     */
    @POST("api/v1/payments/methods/{paymentMethodId}/default")
    fun setDefaultPaymentMethod(@Path("paymentMethodId") paymentMethodId: java.util.UUID, @Query("companyId") companyId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PaymentMethodInfo>

}
