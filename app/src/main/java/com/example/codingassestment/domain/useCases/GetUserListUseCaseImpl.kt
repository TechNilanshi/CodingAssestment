package com.example.codingassestment.domain.useCases

import com.example.codingassestment.data.model.UserListData
import com.example.codingassestment.data.repository.GetUserListRepository
import com.example.codingassestment.presentation.util.Resource
import java.util.Locale
import javax.inject.Inject

class GetUserListUseCaseImpl @Inject constructor(private val repository: GetUserListRepository) {

    suspend fun getUserList(
    ): Resource<UserListData> {
        when (val result = repository.getUserList()) {
            is Resource.Success -> {
                return Resource.Success(
                    UserListData(),
                )
            }

            is Resource.Error -> {
                return Resource.Error(message = result.message ?: "")
            }

            is Resource.Loading -> {
                return Resource.Loading()
            }
        }
    }
}