package com.android.breakingbadcomposeapplication.screens

import androidx.compose.runtime.Composable
import com.android.breakingbadcomposeapplication.data.model.CharacterModel
import com.android.breakingbadcomposeapplication.data.model.EpisodeModel
import com.android.breakingbadcomposeapplication.screens.chracters.CharactersScreen
import com.android.breakingbadcomposeapplication.screens.episodes.EpisodesScreen


typealias ComposableFun = @Composable () -> Unit
sealed class TabItem( var title: String, var screen: ComposableFun) {
     data class Characters(val items:List<CharacterModel>? , val showProgress:Boolean) : TabItem( "Characters", { CharactersScreen(items,showProgress)})
     data class Episodes(val items:List<EpisodeModel>? , val showProgress:Boolean) : TabItem( "Episodes", { EpisodesScreen(items,showProgress) })
}