package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Search200Response

interface SearchControllerApi {
    /**
     * GET api/v1/search/{type}
     * 
     * 
     * Responses:
     *  - 200: Type of response depends on requested type parameter
     *
     * @param type 
     * @param searchText  (optional)
     * @param searchTags  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Search200Response]>
     */
    @GET("api/v1/search/{type}")
    fun search(@Path("type") type: kotlin.String, @Query("searchText") searchText: kotlin.String? = null, @Query("searchTags") searchTags: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Search200Response>

}
