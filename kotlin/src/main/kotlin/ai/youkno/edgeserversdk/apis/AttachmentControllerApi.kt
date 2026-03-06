package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CoedgeappservermodelAttachmentsAttachment
import ai.youkno.edgeserversdk.models.CoedgeappservermodelStorageRefResponse

interface AttachmentControllerApi {

    /**
    * enum for parameter anchorType
    */
    enum class AnchorTypeGetApiV1AttachmentsByAnchortypeByAnchoridStorageRef(val value: kotlin.String) {
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
     * @return [Call]<[CoedgeappservermodelStorageRefResponse]>
     */
    @GET("api/v1/attachments/{anchorType}/{anchorId}/storage/ref")
    fun getApiV1AttachmentsByAnchortypeByAnchoridStorageRef(@Path("anchorType") anchorType: kotlin.String, @Path("anchorId") anchorId: kotlin.String, @Query("attachmentType") attachmentType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelStorageRefResponse>


    /**
    * enum for parameter anchorType
    */
    enum class AnchorTypePostApiV1AttachmentsByAnchortypeByAnchorid(val value: kotlin.String) {
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
     * @param coedgeappservermodelAttachmentsAttachment 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[CoedgeappservermodelAttachmentsAttachment]>
     */
    @POST("api/v1/attachments/{anchorType}/{anchorId}")
    fun postApiV1AttachmentsByAnchortypeByAnchorid(@Path("anchorType") anchorType: kotlin.String, @Path("anchorId") anchorId: kotlin.String, @Body coedgeappservermodelAttachmentsAttachment: CoedgeappservermodelAttachmentsAttachment, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<CoedgeappservermodelAttachmentsAttachment>

}
