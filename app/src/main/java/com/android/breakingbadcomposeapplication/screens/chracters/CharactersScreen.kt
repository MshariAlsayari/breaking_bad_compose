package com.android.breakingbadcomposeapplication.screens.chracters

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.breakingbadcomposeapplication.data.model.CharacterModel
import com.android.breakingbadcomposeapplication.ui.CircularProgressBar
import com.android.breakingbadcomposeapplication.ui.CharacterCard
import com.android.breakingbadcomposeapplication.ui.theme.BreakingBadComposeApplicationTheme

@Composable
fun CharactersScreen(characters:List<CharacterModel>?, showProgress:Boolean) {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        BreakingBadComposeApplicationTheme {
            Box(modifier = Modifier.fillMaxSize()) {
                LazyColumn(modifier = Modifier.padding(all = 20.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp),){
                    items(items = characters ?: listOf()) { item ->
                        CharacterCard(url= item.img , name =item.name ,nickName = item.nickname,birthDate = item.birthday) {
                            Log.d("MshariTest: " , "clicked")
                        }
                    }
                }
                CircularProgressBar(show = showProgress)
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun CharactersScreenPreview() {
    CharactersScreen(listOf(), false)
}