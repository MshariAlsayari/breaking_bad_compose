package com.android.breakingbadcomposeapplication.screens

import androidx.compose.runtime.Composable
import com.android.breakingbadcomposeapplication.screens.chracters.CharactersScreen


typealias ComposableFun = @Composable () -> Unit
sealed class TabItem( var title: String, var screen: ComposableFun) {
     object Characters : TabItem( "Characters", {  })
}