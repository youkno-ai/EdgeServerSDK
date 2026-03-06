package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.OrderResponse
import ai.youkno.edgeserversdk.models.OrderSummary
import ai.youkno.edgeserversdk.models.PageShoppingCart
import ai.youkno.edgeserversdk.models.ProductInfo
import ai.youkno.edgeserversdk.models.ShoppingCart

interface OpenRetailControllerApi {
    /**
     * POST api/v1/open/retail/carts/{cartId}/items
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param productInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @POST("api/v1/open/retail/carts/{cartId}/items")
    fun addCartItem(@Path("cartId") cartId: kotlin.String, @Body productInfo: ProductInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShoppingCart>

    /**
     * POST api/v1/open/retail/carts
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param shoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @POST("api/v1/open/retail/carts")
    fun createCart(@Body shoppingCart: ShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShoppingCart>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/open/retail/carts/{cartId}")
    fun deleteCart(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

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
     * @return [Call]<[ShoppingCart]>
     */
    @DELETE("api/v1/open/retail/carts/{cartId}/items/{itemId}")
    fun deleteCartItem(@Path("cartId") cartId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShoppingCart>

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
     * @return [Call]<[ShoppingCart]>
     */
    @GET("api/v1/open/retail/carts/{cartId}")
    fun getCart(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShoppingCart>

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
     * @return [Call]<[OrderSummary]>
     */
    @GET("api/v1/open/retail/carts/{cartId}/summary")
    fun getCartSummary(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<OrderSummary>


    /**
    * enum for parameter status
    */
    enum class StatusGetCarts(val value: kotlin.String) {
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
     * @return [Call]<[PageShoppingCart]>
     */
    @GET("api/v1/open/retail/carts")
    fun getCarts(@Query("marketId") marketId: kotlin.String? = null, @Query("status") status: StatusGetCarts? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageShoppingCart>

    /**
     * POST api/v1/open/retail/carts/{cartId}/order
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param shoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[OrderResponse]>
     */
    @POST("api/v1/open/retail/carts/{cartId}/order")
    fun placeOrder(@Path("cartId") cartId: kotlin.String, @Body shoppingCart: ShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<OrderResponse>

    /**
     * PATCH api/v1/open/retail/carts/{cartId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param shoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @PATCH("api/v1/open/retail/carts/{cartId}")
    fun updateCart(@Path("cartId") cartId: kotlin.String, @Body shoppingCart: ShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShoppingCart>

    /**
     * PATCH api/v1/open/retail/carts/{cartId}/items/{itemId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param itemId 
     * @param productInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @PATCH("api/v1/open/retail/carts/{cartId}/items/{itemId}")
    fun updateCartItem(@Path("cartId") cartId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Body productInfo: ProductInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShoppingCart>

}
