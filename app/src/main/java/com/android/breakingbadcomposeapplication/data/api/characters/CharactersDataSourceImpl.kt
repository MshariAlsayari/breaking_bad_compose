package com.android.breakingbadcomposeapplication.data.api.characters

import com.android.breakingbadcomposeapplication.base.BaseDataSource
import com.android.breakingbadcomposeapplication.base.BaseResult
import com.msharialsayari.selfimprovement.data.model.characters.CharacterModel
import javax.inject.Inject

class CharactersDataSourceImpl @Inject constructor(private val serviceApi: CharactersServiceApi) : CharactersDataSource, BaseDataSource() {
    override suspend fun getCharacters(): BaseResult<List<CharacterModel>> {
        return getResult { serviceApi.getCharacters() }

    }

    override suspend fun getCharactersByName(charName: String?): BaseResult<List<CharacterModel>> {
        return getResult { serviceApi.getCharactersByName(charName) }
    }
}