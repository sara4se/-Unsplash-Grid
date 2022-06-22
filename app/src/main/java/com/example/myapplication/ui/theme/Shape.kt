package com.example.myapplication.ui.theme

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(
        topStart =0.dp,
        topEnd = 25.dp,
        bottomEnd = 0.dp,
        bottomStart = 25.dp

    ),
    medium = CutCornerShape(
        topStart =0.dp,
        topEnd = 25.dp,
        bottomEnd = 0.dp,
        bottomStart = 25.dp),
    large = CutCornerShape(
        topStart =25.dp,
        topEnd = 0.dp,
        bottomEnd = 0.dp,
        bottomStart = 25.dp)
)