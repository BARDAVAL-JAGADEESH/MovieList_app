package com.bardaval.movieslistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

class DetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val itemName = intent.getStringExtra("name") ?: "No Name"
        val itemDescription = intent.getStringExtra("descrip") ?: "No Description"
        val itemPrice = intent.getStringExtra("directorname") ?: "No Director"
        val itemCast = intent.getStringExtra("cast") ?: "No Cast"
        val itemReleaseDate = intent.getStringExtra("releaseDate") ?: "No Release Date"
        val itemImageResId = intent.getIntExtra("img", R.drawable.pic1) // Default image

        setContent {
            DetailsScreen(
                name = itemName,
                descrip = itemDescription,
                directorname = itemPrice,
                cast = itemCast,
                releaseDate = itemReleaseDate,
                imgResId = itemImageResId
            )
        }
    }
}

@Composable
fun DetailsScreen(
    name: String,
    descrip: String,
    directorname: String,
    cast: String,
    releaseDate: String,
    imgResId: Int
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = imgResId),
            contentDescription = "Movie Image",
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 16.dp),
            contentScale = ContentScale.Crop
        )

        Text(text = "Name: $name", fontSize = 24.sp, color = Color.Black)
        Text(text = "Description: $descrip", fontSize = 18.sp, color = Color.Gray)
        Text(text = "Director name: $directorname", fontSize = 18.sp, color = Color.Red)
        Text(text = "Cast: $cast", fontSize = 16.sp, color = Color.Black)
        Text(text = "Release Date: $releaseDate", fontSize = 16.sp, color = Color.Gray)

        Spacer(modifier = Modifier.weight(1f))
    }
}
