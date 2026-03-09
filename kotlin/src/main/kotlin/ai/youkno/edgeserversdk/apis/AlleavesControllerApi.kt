package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.EdgeApiDataCreateAlleavesCustomerRequest
import ai.youkno.edgeserversdk.models.ThirdpartiesPosPointOfSaleTerminal

interface AlleavesControllerApi {
    /**
     * GET api/v1/alleaves/{client}/terminals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<ThirdpartiesPosPointOfSaleTerminal>]>
     */
    @GET("api/v1/alleaves/{client}/terminals")
    fun getApiV1AlleavesByClientTerminals(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<ThirdpartiesPosPointOfSaleTerminal>>

    /**
     * POST api/v1/alleaves/customer/create
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param merchantId 
     * @param edgeApiDataCreateAlleavesCustomerRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/alleaves/customer/create")
    fun postApiV1AlleavesCustomerCreate(@Query("merchantId") merchantId: kotlin.String, @Body edgeApiDataCreateAlleavesCustomerRequest: EdgeApiDataCreateAlleavesCustomerRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
