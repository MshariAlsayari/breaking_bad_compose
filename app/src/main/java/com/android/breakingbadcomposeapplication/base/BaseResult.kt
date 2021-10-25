package com.android.breakingbadcomposeapplication.base



data class BaseResult<out T>(val status: Status, val data: T?, val message: String?, var showProgress:Boolean) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    companion object {

        fun <T> success(data: T): BaseResult<T>{
            return BaseResult(Status.SUCCESS, data, null, false)
        }

        fun <T> error(msg: String?, data: T? = null): BaseResult<T> {
            return BaseResult(Status.ERROR, data, msg, false)
        }

        fun <T> loading(data: T? = null , showProgress: Boolean): BaseResult<T> {
            return BaseResult(Status.LOADING, data, null,showProgress)
        }

    }

}