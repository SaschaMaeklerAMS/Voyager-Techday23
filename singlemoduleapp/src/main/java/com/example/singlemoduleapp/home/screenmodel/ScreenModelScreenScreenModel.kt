package com.example.singlemoduleapp.home.screenmodel

import kotlinx.coroutines.flow.flow

// TODO migrate to ScreenModel and observe Flow on UI
class ScreenModelScreenScreenModel {
    val niceFlow = flow { emit("nice") }
}


