package com.android.breakingbadcomposeapplication.data.api.episodes

import com.android.breakingbadcomposeapplication.base.BaseResult
import com.android.breakingbadcomposeapplication.data.model.CharacterModel
import com.android.breakingbadcomposeapplication.data.model.EpisodeModel


interface EpisodesDataSource {
    suspend fun getEpisodes(): BaseResult<List<EpisodeModel>>
}