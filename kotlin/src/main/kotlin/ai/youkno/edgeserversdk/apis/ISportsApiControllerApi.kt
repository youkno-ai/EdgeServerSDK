package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.ISportsApiResultListEventsInfo
import ai.youkno.edgeserversdk.models.ISportsApiResultListInjuryInfo
import ai.youkno.edgeserversdk.models.ISportsApiResultListLineupInfo
import ai.youkno.edgeserversdk.models.ISportsApiResultListLiveTextInfo
import ai.youkno.edgeserversdk.models.ISportsApiResultListMatchInfo
import ai.youkno.edgeserversdk.models.ISportsApiResultListStatsInfo
import ai.youkno.edgeserversdk.models.ISportsApiResultListTeamInfo
import ai.youkno.edgeserversdk.models.ISportsApiResultStandingsInfo

interface ISportsApiControllerApi {
    /**
     * GET api/v1/isports/football/events
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param date  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultListEventsInfo]>
     */
    @GET("api/v1/isports/football/events")
    fun getFootballEvents(@Query("date") date: kotlin.Long? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultListEventsInfo>

    /**
     * GET api/v1/isports/football/injury
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param matchId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultListInjuryInfo]>
     */
    @GET("api/v1/isports/football/injury")
    fun getFootballInjury(@Query("matchId") matchId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultListInjuryInfo>

    /**
     * GET api/v1/isports/football/lineups
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param matchId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultListLineupInfo]>
     */
    @GET("api/v1/isports/football/lineups")
    fun getFootballLineups(@Query("matchId") matchId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultListLineupInfo>

    /**
     * GET api/v1/isports/football/livescores
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultListMatchInfo]>
     */
    @GET("api/v1/isports/football/livescores")
    fun getFootballLivescores(@Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultListMatchInfo>

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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultListMatchInfo]>
     */
    @GET("api/v1/isports/football/schedule")
    fun getFootballSchedule(@Query("date") date: kotlin.Long? = null, @Query("leagueId") leagueId: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("season") season: kotlin.String? = null, @Query("subLeagueId") subLeagueId: kotlin.String? = null, @Query("stageId") stageId: kotlin.String? = null, @Query("matchId") matchId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultListMatchInfo>

    /**
     * GET api/v1/isports/football/standing/league
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param leagueId 
     * @param subLeagueId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultStandingsInfo]>
     */
    @GET("api/v1/isports/football/standing/league")
    fun getFootballStandings(@Query("leagueId") leagueId: kotlin.String, @Query("subLeagueId") subLeagueId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultStandingsInfo>

    /**
     * GET api/v1/isports/football/stats
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param date  (optional)
     * @param matchId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultListStatsInfo]>
     */
    @GET("api/v1/isports/football/stats")
    fun getFootballStats(@Query("date") date: kotlin.Long? = null, @Query("matchId") matchId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultListStatsInfo>

    /**
     * GET api/v1/isports/football/team
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param leagueId  (optional)
     * @param teamId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultListTeamInfo]>
     */
    @GET("api/v1/isports/football/team")
    fun getFootballTeam(@Query("leagueId") leagueId: kotlin.String? = null, @Query("teamId") teamId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultListTeamInfo>

    /**
     * GET api/v1/isports/football/livetext
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param matchId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[ISportsApiResultListLiveTextInfo]>
     */
    @GET("api/v1/isports/football/livetext")
    fun getLiveText(@Query("matchId") matchId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<ISportsApiResultListLiveTextInfo>

}
