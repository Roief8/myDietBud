package com.mydietbud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mydietbud.common.Helper
import com.mydietbud.data.remote.dto.RecipeDetailsDto
import com.mydietbud.data.remote.dto.RecipeDto
import com.mydietbud.data.remote.dto.RecipeList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Helper().buildRetrofit().getRecipeDetails(716429).enqueue(object : Callback<RecipeDetailsDto?> {
//            override fun onResponse(
//                call: Call<RecipeDetailsDto?>,
//                response: Response<RecipeDetailsDto?>
//            ) {
//                println(response.body()!!.)
//            }
//
//            override fun onFailure(call: Call<RecipeDetailsDto?>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//        })
//
//    }
    }
}