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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/pointOfSale/customer/{customerId}")
    fun createOrUpdateCustomer(@Path("customerId") customerId: kotlin.String, @Query("merchantId") merchantId: kotlin.String, @Body createPosCustomerRequest: CreatePosCustomerRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/pointOfSale/customer/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param customerId 
     * @param merchantId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Customer]>
     */
    @GET("api/v1/pointOfSale/customer/{customerId}")
    fun getCustomer2(@Path("customerId") customerId: kotlin.String, @Query("merchantId") merchantId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Customer>

}
