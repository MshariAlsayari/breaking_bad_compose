package com.android.breakingbadcomposeapplication.ui.scaffold

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.android.breakingbadcomposeapplication.ui.TopAppBar
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun AppScreen(
    appBarTitle: String?,
    errorMsg: String? = null,
    content: @Composable (PaddingValues) -> Unit
) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        topBar = { TopAppBar(appBarTitle) },
        scaffoldState = scaffoldState,
        content = content
    )


    if (!errorMsg.isNullOrEmpty())
        scope.launch {
            scaffoldState.snackbarHostState.showSnackbar(errorMsg)
        }


}