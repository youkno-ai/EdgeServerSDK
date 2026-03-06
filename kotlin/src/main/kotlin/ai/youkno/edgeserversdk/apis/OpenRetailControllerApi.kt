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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @POST("api/v1/open/retail/carts/{cartId}/items")
    fun addCartItem(@Path("cartId") cartId: kotlin.String, @Body productInfo: ProductInfo, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShoppingCart>

    /**
     * POST api/v1/open/retail/carts
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param shoppingCart 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @POST("api/v1/open/retail/carts")
    fun createCart(@Body shoppingCart: ShoppingCart, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShoppingCart>

    /**
     * DELETE api/v1/open/retail/carts/{cartId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/open/retail/carts/{cartId}")
    fun deleteCart(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * DELETE api/v1/open/retail/carts/{cartId}/items/{itemId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param itemId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @DELETE("api/v1/open/retail/carts/{cartId}/items/{itemId}")
    fun deleteCartItem(@Path("cartId") cartId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShoppingCart>

    /**
     * GET api/v1/open/retail/carts/{cartId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @GET("api/v1/open/retail/carts/{cartId}")
    fun getCart(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShoppingCart>

    /**
     * GET api/v1/open/retail/carts/{cartId}/summary
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[OrderSummary]>
     */
    @GET("api/v1/open/retail/carts/{cartId}/summary")
    fun getCartSummary(@Path("cartId") cartId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<OrderSummary>


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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageShoppingCart]>
     */
    @GET("api/v1/open/retail/carts")
    fun getCarts(@Query("marketId") marketId: kotlin.String? = null, @Query("status") status: StatusGetCarts? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageShoppingCart>

    /**
     * POST api/v1/open/retail/carts/{cartId}/order
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param shoppingCart 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[OrderResponse]>
     */
    @POST("api/v1/open/retail/carts/{cartId}/order")
    fun placeOrder(@Path("cartId") cartId: kotlin.String, @Body shoppingCart: ShoppingCart, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<OrderResponse>

    /**
     * PATCH api/v1/open/retail/carts/{cartId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param cartId 
     * @param shoppingCart 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @PATCH("api/v1/open/retail/carts/{cartId}")
    fun updateCart(@Path("cartId") cartId: kotlin.String, @Body shoppingCart: ShoppingCart, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShoppingCart>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShoppingCart]>
     */
    @PATCH("api/v1/open/retail/carts/{cartId}/items/{itemId}")
    fun updateCartItem(@Path("cartId") cartId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Body productInfo: ProductInfo, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShoppingCart>

}
