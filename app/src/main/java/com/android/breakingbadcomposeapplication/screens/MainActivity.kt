package com.android.breakingbadcomposeapplication.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.android.breakingbadcomposeapplication.R
import com.android.breakingbadcomposeapplication.screens.chracters.CharactersScreen
import com.android.breakingbadcomposeapplication.ui.CircularProgressBar
import com.android.breakingbadcomposeapplication.ui.scaffold.AppScreen
import com.android.breakingbadcomposeapplication.ui.theme.BreakingBadComposeApplicationTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            BreakingBadComposeApplicationTheme {
                MainScreen(viewModel)
            }
        }
    }


}

@ExperimentalPagerApi
@Composable
fun MainScreen(viewModel: MainViewModel){
    val items = viewModel.characters.value
    val showProgress = viewModel.loading.value
    AppScreen(appBarTitle =stringResource(id = R.string.app_name) ) {
        Box(modifier = Modifier.fillMaxSize()) {
            CharactersScreen(items ?:listOf())
            CircularProgressBar(show = showProgress)
        }

    }
}



@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(viewModel())
}