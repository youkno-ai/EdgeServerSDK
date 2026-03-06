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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Avatar]>
     */
    @POST("api/v1/avatars")
    fun createAvatar(@Body createAvatarRequest: CreateAvatarRequest, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Avatar>

    /**
     * GET api/v1/avatars/{avatarId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param avatarId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Avatar]>
     */
    @GET("api/v1/avatars/{avatarId}")
    fun getAvatarById(@Path("avatarId") avatarId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Avatar>

    /**
     * GET api/v1/avatars
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param name 
     * @param length  (optional, default to 10)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<Avatar>]>
     */
    @GET("api/v1/avatars")
    fun searchAvatars(@Query("name") name: kotlin.String, @Query("length") length: kotlin.Int? = 10, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<Avatar>>

}
