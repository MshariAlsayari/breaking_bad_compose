package com.android.breakingbadcomposeapplication.base

import retrofit2.Response

abstract class BaseDataSource {

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): BaseResult<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return BaseResult.Success(body)
            }
            return BaseResult.Failure(" ${response.code()} ${response.message()}")
        } catch (e: Exception) {
            return error(e.message ?: e.toString())
        }
    }

    private fun <T> error(message: String): BaseResult<T> {
        return BaseResult.Failure("Network call has failed for a following reason: $message")
    }

}