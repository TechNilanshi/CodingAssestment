package com.example.codingassestment.presentation.util

/**
 * Resource class is responsible for parsing the responses coming from the API
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
/*    class Success<T>(data: T): Resource<T>(data)
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)
    class Loading<T>(data: T? =null): Resource<T>(data)*/

    class Success<T>(data: T): Resource<T>()
    class Error<T>(message: String, data: T? = null): Resource<T>(data, message)
    class Loading<T>(data: T? =null): Resource<T>(data)

   // class Success<T : Any>(val data: T) : Response<T>()

}