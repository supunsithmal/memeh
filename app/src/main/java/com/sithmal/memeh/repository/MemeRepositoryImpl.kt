package com.sithmal.memeh.repository

import com.sithmal.memeh.db.models.MemeModel
import com.sithmal.memeh.network.MemeMakerService
import com.sithmal.memeh.network.ResultWrapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MemeRepositoryImpl (
    private val memeMakerService: MemeMakerService
) : MemeRepository {

    override fun getMemes(): Flow<ResultWrapper<List<MemeModel>>> {
       return flow {
           emit(ResultWrapper.Loading)
           val response = memeMakerService.getMemes()
           if (response.isSuccessful){
               val data = response.body()?.data?.map {
                   MemeModel(
                       it.iD.toString(),
                       it.name,
                       it.image
                   )
               } ?: emptyList()
               emit(ResultWrapper.Success(data))
           }else{
               ResultWrapper.Error(response.errorBody().toString())
           }
       }
    }
}