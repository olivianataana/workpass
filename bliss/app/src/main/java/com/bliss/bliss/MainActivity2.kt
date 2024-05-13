package com.bliss.bliss

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.bliss.bliss.ui.theme.BlissTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting2()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting2() {

    AsyncImage(
        model = "https://apensoftwares.co.ke/images/media/1669670270logo.png",
        contentDescription = null,
    )

}


