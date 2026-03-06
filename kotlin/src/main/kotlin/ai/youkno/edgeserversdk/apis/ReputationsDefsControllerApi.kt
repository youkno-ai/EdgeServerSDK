package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AssignReputationReq
import ai.youkno.edgeserversdk.models.PageReputationDef
import ai.youkno.edgeserversdk.models.Reputation
import ai.youkno.edgeserversdk.models.ReputationDef

interface ReputationsDefsControllerApi {
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
     * @return [Call]<[PageReputationDef]>
     */
    @GET("api/v1/reputations/defs")
    fun getApiV1ReputationsDefs(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<PageReputationDef>

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
     * @return [Call]<[ReputationDef]>
     */
    @GET("api/v1/reputations/defs/{reputationCode}")
    fun getApiV1ReputationsDefsByReputationcode(@Path("reputationCode") reputationCode: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ReputationDef>

    /**
     * POST api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ReputationDef]>
     */
    @POST("api/v1/reputations/defs")
    fun postApiV1ReputationsDefs(@Body reputationDef: ReputationDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ReputationDef>

    /**
     * POST api/v1/reputations/defs/{reputationCode}/assign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param assignReputationReq 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Reputation]>
     */
    @POST("api/v1/reputations/defs/{reputationCode}/assign")
    fun postApiV1ReputationsDefsByReputationcodeAssign(@Path("reputationCode") reputationCode: kotlin.String, @Body assignReputationReq: AssignReputationReq, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Reputation>

    /**
     * PUT api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationDef 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[ReputationDef]>
     */
    @PUT("api/v1/reputations/defs")
    fun putApiV1ReputationsDefs(@Body reputationDef: ReputationDef, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<ReputationDef>

}
