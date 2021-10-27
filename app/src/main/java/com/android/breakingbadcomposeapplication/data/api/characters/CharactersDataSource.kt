package com.android.breakingbadcomposeapplication.data.api.characters

import com.android.breakingbadcomposeapplication.base.BaseResult
import com.android.breakingbadcomposeapplication.data.model.CharacterModel


interface CharactersDataSource {
    suspend fun getCharacters(): BaseResult<List<CharacterModel>>
    suspend fun getCharactersByName(charName:String?):BaseResult<List<CharacterModel>>
}