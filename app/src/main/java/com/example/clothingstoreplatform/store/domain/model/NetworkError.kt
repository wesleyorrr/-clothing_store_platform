package com.example.clothingstoreplatform.store.domain.model

data class NetworkError(
    val  error:ApiError,
    val t:Throwable? = null
)
enum class ApiError(val message:String){
    NetworkErro("NetworkErro"),
    UnknownResponse("UnknownResponse"),
    UnknownError("UnknownError")
}
