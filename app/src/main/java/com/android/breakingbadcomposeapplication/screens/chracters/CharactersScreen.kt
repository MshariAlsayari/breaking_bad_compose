package com.android.breakingbadcomposeapplication.screens.chracters

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.breakingbadcomposeapplication.ui.cards.CharacterCard
import com.android.breakingbadcomposeapplication.ui.theme.BreakingBadComposeApplicationTheme
import com.msharialsayari.selfimprovement.data.model.characters.CharacterModel
@Composable
fun CharactersScreen(characters:List<CharacterModel>) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        BreakingBadComposeApplicationTheme {
            LazyColumn(modifier = Modifier.padding(all = 20.dp),
              verticalArrangement = Arrangement.spacedBy(10.dp),){
                items(items = characters) { item ->
                    CharacterCard(url= item.img , name =item.name ,nickName = item.nickname,birthDate = item.birthday )
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun CharactersScreenPreview() {
    CharactersScreen(listOf())
}