package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCreatePosCustomerRequest
import ai.youkno.edgeserversdk.models.CoedgeappserverthirdpartiesposPointOfSaleCustomer

interface PointOfSaleControllerApi {
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
     * @return [Call]<[CoedgeappserverthirdpartiesposPointOfSaleCustomer]>
     */
    @GET("api/v1/pointOfSale/customer/{customerId}")
    fun getApiV1PointofsaleCustomerByCustomerid(@Path("customerId") customerId: kotlin.String, @Query("merchantId") merchantId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverthirdpartiesposPointOfSaleCustomer>

    /**
     * POST api/v1/pointOfSale/customer/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param customerId 
     * @param merchantId 
     * @param coedgeappservermodelEdgeApiDataCreatePosCustomerRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/pointOfSale/customer/{customerId}")
    fun postApiV1PointofsaleCustomerByCustomerid(@Path("customerId") customerId: kotlin.String, @Query("merchantId") merchantId: kotlin.String, @Body coedgeappservermodelEdgeApiDataCreatePosCustomerRequest: CoedgeappservermodelEdgeApiDataCreatePosCustomerRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
