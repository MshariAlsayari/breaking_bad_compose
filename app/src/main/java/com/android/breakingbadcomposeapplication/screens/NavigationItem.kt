package com.android.breakingbadcomposeapplication.screens

import com.android.breakingbadcomposeapplication.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
}