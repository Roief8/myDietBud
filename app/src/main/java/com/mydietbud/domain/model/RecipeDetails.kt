package com.mydietbud.domain.model

import com.mydietbud.data.remote.dto.Ingredient
import com.mydietbud.data.remote.dto.WinePairing

data class RecipeDetails(
    val id: Int,
    val title: String,
    val image: String,
    val summary: String,
    val preparationTime: Int,
    val healthScore: Int,
    val instructions: String,
    val tags: List<String>,
    val ingredients: List<Pair<Int, String>>,
    val wines: WinePairing,
    val sourceURL: String



)