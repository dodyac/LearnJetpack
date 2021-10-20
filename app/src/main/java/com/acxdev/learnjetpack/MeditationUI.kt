package com.acxdev.learnjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.DefaultAlpha
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.acxdev.learnjetpack.ui.theme.LearnJetPackTheme

@ExperimentalFoundationApi
class MeditationUI : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetPackTheme {
//                HomeScreen()
            }
            ImageWithBackground(
                painter = painterResource(id = R.drawable.logobaru),
                backgroundDrawableResId = R.drawable.ic_background_page,
                contentDescription = "SplashScreen"
            )
        }
    }
}

@Composable
fun Splash() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logobaru),
                contentDescription = "DigiSaham"
            )
        }

    }
}

@Composable
fun ImageWithBackground(
    painter: Painter,
    @DrawableRes backgroundDrawableResId: Int,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    alignment: Alignment = Alignment.Center,
    contentScale: ContentScale = ContentScale.Fit,
    alpha: Float = DefaultAlpha,
    colorFilter: ColorFilter? = null
) {
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(backgroundDrawableResId),
            contentDescription = null,
            modifier = modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painter,
            contentDescription = contentDescription,
            alignment = alignment,
            contentScale = contentScale,
            alpha = alpha,
            colorFilter = colorFilter,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}