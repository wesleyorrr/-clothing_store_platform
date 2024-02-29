package com.example.clothingstoreplatform.store.domain.repository

import arrow.core.Either
import com.example.clothingstoreplatform.store.domain.model.NetworkError
import com.example.clothingstoreplatform.store.domain.model.Product


interface ProductsRepository {
   suspend fun getProducts(): Either<NetworkError,List<Product>>

}