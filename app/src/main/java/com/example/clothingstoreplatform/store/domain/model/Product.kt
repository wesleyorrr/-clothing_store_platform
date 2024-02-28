package com.example.clothingstoreplatform.store.domain.model

import android.media.Image

data class Product(
    val id : Int,
    val title: String,
    val price : String,
    val description : String,
    val category: String,
    val image: String,

)

data class Rating(
    val rage:Double,
    val count: Int
)
