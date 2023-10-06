package com.example.singlemoduleapp.home

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
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.bottomSheet.LocalBottomSheetNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.example.singlemoduleapp.home.bottomsheet.BottomSheet
import com.example.singlemoduleapp.home.parameter.EnterParameterScreen
import com.example.singlemoduleapp.home.screenmodel.ScreenModelScreen

class HomeScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val bottomSheetNavigator = LocalBottomSheetNavigator.current

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(text = "Welcome Home <3")

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navigator.push(EnterParameterScreen())
            }) {
                Text(text = "ParameterScreen")
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navigator.push(ScreenModelScreen())
            }) {
                Text(text = "ScreenModel")
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                bottomSheetNavigator.show(BottomSheet())
            }) {
                Text(text = "BottomSheet")
            }
        }
    }
}