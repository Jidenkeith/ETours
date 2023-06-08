@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.projecta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.TextField as TextField1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Apk()

                }
            }

        }




@Composable
fun Apk() {
    Box(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.vec),
            contentScale = ContentScale.FillBounds
        )
    ){

    }

    var value by remember { mutableStateOf("") }
    var values by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),


        horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
    ) {


        
        
        Text(text = "WELCOME BACK TO SAFARI PLEASE LOGIN",

        )
        
        Icon(painter = painterResource(id = R.drawable.baseline_login_24),
            contentDescription = null,
            Modifier.size(80.dp),
            tint = Color.Blue )

        TextField1(value = value ,onValueChange = {value = it}, modifier = Modifier.padding( 24.dp) )
        TextField1(value = values , onValueChange = {values = it} )
        Button(onClick = {
            //your onclick code here
        },elevation =  ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp
        )) {
            Text(text = "Login")
        }
        Divider(
            color = Color.White.copy(alpha = 0.3f),
            thickness = 1.dp,
            modifier = Modifier.padding(top = 48.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Don't have an account?", color = Color.Black)
            TextButton(onClick = {/* do something */ }) {
                Text(text = "SIGN UP!")
            }
        }



    }

}




