package com.example.featuretwo

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class FeatureTwoScreenModel : ScreenModel {

    val niceFlow = flow { emit("nice") }

    init {
        coroutineScope.launch {
            // do things
        }
    }

    // Optional
    override fun onDispose() {
        // coroutineScope is disposed automatically
    }
}