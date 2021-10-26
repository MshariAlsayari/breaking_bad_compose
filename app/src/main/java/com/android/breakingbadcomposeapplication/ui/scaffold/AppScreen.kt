package com.android.breakingbadcomposeapplication.ui.scaffold

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.android.breakingbadcomposeapplication.R
import com.android.breakingbadcomposeapplication.screens.chracters.CharactersScreen
import com.android.breakingbadcomposeapplication.ui.TopAppBar

@Composable
fun AppScreen(appBarTitle:String?, content : @Composable (PaddingValues) -> Unit){
    Scaffold(
        topBar = appBarTitle.let{ { TopAppBar(stringResource(id = R.string.app_name)) }},
        content = content
    )




}