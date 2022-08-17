package com.mydietbud.domain.model

data class Recipe (
    val id: Int,
    val title: String,
    val image: String,
    var isLiked : Boolean
    )