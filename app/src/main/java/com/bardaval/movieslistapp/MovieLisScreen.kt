package com.bardaval.movieslistapp
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bardaval.movieslistapp.Data2.verticalScroll2
import com.bardaval.movieslistapp.ui.theme.pink

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeUI(modifier: Modifier = Modifier) {
    var searchQuery by remember { mutableStateOf("") }
    val context = LocalContext.current

    val horizontalList = Data.horizontalDataList.filter { it.name.contains(searchQuery, ignoreCase = true) }
    val verticalList = Data.verticalDataList.filter { it.name.contains(searchQuery, ignoreCase = true) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(4.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Icon(
                painter = painterResource(id = R.drawable.movielog), // Your custom drawable resource
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .size(24.dp),
                tint = Color.White
            )

            Spacer(modifier = Modifier.weight(1f))

            IconButton(
                onClick = {
                    Toast.makeText(context, "Search clicked", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .padding(start = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.search), // Your custom drawable resource
                    contentDescription = null,
                    modifier = Modifier
                        .padding(4.dp)
                        .size(24.dp),
                    tint = Color.White
                )
            }

            IconButton(
                onClick = {
                    Toast.makeText(context, "User Clicked", Toast.LENGTH_SHORT).show()
                },
                modifier = Modifier
                    .padding(start = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.user), // Your custom drawable resource
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .size(24.dp),
                    tint = Color.White
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(46.dp)
                .background(Color.Black)
                .padding(top = 5.dp, bottom = 8.dp)
        ) {
            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(verticalScroll2) { demo2 ->
                    ShowHorizontalList2(data = demo2, modifier = Modifier.padding(horizontal = 8.dp))
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(190.dp)
                .background(Color.LightGray)
                .padding(top = 5.dp, bottom = 8.dp)
        ) {
            LazyRow(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(horizontalList) { demo ->
                    ShowHorizontalList1(data = demo, modifier = Modifier.padding(horizontal = 8.dp))
                }
            }
        }

        Text(
            text = "Top movies for you\uD83D\uDCA5",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White
            ),
            modifier = Modifier.padding(vertical = 8.dp)
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(5.dp),
            contentPadding = PaddingValues(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(verticalList) { demo ->
                VerticalItem(data = demo)
            }
        }

        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun ShowHorizontalList1(data: Data.Demo, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = modifier
            .width(300.dp)
            .height(200.dp)
            .padding(vertical = 5.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = data.img),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Button(
                onClick = {
                    val intent = Intent(context, DetailsActivity::class.java).apply {
                        putExtra("name", data.name)
                        putExtra("descrip", data.descrip)
                        putExtra("directorname", data.directorname)
                        putExtra("cast", data.cast)
                        putExtra("releaseDate", data.releaseDate)
                        putExtra("img", data.img)
                    }
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(8.dp)
                    .width(100.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = pink
                )
            ) {
                Text(
                    text = "description",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.White
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun ShowHorizontalList2(data: Data2.Demo2, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = modifier
            .width(150.dp)
            .height(29.dp)
            .padding(vertical = 5.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = data.name,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W300
                )
            )

            Button(
                onClick = {
                    val intent = Intent(context, DetailsActivity::class.java).apply {
                        putExtra("name", data.name)
                        putExtra("img", data.img)
                    }
                    context.startActivity(intent)
                },
                modifier = Modifier.width(100.dp),
                shape = RoundedCornerShape(25.dp)
            ) {
                // Empty Button content
            }
        }
    }
}

@Composable
fun VerticalItem(data: Data.Demo, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = modifier
            .width(100.dp)
            .height(190.dp)
            .padding(vertical = 5.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = data.img),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Button(
                onClick = {
                    val intent = Intent(context, DetailsActivity::class.java).apply {
                        putExtra("name", data.name)
                        putExtra("descrip", data.descrip)
                        putExtra("directorname", data.directorname)
                        putExtra("cast", data.cast)
                        putExtra("releaseDate", data.releaseDate)
                        putExtra("img", data.img)
                    }
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(8.dp)
                    .width(110.dp),
                shape =  RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black
                )
            ) {
                Text(
                    text = "description",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.W600,
                        color = Color.White
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
