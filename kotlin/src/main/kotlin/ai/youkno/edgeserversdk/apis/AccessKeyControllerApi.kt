package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AccessKey
import ai.youkno.edgeserversdk.models.AccessKeyDef
import ai.youkno.edgeserversdk.models.MetaData
import ai.youkno.edgeserversdk.models.PageAccessKey
import ai.youkno.edgeserversdk.models.PageAccessKeyDef

interface AccessKeyControllerApi {
    /**
     * DELETE api/v1/accessKeys/{userId}/revoke/{accessKeyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param accessKeyId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/accessKeys/{userId}/revoke/{accessKeyId}")
    fun deleteApiV1AccesskeysByUseridRevokeByAccesskeyid(@Path("userId") userId: kotlin.String, @Path("accessKeyId") accessKeyId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * DELETE api/v1/accessKeys/defs/{accessKeyDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accessKeyDefId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/accessKeys/defs/{accessKeyDefId}")
    fun deleteApiV1AccesskeysDefsByAccesskeydefid(@Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/accessKeys/{userId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageAccessKey]>
     */
    @GET("api/v1/accessKeys/{userId}")
    fun getApiV1AccesskeysByUserid(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageAccessKey>

    /**
     * GET api/v1/accessKeys/{userId}/{accessKeyDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param accessKeyDefId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageAccessKey]>
     */
    @GET("api/v1/accessKeys/{userId}/{accessKeyDefId}")
    fun getApiV1AccesskeysByUseridByAccesskeydefid(@Path("userId") userId: kotlin.String, @Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageAccessKey>

    /**
     * GET api/v1/accessKeys/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[PageAccessKeyDef]>
     */
    @GET("api/v1/accessKeys/defs")
    fun getApiV1AccesskeysDefs(@Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageAccessKeyDef>

    /**
     * GET api/v1/accessKeys/defs/{accessKeyDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accessKeyDefId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AccessKeyDef]>
     */
    @GET("api/v1/accessKeys/defs/{accessKeyDefId}")
    fun getApiV1AccesskeysDefsByAccesskeydefid(@Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AccessKeyDef>

    /**
     * POST api/v1/accessKeys/{userId}/grant/{accessKeyDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param accessKeyDefId 
     * @param metaData 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AccessKey]>
     */
    @POST("api/v1/accessKeys/{userId}/grant/{accessKeyDefId}")
    fun postApiV1AccesskeysByUseridGrantByAccesskeydefid(@Path("userId") userId: kotlin.String, @Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Body metaData: MetaData, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AccessKey>

    /**
     * POST api/v1/accessKeys/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accessKeyDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AccessKeyDef]>
     */
    @POST("api/v1/accessKeys/defs")
    fun postApiV1AccesskeysDefs(@Body accessKeyDef: AccessKeyDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AccessKeyDef>

}
