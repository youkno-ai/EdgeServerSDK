package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CreatePosCustomerRequest
import ai.youkno.edgeserversdk.models.Customer

interface PointOfSaleControllerApi {
    /**
     * POST api/v1/pointOfSale/customer/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param customerId 
     * @param merchantId 
     * @param createPosCustomerRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/pointOfSale/customer/{customerId}")
    fun createOrUpdateCustomer(@Path("customerId") customerId: kotlin.String, @Query("merchantId") merchantId: kotlin.String, @Body createPosCustomerRequest: CreatePosCustomerRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * GET api/v1/pointOfSale/customer/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param customerId 
     * @param merchantId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Customer]>
     */
    @GET("api/v1/pointOfSale/customer/{customerId}")
    fun getCustomer2(@Path("customerId") customerId: kotlin.String, @Query("merchantId") merchantId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Customer>

}
