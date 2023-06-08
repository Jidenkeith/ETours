package com.example.projecta

import android.annotation.SuppressLint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projecta.ui.theme.ProjectATheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


                 {

                }
            }

    }
}

@ExperimentalMaterial3Api
@Preview(showBackground = true)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Greeting(modifier: Modifier = Modifier.fillMaxSize()

             ) {



    Column(modifier = Modifier.fillMaxSize(),

        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {



        Scaffold(
            topBar = {
                TopAppBar(
                    modifier = Modifier
                        .background(androidx.compose.ui.graphics.Color.Black),
                    title = {
                        Text(text = "BACK",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = androidx.compose.ui.graphics.Color.Black
                            )
                    },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.ArrowBack, "backIcon")
                        }
                    },

                )
            },



            content = {

                Box(modifier = Modifier
                    .fillMaxSize()
                    .paint(
                        painterResource(id = R.drawable.download),
                        contentScale = ContentScale.FillBounds
                    )
                ){

                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(androidx.compose.ui.graphics.Color.White),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Image(
                        painter = painterResource(R.drawable.baseline_calendar_month_24),
                        contentDescription = "Circle Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(115.dp))
                    Text(
                        text = "Access Daily Attendance",
                        fontSize = 30.sp,
                        color = androidx.compose.ui.graphics.Color.Black

                    )
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "CLICK HERE")
                    }

                    Image(
                        painter = painterResource(R.drawable.complaint),
                        contentDescription = "Circle Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(115.dp))

Text(text = "File Complaint.",

    fontSize = 30.sp,
    color = androidx.compose.ui.graphics.Color.Black
    )
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "CLICK HERE")
                    }

                    Image(
                        painter = painterResource(R.drawable.baseline_meeting_room_24),
                        contentDescription = "Circle Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(115.dp))

                    Text(
                        text = "Enter Meeting",
                        fontSize = 30.sp,
                        color = androidx.compose.ui.graphics.Color.Black

                    )

                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "CLICK HERE")
                    }


                    Divider(
                        color = androidx.compose.ui.graphics.Color.Black.copy(alpha = 1f),
                        thickness = 1.dp,
                        modifier = Modifier.padding(top = 1.5.dp)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Email", color = androidx.compose.ui.graphics.Color.Black)
                        TextButton(onClick = {}) {
                            Text(text = "keithsile@gmail.com")
                        }

                         }
                    }
                 })
         }}











