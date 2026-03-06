package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.NewId
import ai.youkno.edgeserversdk.models.WebSnippet

interface WebSnippetControllerApi {
    /**
     * POST api/v1/web-snippets
     * 
     * 
     * Responses:
     *  - 201: Created
     *
     * @param webSnippet 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/web-snippets")
    fun createSnippet(@Body webSnippet: WebSnippet, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<NewId>

    /**
     * DELETE api/v1/web-snippets/{id}
     * 
     * 
     * Responses:
     *  - 204: No Content
     *
     * @param id 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/web-snippets/{id}")
    fun delete(@Path("id") id: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Unit>

    /**
     * GET api/v1/web-snippets/{snippetId}/render
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param snippetId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("api/v1/web-snippets/{snippetId}/render")
    fun getHtmlSnippetById(@Path("snippetId") snippetId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.String>

    /**
     * GET api/v1/web-snippets/{snippetId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param snippetId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebSnippet]>
     */
    @GET("api/v1/web-snippets/{snippetId}")
    fun getSnippetById(@Path("snippetId") snippetId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebSnippet>

    /**
     * GET api/v1/web-snippets
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param q  (optional)
     * @param slim  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<WebSnippet>]>
     */
    @GET("api/v1/web-snippets")
    fun listSnippets(@Query("q") q: kotlin.String? = null, @Query("slim") slim: kotlin.Boolean? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<WebSnippet>>

    /**
     * PUT api/v1/web-snippets/{id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param webSnippet 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[WebSnippet]>
     */
    @PUT("api/v1/web-snippets/{id}")
    fun updateSnippet(@Path("id") id: java.util.UUID, @Body webSnippet: WebSnippet, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<WebSnippet>

}
