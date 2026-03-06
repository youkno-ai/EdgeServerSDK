package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelChatSlashResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataChatCommand
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataChatMessage
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataChatMessageRead
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataChatOobWatching
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataCreateChat
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataNewId
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataSupportChartResult
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUserChat

interface ChatControllerApi {
    /**
     * GET api/v1/chats/ai-bot
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param botName  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSupportChartResult]>
     */
    @GET("api/v1/chats/ai-bot")
    fun getApiV1ChatsAiBot(@Query("botName") botName: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSupportChartResult>

    /**
     * GET api/v1/chats/support
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId  (optional)
     * @param userId  (optional)
     * @param bountyId  (optional)
     * @param productId  (optional)
     * @param orderId  (optional)
     * @param existingOnly  (optional)
     * @param autoJoin  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSupportChartResult]>
     */
    @GET("api/v1/chats/support")
    fun getApiV1ChatsSupport(@Query("companyId") companyId: kotlin.String? = null, @Query("userId") userId: kotlin.String? = null, @Query("bountyId") bountyId: kotlin.String? = null, @Query("productId") productId: kotlin.String? = null, @Query("orderId") orderId: kotlin.String? = null, @Query("existingOnly") existingOnly: kotlin.Boolean? = null, @Query("autoJoin") autoJoin: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSupportChartResult>

    /**
     * POST api/v1/chats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelEdgeApiDataCreateChat 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserChat]>
     */
    @POST("api/v1/chats")
    fun postApiV1Chats(@Body coedgeappservermodelEdgeApiDataCreateChat: CoedgeappservermodelEdgeApiDataCreateChat, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserChat>

    /**
     * POST api/v1/chats/{room_id}/commands
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roomId 
     * @param coedgeappservermodelEdgeApiDataChatCommand 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelChatSlashResult]>
     */
    @POST("api/v1/chats/{room_id}/commands")
    fun postApiV1ChatsByRoomIdCommands(@Path("room_id") roomId: kotlin.String, @Body coedgeappservermodelEdgeApiDataChatCommand: CoedgeappservermodelEdgeApiDataChatCommand, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelChatSlashResult>

    /**
     * POST api/v1/chats/{room_id}/messages
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roomId 
     * @param coedgeappservermodelEdgeApiDataChatMessage 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataNewId]>
     */
    @POST("api/v1/chats/{room_id}/messages")
    fun postApiV1ChatsByRoomIdMessages(@Path("room_id") roomId: kotlin.String, @Body coedgeappservermodelEdgeApiDataChatMessage: CoedgeappservermodelEdgeApiDataChatMessage, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataNewId>

    /**
     * POST api/v1/chats/{room_id}/messages/{msg_id}/handle_message
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roomId 
     * @param msgId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataSupportChartResult]>
     */
    @POST("api/v1/chats/{room_id}/messages/{msg_id}/handle_message")
    fun postApiV1ChatsByRoomIdMessagesByMsgIdHandleMessage(@Path("room_id") roomId: kotlin.String, @Path("msg_id") msgId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataSupportChartResult>

    /**
     * POST api/v1/chats/{room_id}/messages/{msg_id}/reactions
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roomId 
     * @param msgId 
     * @param coedgeappservermodelEdgeApiDataChatOobWatching 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/chats/{room_id}/messages/{msg_id}/reactions")
    fun postApiV1ChatsByRoomIdMessagesByMsgIdReactions(@Path("room_id") roomId: kotlin.String, @Path("msg_id") msgId: kotlin.String, @Body coedgeappservermodelEdgeApiDataChatOobWatching: CoedgeappservermodelEdgeApiDataChatOobWatching, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * POST api/v1/chats/{room_id}/messages/read
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roomId 
     * @param coedgeappservermodelEdgeApiDataChatMessageRead 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/chats/{room_id}/messages/read")
    fun postApiV1ChatsByRoomIdMessagesRead(@Path("room_id") roomId: kotlin.String, @Body coedgeappservermodelEdgeApiDataChatMessageRead: CoedgeappservermodelEdgeApiDataChatMessageRead, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * POST api/v1/chats/{room_id}/oob/read
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roomId 
     * @param coedgeappservermodelEdgeApiDataChatMessageRead 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @POST("api/v1/chats/{room_id}/oob/read")
    fun postApiV1ChatsByRoomIdOobRead(@Path("room_id") roomId: kotlin.String, @Body coedgeappservermodelEdgeApiDataChatMessageRead: CoedgeappservermodelEdgeApiDataChatMessageRead, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * POST api/v1/chats/{room_id}/oob/watching
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roomId 
     * @param coedgeappservermodelEdgeApiDataChatOobWatching 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataNewId]>
     */
    @POST("api/v1/chats/{room_id}/oob/watching")
    fun postApiV1ChatsByRoomIdOobWatching(@Path("room_id") roomId: kotlin.String, @Body coedgeappservermodelEdgeApiDataChatOobWatching: CoedgeappservermodelEdgeApiDataChatOobWatching, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataNewId>


    /**
    * enum for parameter eventType
    */
    enum class EventTypePostApiV1ChatsByRoomIdSupportByEventType(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "ABANDON") ABANDON("ABANDON"),
        @Json(name = "RESOLVE") RESOLVE("RESOLVE"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * POST api/v1/chats/{room_id}/support/{event_type}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roomId 
     * @param eventType 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/chats/{room_id}/support/{event_type}")
    fun postApiV1ChatsByRoomIdSupportByEventType(@Path("room_id") roomId: kotlin.String, @Path("event_type") eventType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

}
