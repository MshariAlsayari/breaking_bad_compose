package com.android.breakingbadcomposeapplication.screens

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.viewModelScope
import com.android.breakingbadcomposeapplication.base.BaseResult
import com.android.breakingbadcomposeapplication.base.BaseViewModel
import com.android.breakingbadcomposeapplication.data.repo.CharactersRepository
import com.msharialsayari.selfimprovement.data.model.characters.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor(
    private val charactersRepo: CharactersRepository
    ) : BaseViewModel<MainViewModel.MainEvents>() {


    var characters:  MutableState<List<CharacterModel>?> = mutableStateOf(listOf())
    var loading:  MutableState<Boolean> = mutableStateOf(false)
    init {
        fetchCharacters()
    }


     fun fetchCharacters() {
        viewModelScope.launch {
            loading.value = true
            when(val result = charactersRepo.getCharacters()){
            is BaseResult.Success -> characters.value = result.data
            is BaseResult.Failure -> Log.d("MainViewModel", "FAILURE")
            }
            loading.value = false
        }
    }


    sealed class MainEvents{
        data class CharactersSuccess(val data: List<CharacterModel>?):MainEvents()
        data class CharactersError(val error: String):MainEvents()
    }


}


