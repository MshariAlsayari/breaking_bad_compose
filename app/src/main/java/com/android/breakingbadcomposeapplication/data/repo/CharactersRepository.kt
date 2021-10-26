package com.android.breakingbadcomposeapplication.data.repo

import com.android.breakingbadcomposeapplication.base.BaseDataSource
import com.android.breakingbadcomposeapplication.base.BaseResult
import com.android.breakingbadcomposeapplication.data.api.characters.CharactersDataSource
import com.android.breakingbadcomposeapplication.data.api.characters.CharactersDataSourceImpl
import com.android.breakingbadcomposeapplication.data.api.characters.CharactersServiceApi
import com.msharialsayari.selfimprovement.data.model.characters.CharacterModel
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject



class CharactersRepository @Inject constructor(private val serviceApi: CharactersServiceApi) : CharactersDataSource, BaseDataSource()  {

     override suspend fun getCharacters(): BaseResult<List<CharacterModel>> {
        return getResult { serviceApi.getCharacters()}
    }

    override suspend fun getCharactersByName(charName: String?): BaseResult<List<CharacterModel>> {
        TODO("Not yet implemented")
    }


}