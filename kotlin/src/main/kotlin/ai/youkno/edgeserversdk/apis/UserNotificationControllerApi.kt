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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/user/{userId}/notification")
    fun deleteApiV1UserByUseridNotification(@Path("userId") userId: kotlin.String, @Query("entityType") entityType: kotlin.String, @Query("entityId") entityId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserNotificationConfig]>
     */
    @GET("api/v1/user/{userId}/notification")
    fun getApiV1UserByUseridNotification(@Path("userId") userId: kotlin.String, @Query("entityType") entityType: kotlin.String, @Query("entityId") entityId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserNotificationConfig>

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
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageUserNotificationConfig]>
     */
    @GET("api/v1/user/{userId}/notifications")
    fun getApiV1UserByUseridNotifications(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageUserNotificationConfig>

    /**
     * PUT api/v1/user/{userId}/notification
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param userNotificationConfig 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @PUT("api/v1/user/{userId}/notification")
    fun putApiV1UserByUseridNotification(@Path("userId") userId: kotlin.String, @Body userNotificationConfig: UserNotificationConfig, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
