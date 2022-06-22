package com.example.myapplication.data.domain

import com.google.gson.annotations.SerializedName

data class mge(
    val id: String,
    val author:String,
    val width: Int,
    val hight: Int,
    val url: String,
    @SerializedName("download_url")
    val downloadUrl: String
)

