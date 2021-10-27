package com.android.breakingbadcomposeapplication.data.repo

import com.android.breakingbadcomposeapplication.base.BaseDataSource
import com.android.breakingbadcomposeapplication.base.BaseResult
import com.android.breakingbadcomposeapplication.data.api.ServiceApi
import com.android.breakingbadcomposeapplication.data.api.episodes.EpisodesDataSource
import com.android.breakingbadcomposeapplication.data.model.EpisodeModel
import javax.inject.Inject


class EpisodesRepository  @Inject constructor(private val serviceApi: ServiceApi) : EpisodesDataSource, BaseDataSource() {


    override suspend fun getEpisodes(): BaseResult<List<EpisodeModel>> {
        return getResult { serviceApi.getEpisodes()}
    }
}