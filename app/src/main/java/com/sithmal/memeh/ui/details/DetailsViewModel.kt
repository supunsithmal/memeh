package com.sithmal.memeh.ui.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sithmal.memeh.network.ResultWrapper
import com.sithmal.memeh.repository.MemeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import timber.log.Timber
import javax.inject.Inject


@HiltViewModel
class DetailsViewModel @Inject constructor(

) : ViewModel() {

    init {
        Timber.d("Details ViewModel initialized")
    }
}