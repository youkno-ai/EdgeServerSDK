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
     * POST api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationDef 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ReputationDef]>
     */
    @POST("api/v1/reputations/defs")
    fun addReputationDef(@Body reputationDef: ReputationDef, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ReputationDef>

    /**
     * POST api/v1/reputations/defs/{reputationCode}/assign
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param assignReputationReq 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Reputation]>
     */
    @POST("api/v1/reputations/defs/{reputationCode}/assign")
    fun assignReputation(@Path("reputationCode") reputationCode: kotlin.String, @Body assignReputationReq: AssignReputationReq, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Reputation>

    /**
     * DELETE api/v1/reputations/{reputationCode}/{holderId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param holderId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/reputations/{reputationCode}/{holderId}")
    fun deleteReputation(@Path("reputationCode") reputationCode: kotlin.String, @Path("holderId") holderId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * DELETE api/v1/reputations/defs/{reputationCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/reputations/defs/{reputationCode}")
    fun deleteReputationDef(@Path("reputationCode") reputationCode: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * PUT api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationDef 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ReputationDef]>
     */
    @PUT("api/v1/reputations/defs")
    fun editReputationDef(@Body reputationDef: ReputationDef, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ReputationDef>

    /**
     * GET api/v1/reputations/defs/{reputationCode}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param reputationCode 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ReputationDef]>
     */
    @GET("api/v1/reputations/defs/{reputationCode}")
    fun getReputationDef(@Path("reputationCode") reputationCode: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ReputationDef>

    /**
     * GET api/v1/reputations/defs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageReputationDef]>
     */
    @GET("api/v1/reputations/defs")
    fun getReputationDefs(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageReputationDef>

}
