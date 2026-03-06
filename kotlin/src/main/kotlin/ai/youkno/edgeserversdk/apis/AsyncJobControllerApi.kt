package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.AsyncEventJSONB
import ai.youkno.edgeserversdk.models.AsyncJobJSONBJSONBJSONBJSONB
import ai.youkno.edgeserversdk.models.AsyncTaskJSONBJSONBJSONB
import ai.youkno.edgeserversdk.models.JobProgressResponse
import ai.youkno.edgeserversdk.models.QueueStats
import ai.youkno.edgeserversdk.models.ReleaseRequest
import ai.youkno.edgeserversdk.models.RenewLeaseRequest

interface AsyncJobControllerApi {
    /**
     * GET api/v1/async-jobs/jobs
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param status  (optional)
     * @param jobType  (optional)
     * @param entityType  (optional)
     * @param entityId  (optional)
     * @param limit  (optional, default to 50)
     * @param offset  (optional, default to 0)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<AsyncJobJSONBJSONBJSONBJSONB>]>
     */
    @GET("api/v1/async-jobs/jobs")
    fun getApiV1AsyncJobsJobs(@Query("status") status: kotlin.String? = null, @Query("jobType") jobType: kotlin.String? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("entityId") entityId: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = 50, @Query("offset") offset: kotlin.Int? = 0, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<AsyncJobJSONBJSONBJSONBJSONB>>

    /**
     * GET api/v1/async-jobs/jobs/{jobId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AsyncJobJSONBJSONBJSONBJSONB]>
     */
    @GET("api/v1/async-jobs/jobs/{jobId}")
    fun getApiV1AsyncJobsJobsByJobid(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AsyncJobJSONBJSONBJSONBJSONB>

    /**
     * GET api/v1/async-jobs/jobs/{jobId}/events
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param limit  (optional, default to 200)
     * @param afterCreatedAt  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<AsyncEventJSONB>]>
     */
    @GET("api/v1/async-jobs/jobs/{jobId}/events")
    fun getApiV1AsyncJobsJobsByJobidEvents(@Path("jobId") jobId: java.util.UUID, @Query("limit") limit: kotlin.Int? = 200, @Query("afterCreatedAt") afterCreatedAt: kotlin.Long? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<AsyncEventJSONB>>

    /**
     * GET api/v1/async-jobs/jobs/{jobId}/progress
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[JobProgressResponse]>
     */
    @GET("api/v1/async-jobs/jobs/{jobId}/progress")
    fun getApiV1AsyncJobsJobsByJobidProgress(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<JobProgressResponse>

    /**
     * GET api/v1/async-jobs/jobs/{jobId}/tasks
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param status  (optional)
     * @param taskType  (optional)
     * @param limit  (optional, default to 200)
     * @param offset  (optional, default to 0)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<AsyncTaskJSONBJSONBJSONB>]>
     */
    @GET("api/v1/async-jobs/jobs/{jobId}/tasks")
    fun getApiV1AsyncJobsJobsByJobidTasks(@Path("jobId") jobId: java.util.UUID, @Query("status") status: kotlin.String? = null, @Query("taskType") taskType: kotlin.String? = null, @Query("limit") limit: kotlin.Int? = 200, @Query("offset") offset: kotlin.Int? = 0, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<AsyncTaskJSONBJSONBJSONB>>

    /**
     * GET api/v1/async-jobs/jobs/{jobId}/tasks/{taskId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param taskId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[AsyncTaskJSONBJSONBJSONB]>
     */
    @GET("api/v1/async-jobs/jobs/{jobId}/tasks/{taskId}")
    fun getApiV1AsyncJobsJobsByJobidTasksByTaskid(@Path("jobId") jobId: java.util.UUID, @Path("taskId") taskId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<AsyncTaskJSONBJSONBJSONB>

    /**
     * GET api/v1/async-jobs/progress
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param entityType 
     * @param entityId 
     * @param jobType 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[JobProgressResponse]>
     */
    @GET("api/v1/async-jobs/progress")
    fun getApiV1AsyncJobsProgress(@Query("entityType") entityType: kotlin.String, @Query("entityId") entityId: kotlin.String, @Query("jobType") jobType: kotlin.String, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<JobProgressResponse>

    /**
     * GET api/v1/async-jobs/queues
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId  (optional)
     * @param entityType  (optional)
     * @param entityId  (optional)
     * @param taskType  (optional)
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.collections.List<QueueStats>]>
     */
    @GET("api/v1/async-jobs/queues")
    fun getApiV1AsyncJobsQueues(@Query("jobId") jobId: java.util.UUID? = null, @Query("entityType") entityType: kotlin.String? = null, @Query("entityId") entityId: kotlin.String? = null, @Query("taskType") taskType: kotlin.String? = null, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.collections.List<QueueStats>>

    /**
     * POST api/v1/async-jobs/jobs/{jobId}:cancel
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/async-jobs/jobs/{jobId}:cancel")
    fun postApiV1AsyncJobsJobsByJobidCancel(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.Boolean>

    /**
     * POST api/v1/async-jobs/jobs/{jobId}:pause
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/async-jobs/jobs/{jobId}:pause")
    fun postApiV1AsyncJobsJobsByJobidPause(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.Boolean>

    /**
     * POST api/v1/async-jobs/jobs/{jobId}:start
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/async-jobs/jobs/{jobId}:start")
    fun postApiV1AsyncJobsJobsByJobidStart(@Path("jobId") jobId: java.util.UUID, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.Boolean>

    /**
     * POST api/v1/async-jobs/jobs/{jobId}/tasks/{taskId}:release
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param taskId 
     * @param releaseRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/async-jobs/jobs/{jobId}/tasks/{taskId}:release")
    fun postApiV1AsyncJobsJobsByJobidTasksByTaskidRelease(@Path("jobId") jobId: java.util.UUID, @Path("taskId") taskId: java.util.UUID, @Body releaseRequest: ReleaseRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.Boolean>

    /**
     * POST api/v1/async-jobs/jobs/{jobId}/tasks/{taskId}:renew-lease
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param jobId 
     * @param taskId 
     * @param renewLeaseRequest 
     * @param xEdgeAgent  (optional)
     * @param xEdgeState  (optional)
     * @param xEdgeClientId  (optional)
     * @return [Call]<[kotlin.Boolean]>
     */
    @POST("api/v1/async-jobs/jobs/{jobId}/tasks/{taskId}:renew-lease")
    fun postApiV1AsyncJobsJobsByJobidTasksByTaskidRenewLease(@Path("jobId") jobId: java.util.UUID, @Path("taskId") taskId: java.util.UUID, @Body renewLeaseRequest: RenewLeaseRequest, @Header("X-edge-agent") xEdgeAgent: kotlin.String? = null, @Header("X-edge-state") xEdgeState: kotlin.String? = null, @Header("X-edge-client-id") xEdgeClientId: kotlin.String? = null): Call<kotlin.Boolean>

}
