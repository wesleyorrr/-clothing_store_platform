package com.example.clothingstoreplatform.store.presentation.products_screen.componets

import androidx.lifecycle.ViewModel
import com.example.clothingstoreplatform.store.domain.repository.ProductsRepository

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val productsRepository: ProductsRepository
):ViewModel() {


}