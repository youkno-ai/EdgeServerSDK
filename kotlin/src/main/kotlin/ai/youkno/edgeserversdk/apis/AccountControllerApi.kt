package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAccountAmountResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataExchangeCurrencyResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPointCurrency
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSearchCurrenciesFilter
import ai.youkno.edgeserversdk.models.CoedgeappservermodelPointCurrency

import ai.youkno.edgeserversdk.models.*

interface AccountControllerApi {
    /**
     * GET api/v1/account/amount
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param currency  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataAccountAmountResp]>
     */
    @GET("api/v1/account/amount")
    fun getApiV1AccountAmount(@Query("currency") currency: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataAccountAmountResp>

    /**
     * GET api/v1/account/amount_tmp
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param currency  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataAccountAmountResp]>
     */
    @GET("api/v1/account/amount_tmp")
    fun getApiV1AccountAmountTmp(@Query("currency") currency: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataAccountAmountResp>

    /**
     * GET api/v1/account/{code}/currency
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelPointCurrency]>
     */
    @GET("api/v1/account/{code}/currency")
    fun getApiV1AccountByCodeCurrency(@Path("code") code: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelPointCurrency>

    /**
     * GET api/v1/account/companies/{companyId}/amount
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param currency  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataAccountAmountResp]>
     */
    @GET("api/v1/account/companies/{companyId}/amount")
    fun getApiV1AccountCompaniesByCompanyidAmount(@Path("companyId") companyId: kotlin.String, @Query("currency") currency: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataAccountAmountResp>

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataExchangeCurrencyResp]>
     */
    @GET("api/v1/account/companies/{companyId}/currency/{code}/exchange")
    fun getApiV1AccountCompaniesByCompanyidCurrencyByCodeExchange(@Path("companyId") companyId: kotlin.String, @Path("code") code: kotlin.String, @Query("amount") amount: kotlin.Int, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataExchangeCurrencyResp>

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPointCurrency]>
     */
    @GET("api/v1/account/currencies")
    fun getApiV1AccountCurrencies(@Query("code") code: kotlin.String? = null, @Query("codes") codes: kotlin.collections.List<kotlin.String>? = null, @Query("creatorId") creatorId: kotlin.String? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("scope") scope: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Query("name") name: kotlin.String? = null, @Query("equivalentValue") equivalentValue: kotlin.Double? = null, @Query("equivalentCurrency") equivalentCurrency: kotlin.String? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelPointCurrency>

    /**
     * GET api/v1/account/currencies/{code}/exchange
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param amount 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/account/currencies/{code}/exchange")
    fun getApiV1AccountCurrenciesByCodeExchange(@Path("code") code: kotlin.String, @Query("amount") amount: kotlin.Int, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/account/currency/{code}/exchange
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param code 
     * @param amount 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/account/currency/{code}/exchange")
    fun getApiV1AccountCurrencyByCodeExchange(@Path("code") code: kotlin.String, @Query("amount") amount: kotlin.Int, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
