package com.mydietbud.data.remote.dto

data class RecipeList(
    val number: Int,
    val offset: Int,
    val results: List<RecipeDto>,
    val totalResults: Int
)