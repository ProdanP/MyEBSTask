package com.flexeiprata.androidmytaskapplication.utils

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T) = Resource(Status.SUCCESS, data, null)

        fun <T> error(data: T?, message: String) = Resource(Status.ERROR, data, message)

        fun <T> loading(data: T?) = Resource(Status.LOADING, data, null)
    }
}