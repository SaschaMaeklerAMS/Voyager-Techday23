package com.example.singlemoduleapp.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// TODO mirgrate function to Voyager Screen
@Composable
fun WelcomeScreenContent() {
    // TODO get navigator
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "WelcomeScreen 1")

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = {
            // TODO navigate to WelcomeScreen2
        }) {
            Text(text = "Continue")
        }
    }
}

