package com.sithmal.memeh.repository

import com.sithmal.memeh.db.models.MemeModel
import com.sithmal.memeh.network.ResultWrapper
import kotlinx.coroutines.flow.Flow

interface MemeRepository {
    fun getMemes():Flow<ResultWrapper<List<MemeModel>>>
}