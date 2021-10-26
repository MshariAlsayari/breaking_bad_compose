package com.android.breakingbadcomposeapplication.hilt


import com.android.breakingbadcomposeapplication.data.api.characters.CharactersServiceApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object APIServiceModule {


    @Provides
    fun provideCharactersServiceApi(retrofit: Retrofit): CharactersServiceApi = retrofit.create(CharactersServiceApi::class.java)

}