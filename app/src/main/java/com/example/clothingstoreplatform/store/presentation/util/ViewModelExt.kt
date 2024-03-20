package com.example.clothingstoreplatform.store.presentation.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clothingstoreplatform.util.EventBus
import kotlinx.coroutines.launch

fun ViewModel.sendEvent(event:Any){
    viewModelScope.launch {
        EventBus.sendEvent(event)
    }
}