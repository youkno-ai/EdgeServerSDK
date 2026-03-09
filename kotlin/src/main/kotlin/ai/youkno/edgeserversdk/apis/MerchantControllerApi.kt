package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.EdgeApiDataCompleteSelfOnboardingResponse
import ai.youkno.edgeserversdk.models.ShippingFee
import ai.youkno.edgeserversdk.models.UserProfileSelfOnboardingInfo

interface MerchantControllerApi {
    /**
     * GET api/v1/merchant/{userId}/selfOnboarding
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfileSelfOnboardingInfo]>
     */
    @GET("api/v1/merchant/{userId}/selfOnboarding")
    fun getApiV1MerchantByUseridSelfonboarding(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfileSelfOnboardingInfo>

    /**
     * GET api/v1/merchant/{userId}/shippingFee
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ShippingFee]>
     */
    @GET("api/v1/merchant/{userId}/shippingFee")
    fun getApiV1MerchantByUseridShippingfee(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ShippingFee>

    /**
     * PATCH api/v1/merchant/{userId}/selfOnboarding
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param userProfileSelfOnboardingInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfileSelfOnboardingInfo]>
     */
    @PATCH("api/v1/merchant/{userId}/selfOnboarding")
    fun patchApiV1MerchantByUseridSelfonboarding(@Path("userId") userId: kotlin.String, @Body userProfileSelfOnboardingInfo: UserProfileSelfOnboardingInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfileSelfOnboardingInfo>

    /**
     * POST api/v1/merchant/{userId}/selfOnboarding
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param userProfileSelfOnboardingInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserProfileSelfOnboardingInfo]>
     */
    @POST("api/v1/merchant/{userId}/selfOnboarding")
    fun postApiV1MerchantByUseridSelfonboarding(@Path("userId") userId: kotlin.String, @Body userProfileSelfOnboardingInfo: UserProfileSelfOnboardingInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserProfileSelfOnboardingInfo>

    /**
     * POST api/v1/merchant/{userId}/selfOnboarding/complete
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param userProfileSelfOnboardingInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataCompleteSelfOnboardingResponse]>
     */
    @POST("api/v1/merchant/{userId}/selfOnboarding/complete")
    fun postApiV1MerchantByUseridSelfonboardingComplete(@Path("userId") userId: kotlin.String, @Body userProfileSelfOnboardingInfo: UserProfileSelfOnboardingInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataCompleteSelfOnboardingResponse>

    /**
     * POST api/v1/merchant/{userId}/shippingFee
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param shippingFee 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/merchant/{userId}/shippingFee")
    fun postApiV1MerchantByUseridShippingfee(@Path("userId") userId: kotlin.String, @Body shippingFee: ShippingFee, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
