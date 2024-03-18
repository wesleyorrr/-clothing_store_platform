package com.example.clothingstoreplatform.presentation

import com.example.clothingstoreplatform.store.domain.model.Product

data class ProductViewState(
    val isLoading : Boolean = false,
    val products : List<Product> = emptyList(),
    val error : String?=null


)
