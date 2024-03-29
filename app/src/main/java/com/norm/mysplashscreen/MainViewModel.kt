package com.norm.mysplashscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _isRedy = MutableStateFlow(false)
    val isRedy = _isRedy.asStateFlow()

    init {
        viewModelScope.launch {
            delay(3000L)
            _isRedy.value = true
        }
    }
}