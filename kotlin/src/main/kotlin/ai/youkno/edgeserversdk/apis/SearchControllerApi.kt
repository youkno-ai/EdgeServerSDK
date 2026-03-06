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
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Search200Response]>
     */
    @GET("api/v1/search/{type}")
    fun search(@Path("type") type: kotlin.String, @Query("searchText") searchText: kotlin.String? = null, @Query("searchTags") searchTags: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Search200Response>

}
