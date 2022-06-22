package com.example.myapplication.common

sealed class Response<T>(
    val data: T?=null,val message: String?=null )
{
    class Sucsses<T>(data:T):Response<T>(data)
    class Error<T>(message: String,data: T?=null):Response<T>(data,message)
    class Loading<T>(message: String?=null,data: T?=null):Response<T>(data,message)
}
