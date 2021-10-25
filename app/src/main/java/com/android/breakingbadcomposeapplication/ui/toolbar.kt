package com.android.breakingbadcomposeapplication.ui

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.android.breakingbadcomposeapplication.R
import com.android.breakingbadcomposeapplication.ui.theme.BreakingBadComposeApplicationTheme

@Composable
fun TopAppBar(title:String) {
    BreakingBadComposeApplicationTheme {
        TopAppBar(
            title = { Text(text = title , fontSize = 18.sp) },
            contentColor = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview() {
    TopAppBar(stringResource(R.string.app_name))
}