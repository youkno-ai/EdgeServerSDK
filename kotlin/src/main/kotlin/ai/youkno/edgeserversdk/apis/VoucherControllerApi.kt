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
     * POST api/v1/vouchers/{voucherDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherDefId 
     * @param voucherHolder 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Voucher]>
     */
    @POST("api/v1/vouchers/{voucherDefId}")
    fun createVoucher(@Path("voucherDefId") voucherDefId: kotlin.String, @Body voucherHolder: VoucherHolder, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Voucher>

    /**
     * POST api/v1/vouchers/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherDef 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[VoucherDef]>
     */
    @POST("api/v1/vouchers/defs")
    fun createVoucherDef(@Body voucherDef: VoucherDef, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<VoucherDef>

    /**
     * DELETE api/v1/vouchers/defs/{voucherDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherDefId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/vouchers/defs/{voucherDefId}")
    fun deleteVoucherDef(@Path("voucherDefId") voucherDefId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageVoucher]>
     */
    @GET("api/v1/vouchers/scanned")
    fun getScannedVouchers(@Query("order") order: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageVoucher>

    /**
     * GET api/v1/vouchers/{voucherId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Voucher]>
     */
    @GET("api/v1/vouchers/{voucherId}")
    fun getVoucher(@Path("voucherId") voucherId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Voucher>

    /**
     * GET api/v1/vouchers/defs/{voucherDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherDefId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[VoucherDef]>
     */
    @GET("api/v1/vouchers/defs/{voucherDefId}")
    fun getVoucherDef(@Path("voucherDefId") voucherDefId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<VoucherDef>


    /**
    * enum for parameter state
    */
    enum class StateGetVoucherDefs(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageVoucherDef]>
     */
    @GET("api/v1/vouchers/defs")
    fun getVoucherDefs(@Query("state") state: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("order") order: kotlin.String? = null, @Query("voucherIds") voucherIds: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("excludeWithExpDate") excludeWithExpDate: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageVoucherDef>


    /**
    * enum for parameter state
    */
    enum class StateGetVouchers(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageVoucher]>
     */
    @GET("api/v1/vouchers")
    fun getVouchers(@Query("state") state: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("order") order: kotlin.String? = null, @Query("bountyId") bountyId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("tag") tag: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("category") category: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageVoucher>

    /**
     * POST api/v1/vouchers/{voucherId}/redeem
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param voucherId 
     * @param redeemVoucherReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Voucher]>
     */
    @POST("api/v1/vouchers/{voucherId}/redeem")
    fun redeemVoucher(@Path("voucherId") voucherId: kotlin.String, @Body redeemVoucherReq: RedeemVoucherReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Voucher>

}
