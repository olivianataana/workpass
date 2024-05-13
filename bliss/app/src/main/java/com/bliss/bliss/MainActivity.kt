package com.bliss.bliss

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.bliss.bliss.ui.theme.BlissTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting() {
    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .background(Color.Magenta)
                    .fillMaxSize(),

                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){

                Text(
                    text = "Hello Android!",
                    color = Color.Cyan,
                    fontFamily = FontFamily.Cursive,

                    )


                AsyncImage(
                    model = "https://apensoftwares.co.ke/images/media/1669670270logo.png",
                    contentDescription = null,
                )










            }
        }
    }

}


