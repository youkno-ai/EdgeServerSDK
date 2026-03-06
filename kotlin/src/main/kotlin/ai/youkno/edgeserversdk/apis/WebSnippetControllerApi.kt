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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[NewId]>
     */
    @POST("api/v1/web-snippets")
    fun createSnippet(@Body webSnippet: WebSnippet, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<NewId>

    /**
     * DELETE api/v1/web-snippets/{id}
     * 
     * 
     * Responses:
     *  - 204: No Content
     *
     * @param id 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Unit]>
     */
    @DELETE("api/v1/web-snippets/{id}")
    fun delete(@Path("id") id: java.util.UUID, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Unit>

    /**
     * GET api/v1/web-snippets/{snippetId}/render
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param snippetId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("api/v1/web-snippets/{snippetId}/render")
    fun getHtmlSnippetById(@Path("snippetId") snippetId: java.util.UUID, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.String>

    /**
     * GET api/v1/web-snippets/{snippetId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param snippetId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[WebSnippet]>
     */
    @GET("api/v1/web-snippets/{snippetId}")
    fun getSnippetById(@Path("snippetId") snippetId: java.util.UUID, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<WebSnippet>

    /**
     * GET api/v1/web-snippets
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param q  (optional)
     * @param slim  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.collections.List<WebSnippet>]>
     */
    @GET("api/v1/web-snippets")
    fun listSnippets(@Query("q") q: kotlin.String? = null, @Query("slim") slim: kotlin.Boolean? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.collections.List<WebSnippet>>

    /**
     * PUT api/v1/web-snippets/{id}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param id 
     * @param webSnippet 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[WebSnippet]>
     */
    @PUT("api/v1/web-snippets/{id}")
    fun updateSnippet(@Path("id") id: java.util.UUID, @Body webSnippet: WebSnippet, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<WebSnippet>

}
