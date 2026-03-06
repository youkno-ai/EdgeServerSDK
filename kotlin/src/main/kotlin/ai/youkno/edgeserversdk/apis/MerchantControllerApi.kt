package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CompleteSelfOnboardingResponse
import ai.youkno.edgeserversdk.models.SelfOnboardingInfo
import ai.youkno.edgeserversdk.models.ShippingFee

interface MerchantControllerApi {
    /**
     * POST api/v1/merchant/{userId}/selfOnboarding/complete
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param selfOnboardingInfo 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CompleteSelfOnboardingResponse]>
     */
    @POST("api/v1/merchant/{userId}/selfOnboarding/complete")
    fun completeSelfOnboarding(@Path("userId") userId: kotlin.String, @Body selfOnboardingInfo: SelfOnboardingInfo, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CompleteSelfOnboardingResponse>

    /**
     * GET api/v1/merchant/{userId}/selfOnboarding
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SelfOnboardingInfo]>
     */
    @GET("api/v1/merchant/{userId}/selfOnboarding")
    fun getSelfOnboarding(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SelfOnboardingInfo>

    /**
     * GET api/v1/merchant/{userId}/shippingFee
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ShippingFee]>
     */
    @GET("api/v1/merchant/{userId}/shippingFee")
    fun getShippingFee(@Path("userId") userId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ShippingFee>

    /**
     * POST api/v1/merchant/{userId}/selfOnboarding
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param selfOnboardingInfo 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SelfOnboardingInfo]>
     */
    @POST("api/v1/merchant/{userId}/selfOnboarding")
    fun saveSelfOnboarding(@Path("userId") userId: kotlin.String, @Body selfOnboardingInfo: SelfOnboardingInfo, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SelfOnboardingInfo>

    /**
     * POST api/v1/merchant/{userId}/shippingFee
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param shippingFee 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/merchant/{userId}/shippingFee")
    fun saveShippingFee(@Path("userId") userId: kotlin.String, @Body shippingFee: ShippingFee, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * PATCH api/v1/merchant/{userId}/selfOnboarding
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param selfOnboardingInfo 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[SelfOnboardingInfo]>
     */
    @PATCH("api/v1/merchant/{userId}/selfOnboarding")
    fun updateSelfOnboarding(@Path("userId") userId: kotlin.String, @Body selfOnboardingInfo: SelfOnboardingInfo, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<SelfOnboardingInfo>

}
