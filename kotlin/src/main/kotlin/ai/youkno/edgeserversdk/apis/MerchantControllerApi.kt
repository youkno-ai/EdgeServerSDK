package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCompleteSelfOnboardingResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelShippingFee
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUserProfileSelfOnboardingInfo

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
     * @return [Call]<[CoedgeappservermodelUserProfileSelfOnboardingInfo]>
     */
    @GET("api/v1/merchant/{userId}/selfOnboarding")
    fun getApiV1MerchantByUseridSelfonboarding(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserProfileSelfOnboardingInfo>

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
     * @return [Call]<[CoedgeappservermodelShippingFee]>
     */
    @GET("api/v1/merchant/{userId}/shippingFee")
    fun getApiV1MerchantByUseridShippingfee(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelShippingFee>

    /**
     * PATCH api/v1/merchant/{userId}/selfOnboarding
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelUserProfileSelfOnboardingInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserProfileSelfOnboardingInfo]>
     */
    @PATCH("api/v1/merchant/{userId}/selfOnboarding")
    fun patchApiV1MerchantByUseridSelfonboarding(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelUserProfileSelfOnboardingInfo: CoedgeappservermodelUserProfileSelfOnboardingInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserProfileSelfOnboardingInfo>

    /**
     * POST api/v1/merchant/{userId}/selfOnboarding
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelUserProfileSelfOnboardingInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserProfileSelfOnboardingInfo]>
     */
    @POST("api/v1/merchant/{userId}/selfOnboarding")
    fun postApiV1MerchantByUseridSelfonboarding(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelUserProfileSelfOnboardingInfo: CoedgeappservermodelUserProfileSelfOnboardingInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserProfileSelfOnboardingInfo>

    /**
     * POST api/v1/merchant/{userId}/selfOnboarding/complete
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelUserProfileSelfOnboardingInfo 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataCompleteSelfOnboardingResponse]>
     */
    @POST("api/v1/merchant/{userId}/selfOnboarding/complete")
    fun postApiV1MerchantByUseridSelfonboardingComplete(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelUserProfileSelfOnboardingInfo: CoedgeappservermodelUserProfileSelfOnboardingInfo, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataCompleteSelfOnboardingResponse>

    /**
     * POST api/v1/merchant/{userId}/shippingFee
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param coedgeappservermodelShippingFee 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/merchant/{userId}/shippingFee")
    fun postApiV1MerchantByUseridShippingfee(@Path("userId") userId: kotlin.String, @Body coedgeappservermodelShippingFee: CoedgeappservermodelShippingFee, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
