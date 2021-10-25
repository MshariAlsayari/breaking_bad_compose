package com.android.breakingbadcomposeapplication.hilt


import com.android.breakingbadcomposeapplication.data.api.characters.CharactersDataSource
import com.android.breakingbadcomposeapplication.data.api.characters.CharactersDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

import javax.inject.Singleton


@Module
@InstallIn(ActivityComponent::class)
abstract class DataSourceModule {


    @Singleton
    @Binds
    abstract fun provideCharactersDataSource(charactersDataSourceImpl: CharactersDataSourceImpl) : CharactersDataSource


}