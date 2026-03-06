package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.PageUserNotificationConfig
import ai.youkno.edgeserversdk.models.UserNotificationConfig

interface UserNotificationControllerApi {
    /**
     * DELETE api/v1/user/{userId}/notification
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param entityType 
     * @param entityId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/user/{userId}/notification")
    fun deleteNotification(@Path("userId") userId: kotlin.String, @Query("entityType") entityType: kotlin.String, @Query("entityId") entityId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/user/{userId}/notification
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param entityType 
     * @param entityId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[UserNotificationConfig]>
     */
    @GET("api/v1/user/{userId}/notification")
    fun getNotification(@Path("userId") userId: kotlin.String, @Query("entityType") entityType: kotlin.String, @Query("entityId") entityId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<UserNotificationConfig>

    /**
     * GET api/v1/user/{userId}/notifications
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageUserNotificationConfig]>
     */
    @GET("api/v1/user/{userId}/notifications")
    fun getNotification1(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageUserNotificationConfig>

    /**
     * PUT api/v1/user/{userId}/notification
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param userNotificationConfig 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @PUT("api/v1/user/{userId}/notification")
    fun updateNotification(@Path("userId") userId: kotlin.String, @Body userNotificationConfig: UserNotificationConfig, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

}
