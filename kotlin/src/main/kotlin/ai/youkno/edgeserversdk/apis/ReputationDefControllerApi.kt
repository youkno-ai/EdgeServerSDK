package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelBaseSettingsReputationDef
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataAssignReputationReq
import ai.youkno.edgeserversdk.models.CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBaseSettingsReputationDef
import ai.youkno.edgeserversdk.models.CoedgeappservermodelUserReputation

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
     * @return [Call]<[CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBaseSettingsReputationDef]>
     */
    @GET("api/v1/reputations/defs")
    fun getApiV1ReputationsDefs(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelEdgeApiDataPageCoedgeappservermodelBaseSettingsReputationDef>

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
     * @return [Call]<[CoedgeappservermodelBaseSettingsReputationDef]>
     */
    @GET("api/v1/reputations/defs/{reputationCode}")
    fun getApiV1ReputationsDefsByReputationcode(@Path("reputationCode") reputationCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBaseSettingsReputationDef>

    /**
     * POST api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelBaseSettingsReputationDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBaseSettingsReputationDef]>
     */
    @POST("api/v1/reputations/defs")
    fun postApiV1ReputationsDefs(@Body coedgeappservermodelBaseSettingsReputationDef: CoedgeappservermodelBaseSettingsReputationDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBaseSettingsReputationDef>

    /**
     * POST api/v1/reputations/defs/{reputationCode}/assign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param coedgeappservermodelEdgeApiDataAssignReputationReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelUserReputation]>
     */
    @POST("api/v1/reputations/defs/{reputationCode}/assign")
    fun postApiV1ReputationsDefsByReputationcodeAssign(@Path("reputationCode") reputationCode: kotlin.String, @Body coedgeappservermodelEdgeApiDataAssignReputationReq: CoedgeappservermodelEdgeApiDataAssignReputationReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelUserReputation>

    /**
     * PUT api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param coedgeappservermodelBaseSettingsReputationDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelBaseSettingsReputationDef]>
     */
    @PUT("api/v1/reputations/defs")
    fun putApiV1ReputationsDefs(@Body coedgeappservermodelBaseSettingsReputationDef: CoedgeappservermodelBaseSettingsReputationDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelBaseSettingsReputationDef>

}
