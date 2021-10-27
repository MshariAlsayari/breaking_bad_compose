package com.android.breakingbadcomposeapplication.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp



val card_height = 100.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CharacterCard(
    url: String?,
    name: String?,
    nickName: String?,
    birthDate: String?,
    onCardClicked: () -> Unit
) {


    Card(
        modifier = Modifier.height(card_height),
        onClick = onCardClicked,
        shape = RoundedCornerShape(0.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            NetworkImage(
                url = url,
                modifier = Modifier.size(card_height),
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp)
            ) {
                name?.let { Text(text = "Name: $it") }
                nickName?.let { Text(text = "Nickname: $it") }
                birthDate?.let { Text(text = "BirthDate: $it") }
            }

        }

    }


}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EpisodeCard(
    episodeTitle: String?,
    episodeNumber: String?,
    episodeSeason: String?,
    onCardClicked: () -> Unit
) {


    Card(
        modifier = Modifier.height(card_height).fillMaxWidth(),
        onClick = onCardClicked,
        shape = RoundedCornerShape(0.dp),
    ) {
        Column(verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(all = 10.dp)) {
            episodeTitle?.let { Text(text = it) }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                episodeNumber?.let { Text(text = "episodeNumber: $it") }
                episodeSeason?.let { Text(text = "episodeSeason: $it") }
            }

        }

    }


}