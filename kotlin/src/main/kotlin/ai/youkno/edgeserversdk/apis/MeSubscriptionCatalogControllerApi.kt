package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.SubscriptionCatalogComposedView

interface MeSubscriptionCatalogControllerApi {
    /**
     * GET api/v1/me/subscription-catalog/{subscriptionBountyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionBountyId 
     * @param sourceObjectType  (optional)
     * @param sourceObjectId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogComposedView]>
     */
    @GET("api/v1/me/subscription-catalog/{subscriptionBountyId}")
    fun getApiV1MeSubscriptionCatalogBySubscriptionbountyid(@Path("subscriptionBountyId") subscriptionBountyId: kotlin.String, @Query("sourceObjectType") sourceObjectType: kotlin.String? = null, @Query("sourceObjectId") sourceObjectId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogComposedView>

    /**
     * GET api/v1/me/subscription-catalog/code/{subscriptionCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param subscriptionCode 
     * @param sourceObjectType  (optional)
     * @param sourceObjectId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[SubscriptionCatalogComposedView]>
     */
    @GET("api/v1/me/subscription-catalog/code/{subscriptionCode}")
    fun getApiV1MeSubscriptionCatalogCodeBySubscriptioncode(@Path("subscriptionCode") subscriptionCode: kotlin.String, @Query("sourceObjectType") sourceObjectType: kotlin.String? = null, @Query("sourceObjectId") sourceObjectId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SubscriptionCatalogComposedView>

}
