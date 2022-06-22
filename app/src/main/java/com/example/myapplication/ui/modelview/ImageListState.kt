package com.example.myapplication.ui.modelview

import com.example.myapplication.data.domain.mge

data class ImageListState(
    val isLoading:Boolean=false,
    val error:String="",
    val Images: List<mge> = emptyList()

)
