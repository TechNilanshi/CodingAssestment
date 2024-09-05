package com.example.codingassestment.presentation.component

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.codingassestment.data.model.UserListData
import com.example.codingassestment.presentation.navigation.tools.ScreenList
import com.example.codingassestment.presentation.viewModel.UserListViewModel

@Composable
fun UserListDataScreen(navController: NavController, viewModel: UserListViewModel = hiltViewModel()){
    val userList by remember { viewModel.userListData }

    Log.d("qqqqqq",userList.size.toString())
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        val itemCount = userList.size
        item(itemCount) {
            UserListRow(rowIndex = 0, entries = userList, navController = navController)
        }
    }

}

@Composable
fun UserListRow(rowIndex: Int, entries: List<UserListData>,navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                navController.navigate(ScreenList.DetailScreen.route)
            }

    ) {
        Text(
            text = entries[rowIndex].id.toString(),
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF2E3156),

                letterSpacing = 1.8.sp,
            )
        )

        Divider(modifier = Modifier
            .padding(top = 12.dp, bottom = 12.dp)
            .width(318.dp)
            .height(1.dp)
            .background(color = Color(0xFF5D5F7E)))


        Text(
            text = entries[rowIndex].body,
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFF2E3156),
                letterSpacing = 1.8.sp,
            ),maxLines = 1
        )


    }
}