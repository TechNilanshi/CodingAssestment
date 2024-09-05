package com.example.codingassestment.data.repository

import com.example.codingassestment.data.model.UserListData
import com.example.codingassestment.data.remote.UserApi
import com.example.codingassestment.presentation.util.Resource
import com.example.codingassestment.presentation.util.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserListRepositoryImpl @Inject constructor(
    private val api: UserApi,
) : GetUserListRepository {
    override suspend fun getUserList(): Resource<List<UserListData>> {
        val response = try {
            api.getUserList()
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }

}