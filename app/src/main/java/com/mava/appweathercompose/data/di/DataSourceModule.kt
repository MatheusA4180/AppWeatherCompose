package com.mava.appweathercompose.data.di

import com.mava.appweathercompose.data.KtorRemoteDataSource
import com.mava.appweathercompose.data.remote.RemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DataSourceModule {

    @Binds
    @Singleton
    fun bindRemoteDataSource(remoteDataSource: KtorRemoteDataSource): RemoteDataSource

}