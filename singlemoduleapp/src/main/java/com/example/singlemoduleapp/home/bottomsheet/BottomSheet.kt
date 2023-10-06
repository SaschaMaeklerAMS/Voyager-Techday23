package com.example.singlemoduleapp.home.bottomsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.bottomSheet.LocalBottomSheetNavigator

class BottomSheet : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalBottomSheetNavigator.current

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .height(500.dp)
                .fillMaxWidth()
        ) {

            Text(text = "BottomSheet")

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = {
                navigator.push(BottomSheet2())
            }) {
                Text(text = "BottomSheet2")
            }
        }
    }
}

