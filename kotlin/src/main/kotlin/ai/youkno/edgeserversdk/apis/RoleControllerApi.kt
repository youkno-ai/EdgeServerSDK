package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.PagePermission
import ai.youkno.edgeserversdk.models.PageRole
import ai.youkno.edgeserversdk.models.PageScope
import ai.youkno.edgeserversdk.models.Role

interface RoleControllerApi {
    /**
     * DELETE api/v1/roles/{roleName}/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roleName 
     * @param scopeName 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/roles/{roleName}/{scopeName}")
    fun deleteApiV1RolesByRolenameByScopename(@Path("roleName") roleName: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/roles/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param scopeName 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageRole]>
     */
    @GET("api/v1/roles/{scopeName}")
    fun getApiV1RolesByScopename(@Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageRole>

    /**
     * GET api/v1/roles/ops/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param scopeName 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PagePermission]>
     */
    @GET("api/v1/roles/ops/{scopeName}")
    fun getApiV1RolesOpsByScopename(@Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PagePermission>

    /**
     * GET api/v1/roles/resolve
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageRole]>
     */
    @GET("api/v1/roles/resolve")
    fun getApiV1RolesResolve(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageRole>

    /**
     * GET api/v1/roles/scopes
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageScope]>
     */
    @GET("api/v1/roles/scopes")
    fun getApiV1RolesScopes(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageScope>

    /**
     * POST api/v1/roles/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param scopeName 
     * @param role 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Role]>
     */
    @POST("api/v1/roles/{scopeName}")
    fun postApiV1RolesByScopename(@Path("scopeName") scopeName: kotlin.String, @Body role: Role, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Role>

    /**
     * PUT api/v1/roles/{roleName}/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param roleName 
     * @param scopeName 
     * @param role 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Role]>
     */
    @PUT("api/v1/roles/{roleName}/{scopeName}")
    fun putApiV1RolesByRolenameByScopename(@Path("roleName") roleName: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Body role: Role, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Role>

}
