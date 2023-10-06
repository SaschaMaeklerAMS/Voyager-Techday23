package com.example.composedestinations

import cafe.adriel.voyager.navigator.Navigator
import com.example.featureone.FeatureOneRouter
import com.example.featuretwo.FeatureTwoScreen

class Router : FeatureOneRouter {

    private lateinit var navigator: Navigator

    override fun navigateToFeatureTwo() {
        navigator.push(FeatureTwoScreen())
    }

    fun setNavigator(navigator: Navigator) {
        this.navigator = navigator
    }
}