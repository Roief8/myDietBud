package com.mydietbud.data.remote

import com.mydietbud.data.remote.dto.RecipeDetailsDto
import com.mydietbud.data.remote.dto.RecipeList
import com.mydietbud.domain.model.RecipeDetails
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val MYAPIKEY = "68ba0ea76ba749ec806b6770d7e498ee"
const val BASE_URL = "https://api.spoonacular.com/"


interface SpoonacularAPI {

    @GET("recipes/complexSearch?apiKey=$MYAPIKEY")
    fun complexRecipeSearch(
        @Query("query") query: String,
        @Query("addRecipeInformation") info: Boolean = true,
        @Query("number") number: Int = 20
    ): Call<RecipeList>

    @GET("recipes/{id}/information?includeNutrition=true&apiKey=$MYAPIKEY")
    fun getRecipeDetails(
        @Path("id") key : Int
    ) : Call<RecipeDetailsDto>

    @GET("https://api.spoonacular.com/recipes/{id}/similar?apiKey=$MYAPIKEY")
    fun getSimilarRecipes(
        @Path(value = "id") key : Int,
        @Query("number") number : Int = 3
    )
}