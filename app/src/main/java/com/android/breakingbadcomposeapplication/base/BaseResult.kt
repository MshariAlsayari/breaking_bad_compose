package com.android.breakingbadcomposeapplication.base



sealed class BaseResult<out T> {
    data class Success<T: Any>( val data: T?): BaseResult<T>()
    data class Failure(val errorResponse: String): BaseResult<Nothing>()

}