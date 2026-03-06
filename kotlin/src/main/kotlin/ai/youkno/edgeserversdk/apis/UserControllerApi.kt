package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Account
import ai.youkno.edgeserversdk.models.Agreement
import ai.youkno.edgeserversdk.models.AnonAuthResp
import ai.youkno.edgeserversdk.models.ApiSecret
import ai.youkno.edgeserversdk.models.Bounty
import ai.youkno.edgeserversdk.models.CompanyPrivateData
import ai.youkno.edgeserversdk.models.Confirmation
import ai.youkno.edgeserversdk.models.ListResult
import ai.youkno.edgeserversdk.models.ManageUserData
import ai.youkno.edgeserversdk.models.PageBadgeStash
import ai.youkno.edgeserversdk.models.PageFrontEndCount
import ai.youkno.edgeserversdk.models.PageFrontEndData
import ai.youkno.edgeserversdk.models.PageGroupSearchResult
import ai.youkno.edgeserversdk.models.PaymentAccountResult
import ai.youkno.edgeserversdk.models.PointCurrencyStats
import ai.youkno.edgeserversdk.models.Policy
import ai.youkno.edgeserversdk.models.ReservationInfo
import ai.youkno.edgeserversdk.models.SignInDecision
import ai.youkno.edgeserversdk.models.TopupRewardReq
import ai.youkno.edgeserversdk.models.Transaction
import ai.youkno.edgeserversdk.models.UpdateNotificationRequest
import ai.youkno.edgeserversdk.models.UpdateRolesRequest
import ai.youkno.edgeserversdk.models.UpdateUserEvent
import ai.youkno.edgeserversdk.models.UpdateUserRequest
import ai.youkno.edgeserversdk.models.UpdateUserResult
import ai.youkno.edgeserversdk.models.UseUserTicketRequest
import ai.youkno.edgeserversdk.models.UserAllowedRoles
import ai.youkno.edgeserversdk.models.UserChatResult
import ai.youkno.edgeserversdk.models.UserData
import ai.youkno.edgeserversdk.models.UserInvite
import ai.youkno.edgeserversdk.models.UserListResult
import ai.youkno.edgeserversdk.models.UserMetaResult
import ai.youkno.edgeserversdk.models.UserProfileEx
import ai.youkno.edgeserversdk.models.UserTicketHistoryResult
import ai.youkno.edgeserversdk.models.UserTicketResult
import ai.youkno.edgeserversdk.models.ValidateUserTicketRequest

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
     * @return [Call]<[UserListResult]>
     */
    @GET("api/v1/users")
    fun getApiV1Users(@Query("query") query: kotlin.String? = null, @Query("searchFields") searchFields: @JvmSuppressWildcards kotlin.collections.Set<kotlin.String>? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("email") email: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("country") country: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Query("order") order: kotlin.String? = null, @Query("searchMode") searchMode: SearchModeGetApiV1Users? = null, @Query("blacklisted") blacklisted: kotlin.Boolean? = null, @Query("role") role: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserListResult>

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
     * @return [Call]<[PageFrontEndCount]>
     */
    @GET("api/v1/users/{companyId}/front-ends-stats")
    fun getApiV1UsersByCompanyidFrontEndsStats(@Path("companyId") companyId: kotlin.String, @Query("latestOnly") latestOnly: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageFrontEndCount>

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
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/users/{merchantId}/merchant/orders")
    fun getApiV1UsersByMerchantidMerchantOrders(@Path("merchantId") merchantId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListResult>

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
     * @return [Call]<[UserProfileEx]>
     */
    @GET("api/v1/users/{user_id}/profile")
    fun getApiV1UsersByUserIdProfile(@Path("user_id") userId: kotlin.String, @Query("deleted") deleted: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfileEx>

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
     * @return [Call]<[Account]>
     */
    @GET("api/v1/users/{userId}/account")
    fun getApiV1UsersByUseridAccount(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Account>

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
     * @return [Call]<[AnonAuthResp]>
     */
    @GET("api/v1/users/{userId}/anon/token")
    fun getApiV1UsersByUseridAnonToken(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AnonAuthResp>

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
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/users/{userId}/approvals")
    fun getApiV1UsersByUseridApprovals(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListResult>

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
     * @return [Call]<[PageBadgeStash]>
     */
    @GET("api/v1/users/{userId}/badges")
    fun getApiV1UsersByUseridBadges(@Path("userId") userId: kotlin.String, @Query("badgeDefType") badgeDefType: kotlin.String? = "badge", @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageBadgeStash>

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
     * @return [Call]<[UserChatResult]>
     */
    @GET("api/v1/users/{userId}/chats")
    fun getApiV1UsersByUseridChats(@Path("userId") userId: kotlin.String, @Query("type") type: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserChatResult>

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
     * @return [Call]<[kotlin.collections.List<PointCurrencyStats>]>
     */
    @GET("api/v1/users/{userId}/currencies/statistics")
    fun getApiV1UsersByUseridCurrenciesStatistics(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<PointCurrencyStats>>

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
     * @return [Call]<[UserData]>
     */
    @GET("api/v1/users/{userId}/data")
    fun getApiV1UsersByUseridData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserData>

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
     * @return [Call]<[PageFrontEndData]>
     */
    @GET("api/v1/users/{userId}/front-ends")
    fun getApiV1UsersByUseridFrontEnds(@Path("userId") userId: kotlin.String, @Query("latestOnly") latestOnly: kotlin.Boolean? = false, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageFrontEndData>

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
     * @return [Call]<[PageGroupSearchResult]>
     */
    @GET("api/v1/users/{userId}/groups")
    fun getApiV1UsersByUseridGroups(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageGroupSearchResult>

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
     * @return [Call]<[ManageUserData]>
     */
    @GET("api/v1/users/{userId}/manage_data")
    fun getApiV1UsersByUseridManageData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ManageUserData>

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
     * @return [Call]<[UserMetaResult]>
     */
    @GET("api/v1/users/{userId}/meta")
    fun getApiV1UsersByUseridMeta(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserMetaResult>

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
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/users/{userId}/orders")
    fun getApiV1UsersByUseridOrders(@Path("userId") userId: kotlin.String, @Query("orderId") orderId: kotlin.String? = null, @Query("includeSubOrders") includeSubOrders: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListResult>

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
     * @return [Call]<[Bounty]>
     */
    @GET("api/v1/users/{userId}/orders/{orderId}")
    fun getApiV1UsersByUseridOrdersByOrderid(@Path("userId") userId: kotlin.String, @Path("orderId") orderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

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
     * @return [Call]<[CompanyPrivateData]>
     */
    @GET("api/v1/users/{userId}/private_data")
    fun getApiV1UsersByUseridPrivateData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CompanyPrivateData>

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
     * @return [Call]<[UserAllowedRoles]>
     */
    @GET("api/v1/users/{userId}/roles/allowed")
    fun getApiV1UsersByUseridRolesAllowed(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserAllowedRoles>

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
     * @return [Call]<[UserTicketResult]>
     */
    @GET("api/v1/users/{userId}/tickets")
    fun getApiV1UsersByUseridTickets(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserTicketResult>

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
     * @return [Call]<[UserTicketHistoryResult]>
     */
    @GET("api/v1/users/{userId}/tickets/history")
    fun getApiV1UsersByUseridTicketsHistory(@Path("userId") userId: kotlin.String, @Query("ticket_id") ticketId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserTicketHistoryResult>

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
     * @return [Call]<[kotlin.collections.List<Transaction>]>
     */
    @GET("api/v1/users/{userId}/transactions")
    fun getApiV1UsersByUseridTransactions(@Path("userId") userId: kotlin.String, @Query("from") from: kotlin.Long? = null, @Query("to") to: kotlin.Long? = null, @Query("limit") limit: kotlin.Int? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Transaction>>

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
     * @return [Call]<[SignInDecision]>
     */
    @GET("api/v1/users/{userId}/what_next")
    fun getApiV1UsersByUseridWhatNext(@Path("userId") userId: kotlin.String, @Query("current_step") currentStep: kotlin.String? = null, @Query("invite_code") inviteCode: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<SignInDecision>

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
     * @return [Call]<[kotlin.collections.List<UserInvite>]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/users/inviteLinks")
    fun getApiV1UsersInvitelinks(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<UserInvite>>

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
     * @return [Call]<[UserInvite]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/users/inviteLinks/{inviteCode}")
    fun getApiV1UsersInvitelinksByInvitecode(@Path("inviteCode") inviteCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserInvite>

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
     * @return [Call]<[PaymentAccountResult]>
     */
    @GET("api/v1/users/paymentAccount")
    fun getApiV1UsersPaymentaccount(@Query("merchantId") merchantId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PaymentAccountResult>

    /**
     * POST api/v1/users/{userId}/agreement
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param agreement 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Account]>
     */
    @POST("api/v1/users/{userId}/agreement")
    fun postApiV1UsersByUseridAgreement(@Path("userId") userId: kotlin.String, @Body agreement: Agreement, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Account>

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
     * @return [Call]<[ApiSecret]>
     */
    @POST("api/v1/users/{userId}/api-secret")
    fun postApiV1UsersByUseridApiSecret(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ApiSecret>

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
     * @param confirmation 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Account]>
     */
    @POST("api/v1/users/{userId}/confirmation")
    fun postApiV1UsersByUseridConfirmation(@Path("userId") userId: kotlin.String, @Body confirmation: Confirmation, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Account>

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
     * @param updateNotificationRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/notification")
    fun postApiV1UsersByUseridNotification(@Path("userId") userId: kotlin.String, @Body updateNotificationRequest: UpdateNotificationRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param policy 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Account]>
     */
    @POST("api/v1/users/{userId}/policy")
    fun postApiV1UsersByUseridPolicy(@Path("userId") userId: kotlin.String, @Body policy: Policy, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Account>

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
     * @param updateRolesRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/roles")
    fun postApiV1UsersByUseridRoles(@Path("userId") userId: kotlin.String, @Body updateRolesRequest: UpdateRolesRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>


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
     * @param useUserTicketRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/tickets/use")
    fun postApiV1UsersByUseridTicketsUse(@Path("userId") userId: kotlin.String, @Body useUserTicketRequest: UseUserTicketRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/tickets/validate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param validateUserTicketRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/tickets/validate")
    fun postApiV1UsersByUseridTicketsValidate(@Path("userId") userId: kotlin.String, @Body validateUserTicketRequest: ValidateUserTicketRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/{userId}/topup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param topupRewardReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/users/{userId}/topup")
    fun postApiV1UsersByUseridTopup(@Path("userId") userId: kotlin.String, @Body topupRewardReq: TopupRewardReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param userInvite 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @Deprecated("This api was deprecated")
    @POST("api/v1/users/inviteLinks")
    fun postApiV1UsersInvitelinks(@Body userInvite: UserInvite, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/users/reservations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reservationInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Bounty]>
     */
    @POST("api/v1/users/reservations")
    fun postApiV1UsersReservations(@Body reservationInfo: ReservationInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Bounty>

    /**
     * PUT api/v1/users/{userId}/update
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param updateUserRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @Deprecated("This api was deprecated")
    @PUT("api/v1/users/{userId}/update")
    fun putApiV1UsersByUseridUpdate(@Path("userId") userId: kotlin.String, @Body updateUserRequest: UpdateUserRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * PUT api/v1/users/{userId}/update_user
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param updateUserEvent 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UpdateUserResult]>
     */
    @PUT("api/v1/users/{userId}/update_user")
    fun putApiV1UsersByUseridUpdateUser(@Path("userId") userId: kotlin.String, @Body updateUserEvent: UpdateUserEvent, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UpdateUserResult>

    /**
     * PUT api/v1/users/inviteLinks/{inviteCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteCode 
     * @param userInvite 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @Deprecated("This api was deprecated")
    @PUT("api/v1/users/inviteLinks/{inviteCode}")
    fun putApiV1UsersInvitelinksByInvitecode(@Path("inviteCode") inviteCode: kotlin.String, @Body userInvite: UserInvite, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
