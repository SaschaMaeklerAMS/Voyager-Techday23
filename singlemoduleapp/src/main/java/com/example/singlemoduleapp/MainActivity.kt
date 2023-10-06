package com.example.singlemoduleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.singlemoduleapp.ui.theme.ComposeDestinationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDestinationsTheme {
                // TODO create Navigator with start screen (WelcomeScreen)
            }
        }
    }
}