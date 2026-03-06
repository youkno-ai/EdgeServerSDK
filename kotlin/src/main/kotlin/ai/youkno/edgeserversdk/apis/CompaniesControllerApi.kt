package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.CompanyEmployeesResult
import ai.youkno.edgeserversdk.models.PageUser

interface CompaniesControllerApi {
    /**
     * DELETE api/v1/companies/{companyId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/companies/{companyId}")
    fun deleteCompany(@Path("companyId") companyId: kotlin.String, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>


    /**
    * enum for parameter userStatus
    */
    enum class UserStatusGetCompanyEmployees(val value: kotlin.String) {
        @Json(name = "ACTIVE") ACTIVE("ACTIVE"),
        @Json(name = "INACTIVE") INACTIVE("INACTIVE"),
        @Json(name = "SUSPENDED") SUSPENDED("SUSPENDED"),
        @Json(name = "BLACKLISTED") BLACKLISTED("BLACKLISTED"),
        @Json(name = "TO_BE_DELETED") TO_BE_DELETED("TO_BE_DELETED"),
        @Json(name = "DELETED") DELETED("DELETED"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetCompanyEmployees(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }

    /**
     * GET api/v1/companies/{company_id}/employees
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param searchCriteria  (optional)
     * @param country  (optional)
     * @param gender  (optional)
     * @param start  (optional)
     * @param length  (optional)
     * @param userStatus  (optional)
     * @param searchMode  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[CompanyEmployeesResult]>
     */
    @GET("api/v1/companies/{company_id}/employees")
    fun getCompanyEmployees(@Path("company_id") companyId: kotlin.String, @Query("searchCriteria") searchCriteria: kotlin.String? = null, @Query("country") country: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("gender") gender: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = null, @Query("length") length: kotlin.Int? = null, @Query("userStatus") userStatus: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("searchMode") searchMode: SearchModeGetCompanyEmployees? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<CompanyEmployeesResult>


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetInviters(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }

    /**
     * GET api/v1/companies/{company_id}/inviters
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param searchMode  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[PageUser]>
     */
    @GET("api/v1/companies/{company_id}/inviters")
    fun getInviters(@Path("company_id") companyId: kotlin.String, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Query("searchMode") searchMode: SearchModeGetInviters? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<PageUser>


    /**
    * enum for parameter searchMode
    */
    enum class SearchModeGetUsersRegisteredByInviteCode(val value: kotlin.String) {
        @Json(name = "DEFAULT") DEFAULT("DEFAULT"),
        @Json(name = "REGULAR") REGULAR("REGULAR"),
        @Json(name = "TEST") TEST("TEST"),
        @Json(name = "ALL") ALL("ALL")
    }


    /**
    * enum for parameter searchFields
    */
    enum class SearchFieldsGetUsersRegisteredByInviteCode(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "USER_NAME") USER_NAME("USER_NAME"),
        @Json(name = "USER_FIRST_NAME") USER_FIRST_NAME("USER_FIRST_NAME"),
        @Json(name = "USER_LAST_NAME") USER_LAST_NAME("USER_LAST_NAME"),
        @Json(name = "USER_LATINIZED_NAME") USER_LATINIZED_NAME("USER_LATINIZED_NAME"),
        @Json(name = "USER_EMAIL") USER_EMAIL("USER_EMAIL"),
        @Json(name = "USER_COUNTRY_CODE") USER_COUNTRY_CODE("USER_COUNTRY_CODE"),
        @Json(name = "USER_CITY") USER_CITY("USER_CITY"),
        @Json(name = "EMPLOYER_NAME") EMPLOYER_NAME("EMPLOYER_NAME"),
        @Json(name = "BOUNTY_TITLE") BOUNTY_TITLE("BOUNTY_TITLE"),
        @Json(name = "BOUNTY_DESCRIPTION") BOUNTY_DESCRIPTION("BOUNTY_DESCRIPTION"),
        @Json(name = "BOUNTY_CREATOR_NAME") BOUNTY_CREATOR_NAME("BOUNTY_CREATOR_NAME"),
        @Json(name = "APPLICANT_POSITION") APPLICANT_POSITION("APPLICANT_POSITION"),
        @Json(name = "REFERRAL_CODE") REFERRAL_CODE("REFERRAL_CODE"),
        @Json(name = "PIN") PIN("PIN"),
        @Json(name = "COUNTRY") COUNTRY("COUNTRY"),
        @Json(name = "COMPANY_NAME") COMPANY_NAME("COMPANY_NAME"),
        @Json(name = "PHONE") PHONE("PHONE"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/companies/{company_id}/invitees
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param companyId 
     * @param gender  (optional)
     * @param inviter  (optional)
     * @param inviteCode  (optional)
     * @param start  (optional, default to 0)
     * @param limit  (optional, default to 50)
     * @param searchMode  (optional)
     * @param blacklisted  (optional)
     * @param query  (optional)
     * @param searchFields  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @GET("api/v1/companies/{company_id}/invitees")
    fun getUsersRegisteredByInviteCode(@Path("company_id") companyId: kotlin.String, @Query("gender") gender: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("inviter") inviter: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("inviteCode") inviteCode: @JvmSuppressWildcards kotlin.collections.List<kotlin.String>? = null, @Query("start") start: kotlin.Int? = 0, @Query("limit") limit: kotlin.Int? = 50, @Query("searchMode") searchMode: SearchModeGetUsersRegisteredByInviteCode? = null, @Query("blacklisted") blacklisted: kotlin.Boolean? = null, @Query("query") query: kotlin.String? = null, @Query("searchFields") searchFields: @JvmSuppressWildcards kotlin.collections.Set<kotlin.String>? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>

}
