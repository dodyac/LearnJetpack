package com.acxdev.learnjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.acxdev.learnjetpack.ui.theme.MeditationUITheme

@ExperimentalFoundationApi
class MeditationUI : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUITheme {
                HomeScreen()
            }
        }
    }
}
