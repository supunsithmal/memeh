package com.sithmal.memeh.di

import com.sithmal.memeh.network.MemeMakerService
import com.sithmal.memeh.repository.MemeRepository
import com.sithmal.memeh.repository.MemeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideMemeRepository(
        memeMakerService: MemeMakerService
    ):MemeRepository{
        return MemeRepositoryImpl(
            memeMakerService
        )
    }

}
