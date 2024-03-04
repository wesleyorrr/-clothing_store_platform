package com.example.clothingstoreplatform.store.data.mapper


import com.example.clothingstoreplatform.store.domain.model.ApiError
import com.example.clothingstoreplatform.store.domain.model.NetworkError
import retrofit2.HttpException
import java.io.IOException


fun Throwable.toNetwoorkError(): NetworkError{
    val error = when(this) {
        is IOException -> ApiError.NetworkErro
        is HttpException -> ApiError.UnknownResponse
        else -> ApiError.UnknownError
    }
    return NetworkError(
       error = error,
        t = this
    )
}