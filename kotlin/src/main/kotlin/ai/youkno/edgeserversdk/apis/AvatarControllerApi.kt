package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelAvatar
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCreateAvatarRequest

interface AvatarControllerApi {
    /**
     * GET api/v1/avatars
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param name 
     * @param length  (optional, default to 10)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<CoedgeappservermodelAvatar>]>
     */
    @GET("api/v1/avatars")
    fun getApiV1Avatars(@Query("name") name: kotlin.String, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<CoedgeappservermodelAvatar>>

    /**
     * GET api/v1/avatars/{avatarId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param avatarId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAvatar]>
     */
    @GET("api/v1/avatars/{avatarId}")
    fun getApiV1AvatarsByAvatarid(@Path("avatarId") avatarId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAvatar>

    /**
     * POST api/v1/avatars
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelEdgeApiDataCreateAvatarRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAvatar]>
     */
    @POST("api/v1/avatars")
    fun postApiV1Avatars(@Body coedgeappservermodelEdgeApiDataCreateAvatarRequest: CoedgeappservermodelEdgeApiDataCreateAvatarRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAvatar>

}
