package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AccountAmountResp
import ai.youkno.edgeserversdk.models.ExchangeCurrencyResp
import ai.youkno.edgeserversdk.models.PagePointCurrency
import ai.youkno.edgeserversdk.models.PointCurrency
import ai.youkno.edgeserversdk.models.SearchCurrenciesFilter

import ai.youkno.edgeserversdk.models.*

interface AccountControllerApi {
    /**
     * GET api/v1/account/currencies/{code}/exchange
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param amount 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/account/currencies/{code}/exchange")
    fun exchangeCustomCurrency(@Path("code") code: kotlin.String, @Query("amount") amount: kotlin.Int, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/account/currency/{code}/exchange
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param amount 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/account/currency/{code}/exchange")
    fun exchangeCustomCurrency1(@Path("code") code: kotlin.String, @Query("amount") amount: kotlin.Int, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/account/companies/{companyId}/currency/{code}/exchange
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param code 
     * @param amount 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ExchangeCurrencyResp]>
     */
    @GET("api/v1/account/companies/{companyId}/currency/{code}/exchange")
    fun exchangeCustomCurrency_0(@Path("companyId") companyId: kotlin.String, @Path("code") code: kotlin.String, @Query("amount") amount: kotlin.Int, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ExchangeCurrencyResp>

    /**
     * GET api/v1/account/companies/{companyId}/amount
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param currency  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AccountAmountResp]>
     */
    @GET("api/v1/account/companies/{companyId}/amount")
    fun getAccountAmount(@Path("companyId") companyId: kotlin.String, @Query("currency") currency: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AccountAmountResp>

    /**
     * GET api/v1/account/amount
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param currency  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AccountAmountResp]>
     */
    @GET("api/v1/account/amount")
    fun getAccountAmount1(@Query("currency") currency: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AccountAmountResp>

    /**
     * GET api/v1/account/amount_tmp
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param currency  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AccountAmountResp]>
     */
    @GET("api/v1/account/amount_tmp")
    fun getAccountAmount2(@Query("currency") currency: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AccountAmountResp>

    /**
     * GET api/v1/account/currencies
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code  (optional)
     * @param codes  (optional)
     * @param creatorId  (optional)
     * @param companyId  (optional)
     * @param scope  (optional)
     * @param state  (optional)
     * @param name  (optional)
     * @param equivalentValue  (optional)
     * @param equivalentCurrency  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PagePointCurrency]>
     */
    @GET("api/v1/account/currencies")
    fun getCustomCurrencies(@Query("code") code: kotlin.String? = null, @Query("codes") codes: kotlin.collections.List<kotlin.String>? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("scope") scope: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Query("name") name: kotlin.String? = null, @Query("equivalentValue") equivalentValue: kotlin.Double? = null, @Query("equivalentCurrency") equivalentCurrency: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PagePointCurrency>

    /**
     * GET api/v1/account/{code}/currency
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PointCurrency]>
     */
    @GET("api/v1/account/{code}/currency")
    fun getCustomCurrency1(@Path("code") code: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PointCurrency>

}
