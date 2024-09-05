package com.example.codingassestment.presentation.viewModel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.codingassestment.data.model.UserListData
import com.example.codingassestment.domain.useCases.GetUserListUseCaseImpl
import com.example.codingassestment.presentation.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserListViewModel @Inject constructor(private val getUserListUseCase: GetUserListUseCaseImpl) :
    ViewModel() {

    //var UserListData = mutableStateOf<List<UserListData>>(listOf())

    var userListData = mutableStateOf<List<UserListData>>(listOf())
    var loadError = mutableStateOf("")
    var isLoading = mutableStateOf(false)
   // private var _featureServiceList = MutableStateFlow(listOf(UserListData()))
   // val featureServiceList: StateFlow<List<UserListData>> get() = _featureServiceList.asStateFlow()

    fun loadUserListData() {
        viewModelScope.launch {
           // getUserListUseCase.getUserList().data?.userId

            val result = getUserListUseCase.getUserList()
            when (result) {
                is Resource.Success<*> -> {
                //val id = result.data?.id
                //    UserListData.value = result.data?.body
                }

                is Resource.Error<*> -> {
                    loadError.value = result.message!!
                    isLoading.value = false
                }

                is Resource.Loading<*> -> {
                    isLoading.value = true
                }
            }
        }
    }
}