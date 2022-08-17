package com.mydietbud.common

import com.mydietbud.data.remote.BASE_URL
import com.mydietbud.data.remote.SpoonacularAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Helper {

    fun buildRetrofit(): SpoonacularAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build().create(SpoonacularAPI::class.java)
    }
}