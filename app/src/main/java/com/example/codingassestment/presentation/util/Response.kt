package com.example.codingassestment.presentation.util

/**
 * A sealed class representing the result of a network operation, which can be either a loading, success, an error, or an exception.
 *
 * @param T The type of data that is returned in case of success.
 **/
sealed class Response<T : Any> {

    /**
     * A loading result containing the data of type T that was returned from cache.
     *
     * @param data The data returned from cache.
     **/
    class Loading<T : Any>(val data: T? = null) : Response<T>()

    /**
    * A success result containing the data of type T that was returned from the network operation.
    *
    * @param data The data returned from the network operation.
    **/
    class Success<T : Any>(val data: T) : Response<T>()

    /**
     * An error result indicating that the network operation failed with an error message and an optional error code.
     *
     * @param msg An optional error message that explains the reason for the failure.
     * @param code An optional error code that indicates the type of error that occurred.
     */
    class Error<T : Any>(val code: Int? = -1, val message: String? = "") : Response<T>()

    /**
     * An exception result indicating that the network operation failed with an exception.
     *
     * @param e The exception that caused the network operation to fail.
     **/
    class Exception<T : Any>(val e: Throwable) : Response<T>()
}