package com.android.breakingbadcomposeapplication.data.repo

import com.android.breakingbadcomposeapplication.base.BaseResult
import com.android.breakingbadcomposeapplication.data.api.characters.CharactersDataSourceImpl
import com.msharialsayari.selfimprovement.data.model.characters.CharacterModel
import javax.inject.Inject


class CharactersRepository @Inject constructor( private val charactersDataSourceImpl: CharactersDataSourceImpl) {

     suspend fun getCharacters(): BaseResult<List<CharacterModel>> {
        return charactersDataSourceImpl.getCharacters()
    }




}