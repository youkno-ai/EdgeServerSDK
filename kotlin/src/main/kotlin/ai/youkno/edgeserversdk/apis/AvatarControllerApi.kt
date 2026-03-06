package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Avatar
import ai.youkno.edgeserversdk.models.CreateAvatarRequest

interface AvatarControllerApi {
    /**
     * POST api/v1/avatars
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createAvatarRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Avatar]>
     */
    @POST("api/v1/avatars")
    fun createAvatar(@Body createAvatarRequest: CreateAvatarRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Avatar>

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
     * @return [Call]<[Avatar]>
     */
    @GET("api/v1/avatars/{avatarId}")
    fun getAvatarById(@Path("avatarId") avatarId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Avatar>

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
     * @return [Call]<[kotlin.collections.List<Avatar>]>
     */
    @GET("api/v1/avatars")
    fun searchAvatars(@Query("name") name: kotlin.String, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<Avatar>>

}
