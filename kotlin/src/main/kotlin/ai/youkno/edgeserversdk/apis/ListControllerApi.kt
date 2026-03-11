package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.ListsListDef
import ai.youkno.edgeserversdk.models.ListsListDef2

interface ListControllerApi {
    /**
     * DELETE api/v1/lists/{listId}/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param listId 
     * @param scopeName 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/lists/{listId}/{scopeName}")
    fun deleteApiV1ListsByListidByScopename(@Path("listId") listId: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/lists/{listId}/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param listId 
     * @param scopeName 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ListsListDef2]>
     */
    @GET("api/v1/lists/{listId}/{scopeName}")
    fun getApiV1ListsByListidByScopename(@Path("listId") listId: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListsListDef2>

    /**
     * GET api/v1/lists/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param scopeName 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ListsListDef]>
     */
    @GET("api/v1/lists/{scopeName}")
    fun getApiV1ListsByScopename(@Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListsListDef>

    /**
     * POST api/v1/lists/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param scopeName 
     * @param listsListDef2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ListsListDef2]>
     */
    @POST("api/v1/lists/{scopeName}")
    fun postApiV1ListsByScopename(@Path("scopeName") scopeName: kotlin.String, @Body listsListDef2: ListsListDef2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListsListDef2>

    /**
     * PUT api/v1/lists/{listId}/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param listId 
     * @param scopeName 
     * @param listsListDef2 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ListsListDef2]>
     */
    @PUT("api/v1/lists/{listId}/{scopeName}")
    fun putApiV1ListsByListidByScopename(@Path("listId") listId: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Body listsListDef2: ListsListDef2, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ListsListDef2>

}
