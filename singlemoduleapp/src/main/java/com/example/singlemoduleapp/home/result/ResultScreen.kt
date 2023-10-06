package com.example.singlemoduleapp.home.result

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

object ResultScreen : Screen {
    override val key: ScreenKey
        get() = "Key"

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        var result by remember { mutableStateOf("") }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(text = "Result Screen")

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navigator.push(EnterResultScreen {
                    result = it
                })
            }) {
                Text(text = "Go to Enter Result")
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Result is: $result"
            )
        }
    }
}