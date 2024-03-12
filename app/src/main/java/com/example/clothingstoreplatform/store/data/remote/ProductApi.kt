package com.example.clothingstoreplatform.store.data.remote

import com.example.clothingstoreplatform.store.domain.model.Product
import retrofit2.http.GET

interface ProductApi {
@GET("Products")
suspend fun getProducts():List<Product>
}