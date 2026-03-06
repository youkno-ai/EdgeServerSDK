package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.DeleteUserCallbackResp

interface FacebookControllerApi {
    /**
     * POST api/v1/facebook/callbacks/deauthorize/{state}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @POST("api/v1/facebook/callbacks/deauthorize/{state}")
    fun deauthorizeCallback(@Path("state") state: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

    /**
     * GET api/v1/facebook/status/{state}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state 
     * @param userId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.String]>
     */
    @GET("api/v1/facebook/status/{state}")
    fun getStatus(@Path("state") state: kotlin.String, @Query("user_id") userId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.String>

    /**
     * POST api/v1/facebook/callbacks/user-data-deletion/{state}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param state 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[DeleteUserCallbackResp]>
     */
    @POST("api/v1/facebook/callbacks/user-data-deletion/{state}")
    fun userDataDeletionCallback(@Path("state") state: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<DeleteUserCallbackResp>

}
