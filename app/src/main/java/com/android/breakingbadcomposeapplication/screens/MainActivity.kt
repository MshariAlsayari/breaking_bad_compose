package com.android.breakingbadcomposeapplication.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.android.breakingbadcomposeapplication.R
import com.android.breakingbadcomposeapplication.ui.Tabs
import com.android.breakingbadcomposeapplication.ui.TabsContent
import com.android.breakingbadcomposeapplication.ui.scaffold.AppScreen
import com.android.breakingbadcomposeapplication.ui.theme.BreakingBadComposeApplicationTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
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
    val characters = viewModel.characters.value ?: listOf()
    val episodes = viewModel.episodes.value ?: listOf()
    val errorMsg = viewModel.errorMsg.value
    val showProgress = viewModel.loading.value

    val tabs = listOf(TabItem.Characters(items = characters, showProgress= showProgress), TabItem.Episodes(items = episodes, showProgress= showProgress))
    val pagerState = rememberPagerState()
    AppScreen(appBarTitle = stringResource(id = R.string.app_name), errorMsg = errorMsg) {
        Column {
            Tabs(tabs = tabs, pagerState = pagerState)
            TabsContent(tabs = tabs, pagerState = pagerState)
        }


    }
}


@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(viewModel())
}