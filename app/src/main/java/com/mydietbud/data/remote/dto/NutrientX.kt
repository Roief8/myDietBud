package com.mydietbud.data.remote.dto

data class NutrientX(
    val amount: Double,
    val name: String,
    val percentOfDailyNeeds: Double,
    val unit: String
)