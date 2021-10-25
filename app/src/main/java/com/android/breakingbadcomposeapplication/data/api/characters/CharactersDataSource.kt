package com.android.breakingbadcomposeapplication.data.api.characters

import com.android.breakingbadcomposeapplication.base.BaseResult
import com.msharialsayari.selfimprovement.data.model.characters.CharacterModel


interface CharactersDataSource {
    suspend fun getCharacters(): BaseResult<List<CharacterModel>>
    suspend fun getCharactersByName(charName:String?):BaseResult<List<CharacterModel>>
}