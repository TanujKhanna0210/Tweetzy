package com.example.tweetzy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tweetzy.screens.CategoryScreen
import com.example.tweetzy.ui.theme.TweetzyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TweetzyTheme {
                CategoryScreen()
            }
        }
    }
}