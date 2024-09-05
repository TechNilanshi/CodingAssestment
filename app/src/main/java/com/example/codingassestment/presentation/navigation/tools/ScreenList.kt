package com.example.codingassestment.presentation.navigation.tools


const val ROOT_GRAPH_ROUTE = "root"
const val USERLIST_GRAPH_ROUTE = "login"

sealed class ScreenList( val route: String) {

    object ListScreen : ScreenList("List_screen")
    object DetailScreen : ScreenList("Detail_Screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}