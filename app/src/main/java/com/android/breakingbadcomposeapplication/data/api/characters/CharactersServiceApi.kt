package com.android.breakingbadcomposeapplication.data.api.characters

import com.msharialsayari.selfimprovement.data.model.characters.CharacterModel
import dagger.Provides
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface CharactersServiceApi {

    @GET("characters")
    suspend fun getCharacters(): Response<List<CharacterModel>>

    @GET("characters")
    suspend fun getCharactersByName(@Query("name")charName:String?): Response<List<CharacterModel>>
}