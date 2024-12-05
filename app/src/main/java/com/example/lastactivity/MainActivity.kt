
package com.example.lastactivity

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.lastactivity.ui.theme.LastActivityTheme

// Thinking state as we build functionality

// Compose utilizes functional programming paradigm, things cannot change at run time

// Show the user something and react to the User doing something

// Uses a Composable

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // A new version of the set content, NO MORE LAYOUTS, takes a lambda
        setContent {
            LastActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Counter()
                }
            }
        }
    }
}

@Composable
fun Counter() {
    val counter by rememberSaveable { mutableStateOf(0) }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {}
        ) { Text("Increase") }

        Text(
            counter.toString(),
            fontSize = 64.sp
        )


        Button(
            onClick = {}
        ) { Text("Decrease") }

    }
}



// A benefit in the old way was the design view (lets you see it before running)
// However now, with Compose, you have the ability to see a composable in a "design view"

// The below is showing the "design", and you can have different values for visuals sake
// compared to executing the app
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LastActivityTheme {
        Counter()
    }
}


