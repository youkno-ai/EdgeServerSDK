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
     * POST api/v1/users/{userId}/blacklist
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/blacklist")
    fun blackListUser(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/api-secret
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ApiSecret]>
     */
    @POST("api/v1/users/{userId}/api-secret")
    fun createApiSecret(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ApiSecret>

    /**
     * POST api/v1/users/inviteLinks
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userInvite 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @Deprecated("This api was deprecated")
    @POST("api/v1/users/inviteLinks")
    fun createInviteLink(@Body userInvite: UserInvite, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/reservations
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reservationInfo 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Bounty]>
     */
    @POST("api/v1/users/reservations")
    fun createReservation(@Body reservationInfo: ReservationInfo, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Bounty>

    /**
     * DELETE api/v1/users/{userId}/addresses/{addressId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param addressId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/users/{userId}/addresses/{addressId}")
    fun deleteAddress(@Path("userId") userId: kotlin.String, @Path("addressId") addressId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * DELETE api/v1/users/{userId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/users/{userId}")
    fun deleteUser(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * PUT api/v1/users/inviteLinks/{inviteCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteCode 
     * @param userInvite 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @Deprecated("This api was deprecated")
    @PUT("api/v1/users/inviteLinks/{inviteCode}")
    fun editInviteLink(@Path("inviteCode") inviteCode: kotlin.String, @Body userInvite: UserInvite, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/users/{userId}/anon/token
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[AnonAuthResp]>
     */
    @GET("api/v1/users/{userId}/anon/token")
    fun generateAnonAuthToken(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<AnonAuthResp>

    /**
     * GET api/v1/users/{userId}/account
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Account]>
     */
    @GET("api/v1/users/{userId}/account")
    fun getAccountInfo(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Account>

    /**
     * GET api/v1/users/{userId}/roles/allowed
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserAllowedRoles]>
     */
    @GET("api/v1/users/{userId}/roles/allowed")
    fun getAllowedRoles(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserAllowedRoles>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/users/{userId}/approvals")
    fun getApprovals(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>

    /**
     * GET api/v1/users/{userId}/private_data
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CompanyPrivateData]>
     */
    @GET("api/v1/users/{userId}/private_data")
    fun getCompanyPrivateData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CompanyPrivateData>

    /**
     * GET api/v1/users/{userId}/currencies/statistics
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<PointCurrencyStats>]>
     */
    @GET("api/v1/users/{userId}/currencies/statistics")
    fun getCustomCurrenciesStatistics(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<PointCurrencyStats>>

    /**
     * GET api/v1/users/{userId}/front-ends
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param latestOnly  (optional, default to false)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageFrontEndData]>
     */
    @GET("api/v1/users/{userId}/front-ends")
    fun getFrontEnds(@Path("userId") userId: kotlin.String, @Query("latestOnly") latestOnly: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageFrontEndData>

    /**
     * GET api/v1/users/{companyId}/front-ends-stats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param latestOnly  (optional, default to false)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageFrontEndCount]>
     */
    @GET("api/v1/users/{companyId}/front-ends-stats")
    fun getFrontEndsStats(@Path("companyId") companyId: kotlin.String, @Query("latestOnly") latestOnly: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageFrontEndCount>

    /**
     * GET api/v1/users/inviteLinks/{inviteCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param inviteCode 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserInvite]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/users/inviteLinks/{inviteCode}")
    fun getInviteLink(@Path("inviteCode") inviteCode: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserInvite>

    /**
     * GET api/v1/users/inviteLinks
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<UserInvite>]>
     */
    @Deprecated("This api was deprecated")
    @GET("api/v1/users/inviteLinks")
    fun getInviteLinks(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<UserInvite>>

    /**
     * GET api/v1/users/{userId}/manage_data
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ManageUserData]>
     */
    @GET("api/v1/users/{userId}/manage_data")
    fun getManageUserData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ManageUserData>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/users/{merchantId}/merchant/orders")
    fun getMerchantOrders(@Path("merchantId") merchantId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>

    /**
     * GET api/v1/users/paymentAccount
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param merchantId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PaymentAccountResult]>
     */
    @GET("api/v1/users/paymentAccount")
    fun getPaymentAccount(@Query("merchantId") merchantId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PaymentAccountResult>

    /**
     * GET api/v1/users/{userId}/phone_status
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("api/v1/users/{userId}/phone_status")
    fun getPhoneStatus(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.String>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Transaction>]>
     */
    @GET("api/v1/users/{userId}/transactions")
    fun getTransactions(@Path("userId") userId: kotlin.String, @Query("from") from: kotlin.Long? = null, @Query("to") to: kotlin.Long? = null, @Query("limit") limit: kotlin.Int? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Transaction>>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageBadgeStash]>
     */
    @GET("api/v1/users/{userId}/badges")
    fun getUserBadges(@Path("userId") userId: kotlin.String, @Query("badgeDefType") badgeDefType: kotlin.String? = "badge", @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageBadgeStash>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserChatResult]>
     */
    @GET("api/v1/users/{userId}/chats")
    fun getUserChats(@Path("userId") userId: kotlin.String, @Query("type") type: kotlin.String? = null, @Query("state") state: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserChatResult>

    /**
     * GET api/v1/users/{userId}/data
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserData]>
     */
    @GET("api/v1/users/{userId}/data")
    fun getUserData(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserData>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageGroupSearchResult]>
     */
    @GET("api/v1/users/{userId}/groups")
    fun getUserGroups(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageGroupSearchResult>

    /**
     * GET api/v1/users/language
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/users/language")
    fun getUserLanguage(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/users/{userId}/meta
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserMetaResult]>
     */
    @GET("api/v1/users/{userId}/meta")
    fun getUserMeta(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserMetaResult>

    /**
     * GET api/v1/users/{userId}/orders/{orderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param orderId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Bounty]>
     */
    @GET("api/v1/users/{userId}/orders/{orderId}")
    fun getUserOrder(@Path("userId") userId: kotlin.String, @Path("orderId") orderId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Bounty>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ListResult]>
     */
    @GET("api/v1/users/{userId}/orders")
    fun getUserOrders(@Path("userId") userId: kotlin.String, @Query("orderId") orderId: kotlin.String? = null, @Query("includeSubOrders") includeSubOrders: kotlin.Boolean? = null, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ListResult>

    /**
     * GET api/v1/users/{user_id}/profile
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param deleted  (optional, default to false)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserProfileEx]>
     */
    @GET("api/v1/users/{user_id}/profile")
    fun getUserProfile(@Path("user_id") userId: kotlin.String, @Query("deleted") deleted: kotlin.Boolean? = false, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserProfileEx>

    /**
     * GET api/v1/users/{userId}/tickets
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserTicketResult]>
     */
    @GET("api/v1/users/{userId}/tickets")
    fun getUserTickets(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserTicketResult>

    /**
     * GET api/v1/users/{userId}/tickets/history
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param ticketId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserTicketHistoryResult]>
     */
    @GET("api/v1/users/{userId}/tickets/history")
    fun getUserTicketsHistory(@Path("userId") userId: kotlin.String, @Query("ticket_id") ticketId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserTicketHistoryResult>


    /**
    * enum for parameter searchFields
    */
    enum class SearchFieldsGetUsers(val value: kotlin.String) {
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
    enum class SearchModeGetUsers(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserListResult]>
     */
    @GET("api/v1/users")
    fun getUsers(@Query("query") query: kotlin.String? = null, @Query("searchFields") searchFields: @JvmSuppressWildcards kotlin.collections.Set<kotlin.String>? = null, @Query("companyId") companyId: kotlin.String? = null, @Query("email") email: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("country") country: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("referralCode") referralCode: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("pin") pin: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("provider") provider: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Query("order") order: kotlin.String? = null, @Query("searchMode") searchMode: SearchModeGetUsers? = null, @Query("blacklisted") blacklisted: kotlin.Boolean? = null, @Query("role") role: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserListResult>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/users/{userId}/{state}/exist")
    fun isUserExist(@Path("userId") userId: kotlin.String, @Path("state") state: kotlin.String, @Query("timeout") timeout: kotlin.Long? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/password_reset
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/password_reset")
    fun resetPassword(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/policy
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param policy 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Account]>
     */
    @POST("api/v1/users/{userId}/policy")
    fun saveAgreement(@Path("userId") userId: kotlin.String, @Body policy: Policy, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Account>

    /**
     * POST api/v1/users/{userId}/agreement
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param agreement 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Account]>
     */
    @POST("api/v1/users/{userId}/agreement")
    fun saveAgreement1(@Path("userId") userId: kotlin.String, @Body agreement: Agreement, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Account>

    /**
     * POST api/v1/users/{userId}/confirmation
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param confirmation 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Account]>
     */
    @POST("api/v1/users/{userId}/confirmation")
    fun saveConfirmation(@Path("userId") userId: kotlin.String, @Body confirmation: Confirmation, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Account>

    /**
     * POST api/v1/users/{userId}/signout
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/signout")
    fun signout(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/topup
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param topupRewardReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/topup")
    fun topupUser(@Path("userId") userId: kotlin.String, @Body topupRewardReq: TopupRewardReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/unassign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/unassign")
    fun unassignEmployee(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/unblacklist
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/unblacklist")
    fun unblackListUser(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/locale
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param lang 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/locale")
    fun updateLocale(@Path("userId") userId: kotlin.String, @Query("lang") lang: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/notification
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param updateNotificationRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/notification")
    fun updateNotificationState(@Path("userId") userId: kotlin.String, @Body updateNotificationRequest: UpdateNotificationRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/pin")
    fun updatePin(@Path("userId") userId: kotlin.String, @Query("pin") pin: kotlin.String, @Query("force") force: kotlin.Boolean, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/referral_code
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param referralCode 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/referral_code")
    fun updateReferralCode(@Path("userId") userId: kotlin.String, @Query("referral_code") referralCode: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/roles
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param updateRolesRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/roles")
    fun updateRoles(@Path("userId") userId: kotlin.String, @Body updateRolesRequest: UpdateRolesRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>


    /**
    * enum for parameter segment
    */
    enum class SegmentUpdateSegment(val value: kotlin.String) {
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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/segment")
    fun updateSegment(@Path("userId") userId: kotlin.String, @Query("segment") segment: SegmentUpdateSegment, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * PUT api/v1/users/{userId}/update_user
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param updateUserEvent 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UpdateUserResult]>
     */
    @PUT("api/v1/users/{userId}/update_user")
    fun updateUser(@Path("userId") userId: kotlin.String, @Body updateUserEvent: UpdateUserEvent, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UpdateUserResult>

    /**
     * PUT api/v1/users/{userId}/update
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param updateUserRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @Deprecated("This api was deprecated")
    @PUT("api/v1/users/{userId}/update")
    fun updateUser1(@Path("userId") userId: kotlin.String, @Body updateUserRequest: UpdateUserRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/tickets/use
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param useUserTicketRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/tickets/use")
    fun useUserTicket(@Path("userId") userId: kotlin.String, @Body useUserTicketRequest: UseUserTicketRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * POST api/v1/users/{userId}/tickets/validate
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param validateUserTicketRequest 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/users/{userId}/tickets/validate")
    fun validateUserTicket(@Path("userId") userId: kotlin.String, @Body validateUserTicketRequest: ValidateUserTicketRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SignInDecision]>
     */
    @GET("api/v1/users/{userId}/what_next")
    fun whatNext(@Path("userId") userId: kotlin.String, @Query("current_step") currentStep: kotlin.String? = null, @Query("invite_code") inviteCode: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SignInDecision>

}
