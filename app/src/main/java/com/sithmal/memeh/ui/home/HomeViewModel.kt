package com.sithmal.memeh.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sithmal.memeh.network.MemeMakerService
import com.sithmal.memeh.network.ResultWrapper
import com.sithmal.memeh.repository.MemeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val memeRepository: MemeRepository
) :ViewModel(){
    init {
        Timber.d("Home ViewModel Initialized")

        memeRepository
            .getMemes()
            .onEach {
                if (it is ResultWrapper.Success) {
                    it.data.forEach {
                        Timber.d(it.name)
                    }
                } else if (it is ResultWrapper.Loading) {
                    Timber.e("Loading")
                } else if (it is ResultWrapper.Error) {
                    Timber.e(it.message)
                }
            }.catch {
                Timber.e(it.localizedMessage)
            }.launchIn(viewModelScope)
    }
}