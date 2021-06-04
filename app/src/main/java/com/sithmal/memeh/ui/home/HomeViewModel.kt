package com.sithmal.memeh.ui.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() :ViewModel(){

    init {
        Timber.d("Home ViewModel Initialized")
    }
}