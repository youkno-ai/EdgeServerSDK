package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.JoinCampaign
import ai.youkno.edgeserversdk.models.JoinCampaignRequest

interface CampaignControllerApi {
    /**
     * POST api/v1/campaigns/{client}/join
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param joinCampaignRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[JoinCampaign]>
     */
    @POST("api/v1/campaigns/{client}/join")
    fun createJoinCampaign(@Path("client") client: kotlin.String, @Body joinCampaignRequest: JoinCampaignRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<JoinCampaign>

    /**
     * DELETE api/v1/campaigns/{client}/join
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param joinCampaignRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.Map<kotlin.String, kotlin.Any>]>
     */
    @DELETE("api/v1/campaigns/{client}/join")
    fun deleteJoinCampaign(@Path("client") client: kotlin.String, @Body joinCampaignRequest: JoinCampaignRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.Map<kotlin.String, kotlin.Any>>

    /**
     * GET api/v1/campaigns/{client}/join/{campaignId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param campaignId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[JoinCampaign]>
     */
    @GET("api/v1/campaigns/{client}/join/{campaignId}")
    fun getJoinCampaign(@Path("client") client: kotlin.String, @Path("campaignId") campaignId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<JoinCampaign>

    /**
     * GET api/v1/campaigns/{client}/join
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<JoinCampaign>]>
     */
    @GET("api/v1/campaigns/{client}/join")
    fun getJoinCampaigns(@Path("client") client: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<JoinCampaign>>

    /**
     * PUT api/v1/campaigns/{client}/join
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param client 
     * @param joinCampaignRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[JoinCampaign]>
     */
    @PUT("api/v1/campaigns/{client}/join")
    fun updateJoinCampaign(@Path("client") client: kotlin.String, @Body joinCampaignRequest: JoinCampaignRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<JoinCampaign>

}
