package com.android.breakingbadcomposeapplication.screens

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.breakingbadcomposeapplication.base.BaseResult
import com.android.breakingbadcomposeapplication.base.BaseViewModel
import com.android.breakingbadcomposeapplication.data.repo.CharactersRepository
import com.android.breakingbadcomposeapplication.data.model.CharacterModel
import com.android.breakingbadcomposeapplication.data.model.EpisodeModel
import com.android.breakingbadcomposeapplication.data.repo.EpisodesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor(
    private val charactersRepo: CharactersRepository,
    private val episodesRepository: EpisodesRepository
    ) : ViewModel() {


    var characters:  MutableState<List<CharacterModel>?> = mutableStateOf(listOf())
    var episodes:  MutableState<List<EpisodeModel>?> = mutableStateOf(listOf())
    var loading:  MutableState<Boolean> = mutableStateOf(false)
    init {
        fetchCharacters()
        fetchEpisodes()
    }


     private fun fetchCharacters() {
        viewModelScope.launch {
            loading.value = true
            when(val result = charactersRepo.getCharacters()){
            is BaseResult.Success -> characters.value = result.data
            is BaseResult.Failure -> Log.d("MainViewModel", "FAILURE")
            }
            loading.value = false
        }
    }

    private fun fetchEpisodes() {
        viewModelScope.launch {
            loading.value = true
            when(val result = episodesRepository.getEpisodes()){
                is BaseResult.Success -> episodes.value = result.data
                is BaseResult.Failure -> Log.d("MainViewModel", "FAILURE")
            }
            loading.value = false
        }
    }





}


