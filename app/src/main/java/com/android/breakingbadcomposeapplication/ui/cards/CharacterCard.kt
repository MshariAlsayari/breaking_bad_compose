package com.android.breakingbadcomposeapplication.ui.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.android.breakingbadcomposeapplication.ui.NetworkImage


@Composable
fun CharacterCard(url:String?,name: String?, nickName:String?, birthDate:String?) {
   Card {
       Row {
           NetworkImage(url= url)
           Column(modifier = Modifier.weight(1f)) {
               name?.let { Text(text = it) }
               nickName?.let { Text(text = it) }
               birthDate?.let { Text(text = it) }
           }

       }

   }
}