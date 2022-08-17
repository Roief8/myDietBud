package com.mydietbud.data.remote.dto

data class Ingredient(
    val amount: Double,
    val id: Int,
    val name: String,
    val nutrients: List<NutrientX>,
    val unit: String
)