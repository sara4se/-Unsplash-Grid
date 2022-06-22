package com.example.myapplication.di

import com.example.myapplication.data.PicsumApi
import com.example.myapplication.common.Constants
import com.example.myapplication.data.reposstory.ImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    //API impl
    @Provides
    @Singleton
    fun providePicsumApi(): PicsumApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PicsumApi::class.java)
    }
    @Provides
    @Singleton
//repo
fun provideRepo(api:PicsumApi):ImageRepository{
    return ImageRepository(picsumApi = api)
}
}