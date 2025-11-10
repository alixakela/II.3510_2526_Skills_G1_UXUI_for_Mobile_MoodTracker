package com.example.moodtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.moodtracker.ui.theme.MoodTrackerTheme
import com.example.moodtracker.viewmodel.MoodViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: MoodViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoodTrackerTheme {
                Navigation(viewModel = viewModel)
            }
        }
    }
}
