package com.example.myapplication.ui.modelview

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.R
import com.example.myapplication.common.Response
import com.example.myapplication.data.domain.mge
import com.example.myapplication.data.reposstory.ImageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ImageViewList @Inject constructor(
    //add class
    private val repo: ImageRepository
) : ViewModel() {
    private val _state= mutableStateOf(ImageListState())
    val state: State<ImageListState> =_state
    init {
        getImages()
    }

    fun getImages(){
        repo.getAllImages().onEach { repo->
            when(repo) {
                is Response.Loading -> {
                    _state.value=ImageListState(isLoading = true)}
                is Response.Sucsses -> {
                    _state.value=ImageListState(Images=repo.data?: emptyList())
                }
                is Response.Error -> {
                    _state.value=ImageListState(error = repo.message?:"Failed to load the images")
                }
            }
        }.launchIn(viewModelScope)
    }
}