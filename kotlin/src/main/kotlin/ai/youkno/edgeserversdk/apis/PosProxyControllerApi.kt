package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.EdgeApiDataPageBounty
import ai.youkno.edgeserversdk.models.EdgeApiDataPageCategory
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataAdjustReasonResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataAreaResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataBrandResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataCategoryResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataCustomer
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataCycleCountResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataDeliveryRouteResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataInventoryItemResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataInventoryResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataOrder
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataSearchCycleCountResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataStrainResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataUomResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPagePosApiDataVendorResp
import ai.youkno.edgeserversdk.models.EdgeApiDataPageUserProfile
import ai.youkno.edgeserversdk.models.PosApiDataAddOrderItemDto
import ai.youkno.edgeserversdk.models.PosApiDataCustomer
import ai.youkno.edgeserversdk.models.PosApiDataCycleCountReq
import ai.youkno.edgeserversdk.models.PosApiDataCycleCountResp
import ai.youkno.edgeserversdk.models.PosApiDataDiscountResp
import ai.youkno.edgeserversdk.models.PosApiDataManageInventoryAdjustReq
import ai.youkno.edgeserversdk.models.PosApiDataManageInventoryReq
import ai.youkno.edgeserversdk.models.PosApiDataMergeOrdersRequest
import ai.youkno.edgeserversdk.models.PosApiDataOrder
import ai.youkno.edgeserversdk.models.PosApiDataQueueItemResp
import ai.youkno.edgeserversdk.models.PosApiDataSearchReq
import ai.youkno.edgeserversdk.models.PosApiDataTerminalLabelResp
import ai.youkno.edgeserversdk.models.ShoppingCart
import ai.youkno.edgeserversdk.models.UserProfile

interface PosProxyControllerApi {
    /**
     * DELETE api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param cycleCountId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun deleteApiV1PosClientsByClientidInventoryCycleCountByCycleCountId(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * DELETE api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param discountId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}")
    fun deleteApiV1PosClientsByClientidOrdersByPosorderidDiscountsByDiscountid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("discountId") discountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * DELETE api/v1/pos/clients/{clientId}/orders/{posOrderId}/items/{itemId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param itemId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/orders/{posOrderId}/items/{itemId}")
    fun deleteApiV1PosClientsByClientidOrdersByPosorderidItemsByItemid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * DELETE api/v1/pos/clients/{clientId}/queue/{queueId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param queueId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/queue/{queueId}")
    fun deleteApiV1PosClientsByClientidQueueByQueueid(@Path("clientId") clientId: kotlin.String, @Path("queueId") queueId: kotlin.Int, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/pos/clients/{clientId}/customers/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers/{customerId}")
    fun getApiV1PosClientsByClientidCustomersByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer>

    /**
     * GET api/v1/pos/clients/{clientId}/customers_new/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfile]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers_new/{customerId}")
    fun getApiV1PosClientsByClientidCustomersNewByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfile>

    /**
     * GET api/v1/pos/clients/{clientId}/customers_old/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers_old/{customerId}")
    fun getApiV1PosClientsByClientidCustomersOldByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer>

    /**
     * GET api/v1/pos/clients/{clientId}/discounts
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId  (optional)
     * @param promotionCode  (optional)
     * @param enabledOnly  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<PosApiDataDiscountResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/discounts")
    fun getApiV1PosClientsByClientidDiscounts(@Path("clientId") clientId: kotlin.String, @Query("customerId") customerId: kotlin.String? = null, @Query("promotionCode") promotionCode: kotlin.Int? = null, @Query("enabledOnly") enabledOnly: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<PosApiDataDiscountResp>>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/adjust_reason
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataAdjustReasonResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/adjust_reason")
    fun getApiV1PosClientsByClientidInventoryAdjustReason(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataAdjustReasonResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/area
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataAreaResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/area")
    fun getApiV1PosClientsByClientidInventoryArea(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataAreaResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/brand
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataBrandResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/brand")
    fun getApiV1PosClientsByClientidInventoryBrand(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataBrandResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/category
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataCategoryResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category")
    fun getApiV1PosClientsByClientidInventoryCategory(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataCategoryResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/category_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPageCategory]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category_new")
    fun getApiV1PosClientsByClientidInventoryCategoryNew(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageCategory>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/category_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataCategoryResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category_old")
    fun getApiV1PosClientsByClientidInventoryCategoryOld(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataCategoryResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/cycle_count
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataCycleCountResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/cycle_count")
    fun getApiV1PosClientsByClientidInventoryCycleCount(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataCycleCountResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param cycleCountId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCycleCountResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun getApiV1PosClientsByClientidInventoryCycleCountByCycleCountId(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCycleCountResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/delivery_route
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataDeliveryRouteResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/delivery_route")
    fun getApiV1PosClientsByClientidInventoryDeliveryRoute(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataDeliveryRouteResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/strain
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataStrainResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/strain")
    fun getApiV1PosClientsByClientidInventoryStrain(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataStrainResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/uom
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataUomResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/uom")
    fun getApiV1PosClientsByClientidInventoryUom(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataUomResp>

    /**
     * GET api/v1/pos/clients/{clientId}/inventory/vendor
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataVendorResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/vendor")
    fun getApiV1PosClientsByClientidInventoryVendor(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataVendorResp>

    /**
     * GET api/v1/pos/clients/{clientId}/orders/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders/{posOrderId}")
    fun getApiV1PosClientsByClientidOrdersByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * GET api/v1/pos/clients/{clientId}/orders_new/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders_new/{posOrderId}")
    fun getApiV1PosClientsByClientidOrdersNewByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * GET api/v1/pos/clients/{clientId}/orders_old/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders_old/{posOrderId}")
    fun getApiV1PosClientsByClientidOrdersOldByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * GET api/v1/pos/clients/{clientId}/queue
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<PosApiDataQueueItemResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/queue")
    fun getApiV1PosClientsByClientidQueue(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<PosApiDataQueueItemResp>>

    /**
     * GET api/v1/pos/clients/{clientId}/terminals/labels
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<PosApiDataTerminalLabelResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/terminals/labels")
    fun getApiV1PosClientsByClientidTerminalsLabels(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<PosApiDataTerminalLabelResp>>

    /**
     * POST api/v1/pos/clients/{clientId}/customers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers")
    fun postApiV1PosClientsByClientidCustomers(@Path("clientId") clientId: kotlin.String, @Body posApiDataCustomer: PosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataSearchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrders(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataSearchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPageBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders_new")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrdersNew(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageBounty>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataSearchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders_old")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrdersOld(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfile]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_new")
    fun postApiV1PosClientsByClientidCustomersNew(@Path("clientId") clientId: kotlin.String, @Body posApiDataCustomer: PosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfile>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_new/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPageUserProfile]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_new/search")
    fun postApiV1PosClientsByClientidCustomersNewSearch(@Path("clientId") clientId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageUserProfile>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_old")
    fun postApiV1PosClientsByClientidCustomersOld(@Path("clientId") clientId: kotlin.String, @Body posApiDataCustomer: PosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_old/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_old/search")
    fun postApiV1PosClientsByClientidCustomersOldSearch(@Path("clientId") clientId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/search")
    fun postApiV1PosClientsByClientidCustomersSearch(@Path("clientId") clientId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/cycle_count
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataCycleCountReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/cycle_count")
    fun postApiV1PosClientsByClientidInventoryCycleCount(@Path("clientId") clientId: kotlin.String, @Body posApiDataCycleCountReq: PosApiDataCycleCountReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/item/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataInventoryItemResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/item/search")
    fun postApiV1PosClientsByClientidInventoryItemSearch(@Path("clientId") clientId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataInventoryItemResp>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataInventoryResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/search")
    fun postApiV1PosClientsByClientidInventorySearch(@Path("clientId") clientId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataInventoryResp>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/search/cycle_count
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPagePosApiDataSearchCycleCountResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/search/cycle_count")
    fun postApiV1PosClientsByClientidInventorySearchCycleCount(@Path("clientId") clientId: kotlin.String, @Body posApiDataSearchReq: PosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPagePosApiDataSearchCycleCountResp>

    /**
     * POST api/v1/pos/clients/{clientId}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataOrder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders")
    fun postApiV1PosClientsByClientidOrders(@Path("clientId") clientId: kotlin.String, @Body posApiDataOrder: PosApiDataOrder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/orders/bounty
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderIds 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @param posApiDataOrder  (optional)
     * @return [Call]<[EdgeApiDataPageBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/bounty")
    fun postApiV1PosClientsByClientidOrdersBounty(@Path("clientId") clientId: kotlin.String, @Query("posOrderIds") posOrderIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body posApiDataOrder: kotlin.collections.List<PosApiDataOrder>? = null): Call<EdgeApiDataPageBounty>

    /**
     * POST api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param discountId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}")
    fun postApiV1PosClientsByClientidOrdersByPosorderidDiscountsByDiscountid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("discountId") discountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/orders/{posOrderId}/items
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param posApiDataAddOrderItemDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/{posOrderId}/items")
    fun postApiV1PosClientsByClientidOrdersByPosorderidItems(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body posApiDataAddOrderItemDto: PosApiDataAddOrderItemDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/orders_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param shoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders_new")
    fun postApiV1PosClientsByClientidOrdersNew(@Path("clientId") clientId: kotlin.String, @Body shoppingCart: ShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * POST api/v1/pos/clients/{clientId}/orders_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataOrder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders_old")
    fun postApiV1PosClientsByClientidOrdersOld(@Path("clientId") clientId: kotlin.String, @Body posApiDataOrder: PosApiDataOrder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/queue
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataQueueItemResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/queue")
    fun postApiV1PosClientsByClientidQueue(@Path("clientId") clientId: kotlin.String, @Query("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataQueueItemResp>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers/{customerId}")
    fun putApiV1PosClientsByClientidCustomersByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataCustomer: PosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers_new/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfile]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers_new/{customerId}")
    fun putApiV1PosClientsByClientidCustomersNewByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataCustomer: PosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfile>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers_old/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers_old/{customerId}")
    fun putApiV1PosClientsByClientidCustomersOldByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataCustomer: PosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/adjust
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataManageInventoryAdjustReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/adjust")
    fun putApiV1PosClientsByClientidInventoryAdjust(@Path("clientId") clientId: kotlin.String, @Body posApiDataManageInventoryAdjustReq: PosApiDataManageInventoryAdjustReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param cycleCountId 
     * @param posApiDataCycleCountReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun putApiV1PosClientsByClientidInventoryCycleCountByCycleCountId(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Body posApiDataCycleCountReq: PosApiDataCycleCountReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/move
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataManageInventoryReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/move")
    fun putApiV1PosClientsByClientidInventoryMove(@Path("clientId") clientId: kotlin.String, @Body posApiDataManageInventoryReq: PosApiDataManageInventoryReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param posApiDataOrder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}")
    fun putApiV1PosClientsByClientidOrdersByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.Int, @Body posApiDataOrder: PosApiDataOrder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param posApiDataMergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMerge(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body posApiDataMergeOrdersRequest: PosApiDataMergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param posApiDataMergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_new")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMergeNew(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body posApiDataMergeOrdersRequest: PosApiDataMergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param posApiDataMergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_old")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMergeOld(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body posApiDataMergeOrdersRequest: PosApiDataMergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders_new/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param shoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders_new/{posOrderId}")
    fun putApiV1PosClientsByClientidOrdersNewByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body shoppingCart: ShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders_old/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param posApiDataOrder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders_old/{posOrderId}")
    fun putApiV1PosClientsByClientidOrdersOldByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.Int, @Body posApiDataOrder: PosApiDataOrder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * PUT api/v1/pos/clients/{clientId}/queue/{queueId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param queueId 
     * @param status 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/queue/{queueId}")
    fun putApiV1PosClientsByClientidQueueByQueueid(@Path("clientId") clientId: kotlin.String, @Path("queueId") queueId: kotlin.String, @Query("status") status: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
