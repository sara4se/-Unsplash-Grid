package com.example.myapplication.data

import com.example.myapplication.data.domain.mge
import retrofit2.http.GET

interface PicsumApi {
    @GET("/v2/list")
    suspend fun getImages():List<mge>
}