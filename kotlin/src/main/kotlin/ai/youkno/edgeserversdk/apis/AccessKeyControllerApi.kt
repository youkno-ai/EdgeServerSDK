package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessKey
import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessKeyApiAccessKeyRequirement
import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessKeyApiKeychainAcquireRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessKeyApiKeychainUseRequest
import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessKeyApiKeychainUseResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessKeyApiRequirementEvaluationResponse
import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessKeyDef
import ai.youkno.edgeserversdk.models.CoedgeappservermodelAccessKeyDefMetaData
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessKey
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessKeyDef
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelScope

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
     * DELETE api/v1/accessKeys/defs/{accessKeyDefId}/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accessKeyDefId 
     * @param scopeName 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/accessKeys/defs/{accessKeyDefId}/{scopeName}")
    fun deleteApiV1AccesskeysDefsByAccesskeydefidByScopename(@Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * DELETE api/v1/accessKeys/keychain/{userId}/{virtualUserId}/{acquisitionId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param virtualUserId 
     * @param acquisitionId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/accessKeys/keychain/{userId}/{virtualUserId}/{acquisitionId}")
    fun deleteApiV1AccesskeysKeychainByUseridByVirtualuseridByAcquisitionid(@Path("userId") userId: kotlin.String, @Path("virtualUserId") virtualUserId: kotlin.String, @Path("acquisitionId") acquisitionId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * DELETE api/v1/accessKeys/requirements/{objectType}/{objectId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param objectType 
     * @param objectId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/accessKeys/requirements/{objectType}/{objectId}")
    fun deleteApiV1AccesskeysRequirementsByObjecttypeByObjectid(@Path("objectType") objectType: kotlin.String, @Path("objectId") objectId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessKey]>
     */
    @GET("api/v1/accessKeys/{userId}")
    fun getApiV1AccesskeysByUserid(@Path("userId") userId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessKey>

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessKey]>
     */
    @GET("api/v1/accessKeys/{userId}/{accessKeyDefId}")
    fun getApiV1AccesskeysByUseridByAccesskeydefid(@Path("userId") userId: kotlin.String, @Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessKey>

    /**
     * GET api/v1/accessKeys/defs/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param scopeName 
     * @param start  (optional, default to 0)
     * @param length  (optional, default to 20)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessKeyDef]>
     */
    @GET("api/v1/accessKeys/defs/{scopeName}")
    fun getApiV1AccesskeysDefsByScopename(@Path("scopeName") scopeName: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("length") length: kotlin.Int? = 20, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelAccessKeyDef>

    /**
     * GET api/v1/accessKeys/defs/id/{accessKeyDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accessKeyDefId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKeyDef]>
     */
    @GET("api/v1/accessKeys/defs/id/{accessKeyDefId}")
    fun getApiV1AccesskeysDefsIdByAccesskeydefid(@Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKeyDef>

    /**
     * GET api/v1/accessKeys/defs/scopes
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelScope]>
     */
    @GET("api/v1/accessKeys/defs/scopes")
    fun getApiV1AccesskeysDefsScopes(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelScope>

    /**
     * GET api/v1/accessKeys/requirements/{objectType}/{objectId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param objectType 
     * @param objectId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKeyApiAccessKeyRequirement]>
     */
    @GET("api/v1/accessKeys/requirements/{objectType}/{objectId}")
    fun getApiV1AccesskeysRequirementsByObjecttypeByObjectid(@Path("objectType") objectType: kotlin.String, @Path("objectId") objectId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKeyApiAccessKeyRequirement>

    /**
     * GET api/v1/accessKeys/requirements/{objectType}/{objectId}/evaluate/{userId}/{virtualUserId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param objectType 
     * @param objectId 
     * @param userId 
     * @param virtualUserId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKeyApiRequirementEvaluationResponse]>
     */
    @GET("api/v1/accessKeys/requirements/{objectType}/{objectId}/evaluate/{userId}/{virtualUserId}")
    fun getApiV1AccesskeysRequirementsByObjecttypeByObjectidEvaluateByUseridByVirtualuserid(@Path("objectType") objectType: kotlin.String, @Path("objectId") objectId: kotlin.String, @Path("userId") userId: kotlin.String, @Path("virtualUserId") virtualUserId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKeyApiRequirementEvaluationResponse>

    /**
     * POST api/v1/accessKeys/{userId}/grant/{accessKeyDefId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param accessKeyDefId 
     * @param coedgeappservermodelAccessKeyDefMetaData 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKey]>
     */
    @POST("api/v1/accessKeys/{userId}/grant/{accessKeyDefId}")
    fun postApiV1AccesskeysByUseridGrantByAccesskeydefid(@Path("userId") userId: kotlin.String, @Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Body coedgeappservermodelAccessKeyDefMetaData: CoedgeappservermodelAccessKeyDefMetaData, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKey>

    /**
     * POST api/v1/accessKeys/defs/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param scopeName 
     * @param coedgeappservermodelAccessKeyDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKeyDef]>
     */
    @POST("api/v1/accessKeys/defs/{scopeName}")
    fun postApiV1AccesskeysDefsByScopename(@Path("scopeName") scopeName: kotlin.String, @Body coedgeappservermodelAccessKeyDef: CoedgeappservermodelAccessKeyDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKeyDef>

    /**
     * POST api/v1/accessKeys/defs/standard/sync
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @POST("api/v1/accessKeys/defs/standard/sync")
    fun postApiV1AccesskeysDefsStandardSync(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * POST api/v1/accessKeys/keychain/{userId}/{virtualUserId}/acquire
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param virtualUserId 
     * @param coedgeappservermodelAccessKeyApiKeychainAcquireRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKey]>
     */
    @POST("api/v1/accessKeys/keychain/{userId}/{virtualUserId}/acquire")
    fun postApiV1AccesskeysKeychainByUseridByVirtualuseridAcquire(@Path("userId") userId: kotlin.String, @Path("virtualUserId") virtualUserId: kotlin.String, @Body coedgeappservermodelAccessKeyApiKeychainAcquireRequest: CoedgeappservermodelAccessKeyApiKeychainAcquireRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKey>

    /**
     * POST api/v1/accessKeys/keychain/{userId}/{virtualUserId}/use
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param userId 
     * @param virtualUserId 
     * @param coedgeappservermodelAccessKeyApiKeychainUseRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKeyApiKeychainUseResponse]>
     */
    @POST("api/v1/accessKeys/keychain/{userId}/{virtualUserId}/use")
    fun postApiV1AccesskeysKeychainByUseridByVirtualuseridUse(@Path("userId") userId: kotlin.String, @Path("virtualUserId") virtualUserId: kotlin.String, @Body coedgeappservermodelAccessKeyApiKeychainUseRequest: CoedgeappservermodelAccessKeyApiKeychainUseRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKeyApiKeychainUseResponse>

    /**
     * PUT api/v1/accessKeys/defs/{accessKeyDefId}/{scopeName}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param accessKeyDefId 
     * @param scopeName 
     * @param coedgeappservermodelAccessKeyDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKeyDef]>
     */
    @PUT("api/v1/accessKeys/defs/{accessKeyDefId}/{scopeName}")
    fun putApiV1AccesskeysDefsByAccesskeydefidByScopename(@Path("accessKeyDefId") accessKeyDefId: kotlin.String, @Path("scopeName") scopeName: kotlin.String, @Body coedgeappservermodelAccessKeyDef: CoedgeappservermodelAccessKeyDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKeyDef>

    /**
     * PUT api/v1/accessKeys/requirements/{objectType}/{objectId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param objectType 
     * @param objectId 
     * @param coedgeappservermodelAccessKeyApiAccessKeyRequirement 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAccessKeyApiAccessKeyRequirement]>
     */
    @PUT("api/v1/accessKeys/requirements/{objectType}/{objectId}")
    fun putApiV1AccesskeysRequirementsByObjecttypeByObjectid(@Path("objectType") objectType: kotlin.String, @Path("objectId") objectId: kotlin.String, @Body coedgeappservermodelAccessKeyApiAccessKeyRequirement: CoedgeappservermodelAccessKeyApiAccessKeyRequirement, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAccessKeyApiAccessKeyRequirement>

}
