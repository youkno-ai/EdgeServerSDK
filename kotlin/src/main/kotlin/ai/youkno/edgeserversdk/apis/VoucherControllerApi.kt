package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.PageVoucher
import ai.youkno.edgeserversdk.models.PageVoucherDef
import ai.youkno.edgeserversdk.models.RedeemVoucherReq
import ai.youkno.edgeserversdk.models.Voucher
import ai.youkno.edgeserversdk.models.VoucherDef
import ai.youkno.edgeserversdk.models.VoucherHolder

interface VoucherControllerApi {
    /**
     * DELETE api/v1/vouchers/defs/{voucherDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherDefId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/vouchers/defs/{voucherDefId}")
    fun deleteApiV1VouchersDefsByVoucherdefid(@Path("voucherDefId") voucherDefId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>


    /**
    * enum for parameter state
    */
    enum class StateGetApiV1Vouchers(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "PENDING") PENDING("PENDING"),
        @Json(name = "ACTIVE") ACTIVE("ACTIVE"),
        @Json(name = "REDEEMED") REDEEMED("REDEEMED"),
        @Json(name = "CANCELED") CANCELED("CANCELED"),
        @Json(name = "EXPIRED") EXPIRED("EXPIRED"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/vouchers
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state  (optional)
     * @param order  (optional)
     * @param bountyId  (optional)
     * @param tag  (optional)
     * @param category  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageVoucher]>
     */
    @GET("api/v1/vouchers")
    fun getApiV1Vouchers(@Query("state") state: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("order") order: kotlin.String? = null, @Query("bountyId") bountyId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageVoucher>

    /**
     * GET api/v1/vouchers/{voucherId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Voucher]>
     */
    @GET("api/v1/vouchers/{voucherId}")
    fun getApiV1VouchersByVoucherid(@Path("voucherId") voucherId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Voucher>


    /**
    * enum for parameter state
    */
    enum class StateGetApiV1VouchersDefs(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "PENDING") PENDING("PENDING"),
        @Json(name = "ACTIVE") ACTIVE("ACTIVE"),
        @Json(name = "REDEEMED") REDEEMED("REDEEMED"),
        @Json(name = "CANCELED") CANCELED("CANCELED"),
        @Json(name = "EXPIRED") EXPIRED("EXPIRED"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/vouchers/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state  (optional)
     * @param order  (optional)
     * @param voucherIds  (optional)
     * @param excludeWithExpDate  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageVoucherDef]>
     */
    @GET("api/v1/vouchers/defs")
    fun getApiV1VouchersDefs(@Query("state") state: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("order") order: kotlin.String? = null, @Query("voucherIds") voucherIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageVoucherDef>

    /**
     * GET api/v1/vouchers/defs/{voucherDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherDefId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[VoucherDef]>
     */
    @GET("api/v1/vouchers/defs/{voucherDefId}")
    fun getApiV1VouchersDefsByVoucherdefid(@Path("voucherDefId") voucherDefId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<VoucherDef>

    /**
     * GET api/v1/vouchers/scanned
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param order  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageVoucher]>
     */
    @GET("api/v1/vouchers/scanned")
    fun getApiV1VouchersScanned(@Query("order") order: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageVoucher>

    /**
     * POST api/v1/vouchers/{voucherDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherDefId 
     * @param voucherHolder 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Voucher]>
     */
    @POST("api/v1/vouchers/{voucherDefId}")
    fun postApiV1VouchersByVoucherdefid(@Path("voucherDefId") voucherDefId: kotlin.String, @Body voucherHolder: VoucherHolder, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Voucher>

    /**
     * POST api/v1/vouchers/{voucherId}/redeem
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherId 
     * @param redeemVoucherReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Voucher]>
     */
    @POST("api/v1/vouchers/{voucherId}/redeem")
    fun postApiV1VouchersByVoucheridRedeem(@Path("voucherId") voucherId: kotlin.String, @Body redeemVoucherReq: RedeemVoucherReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Voucher>

    /**
     * POST api/v1/vouchers/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[VoucherDef]>
     */
    @POST("api/v1/vouchers/defs")
    fun postApiV1VouchersDefs(@Body voucherDef: VoucherDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<VoucherDef>

}
