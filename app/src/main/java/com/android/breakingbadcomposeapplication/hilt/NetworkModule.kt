package com.android.breakingbadcomposeapplication.hilt


import com.android.breakingbadcomposeapplication.BuildConfig
import com.android.breakingbadcomposeapplication.constants.NetworkConstants
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {


//    @Provides
//    fun httpLoggingInterceptor(): HttpLoggingInterceptor {
//        val logging = HttpLoggingInterceptor()
//        logging.level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
//        else HttpLoggingInterceptor.Level.NONE
//
//        return logging
//    }
//
//    @Provides
//    fun provideOkHttpClient(
//        loggingInterceptor: HttpLoggingInterceptor,
//    ): OkHttpClient {
//        return OkHttpClient.Builder()
//            .connectTimeout(30, TimeUnit.SECONDS)
//            .readTimeout(30, TimeUnit.SECONDS)
//            .writeTimeout(30, TimeUnit.SECONDS)
//            .addInterceptor(loggingInterceptor)
//            .build()
//    }

    @Provides
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(NetworkConstants.BASE_URL)
            .build()


}