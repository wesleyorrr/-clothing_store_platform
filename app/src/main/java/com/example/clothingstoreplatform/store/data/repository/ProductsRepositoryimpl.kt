package com.example.clothingstoreplatform.store.data.repository

import arrow.core.Either
import com.example.clothingstoreplatform.store.data.remote.ProductApi
import com.example.clothingstoreplatform.store.domain.model.NetworkError
import com.example.clothingstoreplatform.store.domain.model.Product
import com.example.clothingstoreplatform.store.domain.repository.ProductsRepository
import java.util.concurrent.CancellationException

class ProductsRepositoryimpl constructor(
    private val productsApi:ProductApi
) : ProductsRepository {
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
    Either.catch {
        productsApi.getProduct()
    }

        return TODO("Provide the return value")
    }
}