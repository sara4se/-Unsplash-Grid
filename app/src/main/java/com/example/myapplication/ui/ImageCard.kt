package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.domain.mge
import com.example.myapplication.ui.modelview.NetworkImage

@OptIn(ExperimentalUnitApi::class)
@Composable
fun ImageCard(image: mge) {
    Card(
        backgroundColor = Color.LightGray,
        shape = MaterialTheme.shapes.small,
        elevation = 50.dp,
        modifier = Modifier
            .size(180.dp)
            .padding(10.dp)
    )
    {
        NetworkImage(
            url = image.downloadUrl,
            contentDesc = null,
            modifier = Modifier.size(200.dp)
        )
        Box(
            contentAlignment = Alignment.BottomEnd,//this is for the image inside the img border
            modifier = Modifier
                .size(200.dp)
        ) {
            Text(
                text = image.author.uppercase(),
                style = MaterialTheme.typography.subtitle2,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        MaterialTheme.colors.secondary.copy(alpha = 0.4f)
//                        Color.Gray.copy(alpha = 0.4f)
                    ),
                fontSize = TextUnit(value = 25f, TextUnitType.Sp)
            )
        }
    }
}