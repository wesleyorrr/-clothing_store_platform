package com.example.clothingstoreplatform.store.presentation.products_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clothingstoreplatform.store.domain.repository.ProductsRepository
import com.example.clothingstoreplatform.store.presentation.util.sendEvent
import com.example.clothingstoreplatform.util.Event

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val productsRepository: ProductsRepository
):ViewModel() {
   private val _state = MutableStateFlow(ProductViewState())
    val state = _state.asStateFlow()

    fun getProducts(){
        viewModelScope.launch {
        _state.update {
            it.copy(isLoading = true)
        }

        productsRepository.getProducts()
            .onRight {products ->
                _state.update {
                    it.copy(products = products)
                }

            }
            .onLeft {
                error->
                _state.update {
                    it.copy(error = error.error.message)
                }
                sendEvent(Event.Toast(error.error.message))
            }


            _state.update {
                it.copy(isLoading = false)
            }


        }

    }


}