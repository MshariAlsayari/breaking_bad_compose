package com.android.breakingbadcomposeapplication.ui.scaffold

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.android.breakingbadcomposeapplication.ui.TopAppBar

@Composable
fun AppScreen(appBarTitle: String?, content: @Composable (PaddingValues) -> Unit) {
    Scaffold(
        topBar = { TopAppBar(appBarTitle) },
        content = content
    )


}