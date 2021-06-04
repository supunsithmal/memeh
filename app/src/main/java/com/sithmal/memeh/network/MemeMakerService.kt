package com.sithmal.memeh.network

import com.sithmal.memeh.network.models.MemePageResponse
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.GET

interface MemeMakerService {

    @GET("/1")
    suspend fun getMemes():Response<MemePageResponse>

}