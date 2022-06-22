package com.example.myapplication.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import com.example.myapplication.ui.modelview.modelView
import com.example.myapplication.ui.theme.MyApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                //status bar change color
                window.statusBarColor = MaterialTheme.colors.primaryVariant.toArgb()
                // A surface container using the 'background' color from the theme
                modelView()
            }
        }
    }
}
//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
@OptIn(ExperimentalFoundationApi::class, ExperimentalUnitApi::class)
@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        //window.statusBarColor=MaterialTheme.colors.primaryVariant.toArgb()
        modelView()
    }
}


//homework my solo
//item {
//    LazyColumn (
//        modifier = Modifier
//            .background(Color.Black)){
//        item {
//            Text(
//                text = "Gallery".uppercase(),
//                color = Color.Black,
//                textAlign = TextAlign.Center,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .background(
//                        Color.Gray.copy(alpha = 0.4f)
//                    ),
//                fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//            )
//        }
//    }}
// #WEEK1
//{
//    Card(
//        backgroundColor = Color.LightGray,
//        shape = RoundedCornerShape(25.dp),
//        elevation = 50.dp,
//        modifier = Modifier
//            .size(200.dp)
//            .align(Alignment.TopStart).wrapContentSize()
//    )
//    {
//        Image(
//            bitmap = ImageBitmap.imageResource(id = item1.photoPath),
//            contentDescription = item1.title,
//            contentScale = ContentScale.Crop,
//            alignment = Alignment.TopStart,//this is for the image inside the img border
//            modifier = Modifier
//                .size(200.dp)
//                .align(Alignment.BottomEnd)//alig in the modifier is for the box
//        )
//        Text(
//            text = item1.title.uppercase(),
//            color = Color.Black,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .fillMaxWidth()
//                .background(
//                    Color.Gray.copy(alpha = 0.4f)
//                ),
//            fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//        )
//    }
//    Card(
//        backgroundColor = Color.LightGray,
//        shape = RoundedCornerShape(25.dp),
//        elevation = 50.dp,
//        modifier = Modifier
//            .size(200.dp)
//            .align(Alignment.BottomEnd).wrapContentSize()//alig in the modifier is for the box
//    )
//    {
//        Image(
//            bitmap = ImageBitmap.imageResource(id = R.drawable.img2),
//            contentDescription = "LAPTOP",
//            contentScale = ContentScale.FillBounds,
//            alignment = Alignment.TopStart,//this is for the image inside the img border
//            modifier = Modifier
//                .size(200.dp)
//                .align(Alignment.BottomEnd)//alig in the modifier is for the box
//        )
//        Text(
//            text = "book".uppercase(),
//            color = Color.Black,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .fillMaxWidth()
//                .background(
//                    Color.Gray.copy(alpha = 0.4f)
//                ),
//            fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//        )
//    }
//    Card(
//        backgroundColor = Color.LightGray,
//        shape = RoundedCornerShape(25.dp),
//        elevation = 50.dp,
//        modifier = Modifier
//            .size(200.dp)
//            .align(Alignment.BottomStart).wrapContentSize()
//    )
//    {
//        Image(
//            bitmap = ImageBitmap.imageResource(id = R.drawable.img3),
//            contentDescription = "LAPTOP",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .size(200.dp)
//                .align(Alignment.BottomStart)
//        )
//        Text(
//            text = "horses".uppercase(),
//            color = Color.Black,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .fillMaxWidth()
//                .background(
//                    Color.Gray.copy(alpha = 0.4f)
//                ),
//            fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//        )
//    }
//    Card(
//        backgroundColor = Color.LightGray,
//        shape = RoundedCornerShape(25.dp),
//        elevation = 50.dp,
//        modifier = Modifier
//            .size(200.dp)
//            .align(Alignment.TopEnd).wrapContentSize()
//    )
//    {
//        Image(
//            bitmap = ImageBitmap.imageResource(id = item2.photoPath),
//            contentDescription = "LAPTOP",
//            contentScale = ContentScale.Crop,
//            alignment = Alignment.TopStart,//this is for the image inside the img border
//            modifier = Modifier
//                .size(200.dp)
//                .align(Alignment.TopEnd)
//        )
//        Text(
//            text = item2.title.uppercase(),
//            color = Color.Black,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .fillMaxWidth()
//                .background(
//                    Color.Gray.copy(alpha = 0.4f)
//                ),
//            fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//        )
//    }
//
//    Card(
//        backgroundColor = Color.LightGray,
//        shape = RoundedCornerShape(25.dp),
//        elevation = 50.dp,
//        modifier = Modifier
//            .size(200.dp)
//            .align(Alignment.CenterStart).wrapContentSize()
//    )
//    {
//        Image(
//            bitmap = ImageBitmap.imageResource(id = R.drawable.img6),
//            contentDescription = "LAPTOP",
//            contentScale = ContentScale.Crop,
//            alignment = Alignment.TopStart,
//            modifier = Modifier
//                .size(180.dp)
//                .fillMaxSize().align(Alignment.BottomEnd)
//        )
//        Text(
//            text = "coffee".uppercase(),
//            color = Color.Black,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .fillMaxWidth()
//                .background(
//                    Color.Gray.copy(alpha = 0.4f)
//                ),
//            fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//        )
//    }
//    Card(
//        backgroundColor = Color.LightGray,
//        shape = RoundedCornerShape(25.dp),
//        elevation = 50.dp,
//        modifier = Modifier
//            .size(200.dp)
//            .align(Alignment.CenterEnd).wrapContentSize()
//    )
//    {
//        Image(
//            bitmap = ImageBitmap.imageResource(id = R.drawable.img8),
//            contentDescription = "LAPTOP",
//            alignment = Alignment.TopStart,//     alignment = Alignment.TopStart,//this is for the image inside the img border
//            contentScale = ContentScale.Crop,
//            modifier = Modifier
//                .size(180.dp)
//                .fillMaxSize().align(Alignment.BottomEnd)
//        )
//        Text(
//            text = "blants".uppercase(),
//            color = Color.Black,
//            textAlign = TextAlign.Center,
//            modifier = Modifier
//                .align(Alignment.BottomCenter)
//                .fillMaxWidth()
//                .background(
//                    Color.Gray.copy(alpha = 0.4f)
//                ),
//            fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//        )
//    }
//}

// # WEEK 1
//     {
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                //  .background(Color.Blue),
//                //contentAlignment = Alignment.TopStart
//            )
//            {
//                Card(
//                    backgroundColor = Color.LightGray,
//                    shape = RoundedCornerShape(25.dp),
//                    //   border= BorderStroke(4.dp,Color.Red),
//                    elevation = 50.dp,
//                    modifier = Modifier
//                        .size(200.dp)
//                        .align(Alignment.TopStart)
//                )
//
//                {
//                    Image(
//                        bitmap = ImageBitmap.imageResource(id = R.drawable.image2),
//                        contentDescription = "LAPTOP",
//                        contentScale = ContentScale.FillBounds,
//                        alignment = Alignment.TopStart,//this is for the image inside the img border
////                        modifier = Modifier
////                            .size(200.dp)
////                            .align(Alignment.TopStart)
//
//                    )
//
//                }
//                Card(
//                    backgroundColor = Color.LightGray,
//                    shape = RoundedCornerShape(25.dp),
//                    //   border= BorderStroke(4.dp,Color.Red),
//                    elevation = 50.dp,
//                    modifier = Modifier
//                        .size(200.dp)
//                        .align(Alignment.BottomEnd)//alig in the modifier is for the box
//
//                )
//
//                {
//                    Image(
//                        bitmap = ImageBitmap.imageResource(id = R.drawable.image3),
//                        contentDescription = "LAPTOP",
//                        contentScale = ContentScale.FillBounds,
//                        alignment = Alignment.TopStart,//this is for the image inside the img border
//                        modifier = Modifier
//                            .size(200.dp)
//                            .align(Alignment.BottomEnd)//alig in the modifier is for the box
//                    )
//                }
//                Card(
//                    backgroundColor = Color.LightGray,
//                    shape = RoundedCornerShape(25.dp),
//                    //   border= BorderStroke(4.dp,Color.Red),
//                    elevation = 50.dp,
//                    modifier = Modifier
//                        .size(200.dp)
//                        .align(Alignment.BottomStart)
//                )
//
//                {
//                    Image(
//                        bitmap = ImageBitmap.imageResource(id = R.drawable.image4),
//                        contentDescription = "LAPTOP",
//                        contentScale = ContentScale.Fit,
//                        modifier = Modifier
//                            .size(200.dp)
//                            .align(Alignment.BottomStart)
//                    )
//                }
//                Card(
//                    backgroundColor = Color.LightGray,
//                    shape = RoundedCornerShape(25.dp),
//                    //   border= BorderStroke(4.dp,Color.Red),
//                    elevation = 50.dp,
//                    modifier = Modifier
//                        .size(200.dp)
//                        .align(Alignment.TopEnd)
//                )
//                {
//                    Image(
//                        bitmap = ImageBitmap.imageResource(id = R.drawable.imagekotlin),
//                        contentDescription = "LAPTOP",
//                        contentScale = ContentScale.FillBounds,
//                        alignment = Alignment.TopStart,//this is for the image inside the img border
//                        modifier = Modifier
//                            .size(200.dp)
//                            .align(Alignment.TopEnd)
//                    )
//                }
//
//                Box(
//                    modifier = Modifier
//                        .align(Alignment.Center)
//
//                ) {
//                    Card(
//                        modifier = Modifier
//                            .size(180.dp)
//                            .wrapContentSize()
//                            // .background(Color.Blue)
//                            .align(Alignment.BottomCenter),
//                        //  contentAlignment = Alignment.TopStart
//
//                    )
//                    {
//                        Image(
//                            bitmap = ImageBitmap.imageResource(id = R.drawable.imagekotlin),
//                            contentDescription = "LAPTOP",
//                            contentScale = ContentScale.Fit,
//                            // alignment = Alignment.TopStart,//this is for the image inside the img border
//                            modifier = Modifier
//                                .size(180.dp)
//                                .fillMaxSize()
//
//                        )
//                        Text(
//                            text = "kotlin".uppercase(),
//                            color = Color.Black,
//                            textAlign = TextAlign.Center,
//                            modifier = Modifier
//                                .align(Alignment.BottomCenter)
//                                .fillMaxWidth()
//                                .background(
//                                    Color.Blue.copy(alpha = 0.4f)
//                                ),
//                            fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//                        )
//                    }
//                    Card(
//                        backgroundColor = Color.LightGray,
//                        shape = RoundedCornerShape(25.dp),
//                        //   border= BorderStroke(4.dp,Color.Red),
//                        elevation = 50.dp,
//                        modifier = Modifier
//                            .size(200.dp)
//                            .align(Alignment.TopStart).wrapContentSize()
////                        modifier = Modifier
////                            .size(180.dp)
////                            .wrapContentSize()
////                            .background(Color.Blue)
////                          .align(Alignment.CenterStart)
////                        //  contentAlignment = Alignment.TopStart
//                    )
//                    {
//                        Image(
//                            bitmap = ImageBitmap.imageResource(id = R.drawable.image4),
//                            contentDescription = "LAPTOP",
//                            contentScale = ContentScale.Fit,
//                             alignment = Alignment.TopStart,//this is for the image inside the img border
//                            modifier = Modifier
//                                .size(180.dp)
//                                .fillMaxSize()
//
//                        )
//                        Text(
//                            text = "kotlin".uppercase(),
//                            color = Color.Black,
//                            textAlign = TextAlign.Center,
//                            modifier = Modifier
//                                .align(Alignment.BottomCenter)
//                                .fillMaxWidth()
//                                .background(
//                                    Color.Blue.copy(alpha = 0.4f)
//                                ),
//                            fontSize = TextUnit(value = 25f, TextUnitType.Sp)
//                        )
//                    }
//                }
//            }
//        }
//{
//    Column() {
//        Column(
//            verticalArrangement = Arrangement.Center, //THIS IS FOR CULEuMN row is diff
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier
//                .background(Color.Blue)
//                .fillMaxWidth()//cant use fullmaxsize or size with wrapsize
//        )
//        {
//            Text(text = "hello")
//            Text(text = "i kotlin")
//            Text(text = "my name is:")
//            Text(text = "sara")
////                    Icon(
////                        imageVector = Icon.Rounded.Create,
////                        contentDescription = "Create",
////                        modifier = Modifier.size(50.dp),
////                        tint = Color.Magenta
////                    )
//        }
//        Column(
//            verticalArrangement = Arrangement.Center, //THIS IS FOR CULEMN
//            horizontalAlignment = Alignment.CenterHorizontally,
//        ) {
//
//            Image(
//                contentDescription = "picture of laptop",
//                bitmap = ImageBitmap.imageResource(id = R.drawable.imagekotlin),
//                contentScale= ContentScale.Crop,
//                modifier = Modifier.fillMaxWidth()
//                    .clip(CircleShape)
//                    .background(Color.Red)
//                    .border(width =2.dp,Color.Red,CircleShape)
//            )
//        }
//    }
////                Column(
////                verticalArrangement = Arrangement.Center,// THIS IS FOR CULEMN
////                horizontalAlignment = Alignment.CenterHorizontally,
//////                verticalAlignment = Alignment.Top,
//////                horizontalArrangement = Arrangement.End, // the se of this alig and arrang لجعل الواجهات لا تختلف من جهاز لاخر
//////                        .wrapContentHeight() this is can use with width both full and  wrap or size
////                ) {
////                }
//}