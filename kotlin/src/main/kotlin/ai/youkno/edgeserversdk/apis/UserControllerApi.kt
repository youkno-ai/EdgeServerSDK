package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccount
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBaseSettingsAgreement
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBaseSettingsConfirmation
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBaseSettingsPolicy
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBounty
import ai.youkno.edgeserversdk.models.CoedgeappservermodelBountyReservationInfo
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAnonAuthResp
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataApiSecret
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCompanyPrivateData
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataManageUserData
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBadgesBadgeStash
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelGroupSearchResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappserverrestcontrollerUserControllerFrontEndData
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappserverserviceUserHandleFrontEndCount
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPaymentAccountResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPointCurrencyStats
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataTopupRewardReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUpdateNotificationRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUpdateRolesRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUpdateUserRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUseUserTicketRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserAllowedRoles
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserChatResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserListResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserMetaResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserProfileEx
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserTicketHistoryResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataUserTicketResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataValidateUserTicketRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelMailingAddress
import ai.youkno.edgeserversdk.models.CoedgeappservermodelSignInDecision
import ai.youkno.edgeserversdk.models.CoedgeappservermodelTransaction
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUpdateUserResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUserData
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUserInvite
import ai.youkno.edgeserversdk.models.CoedgeappserverqueueeventsUpdateUserEvent
import ai.youkno.edgeserversdk.models.CoedgeappserverserviceUserOpListResult

interface UserControllerApi {
    /**
     * DELETE api/v1/users/{userId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/users/{userId}")
    fun deleteApiV1UsersByUserid(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * DELETE api/v1/users/{userId}/addresses/{addressId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param addressId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/users/{userId}/addresses/{addressId}")
    fun deleteApiV1UsersByUseridAddressesByAddressid(@Path("userId") userId: kotlin.String, @Path("addressId") addressId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>


    /**
    * enum for parameter searchFields
    */
    enum class SearchFieldsGetApiV1Users(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "USER_NAME") USER_NAME("USER_NAME"),
        @Json(name = "USER_FIRST_NAME") USER_FIRST_NAME("USER_FIRST_NAME"),
        @Json(name = "USER_LAST_NAME") USER_LAST_NAME("USER_LAST_NAME"),
        @Json(name = "USER_LATINIZED_NAME") USER_LATINIZED_NAME("USER_LATINIZED_NAME"),
        @Json(name = "USER_EMAIL") USER_EMAIL("USER_EMAIL"),
        @Json(name = "USER_COUNTRY_CODE") USER_COUNTRY_CODE("USER_COUNTRY_CODE"),
        @Json(name = "USER_CITY") USER_CITY("USER_CITY"),
        @Json(name = "EMPLOYER_NAME") EMPLOYER_NAME("EMPLOYER_NAME"),
        @Json(name = "BOUNTY_TITLE") BOUNTY_TITLE("BOUNTY_TITLE"),
        @Json(name = "BOUNTY_DESCRIPTION") BOUNTY_DESCRIPTION("BOUNTY_DESCRIPTION"),
        @Json(name = "BOUNTY_CREATOR_NAME") BOUNTY_CREATOR_NAME("BOUNTY_CREATOR_NAME"),
        @Json(name = "APPLICANT_POSITION") APPLICANT_POSITION("APPLICANT_POSITION"),
        @Json(name = "REFERRAL_CODE") REFERRAL_CODE("REFERRAL_CODE"),
        @Json(name = "PIN") PIN("PIN"),
        @Json(name = "COUNTRY") COUNTRY("COUNTRY"),
        @Json(name = "COMPANY_NAME") COMPANY_NAME("COMPANY_NAME"),
        @Json(name = "PHONE") PHONE("PHONE"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetApiV1Users(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }

    /**
     * GET api/v1/users
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param query  (optional)
     * @param searchFields  (optional)
     * @param companyId  (optional)
     * @param email  (optional)
     * @param country  (optional)
     * @param referralCode  (optional)
     * @param pin  (optional)
     * @param provider  (optional)
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param order  (optional)
     * @param searchMode  (optional)
     * @param blacklisted  (optional)
     * @param role  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserListResult]>
     */
    @GET("api/v1/users")
    fun getApiV1Users(@Query("query") query: kotlin.String? = null, @Query("searchFields") searchFields: @JvmSuppressWildcards kotlin.collections.Set<kotlin.String>? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("email") email: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("country") country: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Query("order") order: kotlin.String? = null, @Query("searchMode") searchMode: SearchModeGetApiV1Users? = null, @Query("blacklisted") blacklisted: kotlin.Boolean? = null, @Query("role") role: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserListResult>

    /**
     * GET api/v1/users/{companyId}/front-ends-stats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param latestOnly  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappserverserviceUserHandleFrontEndCount]>
     */
    @GET("api/v1/users/{companyId}/front-ends-stats")
    fun getApiV1UsersByCompanyidFrontEndsStats(@Path("companyId") companyId: kotlin.String, @Query("latestOnly") latestOnly: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappserverserviceUserHandleFrontEndCount>

    /**
     * GET api/v1/users/{merchantId}/merchant/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param merchantId 
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/users/{merchantId}/merchant/orders")
    fun getApiV1UsersByMerchantidMerchantOrders(@Path("merchantId") merchantId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

    /**
     * GET api/v1/users/{user_id}/profile
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param deleted  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserProfileEx]>
     */
    @GET("api/v1/users/{user_id}/profile")
    fun getApiV1UsersByUserIdProfile(@Path("user_id") userId: kotlin.String, @Query("deleted") deleted: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserProfileEx>

    /**
     * GET api/v1/users/{userId}/account
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccount]>
     */
    @GET("api/v1/users/{userId}/account")
    fun getApiV1UsersByUseridAccount(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccount>

    /**
     * GET api/v1/users/{userId}/addresses
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelMailingAddress>]>
     */
    @GET("api/v1/users/{userId}/addresses")
    fun getApiV1UsersByUseridAddresses(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelMailingAddress>>

    /**
     * GET api/v1/users/{userId}/addresses/{addressId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param addressId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelMailingAddress]>
     */
    @GET("api/v1/users/{userId}/addresses/{addressId}")
    fun getApiV1UsersByUseridAddressesByAddressid(@Path("userId") userId: kotlin.String, @Path("addressId") addressId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelMailingAddress>

    /**
     * GET api/v1/users/{userId}/anon/token
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataAnonAuthResp]>
     */
    @GET("api/v1/users/{userId}/anon/token")
    fun getApiV1UsersByUseridAnonToken(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataAnonAuthResp>

    /**
     * GET api/v1/users/{userId}/approvals
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/users/{userId}/approvals")
    fun getApiV1UsersByUseridApprovals(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

    /**
     * GET api/v1/users/{userId}/badges
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param badgeDefType  (optional, default to "badge")
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBadgesBadgeStash]>
     */
    @GET("api/v1/users/{userId}/badges")
    fun getApiV1UsersByUseridBadges(@Path("userId") userId: kotlin.String, @Query("badgeDefType") badgeDefType: kotlin.String? = "badge", @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBadgesBadgeStash>

    /**
     * GET api/v1/users/{userId}/{state}/exist
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param state 
     * @param timeout  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/users/{userId}/{state}/exist")
    fun getApiV1UsersByUseridByStateExist(@Path("userId") userId: kotlin.String, @Path("state") state: kotlin.String, @Query("timeout") timeout: kotlin.Long? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/users/{userId}/chats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param type  (optional)
     * @param state  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserChatResult]>
     */
    @GET("api/v1/users/{userId}/chats")
    fun getApiV1UsersByUseridChats(@Path("userId") userId: kotlin.String, @Query("type") type: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserChatResult>

    /**
     * GET api/v1/users/{userId}/currencies/statistics
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelEdgeApiDataPointCurrencyStats>]>
     */
    @GET("api/v1/users/{userId}/currencies/statistics")
    fun getApiV1UsersByUseridCurrenciesStatistics(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelEdgeApiDataPointCurrencyStats>>

    /**
     * GET api/v1/users/{userId}/data
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserData]>
     */
    @GET("api/v1/users/{userId}/data")
    fun getApiV1UsersByUseridData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserData>

    /**
     * GET api/v1/users/{userId}/front-ends
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param latestOnly  (optional, default to false)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappserverrestcontrollerUserControllerFrontEndData]>
     */
    @GET("api/v1/users/{userId}/front-ends")
    fun getApiV1UsersByUseridFrontEnds(@Path("userId") userId: kotlin.String, @Query("latestOnly") latestOnly: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappserverrestcontrollerUserControllerFrontEndData>

    /**
     * GET api/v1/users/{userId}/groups
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelGroupSearchResult]>
     */
    @GET("api/v1/users/{userId}/groups")
    fun getApiV1UsersByUseridGroups(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelGroupSearchResult>

    /**
     * GET api/v1/users/{userId}/manage_data
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataManageUserData]>
     */
    @GET("api/v1/users/{userId}/manage_data")
    fun getApiV1UsersByUseridManageData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataManageUserData>

    /**
     * GET api/v1/users/{userId}/meta
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserMetaResult]>
     */
    @GET("api/v1/users/{userId}/meta")
    fun getApiV1UsersByUseridMeta(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserMetaResult>

    /**
     * GET api/v1/users/{userId}/orders
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param orderId  (optional)
     * @param includeSubOrders  (optional)
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 50)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappserverserviceUserOpListResult]>
     */
    @GET("api/v1/users/{userId}/orders")
    fun getApiV1UsersByUseridOrders(@Path("userId") userId: kotlin.String, @Query("orderId") orderId: kotlin.String? = null, @Query("includeSubOrders") includeSubOrders: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappserverserviceUserOpListResult>

    /**
     * GET api/v1/users/{userId}/orders/{orderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param orderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @GET("api/v1/users/{userId}/orders/{orderId}")
    fun getApiV1UsersByUseridOrdersByOrderid(@Path("userId") userId: kotlin.String, @Path("orderId") orderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * GET api/v1/users/{userId}/phone_status
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("api/v1/users/{userId}/phone_status")
    fun getApiV1UsersByUseridPhoneStatus(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * GET api/v1/users/{userId}/private_data
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCompanyPrivateData]>
     */
    @GET("api/v1/users/{userId}/private_data")
    fun getApiV1UsersByUseridPrivateData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCompanyPrivateData>

    /**
     * GET api/v1/users/{userId}/roles/allowed
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserAllowedRoles]>
     */
    @GET("api/v1/users/{userId}/roles/allowed")
    fun getApiV1UsersByUseridRolesAllowed(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserAllowedRoles>

    /**
     * GET api/v1/users/{userId}/tickets
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserTicketResult]>
     */
    @GET("api/v1/users/{userId}/tickets")
    fun getApiV1UsersByUseridTickets(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserTicketResult>

    /**
     * GET api/v1/users/{userId}/tickets/history
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param ticketId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataUserTicketHistoryResult]>
     */
    @GET("api/v1/users/{userId}/tickets/history")
    fun getApiV1UsersByUseridTicketsHistory(@Path("userId") userId: kotlin.String, @Query("ticket_id") ticketId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataUserTicketHistoryResult>

    /**
     * GET api/v1/users/{userId}/transactions
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param from  (optional)
     * @param to  (optional)
     * @param limit  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelTransaction>]>
     */
    @GET("api/v1/users/{userId}/transactions")
    fun getApiV1UsersByUseridTransactions(@Path("userId") userId: kotlin.String, @Query("from") from: kotlin.Long? = null, @Query("to") to: kotlin.Long? = null, @Query("limit") limit: kotlin.Int? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelTransaction>>

    /**
     * GET api/v1/users/{userId}/what_next
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param currentStep  (optional)
     * @param inviteCode  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelSignInDecision]>
     */
    @GET("api/v1/users/{userId}/what_next")
    fun getApiV1UsersByUseridWhatNext(@Path("userId") userId: kotlin.String, @Query("current_step") currentStep: kotlin.String? = null, @Query("invite_code") inviteCode: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelSignInDecision>

    /**
     * GET api/v1/users/inviteLinks
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelUserInvite>]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/users/inviteLinks")
    fun getApiV1UsersInvitelinks(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelUserInvite>>

    /**
     * GET api/v1/users/inviteLinks/{inviteCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteCode 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserInvite]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/users/inviteLinks/{inviteCode}")
    fun getApiV1UsersInvitelinksByInvitecode(@Path("inviteCode") inviteCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserInvite>

    /**
     * GET api/v1/users/language
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @GET("api/v1/users/language")
    fun getApiV1UsersLanguage(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/users/paymentAccount
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param merchantId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPaymentAccountResult]>
     */
    @GET("api/v1/users/paymentAccount")
    fun getApiV1UsersPaymentaccount(@Query("merchantId") merchantId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPaymentAccountResult>

    /**
     * POST api/v1/users/{userId}/addresses
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelMailingAddress 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelMailingAddress]>
     */
    @POST("api/v1/users/{userId}/addresses")
    fun postApiV1UsersByUseridAddresses(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelMailingAddress: CoedgeappservermodelMailingAddress, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelMailingAddress>

    /**
     * POST api/v1/users/{userId}/agreement
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelBaseSettingsAgreement 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccount]>
     */
    @POST("api/v1/users/{userId}/agreement")
    fun postApiV1UsersByUseridAgreement(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelBaseSettingsAgreement: CoedgeappservermodelBaseSettingsAgreement, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccount>

    /**
     * POST api/v1/users/{userId}/api-secret
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataApiSecret]>
     */
    @POST("api/v1/users/{userId}/api-secret")
    fun postApiV1UsersByUseridApiSecret(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataApiSecret>

    /**
     * POST api/v1/users/{userId}/blacklist
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/blacklist")
    fun postApiV1UsersByUseridBlacklist(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/confirmation
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelBaseSettingsConfirmation 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccount]>
     */
    @POST("api/v1/users/{userId}/confirmation")
    fun postApiV1UsersByUseridConfirmation(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelBaseSettingsConfirmation: CoedgeappservermodelBaseSettingsConfirmation, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccount>

    /**
     * POST api/v1/users/{userId}/locale
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param lang 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/locale")
    fun postApiV1UsersByUseridLocale(@Path("userId") userId: kotlin.String, @Query("lang") lang: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/notification
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelEdgeApiDataUpdateNotificationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/notification")
    fun postApiV1UsersByUseridNotification(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelEdgeApiDataUpdateNotificationRequest: CoedgeappservermodelEdgeApiDataUpdateNotificationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/password_reset
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/password_reset")
    fun postApiV1UsersByUseridPasswordReset(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/pin
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param pin 
     * @param force 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/pin")
    fun postApiV1UsersByUseridPin(@Path("userId") userId: kotlin.String, @Query("pin") pin: kotlin.String, @Query("force") force: kotlin.Boolean, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/policy
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelBaseSettingsPolicy 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccount]>
     */
    @POST("api/v1/users/{userId}/policy")
    fun postApiV1UsersByUseridPolicy(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelBaseSettingsPolicy: CoedgeappservermodelBaseSettingsPolicy, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccount>

    /**
     * POST api/v1/users/{userId}/referral_code
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param referralCode 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/referral_code")
    fun postApiV1UsersByUseridReferralCode(@Path("userId") userId: kotlin.String, @Query("referral_code") referralCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/roles
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelEdgeApiDataUpdateRolesRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/roles")
    fun postApiV1UsersByUseridRoles(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelEdgeApiDataUpdateRolesRequest: CoedgeappservermodelEdgeApiDataUpdateRolesRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>


    /**
    * enum for parameter segment
    */
    enum class SegmentPostApiV1UsersByUseridSegment(val value: kotlin.String) {
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST")
    }

    /**
     * POST api/v1/users/{userId}/segment
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param segment 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/segment")
    fun postApiV1UsersByUseridSegment(@Path("userId") userId: kotlin.String, @Query("segment") segment: SegmentPostApiV1UsersByUseridSegment, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/signout
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/signout")
    fun postApiV1UsersByUseridSignout(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/tickets/use
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelEdgeApiDataUseUserTicketRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/tickets/use")
    fun postApiV1UsersByUseridTicketsUse(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelEdgeApiDataUseUserTicketRequest: CoedgeappservermodelEdgeApiDataUseUserTicketRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/tickets/validate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelEdgeApiDataValidateUserTicketRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/tickets/validate")
    fun postApiV1UsersByUseridTicketsValidate(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelEdgeApiDataValidateUserTicketRequest: CoedgeappservermodelEdgeApiDataValidateUserTicketRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/topup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelEdgeApiDataTopupRewardReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/topup")
    fun postApiV1UsersByUseridTopup(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelEdgeApiDataTopupRewardReq: CoedgeappservermodelEdgeApiDataTopupRewardReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/unassign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/unassign")
    fun postApiV1UsersByUseridUnassign(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/unblacklist
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/unblacklist")
    fun postApiV1UsersByUseridUnblacklist(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/inviteLinks
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelUserInvite 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @Deprecated("This api was deprecated")
    @POST("api/v1/users/inviteLinks")
    fun postApiV1UsersInvitelinks(@Body coedgeappservermodelUserInvite: CoedgeappservermodelUserInvite, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/reservations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelBountyReservationInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBounty]>
     */
    @POST("api/v1/users/reservations")
    fun postApiV1UsersReservations(@Body coedgeappservermodelBountyReservationInfo: CoedgeappservermodelBountyReservationInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBounty>

    /**
     * PUT api/v1/users/{userId}/update
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelEdgeApiDataUpdateUserRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @Deprecated("This api was deprecated")
    @PUT("api/v1/users/{userId}/update")
    fun putApiV1UsersByUseridUpdate(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelEdgeApiDataUpdateUserRequest: CoedgeappservermodelEdgeApiDataUpdateUserRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/users/{userId}/update_user
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappserverqueueeventsUpdateUserEvent 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUpdateUserResult]>
     */
    @PUT("api/v1/users/{userId}/update_user")
    fun putApiV1UsersByUseridUpdateUser(@Path("userId") userId: kotlin.String, @Body coedgeappserverqueueeventsUpdateUserEvent: CoedgeappserverqueueeventsUpdateUserEvent, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUpdateUserResult>

    /**
     * PUT api/v1/users/inviteLinks/{inviteCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteCode 
     * @param coedgeappservermodelUserInvite 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @Deprecated("This api was deprecated")
    @PUT("api/v1/users/inviteLinks/{inviteCode}")
    fun putApiV1UsersInvitelinksByInvitecode(@Path("inviteCode") inviteCode: kotlin.String, @Body coedgeappservermodelUserInvite: CoedgeappservermodelUserInvite, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
