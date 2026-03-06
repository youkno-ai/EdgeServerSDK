package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CreateAlleavesCustomerRequest
import ai.youkno.edgeserversdk.models.Terminal

interface AlleavesControllerApi {
    /**
     * POST api/v1/alleaves/customer/create
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param merchantId 
     * @param createAlleavesCustomerRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/alleaves/customer/create")
    fun createAlleavesCustomer(@Query("merchantId") merchantId: kotlin.String, @Body createAlleavesCustomerRequest: CreateAlleavesCustomerRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/alleaves/{client}/terminals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Terminal>]>
     */
    @GET("api/v1/alleaves/{client}/terminals")
    fun getTerminals(@Path("client") client: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Terminal>>

}
