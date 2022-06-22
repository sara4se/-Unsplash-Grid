package com.example.myapplication.ui.modelview

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.GridItemSpan
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.myapplication.ImageCard

@OptIn(ExperimentalFoundationApi::class, ExperimentalUnitApi::class)
@Composable
fun modelView(viewModel: ImageViewList= hiltViewModel()) {
    val state=viewModel.state.value
    Surface(
//surface takes only one composable func and other can be nasted
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize()
            .wrapContentSize(),
        color = MaterialTheme.colors.primary,
    ) {
        // #WEEK 2 lazy :
        LazyVerticalGrid(
            modifier = Modifier
//                    .background(Color.LightGray)
                .wrapContentSize(),
            cells = GridCells.Fixed(2)//Fixed is used for how many item u want to show in row
        )
        {
            item(span = { GridItemSpan(8) }) {
                Box(
                    modifier = Modifier
                        .wrapContentHeight()
                        .size(100.dp)
                        .background(MaterialTheme.colors.secondary.copy(alpha = 0.4f))
                ) {
                    Text(
                        text = "Your Space",
                        fontFamily = FontFamily.Monospace,
                        modifier = Modifier
                            .wrapContentSize()
                            .align(Alignment.Center),
                        onTextLayout = { Shadow(Color.Black) },
                        fontSize = TextUnit(value = 25f, TextUnitType.Sp)
                    )
                }
            }
            items(state.Images) { pic ->
                Log.e("ImagesScreen", "${state.Images}")
                ImageCard(image = pic)
            }
            // homework!!!!!: add text with item not items in here inside the lazy make it as a title for the gallery
        }
    }
}