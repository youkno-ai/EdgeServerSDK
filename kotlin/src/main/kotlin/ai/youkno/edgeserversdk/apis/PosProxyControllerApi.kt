package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelBounty
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataAdjustReasonResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataAreaResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataBrandResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCategoryResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCustomer
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCycleCountResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataDeliveryRouteResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataInventoryItemResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataInventoryResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataOrder
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataSearchCycleCountResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataStrainResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataUomResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataVendorResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserProfile
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappserverservicemodelCategory
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataAddOrderItemDto
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataCustomer
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataCycleCountReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataCycleCountResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataDiscountResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataManageInventoryAdjustReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataManageInventoryReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataMergeOrdersRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataOrder
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataQueueItemResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataSearchReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPosApiDataTerminalLabelResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelShoppingCart
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUserProfile

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
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}")
    fun deleteApiV1PosClientsByClientidOrdersByPosorderidDiscountsByDiscountid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("discountId") discountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

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
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/orders/{posOrderId}/items/{itemId}")
    fun deleteApiV1PosClientsByClientidOrdersByPosorderidItemsByItemid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

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
     * @return [Call]<[CoedgeappservermodelPosApiDataCustomer]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers/{customerId}")
    fun getApiV1PosClientsByClientidCustomersByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataCustomer>

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
     * @return [Call]<[CoedgeappservermodelUserProfile]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers_new/{customerId}")
    fun getApiV1PosClientsByClientidCustomersNewByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserProfile>

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
     * @return [Call]<[CoedgeappservermodelPosApiDataCustomer]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers_old/{customerId}")
    fun getApiV1PosClientsByClientidCustomersOldByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataCustomer>

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
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelPosApiDataDiscountResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/discounts")
    fun getApiV1PosClientsByClientidDiscounts(@Path("clientId") clientId: kotlin.String, @Query("customerId") customerId: kotlin.String? = null, @Query("promotionCode") promotionCode: kotlin.Int? = null, @Query("enabledOnly") enabledOnly: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelPosApiDataDiscountResp>>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataAdjustReasonResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/adjust_reason")
    fun getApiV1PosClientsByClientidInventoryAdjustReason(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataAdjustReasonResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataAreaResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/area")
    fun getApiV1PosClientsByClientidInventoryArea(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataAreaResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataBrandResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/brand")
    fun getApiV1PosClientsByClientidInventoryBrand(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataBrandResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCategoryResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category")
    fun getApiV1PosClientsByClientidInventoryCategory(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCategoryResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappserverservicemodelCategory]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category_new")
    fun getApiV1PosClientsByClientidInventoryCategoryNew(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappserverservicemodelCategory>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCategoryResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category_old")
    fun getApiV1PosClientsByClientidInventoryCategoryOld(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCategoryResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCycleCountResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/cycle_count")
    fun getApiV1PosClientsByClientidInventoryCycleCount(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCycleCountResp>

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
     * @return [Call]<[CoedgeappservermodelPosApiDataCycleCountResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun getApiV1PosClientsByClientidInventoryCycleCountByCycleCountId(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataCycleCountResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataDeliveryRouteResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/delivery_route")
    fun getApiV1PosClientsByClientidInventoryDeliveryRoute(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataDeliveryRouteResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataStrainResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/strain")
    fun getApiV1PosClientsByClientidInventoryStrain(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataStrainResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataUomResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/uom")
    fun getApiV1PosClientsByClientidInventoryUom(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataUomResp>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataVendorResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/vendor")
    fun getApiV1PosClientsByClientidInventoryVendor(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataVendorResp>

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
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders/{posOrderId}")
    fun getApiV1PosClientsByClientidOrdersByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

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
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders_new/{posOrderId}")
    fun getApiV1PosClientsByClientidOrdersNewByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

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
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders_old/{posOrderId}")
    fun getApiV1PosClientsByClientidOrdersOldByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

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
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelPosApiDataQueueItemResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/queue")
    fun getApiV1PosClientsByClientidQueue(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelPosApiDataQueueItemResp>>

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
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelPosApiDataTerminalLabelResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/terminals/labels")
    fun getApiV1PosClientsByClientidTerminalsLabels(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelPosApiDataTerminalLabelResp>>

    /**
     * POST api/v1/pos/clients/{clientId}/customers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers")
    fun postApiV1PosClientsByClientidCustomers(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataCustomer: CoedgeappservermodelPosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrders(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders_new")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrdersNew(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/{customerId}/orders_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param completed  (optional)
     * @param paidInFull  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders_old")
    fun postApiV1PosClientsByClientidCustomersByCustomeridOrdersOld(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserProfile]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_new")
    fun postApiV1PosClientsByClientidCustomersNew(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataCustomer: CoedgeappservermodelPosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserProfile>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_new/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserProfile]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_new/search")
    fun postApiV1PosClientsByClientidCustomersNewSearch(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelUserProfile>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_old")
    fun postApiV1PosClientsByClientidCustomersOld(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataCustomer: CoedgeappservermodelPosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_old/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_old/search")
    fun postApiV1PosClientsByClientidCustomersOldSearch(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/search")
    fun postApiV1PosClientsByClientidCustomersSearch(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataCustomer>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/cycle_count
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataCycleCountReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/cycle_count")
    fun postApiV1PosClientsByClientidInventoryCycleCount(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataCycleCountReq: CoedgeappservermodelPosApiDataCycleCountReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/item/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataInventoryItemResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/item/search")
    fun postApiV1PosClientsByClientidInventoryItemSearch(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataInventoryItemResp>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataInventoryResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/search")
    fun postApiV1PosClientsByClientidInventorySearch(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataInventoryResp>

    /**
     * POST api/v1/pos/clients/{clientId}/inventory/search/cycle_count
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataSearchReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataSearchCycleCountResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/search/cycle_count")
    fun postApiV1PosClientsByClientidInventorySearchCycleCount(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataSearchReq: CoedgeappservermodelPosApiDataSearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPosApiDataSearchCycleCountResp>

    /**
     * POST api/v1/pos/clients/{clientId}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataOrder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders")
    fun postApiV1PosClientsByClientidOrders(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataOrder: CoedgeappservermodelPosApiDataOrder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

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
     * @param coedgeappservermodelPosApiDataOrder  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/bounty")
    fun postApiV1PosClientsByClientidOrdersBounty(@Path("clientId") clientId: kotlin.String, @Query("posOrderIds") posOrderIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body coedgeappservermodelPosApiDataOrder: kotlin.collections.List<CoedgeappservermodelPosApiDataOrder>? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBounty>

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
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}")
    fun postApiV1PosClientsByClientidOrdersByPosorderidDiscountsByDiscountid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("discountId") discountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/orders/{posOrderId}/items
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param coedgeappservermodelPosApiDataAddOrderItemDto 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/{posOrderId}/items")
    fun postApiV1PosClientsByClientidOrdersByPosorderidItems(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body coedgeappservermodelPosApiDataAddOrderItemDto: CoedgeappservermodelPosApiDataAddOrderItemDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

    /**
     * POST api/v1/pos/clients/{clientId}/orders_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelShoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders_new")
    fun postApiV1PosClientsByClientidOrdersNew(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelShoppingCart: CoedgeappservermodelShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * POST api/v1/pos/clients/{clientId}/orders_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataOrder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders_old")
    fun postApiV1PosClientsByClientidOrdersOld(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataOrder: CoedgeappservermodelPosApiDataOrder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

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
     * @return [Call]<[CoedgeappservermodelPosApiDataQueueItemResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/queue")
    fun postApiV1PosClientsByClientidQueue(@Path("clientId") clientId: kotlin.String, @Query("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataQueueItemResp>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param coedgeappservermodelPosApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataCustomer]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers/{customerId}")
    fun putApiV1PosClientsByClientidCustomersByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body coedgeappservermodelPosApiDataCustomer: CoedgeappservermodelPosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataCustomer>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers_new/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param coedgeappservermodelPosApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserProfile]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers_new/{customerId}")
    fun putApiV1PosClientsByClientidCustomersNewByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body coedgeappservermodelPosApiDataCustomer: CoedgeappservermodelPosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserProfile>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers_old/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param coedgeappservermodelPosApiDataCustomer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataCustomer]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers_old/{customerId}")
    fun putApiV1PosClientsByClientidCustomersOldByCustomerid(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body coedgeappservermodelPosApiDataCustomer: CoedgeappservermodelPosApiDataCustomer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataCustomer>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/adjust
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataManageInventoryAdjustReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/adjust")
    fun putApiV1PosClientsByClientidInventoryAdjust(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataManageInventoryAdjustReq: CoedgeappservermodelPosApiDataManageInventoryAdjustReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param cycleCountId 
     * @param coedgeappservermodelPosApiDataCycleCountReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun putApiV1PosClientsByClientidInventoryCycleCountByCycleCountId(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Body coedgeappservermodelPosApiDataCycleCountReq: CoedgeappservermodelPosApiDataCycleCountReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/inventory/move
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param coedgeappservermodelPosApiDataManageInventoryReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/move")
    fun putApiV1PosClientsByClientidInventoryMove(@Path("clientId") clientId: kotlin.String, @Body coedgeappservermodelPosApiDataManageInventoryReq: CoedgeappservermodelPosApiDataManageInventoryReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param coedgeappservermodelPosApiDataOrder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}")
    fun putApiV1PosClientsByClientidOrdersByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.Int, @Body coedgeappservermodelPosApiDataOrder: CoedgeappservermodelPosApiDataOrder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param coedgeappservermodelPosApiDataMergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMerge(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body coedgeappservermodelPosApiDataMergeOrdersRequest: CoedgeappservermodelPosApiDataMergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param coedgeappservermodelPosApiDataMergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_new")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMergeNew(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body coedgeappservermodelPosApiDataMergeOrdersRequest: CoedgeappservermodelPosApiDataMergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param coedgeappservermodelPosApiDataMergeOrdersRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_old")
    fun putApiV1PosClientsByClientidOrdersByPosorderidMergeOld(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body coedgeappservermodelPosApiDataMergeOrdersRequest: CoedgeappservermodelPosApiDataMergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders_new/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param coedgeappservermodelShoppingCart 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders_new/{posOrderId}")
    fun putApiV1PosClientsByClientidOrdersNewByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body coedgeappservermodelShoppingCart: CoedgeappservermodelShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders_old/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param coedgeappservermodelPosApiDataOrder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPosApiDataOrder]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders_old/{posOrderId}")
    fun putApiV1PosClientsByClientidOrdersOldByPosorderid(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.Int, @Body coedgeappservermodelPosApiDataOrder: CoedgeappservermodelPosApiDataOrder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPosApiDataOrder>

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
