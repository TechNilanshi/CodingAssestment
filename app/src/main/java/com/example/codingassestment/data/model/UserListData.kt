package com.example.codingassestment.data.model

import kotlinx.serialization.Serializable


data class UserListData(
    val userId : Int = 0,
    val id : Int = 0,
    val title : String = "",
    val body : String = "")