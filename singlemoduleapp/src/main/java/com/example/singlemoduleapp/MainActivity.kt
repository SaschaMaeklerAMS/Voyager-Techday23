package com.example.singlemoduleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.bottomSheet.BottomSheetNavigator
import com.example.singlemoduleapp.ui.theme.ComposeDestinationsTheme
import com.example.singlemoduleapp.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDestinationsTheme {
                BottomSheetNavigator {
                    Navigator(WelcomeScreen())
                }
            }
        }
    }
}