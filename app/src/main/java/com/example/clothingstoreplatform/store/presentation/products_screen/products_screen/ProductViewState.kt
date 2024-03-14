package com.example.clothingstoreplatform.store.presentation.products_screen.products_screen

import com.example.clothingstoreplatform.store.domain.model.Product

data class ProductViewState(
    val isLoading : Boolean = false,
    val products : List<Product> = emptyList(),
    val error : String?=null


)
