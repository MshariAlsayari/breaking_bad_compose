package com.android.breakingbadcomposeapplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.android.breakingbadcomposeapplication.screens.NavigationItem
import com.android.breakingbadcomposeapplication.screens.home.HomeScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationItem.Home.route) {
        composable(NavigationItem.Home.route) {
            HomeScreen()
        }

    }
}