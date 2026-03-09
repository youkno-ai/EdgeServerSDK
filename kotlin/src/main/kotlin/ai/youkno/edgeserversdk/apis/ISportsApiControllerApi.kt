package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIEventsInfo
import ai.youkno.edgeserversdk.models.EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIInjuryInfo
import ai.youkno.edgeserversdk.models.EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPILineupInfo
import ai.youkno.edgeserversdk.models.EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPILiveTextInfo
import ai.youkno.edgeserversdk.models.EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIMatchInfo
import ai.youkno.edgeserversdk.models.EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIStatsInfo
import ai.youkno.edgeserversdk.models.EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPITeamInfo
import ai.youkno.edgeserversdk.models.EdgeApiDataISportsApiResultThirdpartiesISportsAPIAPIStandingsInfo

interface ISportsApiControllerApi {
    /**
     * GET api/v1/isports/football/events
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param date  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIEventsInfo]>
     */
    @GET("api/v1/isports/football/events")
    fun getApiV1IsportsFootballEvents(@Query("date") date: kotlin.Long? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIEventsInfo>

    /**
     * GET api/v1/isports/football/injury
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param matchId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIInjuryInfo]>
     */
    @GET("api/v1/isports/football/injury")
    fun getApiV1IsportsFootballInjury(@Query("matchId") matchId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIInjuryInfo>

    /**
     * GET api/v1/isports/football/lineups
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param matchId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPILineupInfo]>
     */
    @GET("api/v1/isports/football/lineups")
    fun getApiV1IsportsFootballLineups(@Query("matchId") matchId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPILineupInfo>

    /**
     * GET api/v1/isports/football/livescores
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIMatchInfo]>
     */
    @GET("api/v1/isports/football/livescores")
    fun getApiV1IsportsFootballLivescores(@Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIMatchInfo>

    /**
     * GET api/v1/isports/football/livetext
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param matchId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPILiveTextInfo]>
     */
    @GET("api/v1/isports/football/livetext")
    fun getApiV1IsportsFootballLivetext(@Query("matchId") matchId: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPILiveTextInfo>

    /**
     * GET api/v1/isports/football/schedule
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param date  (optional)
     * @param leagueId  (optional)
     * @param season  (optional)
     * @param subLeagueId  (optional)
     * @param stageId  (optional)
     * @param matchId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIMatchInfo]>
     */
    @GET("api/v1/isports/football/schedule")
    fun getApiV1IsportsFootballSchedule(@Query("date") date: kotlin.Long? = null, @Query("leagueId") leagueId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("season") season: kotlin.String? = null, @Query("subLeagueId") subLeagueId: kotlin.String? = null, @Query("stageId") stageId: kotlin.String? = null, @Query("matchId") matchId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIMatchInfo>

    /**
     * GET api/v1/isports/football/standing/league
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param leagueId 
     * @param subLeagueId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultThirdpartiesISportsAPIAPIStandingsInfo]>
     */
    @GET("api/v1/isports/football/standing/league")
    fun getApiV1IsportsFootballStandingLeague(@Query("leagueId") leagueId: kotlin.String, @Query("subLeagueId") subLeagueId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultThirdpartiesISportsAPIAPIStandingsInfo>

    /**
     * GET api/v1/isports/football/stats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param date  (optional)
     * @param matchId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIStatsInfo]>
     */
    @GET("api/v1/isports/football/stats")
    fun getApiV1IsportsFootballStats(@Query("date") date: kotlin.Long? = null, @Query("matchId") matchId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPIStatsInfo>

    /**
     * GET api/v1/isports/football/team
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param leagueId  (optional)
     * @param teamId  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPITeamInfo]>
     */
    @GET("api/v1/isports/football/team")
    fun getApiV1IsportsFootballTeam(@Query("leagueId") leagueId: kotlin.String? = null, @Query("teamId") teamId: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<EdgeApiDataISportsApiResultListThirdpartiesISportsAPIAPITeamInfo>

}
