package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataOrderResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelShoppingCart
import ai.youkno.edgeserversdk.models.CoedgeappservermodelShoppingCart
import ai.youkno.edgeserversdk.models.CoedgeappservermodelShoppingCartOrderSummary
import ai.youkno.edgeserversdk.models.CoedgeappservermodelShoppingCartProductInfo

interface OpenRetailControllerApi {
    /**
     * DELETE api/v1/open/retail/carts/{cartId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/open/retail/carts/{cartId}")
    fun deleteApiV1OpenRetailCartsByCartid(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * DELETE api/v1/open/retail/carts/{cartId}/items/{itemId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param itemId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelShoppingCart]>
     */
    @DELETE("api/v1/open/retail/carts/{cartId}/items/{itemId}")
    fun deleteApiV1OpenRetailCartsByCartidItemsByItemid(@Path("cartId") cartId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShoppingCart>


    /**
    * enum for parameter status
    */
    enum class StatusGetApiV1OpenRetailCarts(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "ACTIVE") ACTIVE("ACTIVE"),
        @Json(name = "ABANDONED") ABANDONED("ABANDONED"),
        @Json(name = "CLOSED") CLOSED("CLOSED"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/open/retail/carts
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param marketId  (optional)
     * @param status  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelShoppingCart]>
     */
    @GET("api/v1/open/retail/carts")
    fun getApiV1OpenRetailCarts(@Query("marketId") marketId: kotlin.String? = null, @Query("status") status: StatusGetApiV1OpenRetailCarts? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelShoppingCart>

    /**
     * GET api/v1/open/retail/carts/{cartId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelShoppingCart]>
     */
    @GET("api/v1/open/retail/carts/{cartId}")
    fun getApiV1OpenRetailCartsByCartid(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShoppingCart>

    /**
     * GET api/v1/open/retail/carts/{cartId}/summary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelShoppingCartOrderSummary]>
     */
    @GET("api/v1/open/retail/carts/{cartId}/summary")
    fun getApiV1OpenRetailCartsByCartidSummary(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShoppingCartOrderSummary>

    /**
     * PATCH api/v1/open/retail/carts/{cartId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param coedgeappservermodelShoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelShoppingCart]>
     */
    @PATCH("api/v1/open/retail/carts/{cartId}")
    fun patchApiV1OpenRetailCartsByCartid(@Path("cartId") cartId: kotlin.String, @Body coedgeappservermodelShoppingCart: CoedgeappservermodelShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShoppingCart>

    /**
     * PATCH api/v1/open/retail/carts/{cartId}/items/{itemId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param itemId 
     * @param coedgeappservermodelShoppingCartProductInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelShoppingCart]>
     */
    @PATCH("api/v1/open/retail/carts/{cartId}/items/{itemId}")
    fun patchApiV1OpenRetailCartsByCartidItemsByItemid(@Path("cartId") cartId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Body coedgeappservermodelShoppingCartProductInfo: CoedgeappservermodelShoppingCartProductInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShoppingCart>

    /**
     * POST api/v1/open/retail/carts
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelShoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelShoppingCart]>
     */
    @POST("api/v1/open/retail/carts")
    fun postApiV1OpenRetailCarts(@Body coedgeappservermodelShoppingCart: CoedgeappservermodelShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShoppingCart>

    /**
     * POST api/v1/open/retail/carts/{cartId}/items
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param coedgeappservermodelShoppingCartProductInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelShoppingCart]>
     */
    @POST("api/v1/open/retail/carts/{cartId}/items")
    fun postApiV1OpenRetailCartsByCartidItems(@Path("cartId") cartId: kotlin.String, @Body coedgeappservermodelShoppingCartProductInfo: CoedgeappservermodelShoppingCartProductInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShoppingCart>

    /**
     * POST api/v1/open/retail/carts/{cartId}/order
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param coedgeappservermodelShoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataOrderResponse]>
     */
    @POST("api/v1/open/retail/carts/{cartId}/order")
    fun postApiV1OpenRetailCartsByCartidOrder(@Path("cartId") cartId: kotlin.String, @Body coedgeappservermodelShoppingCart: CoedgeappservermodelShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataOrderResponse>

}
