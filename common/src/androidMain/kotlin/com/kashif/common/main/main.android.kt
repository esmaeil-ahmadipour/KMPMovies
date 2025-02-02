package com.kashif.common.main

// AndroidVideoPlayer.kt
import androidx.compose.runtime.Composable
import com.kashif.common.VideoPlayer
import com.kashif.common.presentation.App

@Composable
fun Application() {
    App { url -> VideoPlayer(url) }
}

