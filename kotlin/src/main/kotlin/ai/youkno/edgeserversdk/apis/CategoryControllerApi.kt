package ai.youkno.edgeserversdk.apis

import ai.youkno.edgeserversdk.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Call
import okhttp3.RequestBody
import com.squareup.moshi.Json

import ai.youkno.edgeserversdk.models.Category

interface CategoryControllerApi {
    /**
     * POST api/v1/categories
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param category 
     * @param clientId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Category]>
     */
    @POST("api/v1/categories")
    fun createCategory(@Body category: Category, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Category>

    /**
     * DELETE api/v1/categories/{categoryId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param categoryId 
     * @param clientId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[kotlin.Any]>
     */
    @DELETE("api/v1/categories/{categoryId}")
    fun deleteCategory(@Path("categoryId") categoryId: kotlin.Int, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<kotlin.Any>


    /**
    * enum for parameter categoryType
    */
    enum class CategoryTypeGetCategoriesByType(val value: kotlin.String) {
        @Json(name = "NONE") NONE("NONE"),
        @Json(name = "QUESTION") QUESTION("QUESTION"),
        @Json(name = "THREAD") THREAD("THREAD"),
        @Json(name = "TALENT_SEARCH") TALENT_SEARCH("TALENT_SEARCH"),
        @Json(name = "TALENT_RECOMMENDATION") TALENT_RECOMMENDATION("TALENT_RECOMMENDATION"),
        @Json(name = "TMOB_CHALLENGE") TMOB_CHALLENGE("TMOB_CHALLENGE"),
        @Json(name = "TMOB_COACHING") TMOB_COACHING("TMOB_COACHING"),
        @Json(name = "ORDER") ORDER("ORDER"),
        @Json(name = "REALESTATE_CUSTOMER") REALESTATE_CUSTOMER("REALESTATE_CUSTOMER"),
        @Json(name = "REALESTATE_RECOMMENDATION") REALESTATE_RECOMMENDATION("REALESTATE_RECOMMENDATION"),
        @Json(name = "SURVEY") SURVEY("SURVEY"),
        @Json(name = "CLASSIFIED") CLASSIFIED("CLASSIFIED"),
        @Json(name = "PRODUCT") PRODUCT("PRODUCT"),
        @Json(name = "BUNDLE") BUNDLE("BUNDLE"),
        @Json(name = "STORY") STORY("STORY"),
        @Json(name = "SCORE") SCORE("SCORE"),
        @Json(name = "SERIES") SERIES("SERIES"),
        @Json(name = "CHECKLIST") CHECKLIST("CHECKLIST"),
        @Json(name = "SUPPORT") SUPPORT("SUPPORT"),
        @Json(name = "AI_BOT") AI_BOT("AI_BOT"),
        @Json(name = "DEAL") DEAL("DEAL"),
        @Json(name = "PROMOTION") PROMOTION("PROMOTION"),
        @Json(name = "AUTOSUGGESTION") AUTOSUGGESTION("AUTOSUGGESTION"),
        @Json(name = "APPROVAL") APPROVAL("APPROVAL"),
        @Json(name = "MCQ") MCQ("MCQ"),
        @Json(name = "FUNDING") FUNDING("FUNDING"),
        @Json(name = "AUCTION") AUCTION("AUCTION"),
        @Json(name = "ROLEPLAY") ROLEPLAY("ROLEPLAY"),
        @Json(name = "PRIVATE_LISTING") PRIVATE_LISTING("PRIVATE_LISTING"),
        @Json(name = "QUEST") QUEST("QUEST"),
        @Json(name = "LIVE_STREAM") LIVE_STREAM("LIVE_STREAM"),
        @Json(name = "ALBUM") ALBUM("ALBUM"),
        @Json(name = "NEWS") NEWS("NEWS"),
        @Json(name = "BANNER") BANNER("BANNER"),
        @Json(name = "MATCH") MATCH("MATCH"),
        @Json(name = "CONTEST") CONTEST("CONTEST"),
        @Json(name = "TRIVIA") TRIVIA("TRIVIA"),
        @Json(name = "LOTTERY") LOTTERY("LOTTERY"),
        @Json(name = "BADGE_COLLECTION") BADGE_COLLECTION("BADGE_COLLECTION"),
        @Json(name = "RAFFLE") RAFFLE("RAFFLE"),
        @Json(name = "CALENDAR_EVENT") CALENDAR_EVENT("CALENDAR_EVENT"),
        @Json(name = "CURRENCY") CURRENCY("CURRENCY"),
        @Json(name = "RESERVATION") RESERVATION("RESERVATION"),
        @Json(name = "QUICK_CLAIM") QUICK_CLAIM("QUICK_CLAIM"),
        @Json(name = "CAMPAIGN") CAMPAIGN("CAMPAIGN"),
        @Json(name = "EXPRESS_CAMPAIGN") EXPRESS_CAMPAIGN("EXPRESS_CAMPAIGN"),
        @Json(name = "GEO_LOCATION") GEO_LOCATION("GEO_LOCATION"),
        @Json(name = "FEEDBACK") FEEDBACK("FEEDBACK"),
        @Json(name = "UNKNOWN") UNKNOWN("UNKNOWN")
    }

    /**
     * GET api/v1/categories
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param categoryType 
     * @param clientId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Category]>
     */
    @GET("api/v1/categories")
    fun getCategoriesByType(@Query("categoryType") categoryType: CategoryTypeGetCategoriesByType, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Category>

    /**
     * GET api/v1/categories/{categoryId}
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param categoryId 
     * @param clientId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Category]>
     */
    @GET("api/v1/categories/{categoryId}")
    fun getCategory(@Path("categoryId") categoryId: kotlin.Int, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Category>

    /**
     * PUT api/v1/categories
     * 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param category 
     * @param clientId  (optional)
     * @param UNKNOWN_PARAMETER_NAME  (optional)
     * @param UNKNOWN_PARAMETER_NAME2  (optional)
     * @param UNKNOWN_PARAMETER_NAME3  (optional)
     * @return [Call]<[Category]>
     */
    @PUT("api/v1/categories")
    fun updateCategory(@Body category: Category, @Query("clientId") clientId: kotlin.String? = null, @Header("X-edge-agent") UNKNOWN_PARAMETER_NAME: ? = null, @Header("X-edge-state") UNKNOWN_PARAMETER_NAME2: ? = null, @Header("X-edge-client-id") UNKNOWN_PARAMETER_NAME3: ? = null): Call<Category>

}
