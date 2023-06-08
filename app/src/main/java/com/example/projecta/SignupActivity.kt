package com.example.projecta

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projecta.ui.theme.ProjectATheme

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sign()

        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Sign() {




    Box(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.vec),
            contentScale = ContentScale.FillBounds
        )
    ){

    }

    var texts by remember { mutableStateOf(TextFieldValue("")) }
    var text by remember { mutableStateOf(TextFieldValue("")) }
    var texte by remember { mutableStateOf(TextFieldValue("")) }
    var textd by remember { mutableStateOf(TextFieldValue("")) }
    var texted by remember { mutableStateOf(TextFieldValue("")) }




    Column(modifier = Modifier
        .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "WELCOME TO THE SAFARI ",
        )
        Image(
            painter = painterResource(R.drawable.photo),
            contentDescription = "Circle Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(128.dp)

        )

        OutlinedTextField(
            modifier=Modifier
            ,
            value = texts,
            label = { Text(text = "First Name...") },
            onValueChange = {
                texts = it
            }
        )
        OutlinedTextField(
            value = text,
            label = { Text(text = "Other Name...") },
            onValueChange = {
                texts = it
            }
        )
        OutlinedTextField(
            value = texte,
            label = { Text(text = "Email Adress...") },
            onValueChange = {
                texts = it
            }
        )
        OutlinedTextField(
            value = textd,
            label = { Text(text = "Password...") },
            onValueChange = {
                texts = it
            }
        )

        OutlinedTextField(
            value = texted,
            label = { Text(text = "Confirm Password...") },
            onValueChange = {
                texts = it
            }
        )


        Button(
            onClick = {
                //your onclick code here
            }, elevation = ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            )
        ) {
            Text(text = "SIGN UP")
        }
        Divider(
            color = androidx.compose.ui.graphics.Color.White.copy(alpha = 0.3f),
            thickness = 1.dp,
            modifier = Modifier.padding(top = 48.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Sign In with:", color = androidx.compose.ui.graphics.Color.Black)
            TextButton(onClick = {}) {
                Text(text = "Google Account")
            }

        }

    }}







