package com.android.breakingbadcomposeapplication.ui.cards

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.android.breakingbadcomposeapplication.ui.NetworkImage


@Composable
fun CharacterCard(url:String?,name: String?, nickName:String?, birthDate:String?) {
   Card (modifier = Modifier.height(100.dp),
       shape = RoundedCornerShape(0.dp),) {
       Row (verticalAlignment= Alignment.CenterVertically) {
           NetworkImage(url= url, modifier = Modifier.size(100.dp), contentScale = ContentScale.FillBounds)
           Column(modifier = Modifier.weight(1f).padding(horizontal = 10.dp)) {
               name?.let { Text(text = "Name: $it") }
               nickName?.let { Text(text = "Nickname: $it") }
               birthDate?.let { Text(text = "BirthDate: $it") }
           }

       }

   }
}