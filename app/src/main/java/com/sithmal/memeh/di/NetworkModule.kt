package com.sithmal.memeh.di

import com.sithmal.memeh.network.MemeMakerService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://alpha-meme-maker.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideMemeMakerService(retrofit: Retrofit): MemeMakerService {
        return retrofit.create(MemeMakerService::class.java)
    }

}