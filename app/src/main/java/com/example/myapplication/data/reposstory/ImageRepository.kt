package com.example.myapplication.data.reposstory

import com.example.myapplication.common.Response
import com.example.myapplication.data.PicsumApi
import com.example.myapplication.data.domain.mge
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject

class ImageRepository @Inject constructor(
    private val picsumApi: PicsumApi
){
    suspend fun getImages():List<mge>{
        return picsumApi.getImages()
    }
    fun getAllImages(): Flow<Response<List<mge>>> = flow {
        try {
            emit(Response.Loading<List<mge>>())
            // we add it here cause it is suspend fun so we want to load the imge as soon as it Sucsses
            val images=getImages()
            emit(Response.Sucsses<List<mge>>(images))
        }catch (e:HttpException){
            emit(Response.Error<List<mge>>(e.localizedMessage!!))
        }
    }
}