package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AddOrderItemDto
import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.Customer
import ai.youkno.edgeserversdk.models.CycleCountReq
import ai.youkno.edgeserversdk.models.CycleCountResp
import ai.youkno.edgeserversdk.models.DiscountResp
import ai.youkno.edgeserversdk.models.ManageInventoryAdjustReq
import ai.youkno.edgeserversdk.models.ManageInventoryReq
import ai.youkno.edgeserversdk.models.MergeOrdersRequest
import ai.youkno.edgeserversdk.models.Order
import ai.youkno.edgeserversdk.models.PageAdjustReasonResp
import ai.youkno.edgeserversdk.models.PageAreaResp
import ai.youkno.edgeserversdk.models.PageBounty
import ai.youkno.edgeserversdk.models.PageBrandResp
import ai.youkno.edgeserversdk.models.PageCategory
import ai.youkno.edgeserversdk.models.PageCategoryResp
import ai.youkno.edgeserversdk.models.PageCustomer
import ai.youkno.edgeserversdk.models.PageCycleCountResp
import ai.youkno.edgeserversdk.models.PageDeliveryRouteResp
import ai.youkno.edgeserversdk.models.PageInventoryItemResp
import ai.youkno.edgeserversdk.models.PageInventoryResp
import ai.youkno.edgeserversdk.models.PageOrder
import ai.youkno.edgeserversdk.models.PageSearchCycleCountResp
import ai.youkno.edgeserversdk.models.PageStrainResp
import ai.youkno.edgeserversdk.models.PageUomResp
import ai.youkno.edgeserversdk.models.PageUserProfile
import ai.youkno.edgeserversdk.models.PageVendorResp
import ai.youkno.edgeserversdk.models.QueueItemResp
import ai.youkno.edgeserversdk.models.SearchReq
import ai.youkno.edgeserversdk.models.ShoppingCart
import ai.youkno.edgeserversdk.models.TerminalLabelResp
import ai.youkno.edgeserversdk.models.UserProfile

interface PosProxyControllerApi {
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
     * @return [Call]<[Order]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/{posOrderId}/items")
    fun addItemToOrder(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body addOrderItemDto: AddOrderItemDto, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
    fun addQueueItem(@Path("clientId") clientId: kotlin.String, @Query("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<QueueItemResp>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/adjust")
    fun adjustInventoryItems(@Path("clientId") clientId: kotlin.String, @Body manageInventoryAdjustReq: ManageInventoryAdjustReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

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
     * @return [Call]<[Order]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}")
    fun applyDiscount(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("discountId") discountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

    /**
     * POST api/v1/pos/clients/{clientId}/customers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Customer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers")
    fun createCustomer(@Path("clientId") clientId: kotlin.String, @Body customer: Customer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Customer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Customer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_old")
    fun createCustomer1(@Path("clientId") clientId: kotlin.String, @Body customer: Customer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Customer>

    /**
     * POST api/v1/pos/clients/{clientId}/customers_new
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfile]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_new")
    fun createCustomerNew(@Path("clientId") clientId: kotlin.String, @Body customer: Customer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfile>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/cycle_count")
    fun createCycleCount(@Path("clientId") clientId: kotlin.String, @Body cycleCountReq: CycleCountReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

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
    fun createOrderNew(@Path("clientId") clientId: kotlin.String, @Body shoppingCart: ShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * POST api/v1/pos/clients/{clientId}/orders_old
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param order 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Order]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders_old")
    fun createOrderOld(@Path("clientId") clientId: kotlin.String, @Body order: Order, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

    /**
     * POST api/v1/pos/clients/{clientId}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param order 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Order]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders")
    fun createOrderOld1(@Path("clientId") clientId: kotlin.String, @Body order: Order, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun deleteCycleCount(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/queue/{queueId}")
    fun deleteQueueItem(@Path("clientId") clientId: kotlin.String, @Path("queueId") queueId: kotlin.Int, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

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
     * @return [Call]<[PageAdjustReasonResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/adjust_reason")
    fun getAdjustReasons(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageAdjustReasonResp>

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
     * @return [Call]<[PageBrandResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/brand")
    fun getBrands(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageBrandResp>

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
     * @return [Call]<[PageCategoryResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category")
    fun getCategories(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageCategoryResp>

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
     * @return [Call]<[PageCategoryResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category_old")
    fun getCategories1(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageCategoryResp>

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
     * @return [Call]<[PageCategory]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/category_new")
    fun getCategoriesTmp(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageCategory>

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
     * @return [Call]<[Customer]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers/{customerId}")
    fun getCustomer(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Customer>

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
     * @return [Call]<[Customer]>
     */
    @GET("api/v1/pos/clients/{clientId}/customers_old/{customerId}")
    fun getCustomer1(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Customer>

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
    fun getCustomerNew(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfile>

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
     * @return [Call]<[PageBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders_new")
    fun getCustomerOrdersNew(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body searchReq: SearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageBounty>

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
     * @return [Call]<[PageOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders_old")
    fun getCustomerOrdersOld(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body searchReq: SearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageOrder>

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
     * @return [Call]<[PageOrder]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/{customerId}/orders")
    fun getCustomerOrdersOld1(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body searchReq: SearchReq, @Query("completed") completed: kotlin.Boolean? = null, @Query("paidInFull") paidInFull: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageOrder>

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
     * @return [Call]<[CycleCountResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun getCycleCount(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CycleCountResp>

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
     * @return [Call]<[PageCycleCountResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/cycle_count")
    fun getCycleCounts(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageCycleCountResp>

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
     * @return [Call]<[PageDeliveryRouteResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/delivery_route")
    fun getDeliveryRoutes(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageDeliveryRouteResp>

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
     * @return [Call]<[kotlin.collections.List<DiscountResp>]>
     */
    @GET("api/v1/pos/clients/{clientId}/discounts")
    fun getDiscounts(@Path("clientId") clientId: kotlin.String, @Query("customerId") customerId: kotlin.String? = null, @Query("promotionCode") promotionCode: kotlin.Int? = null, @Query("enabledOnly") enabledOnly: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<DiscountResp>>

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
     * @return [Call]<[PageAreaResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/area")
    fun getLocationAreas(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageAreaResp>

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
     * @return [Call]<[Order]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders/{posOrderId}")
    fun getOrder(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
     * @return [Call]<[Order]>
     */
    @GET("api/v1/pos/clients/{clientId}/orders_old/{posOrderId}")
    fun getOrder1(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
     * @param order  (optional)
     * @return [Call]<[PageBounty]>
     */
    @POST("api/v1/pos/clients/{clientId}/orders/bounty")
    fun getOrderAsBounty(@Path("clientId") clientId: kotlin.String, @Query("posOrderIds") posOrderIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null, @Body order: kotlin.collections.List<Order>? = null): Call<PageBounty>

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
    fun getOrderNew(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

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
    fun getQueue(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<QueueItemResp>>

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
     * @return [Call]<[PageStrainResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/strain")
    fun getStrains(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageStrainResp>

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
    fun getTerminalLabels(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<TerminalLabelResp>>

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
     * @return [Call]<[PageUomResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/uom")
    fun getUoms(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageUomResp>

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
     * @return [Call]<[PageVendorResp]>
     */
    @GET("api/v1/pos/clients/{clientId}/inventory/vendor")
    fun getVendors(@Path("clientId") clientId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageVendorResp>

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
     * @return [Call]<[Order]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge_old")
    fun mergeOrders(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body mergeOrdersRequest: MergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
     * @return [Call]<[Order]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}/merge")
    fun mergeOrders1(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body mergeOrdersRequest: MergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
    fun mergeOrdersNew(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body mergeOrdersRequest: MergeOrdersRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/move")
    fun moveInventoryItems(@Path("clientId") clientId: kotlin.String, @Body manageInventoryReq: ManageInventoryReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

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
     * @return [Call]<[Order]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/orders/{posOrderId}/discounts/{discountId}")
    fun removeDiscountFromOrder(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("discountId") discountId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
     * @return [Call]<[Order]>
     */
    @DELETE("api/v1/pos/clients/{clientId}/orders/{posOrderId}/items/{itemId}")
    fun removeItemFromOrder(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Path("itemId") itemId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
     * @return [Call]<[PageCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_old/search")
    fun searchCustomer(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageCustomer>

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
     * @return [Call]<[PageCustomer]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers/search")
    fun searchCustomer1(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageCustomer>

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
     * @return [Call]<[PageUserProfile]>
     */
    @POST("api/v1/pos/clients/{clientId}/customers_new/search")
    fun searchCustomerNew(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageUserProfile>

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
     * @return [Call]<[PageSearchCycleCountResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/search/cycle_count")
    fun searchCycleCounts(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageSearchCycleCountResp>

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
     * @return [Call]<[PageInventoryResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/search")
    fun searchInventory(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageInventoryResp>

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
     * @return [Call]<[PageInventoryItemResp]>
     */
    @POST("api/v1/pos/clients/{clientId}/inventory/item/search")
    fun searchInventoryItems(@Path("clientId") clientId: kotlin.String, @Body searchReq: SearchReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageInventoryItemResp>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param customer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Customer]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers/{customerId}")
    fun updateCustomer(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body customer: Customer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Customer>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers_old/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param customer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Customer]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers_old/{customerId}")
    fun updateCustomer1(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body customer: Customer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Customer>

    /**
     * PUT api/v1/pos/clients/{clientId}/customers_new/{customerId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param customerId 
     * @param customer 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfile]>
     */
    @PUT("api/v1/pos/clients/{clientId}/customers_new/{customerId}")
    fun updateCustomerNew(@Path("clientId") clientId: kotlin.String, @Path("customerId") customerId: kotlin.String, @Body customer: Customer, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfile>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/inventory/cycle_count/{cycle_count_id}")
    fun updateCycleCount(@Path("clientId") clientId: kotlin.String, @Path("cycle_count_id") cycleCountId: kotlin.String, @Body cycleCountReq: CycleCountReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param order 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Order]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders/{posOrderId}")
    fun updateOrder(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.Int, @Body order: Order, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

    /**
     * PUT api/v1/pos/clients/{clientId}/orders_old/{posOrderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param clientId 
     * @param posOrderId 
     * @param order 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Order]>
     */
    @PUT("api/v1/pos/clients/{clientId}/orders_old/{posOrderId}")
    fun updateOrder1(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.Int, @Body order: Order, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Order>

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
    fun updateOrderNew(@Path("clientId") clientId: kotlin.String, @Path("posOrderId") posOrderId: kotlin.String, @Body shoppingCart: ShoppingCart, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

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
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @PUT("api/v1/pos/clients/{clientId}/queue/{queueId}")
    fun updateQueueItemStatus(@Path("clientId") clientId: kotlin.String, @Path("queueId") queueId: kotlin.String, @Query("status") status: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

}
