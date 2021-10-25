package com.android.breakingbadcomposeapplication.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.android.breakingbadcomposeapplication.Navigation
import com.android.breakingbadcomposeapplication.R
import com.android.breakingbadcomposeapplication.screens.chracters.CharactersScreen
import com.android.breakingbadcomposeapplication.ui.BottomNavigationBar
import com.android.breakingbadcomposeapplication.ui.Tabs
import com.android.breakingbadcomposeapplication.ui.TabsContent
import com.android.breakingbadcomposeapplication.ui.TopAppBar
import com.android.breakingbadcomposeapplication.ui.theme.BreakingBadComposeApplicationTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BreakingBadComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                MainScreen(viewModel)
            }
        }
    }


}

@ExperimentalPagerApi
@Composable
fun MainScreen(mainViewModel: MainViewModel){


   // val tabs = listOf(TabItem.Characters)
    val pagerState = rememberPagerState()
    Scaffold(
        topBar = { TopAppBar(stringResource(id = R.string.app_name)) },
    ) {
//        Column {
//            Tabs(tabs = tabs, pagerState = pagerState)
//            TabsContent(tabs = tabs, pagerState = pagerState)
//        }

        CharactersScreen(mainViewModel.characters?: listOf())
    }
}

//@Composable
//fun MainScreen(){
//    val navController = rememberNavController()
//    Scaffold(
//        topBar = { TopAppBar(stringResource(R.string.app_name)) },
//        bottomBar = { BottomNavigationBar(navController) }
//    ) {
//        Navigation(navController = navController)
//
//    }
//}



@ExperimentalPagerApi
@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(viewModel())
}