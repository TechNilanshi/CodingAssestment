package com.example.codingassestment.presentation.navigation.tools

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.codingassestment.presentation.navigation.entrance.userNavGraph


@ExperimentalComposeUiApi
@ExperimentalAnimationApi
@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = USERLIST_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        userNavGraph(navController = navController)

    }

}