package com.android.breakingbadcomposeapplication.hilt


import com.android.breakingbadcomposeapplication.data.api.ServiceApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit


@Module
@InstallIn(SingletonComponent::class)
object APIServiceModule {

    @Provides
    fun provideServiceApi(retrofit: Retrofit): ServiceApi = retrofit.create(ServiceApi::class.java)

}