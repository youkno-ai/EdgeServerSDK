package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AddOrderItemDto
import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.CycleCountReq
import ai.youkno.edgeserversdk.models.ManageInventoryAdjustReq
import ai.youkno.edgeserversdk.models.ManageInventoryReq
import ai.youkno.edgeserversdk.models.MergeOrdersRequest
import ai.youkno.edgeserversdk.models.ModelBounty
import ai.youkno.edgeserversdk.models.ModelCategory
import ai.youkno.edgeserversdk.models.ModelUserProfile
import ai.youkno.edgeserversdk.models.PosApiDataAdjustReasonResp
import ai.youkno.edgeserversdk.models.PosApiDataAreaResp
import ai.youkno.edgeserversdk.models.PosApiDataBrandResp
import ai.youkno.edgeserversdk.models.PosApiDataCategoryResp
import ai.youkno.edgeserversdk.models.PosApiDataCustomer
import ai.youkno.edgeserversdk.models.PosApiDataCustomer2
import ai.youkno.edgeserversdk.models.PosApiDataCycleCountResp
import ai.youkno.edgeserversdk.models.PosApiDataCycleCountResp2
import ai.youkno.edgeserversdk.models.PosApiDataDeliveryRouteResp
import ai.youkno.edgeserversdk.models.PosApiDataDiscountResp
import ai.youkno.edgeserversdk.models.PosApiDataInventoryItemResp
import ai.youkno.edgeserversdk.models.PosApiDataInventoryResp
import ai.youkno.edgeserversdk.models.PosApiDataOrder
import ai.youkno.edgeserversdk.models.PosApiDataOrder2
import ai.youkno.edgeserversdk.models.PosApiDataSearchCycleCountResp
import ai.youkno.edgeserversdk.models.PosApiDataStrainResp
import ai.youkno.edgeserversdk.models.PosApiDataUomResp
import ai.youkno.edgeserversdk.models.PosApiDataVendorResp
import ai.youkno.edgeserversdk.models.QueueItemResp
import ai.youkno.edgeserversdk.models.SearchReq
import ai.youkno.edgeserversdk.models.ShoppingCart
import ai.youkno.edgeserversdk.models.TerminalLabelResp
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
     * @return [Call]<[PosApiDataOrder2]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}")
    fun deleteApiV1PosClientsByClientidOrdersByPosorderidDiscountsByDiscountid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("discountId") discountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
     * @return [Call]<[PosApiDataOrder2]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/orders/{posOrderId}/items/{itemId}")
    fun deleteApiV1PosClientsByClientidOrdersByPosorderidItemsByItemid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
     * @return [Call]<[PosApiDataCustomer2]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers/{customerId}")
    fun getApiV1PosClientsByClientidCustomersByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer2>

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
     * @return [Call]<[PosApiDataCustomer2]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers_old/{customerId}")
    fun getApiV1PosClientsByClientidCustomersOldByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer2>

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
     * @return [Call]<[PosApiDataAdjustReasonResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/adjust_reason")
    fun getApiV1PosClientsByClientidInventoryAdjustReason(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataAdjustReasonResp>

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
     * @return [Call]<[PosApiDataAreaResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/area")
    fun getApiV1PosClientsByClientidInventoryArea(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataAreaResp>

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
     * @return [Call]<[PosApiDataBrandResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/brand")
    fun getApiV1PosClientsByClientidInventoryBrand(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataBrandResp>

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
     * @return [Call]<[PosApiDataCategoryResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category")
    fun getApiV1PosClientsByClientidInventoryCategory(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCategoryResp>

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
     * @return [Call]<[ModelCategory]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category_new")
    fun getApiV1PosClientsByClientidInventoryCategoryNew(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ModelCategory>

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
     * @return [Call]<[PosApiDataCategoryResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category_old")
    fun getApiV1PosClientsByClientidInventoryCategoryOld(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCategoryResp>

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
     * @return [Call]<[PosApiDataCycleCountResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/cycle_count")
    fun getApiV1PosClientsByClientidInventoryCycleCount(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCycleCountResp>

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
     * @return [Call]<[PosApiDataCycleCountResp2]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun getApiV1PosClientsByClientidInventoryCycleCountByCycleCountId(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCycleCountResp2>

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
     * @return [Call]<[PosApiDataDeliveryRouteResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/delivery_route")
    fun getApiV1PosClientsByClientidInventoryDeliveryRoute(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataDeliveryRouteResp>

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
     * @return [Call]<[PosApiDataStrainResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/strain")
    fun getApiV1PosClientsByClientidInventoryStrain(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataStrainResp>

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
     * @return [Call]<[PosApiDataUomResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/uom")
    fun getApiV1PosClientsByClientidInventoryUom(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataUomResp>

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
     * @return [Call]<[PosApiDataVendorResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/vendor")
    fun getApiV1PosClientsByClientidInventoryVendor(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataVendorResp>

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
     * @return [Call]<[PosApiDataOrder2]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders/{posOrderId}")
    fun getApiV1PosClientsByClientidOrdersByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
     * @return [Call]<[PosApiDataOrder2]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders_old/{posOrderId}")
    fun getApiV1PosClientsByClientidOrdersOldByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
     * @return [Call]<[kotlin.collections.List<QueueItemResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/queue")
    fun getApiV1PosClientsByClientidQueue(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<QueueItemResp>>

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
     * @return [Call]<[kotlin.collections.List<TerminalLabelResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/terminals/labels")
    fun getApiV1PosClientsByClientidTerminalsLabels(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<TerminalLabelResp>>

    /**
     * POST api/v1/pos/clients/{clientId}/customers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataCustomer2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer2]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers")
    fun postApiV1PosClientsByClientidCustomers(@Path("clientId") clientId: kotlin.String, @Body posApiDataCustomer2: PosApiDataCustomer2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer2>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param searchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrders(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body searchReq: SearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param searchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ModelBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders_new")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrdersNew(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body searchReq: SearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ModelBounty>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param searchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders_old")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrdersOld(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body searchReq: SearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataCustomer2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfile]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_new")
    fun postApiV1PosClientsByClientidCustomersNew(@Path("clientId") clientId: kotlin.String, @Body posApiDataCustomer2: PosApiDataCustomer2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfile>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_new/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param searchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ModelUserProfile]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_new/search")
    fun postApiV1PosClientsByClientidCustomersNewSearch(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ModelUserProfile>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataCustomer2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer2]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_old")
    fun postApiV1PosClientsByClientidCustomersOld(@Path("clientId") clientId: kotlin.String, @Body posApiDataCustomer2: PosApiDataCustomer2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer2>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_old/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param searchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_old/search")
    fun postApiV1PosClientsByClientidCustomersOldSearch(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param searchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/search")
    fun postApiV1PosClientsByClientidCustomersSearch(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/cycle_count
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param cycleCountReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/cycle_count")
    fun postApiV1PosClientsByClientidInventoryCycleCount(@Path("clientId") clientId: kotlin.String, @Body cycleCountReq: CycleCountReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/item/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param searchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataInventoryItemResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/item/search")
    fun postApiV1PosClientsByClientidInventoryItemSearch(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataInventoryItemResp>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param searchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataInventoryResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/search")
    fun postApiV1PosClientsByClientidInventorySearch(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataInventoryResp>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/search/cycle_count
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param searchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataSearchCycleCountResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/search/cycle_count")
    fun postApiV1PosClientsByClientidInventorySearchCycleCount(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataSearchCycleCountResp>

    /**
     * POST api/v1/pos/clients/{clientId}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posApiDataOrder2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder2]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders")
    fun postApiV1PosClientsByClientidOrders(@Path("clientId") clientId: kotlin.String, @Body posApiDataOrder2: PosApiDataOrder2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
     * @param posApiDataOrder2  (optional)
     * @return [Call]<[ModelBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/bounty")
    fun postApiV1PosClientsByClientidOrdersBounty(@Path("clientId") clientId: kotlin.String, @Query("posOrderIds") posOrderIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body posApiDataOrder2: kotlin.collections.List<PosApiDataOrder2>? = null): Call<ModelBounty>

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
     * @return [Call]<[PosApiDataOrder2]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}")
    fun postApiV1PosClientsByClientidOrdersByPosorderidDiscountsByDiscountid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("discountId") discountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

    /**
     * POST api/v1/pos/clients/{clientId}/orders/{posOrderId}/items
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param addOrderItemDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder2]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/{posOrderId}/items")
    fun postApiV1PosClientsByClientidOrdersByPosorderidItems(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body addOrderItemDto: AddOrderItemDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
     * @param posApiDataOrder2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder2]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders_old")
    fun postApiV1PosClientsByClientidOrdersOld(@Path("clientId") clientId: kotlin.String, @Body posApiDataOrder2: PosApiDataOrder2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
     * @return [Call]<[QueueItemResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/queue")
    fun postApiV1PosClientsByClientidQueue(@Path("clientId") clientId: kotlin.String, @Query("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<QueueItemResp>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataCustomer2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer2]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers/{customerId}")
    fun putApiV1PosClientsByClientidCustomersByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataCustomer2: PosApiDataCustomer2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer2>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers_new/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataCustomer2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfile]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers_new/{customerId}")
    fun putApiV1PosClientsByClientidCustomersNewByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataCustomer2: PosApiDataCustomer2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfile>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers_old/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param posApiDataCustomer2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataCustomer2]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers_old/{customerId}")
    fun putApiV1PosClientsByClientidCustomersOldByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body posApiDataCustomer2: PosApiDataCustomer2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataCustomer2>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/adjust
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param manageInventoryAdjustReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/adjust")
    fun putApiV1PosClientsByClientidInventoryAdjust(@Path("clientId") clientId: kotlin.String, @Body manageInventoryAdjustReq: ManageInventoryAdjustReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param cycleCountId 
     * @param cycleCountReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun putApiV1PosClientsByClientidInventoryCycleCountByCycleCountId(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Body cycleCountReq: CycleCountReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/move
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param manageInventoryReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/move")
    fun putApiV1PosClientsByClientidInventoryMove(@Path("clientId") clientId: kotlin.String, @Body manageInventoryReq: ManageInventoryReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param posApiDataOrder2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder2]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}")
    fun putApiV1PosClientsByClientidOrdersByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.Int, @Body posApiDataOrder2: PosApiDataOrder2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param mergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder2]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMerge(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body mergeOrdersRequest: MergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param mergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_new")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMergeNew(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body mergeOrdersRequest: MergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param mergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder2]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_old")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMergeOld(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body mergeOrdersRequest: MergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
     * @param posApiDataOrder2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PosApiDataOrder2]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders_old/{posOrderId}")
    fun putApiV1PosClientsByClientidOrdersOldByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.Int, @Body posApiDataOrder2: PosApiDataOrder2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PosApiDataOrder2>

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
