package com.example.codingassestment.presentation.navigation.entrance

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.codingassestment.presentation.component.UserDetailComponent
import com.example.codingassestment.presentation.component.UserListDataScreen
import com.example.codingassestment.presentation.navigation.tools.ScreenList
import com.example.codingassestment.presentation.navigation.tools.USERLIST_GRAPH_ROUTE

@ExperimentalComposeUiApi
@ExperimentalAnimationApi
fun NavGraphBuilder.userNavGraph(
    navController: NavController
) {

    navigation(startDestination = ScreenList.ListScreen.route, route = USERLIST_GRAPH_ROUTE) {

        composable(route = ScreenList.ListScreen.route) {
            UserListDataScreen(navController = navController, hiltViewModel())
        }

        composable(route = ScreenList.DetailScreen.route) {
            UserDetailComponent(navController = navController, hiltViewModel())
        }

    }
}
