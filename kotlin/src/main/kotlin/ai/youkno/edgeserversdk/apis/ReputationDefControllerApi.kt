package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.BaseSettingsReputationDef
import ai.youkno.edgeserversdk.models.EdgeApiDataAssignReputationReq
import ai.youkno.edgeserversdk.models.EdgeApiDataPageBaseSettingsReputationDef
import ai.youkno.edgeserversdk.models.UserReputation

interface ReputationDefControllerApi {
    /**
     * DELETE api/v1/reputations/{reputationCode}/{holderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param holderId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/reputations/{reputationCode}/{holderId}")
    fun deleteApiV1ReputationsByReputationcodeByHolderid(@Path("reputationCode") reputationCode: kotlin.String, @Path("holderId") holderId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * DELETE api/v1/reputations/defs/{reputationCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.String>]>
     */
    @DELETE("api/v1/reputations/defs/{reputationCode}")
    fun deleteApiV1ReputationsDefsByReputationcode(@Path("reputationCode") reputationCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.String>>

    /**
     * GET api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataPageBaseSettingsReputationDef]>
     */
    @GET("api/v1/reputations/defs")
    fun getApiV1ReputationsDefs(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataPageBaseSettingsReputationDef>

    /**
     * GET api/v1/reputations/defs/{reputationCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BaseSettingsReputationDef]>
     */
    @GET("api/v1/reputations/defs/{reputationCode}")
    fun getApiV1ReputationsDefsByReputationcode(@Path("reputationCode") reputationCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BaseSettingsReputationDef>

    /**
     * POST api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param baseSettingsReputationDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BaseSettingsReputationDef]>
     */
    @POST("api/v1/reputations/defs")
    fun postApiV1ReputationsDefs(@Body baseSettingsReputationDef: BaseSettingsReputationDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BaseSettingsReputationDef>

    /**
     * POST api/v1/reputations/defs/{reputationCode}/assign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param edgeApiDataAssignReputationReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[UserReputation]>
     */
    @POST("api/v1/reputations/defs/{reputationCode}/assign")
    fun postApiV1ReputationsDefsByReputationcodeAssign(@Path("reputationCode") reputationCode: kotlin.String, @Body edgeApiDataAssignReputationReq: EdgeApiDataAssignReputationReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<UserReputation>

    /**
     * PUT api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param baseSettingsReputationDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[BaseSettingsReputationDef]>
     */
    @PUT("api/v1/reputations/defs")
    fun putApiV1ReputationsDefs(@Body baseSettingsReputationDef: BaseSettingsReputationDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<BaseSettingsReputationDef>

}
