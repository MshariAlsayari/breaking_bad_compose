package com.android.breakingbadcomposeapplication.screens

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
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
    private val savedStateHandle: SavedStateHandle,
    private val charactersRepo: CharactersRepository
    ) : ViewModel() {


    var characters: List<CharacterModel>? by mutableStateOf(listOf())
    init {
        fetchCharacters()
    }

    private fun fetchCharacters() {
        viewModelScope.launch {
            val result = charactersRepo.getCharacters()
            when(result){
            is BaseResult.Success -> characters = result.data
            is BaseResult.Failure -> Log.d("MainViewModel", "FAILURE")
            }
        }
    }


    sealed class MainEvents{
        data class CharactersSuccess(val data: List<CharacterModel>?):MainEvents()
        data class CharactersError(val error: String):MainEvents()
    }


}


