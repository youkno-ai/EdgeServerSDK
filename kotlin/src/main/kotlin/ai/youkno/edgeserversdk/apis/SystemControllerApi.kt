package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AuditLogResult
import ai.youkno.edgeserversdk.models.CountriesResponse
import ai.youkno.edgeserversdk.models.CountryExtraInfo
import ai.youkno.edgeserversdk.models.CurrenciesResponse
import ai.youkno.edgeserversdk.models.DocSearchResult
import ai.youkno.edgeserversdk.models.MxCheckResponse
import ai.youkno.edgeserversdk.models.PageEventLogEntry
import ai.youkno.edgeserversdk.models.PageFrontEndCount
import ai.youkno.edgeserversdk.models.PageOrgTypeResp
import ai.youkno.edgeserversdk.models.SaveCurrencyReq
import ai.youkno.edgeserversdk.models.ShopMeta

interface SystemControllerApi {

    /**
    * enum for parameter verbs
    */
    enum class VerbsGetApiV1SystemAuditLog(val value: kotlin.String) {
        @Json(name = "ASSIGN_COMPANY") ASSIGN_COMPANY("ASSIGN_COMPANY"),
        @Json(name = "USER_CREATED") USER_CREATED("USER_CREATED"),
        @Json(name = "PIN_CHANGED") PIN_CHANGED("PIN_CHANGED"),
        @Json(name = "REFERRAL_CODE_CHANGED") REFERRAL_CODE_CHANGED("REFERRAL_CODE_CHANGED"),
        @Json(name = "BLACKLISTED_CHANGED") BLACKLISTED_CHANGED("BLACKLISTED_CHANGED"),
        @Json(name = "USER_SIGNED_IN") USER_SIGNED_IN("USER_SIGNED_IN"),
        @Json(name = "USER_UPDATED") USER_UPDATED("USER_UPDATED"),
        @Json(name = "ATTACHMENT_ADDED") ATTACHMENT_ADDED("ATTACHMENT_ADDED"),
        @Json(name = "ATTACHMENT_UPDATED") ATTACHMENT_UPDATED("ATTACHMENT_UPDATED"),
        @Json(name = "ATTACHMENT_DELETED") ATTACHMENT_DELETED("ATTACHMENT_DELETED"),
        @Json(name = "TAG_ADDED") TAG_ADDED("TAG_ADDED"),
        @Json(name = "TAG_DELETED") TAG_DELETED("TAG_DELETED"),
        @Json(name = "SHOP_SETTINGS_CHANGED") SHOP_SETTINGS_CHANGED("SHOP_SETTINGS_CHANGED")
    }

    /**
     * GET api/v1/system/audit/log
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param actorId  (optional)
     * @param objectType  (optional)
     * @param objectId  (optional)
     * @param verbs  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AuditLogResult]>
     */
    @GET("api/v1/system/audit/log")
    fun getApiV1SystemAuditLog(@Query("actor_id") actorId: kotlin.String? = null, @Query("object_type") objectType: kotlin.String? = null, @Query("object_id") objectId: kotlin.String? = null, @Query("verbs") verbs: @JvmSuppressWildcards kotlin.collections.Set<kotlin.String>? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AuditLogResult>

    /**
     * GET api/v1/system/countries
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CountriesResponse]>
     */
    @GET("api/v1/system/countries")
    fun getApiV1SystemCountries(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CountriesResponse>

    /**
     * GET api/v1/system/countries/{countryCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param countryCode 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CountryExtraInfo]>
     */
    @GET("api/v1/system/countries/{countryCode}")
    fun getApiV1SystemCountriesByCountrycode(@Path("countryCode") countryCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CountryExtraInfo>

    /**
     * GET api/v1/system/doc-get
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/system/doc-get")
    fun getApiV1SystemDocGet(@Query("id") id: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/system/doc-search
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param s 
     * @param index  (optional)
     * @param start  (optional)
     * @param length  (optional, default to 10)
     * @param type  (optional, default to "ELASTICSEARCH")
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[DocSearchResult]>
     */
    @GET("api/v1/system/doc-search")
    fun getApiV1SystemDocSearch(@Query("s") s: kotlin.String, @Query("index") index: kotlin.String? = null, @Query("start") start: kotlin.String? = null, @Query("length") length: kotlin.Int? = 10, @Query("type") type: kotlin.String? = "ELASTICSEARCH", @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<DocSearchResult>


    /**
    * enum for parameter verb
    */
    enum class VerbGetApiV1SystemEventLog(val value: kotlin.String) {
        @Json(name = "ADD") ADD("ADD"),
        @Json(name = "UPDATE") UPDATE("UPDATE"),
        @Json(name = "DELETE") DELETE("DELETE")
    }

    /**
     * GET api/v1/system/event/log
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param actorId  (optional)
     * @param objectType  (optional)
     * @param objectId  (optional)
     * @param verb  (optional)
     * @param startAt  (optional, default to "0")
     * @param limit  (optional, default to 50)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageEventLogEntry]>
     */
    @GET("api/v1/system/event/log")
    fun getApiV1SystemEventLog(@Query("actor_id") actorId: kotlin.String? = null, @Query("object_type") objectType: kotlin.String? = null, @Query("object_id") objectId: kotlin.String? = null, @Query("verb") verb: @JvmSuppressWildcards kotlin.collections.Set<kotlin.String>? = null, @Query("startAt") startAt: kotlin.String? = "0", @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageEventLogEntry>

    /**
     * GET api/v1/system/front-ends-stats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param latestOnly  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageFrontEndCount]>
     */
    @GET("api/v1/system/front-ends-stats")
    fun getApiV1SystemFrontEndsStats(@Query("latestOnly") latestOnly: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageFrontEndCount>

    /**
     * GET api/v1/system/mx-check
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param email 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[MxCheckResponse]>
     */
    @GET("api/v1/system/mx-check")
    fun getApiV1SystemMxCheck(@Query("email") email: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<MxCheckResponse>

    /**
     * GET api/v1/system/organizations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageOrgTypeResp]>
     */
    @GET("api/v1/system/organizations")
    fun getApiV1SystemOrganizations(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageOrgTypeResp>

    /**
     * GET api/v1/system/shops/{shopId}/meta
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param shopId 
     * @param locationId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ShopMeta]>
     */
    @GET("api/v1/system/shops/{shopId}/meta")
    fun getApiV1SystemShopsByShopidMeta(@Path("shopId") shopId: kotlin.String, @Query("locationId") locationId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShopMeta>

    /**
     * POST api/v1/system/currencies
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param saveCurrencyReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CurrenciesResponse]>
     */
    @POST("api/v1/system/currencies")
    fun postApiV1SystemCurrencies(@Body saveCurrencyReq: SaveCurrencyReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CurrenciesResponse>

}
