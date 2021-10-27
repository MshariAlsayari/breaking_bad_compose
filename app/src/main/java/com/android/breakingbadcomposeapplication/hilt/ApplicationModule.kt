package com.android.breakingbadcomposeapplication.hilt

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent

@Module(includes = [NetworkModule::class, APIServiceModule::class])
@InstallIn(ActivityComponent::class)
object ApplicationModule {


}