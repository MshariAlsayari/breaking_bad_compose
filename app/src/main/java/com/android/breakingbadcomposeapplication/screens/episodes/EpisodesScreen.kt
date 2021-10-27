package com.android.breakingbadcomposeapplication.screens.episodes

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.android.breakingbadcomposeapplication.data.model.EpisodeModel
import com.android.breakingbadcomposeapplication.ui.CircularProgressBar
import com.android.breakingbadcomposeapplication.ui.EpisodeCard
import com.android.breakingbadcomposeapplication.ui.theme.BreakingBadComposeApplicationTheme


@Composable
fun EpisodesScreen(episodes:List<EpisodeModel>?, showProgress:Boolean){
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        BreakingBadComposeApplicationTheme {
            Box(modifier = Modifier.fillMaxSize()) {
                LazyColumn(modifier = Modifier.padding(all = 20.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),){
                    items(items = episodes ?: listOf()) { item ->
                        EpisodeCard(episodeTitle =item.title ,episodeNumber =item.episode ,episodeSeason = item.season) {
                            Log.d("MshariTest: " , "clicked")
                        }
                    }
                }
                CircularProgressBar(show = showProgress)
            }

        }

    }

}