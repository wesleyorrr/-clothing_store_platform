package com.example.clothingstoreplatform.store.presentation.products_screen.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clothingstoreplatform.util.components.EventBus
import kotlinx.coroutines.launch

fun ViewModel.sendEvent(event:Any){
    viewModelScope.launch {
        EventBus.sendEvent(event)
    }
}