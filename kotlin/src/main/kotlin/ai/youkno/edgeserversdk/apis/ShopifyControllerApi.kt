package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.ShopifyConnectResponse
import ai.youkno.edgeserversdk.models.ShopifyShopInfo

interface ShopifyControllerApi {
    /**
     * GET api/v1/shopify/app-info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/shopify/app-info")
    fun getAppPage(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/shopify/info
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<ShopifyShopInfo>]>
     */
    @GET("api/v1/shopify/info")
    fun getInfo(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<ShopifyShopInfo>>

    /**
     * GET api/v1/shopify/connect
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param shop 
     * @param redirectUrl 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShopifyConnectResponse]>
     */
    @GET("api/v1/shopify/connect")
    fun getLink1(@Query("shop") shop: kotlin.String, @Query("redirectUrl") redirectUrl: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShopifyConnectResponse>

    /**
     * GET api/v1/shopify/connect/complete
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param shop  (optional)
     * @param code  (optional)
     * @param hmac  (optional)
     * @param state  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/shopify/connect/complete")
    fun shopify(@Query("shop") shop: kotlin.String? = null, @Query("code") code: kotlin.String? = null, @Query("hmac") hmac: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/shopify/gdpr/webhook
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xShopifyHmacSha256  (optional)
     * @param xShopifyTopic  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/shopify/gdpr/webhook")
    fun shopifyGdprWebhook(@Header("X-Shopify-Hmac-Sha256") xShopifyHmacSha256: kotlin.String? = null, @Header("X-Shopify-Topic") xShopifyTopic: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/shopify/webhook
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xShopifyShopDomain  (optional)
     * @param xShopifyHmacSha256  (optional)
     * @param state  (optional)
     * @param webhookType  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/shopify/webhook")
    fun shopifyWebhook(@Header("X-Shopify-Shop-Domain") xShopifyShopDomain: kotlin.String? = null, @Header("X-Shopify-Hmac-Sha256") xShopifyHmacSha256: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Query("webhook_type") webhookType: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

}
