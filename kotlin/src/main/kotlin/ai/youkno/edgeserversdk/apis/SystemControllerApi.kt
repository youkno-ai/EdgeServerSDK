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
     * GET api/v1/system/mx-check
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param email 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[MxCheckResponse]>
     */
    @GET("api/v1/system/mx-check")
    fun checkMx(@Query("email") email: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<MxCheckResponse>

    /**
     * GET api/v1/system/doc-get
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/system/doc-get")
    fun docGet(@Query("id") id: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[DocSearchResult]>
     */
    @GET("api/v1/system/doc-search")
    fun docSearch(@Query("s") s: kotlin.String, @Query("index") index: kotlin.String? = null, @Query("start") start: kotlin.String? = null, @Query("length") length: kotlin.Int? = 10, @Query("type") type: kotlin.String? = "ELASTICSEARCH", @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<DocSearchResult>


    /**
    * enum for parameter verbs
    */
    enum class VerbsGetAuditLog(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AuditLogResult]>
     */
    @GET("api/v1/system/audit/log")
    fun getAuditLog(@Query("actor_id") actorId: kotlin.String? = null, @Query("object_type") objectType: kotlin.String? = null, @Query("object_id") objectId: kotlin.String? = null, @Query("verbs") verbs: @JvmSuppressWildcards kotlin.collections.Set<kotlin.String>? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AuditLogResult>

    /**
     * GET api/v1/system/countries
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CountriesResponse]>
     */
    @GET("api/v1/system/countries")
    fun getCountries(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CountriesResponse>

    /**
     * GET api/v1/system/countries/{countryCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param countryCode 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CountryExtraInfo]>
     */
    @GET("api/v1/system/countries/{countryCode}")
    fun getCountries1(@Path("countryCode") countryCode: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CountryExtraInfo>


    /**
    * enum for parameter verb
    */
    enum class VerbGetEventLog(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageEventLogEntry]>
     */
    @GET("api/v1/system/event/log")
    fun getEventLog(@Query("actor_id") actorId: kotlin.String? = null, @Query("object_type") objectType: kotlin.String? = null, @Query("object_id") objectId: kotlin.String? = null, @Query("verb") verb: @JvmSuppressWildcards kotlin.collections.Set<kotlin.String>? = null, @Query("startAt") startAt: kotlin.String? = "0", @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageEventLogEntry>

    /**
     * GET api/v1/system/front-ends-stats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param latestOnly  (optional, default to false)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageFrontEndCount]>
     */
    @GET("api/v1/system/front-ends-stats")
    fun getFrontEndsStats1(@Query("latestOnly") latestOnly: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageFrontEndCount>

    /**
     * GET api/v1/system/organizations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageOrgTypeResp]>
     */
    @GET("api/v1/system/organizations")
    fun getOrganizations(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageOrgTypeResp>

    /**
     * GET api/v1/system/shops/{shopId}/meta
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param shopId 
     * @param locationId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShopMeta]>
     */
    @GET("api/v1/system/shops/{shopId}/meta")
    fun getShotMeta(@Path("shopId") shopId: kotlin.String, @Query("locationId") locationId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShopMeta>

    /**
     * POST api/v1/system/currencies
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param saveCurrencyReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CurrenciesResponse]>
     */
    @POST("api/v1/system/currencies")
    fun saveSystemCurrencies(@Body saveCurrencyReq: SaveCurrencyReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CurrenciesResponse>

}
