package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelListsListDef
import ai.youkno.edgeserversdk.models.CoedgeappservermodelListsListDef

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
     * @return [Call]<[CoedgeappservermodelListsListDef]>
     */
    @GET("api/v1/lists/{listId}/{scopeName}")
    fun getApiV1ListsByListidByScopename(@Path("listId") listId: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelListsListDef>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelListsListDef]>
     */
    @GET("api/v1/lists/{scopeName}")
    fun getApiV1ListsByScopename(@Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelListsListDef>

    /**
     * POST api/v1/lists/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param scopeName 
     * @param coedgeappservermodelListsListDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelListsListDef]>
     */
    @POST("api/v1/lists/{scopeName}")
    fun postApiV1ListsByScopename(@Path("scopeName") scopeName: kotlin.String, @Body coedgeappservermodelListsListDef: CoedgeappservermodelListsListDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelListsListDef>

    /**
     * PUT api/v1/lists/{listId}/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param listId 
     * @param scopeName 
     * @param coedgeappservermodelListsListDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelListsListDef]>
     */
    @PUT("api/v1/lists/{listId}/{scopeName}")
    fun putApiV1ListsByListidByScopename(@Path("listId") listId: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Body coedgeappservermodelListsListDef: CoedgeappservermodelListsListDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelListsListDef>

}
