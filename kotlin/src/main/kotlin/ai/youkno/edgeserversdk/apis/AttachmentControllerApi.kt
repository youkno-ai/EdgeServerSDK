package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Attachment
import ai.youkno.edgeserversdk.models.StorageRefResponse

interface AttachmentControllerApi {

    /**
    * enum for parameter anchorType
    */
    enum class AnchorTypeGetUploadPath(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "USER") USER("USER"),
        @Json(name = "BOUNTY") BOUNTY("BOUNTY"),
        @Json(name = "RESPONSE") RESPONSE("RESPONSE"),
        @Json(name = "MESSAGE") MESSAGE("MESSAGE"),
        @Json(name = "VOUCHER") VOUCHER("VOUCHER"),
        @Json(name = "SETTINGS") SETTINGS("SETTINGS"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/attachments/{anchorType}/{anchorId}/storage/ref
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param anchorType 
     * @param anchorId 
     * @param attachmentType 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[StorageRefResponse]>
     */
    @GET("api/v1/attachments/{anchorType}/{anchorId}/storage/ref")
    fun getUploadPath(@Path("anchorType") anchorType: kotlin.String, @Path("anchorId") anchorId: kotlin.String, @Query("attachmentType") attachmentType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<StorageRefResponse>


    /**
    * enum for parameter anchorType
    */
    enum class AnchorTypeSaveAttachment(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "USER") USER("USER"),
        @Json(name = "BOUNTY") BOUNTY("BOUNTY"),
        @Json(name = "RESPONSE") RESPONSE("RESPONSE"),
        @Json(name = "MESSAGE") MESSAGE("MESSAGE"),
        @Json(name = "VOUCHER") VOUCHER("VOUCHER"),
        @Json(name = "SETTINGS") SETTINGS("SETTINGS"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * POST api/v1/attachments/{anchorType}/{anchorId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param anchorType 
     * @param anchorId 
     * @param attachment 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[Attachment]>
     */
    @POST("api/v1/attachments/{anchorType}/{anchorId}")
    fun saveAttachment(@Path("anchorType") anchorType: kotlin.String, @Path("anchorId") anchorId: kotlin.String, @Body attachment: Attachment, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<Attachment>

}
