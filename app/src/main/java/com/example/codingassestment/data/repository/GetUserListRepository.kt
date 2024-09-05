package com.example.codingassestment.data.repository

import com.example.codingassestment.data.model.UserListData
import com.example.codingassestment.presentation.util.Resource
import com.example.codingassestment.presentation.util.Response
//import java.util.concurrent.Flow
import kotlinx.coroutines.flow.Flow

interface GetUserListRepository {
    suspend fun getUserList(): Resource<List<UserListData>>
 //  suspend fun getUserList(): Flow<Response<List<UserListData>>>

}