package com.example.codingassestment.data.remote

import com.example.codingassestment.data.model.UserListData
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {
    @GET("posts")
    suspend fun getUserList(): List<UserListData>
}