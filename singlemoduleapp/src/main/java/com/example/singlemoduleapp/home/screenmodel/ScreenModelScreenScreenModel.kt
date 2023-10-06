package com.example.singlemoduleapp.home.screenmodel

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.coroutineScope
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class ScreenModelScreenScreenModel : ScreenModel {

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


