package com.example.composedestinations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import com.example.composedestinations.ui.ComposeDestinationsTheme
import com.example.featureone.FeatureOneRouter
import com.example.featureone.FeatureOneScreen
import com.example.featuretwo.FeatureTwoScreenModel
import org.koin.android.ext.android.inject
import org.koin.core.context.GlobalContext.startKoin
import org.koin.dsl.bind
import org.koin.dsl.module

class MainActivity : ComponentActivity() {

    private val router: Router by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startKoin {
            modules(module {
                single { Router() } bind FeatureOneRouter::class
                factory { FeatureTwoScreenModel() }
            })
        }

        setContent {
            ComposeDestinationsTheme {
                Navigator(FeatureOneScreen()) {
                    router.setNavigator(it)
                    CurrentScreen()
                }

            }
        }
    }
}