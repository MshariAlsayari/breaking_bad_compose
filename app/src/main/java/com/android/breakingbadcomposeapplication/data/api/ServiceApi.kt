package com.android.breakingbadcomposeapplication.data.api

import com.android.breakingbadcomposeapplication.data.model.CharacterModel
import com.android.breakingbadcomposeapplication.data.model.EpisodeModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ServiceApi {

    @GET("characters")
    suspend fun getCharacters(): Response<List<CharacterModel>>

    @GET("characters")
    suspend fun getCharactersByName(@Query("name")charName:String?): Response<List<CharacterModel>>

    @GET("episodes")
    suspend fun getEpisodes(): Response<List<EpisodeModel>>
}