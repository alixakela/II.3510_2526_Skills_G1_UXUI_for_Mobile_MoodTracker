package com.example.moodtracker.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.moodtracker.R
import com.example.moodtracker.viewmodel.MoodViewModel

/**
 * 📊 Statistics Screen (Unfinished version)
 *
 * UX/UI goals:
 * - Visualize weekly mood distribution
 * - Use Material You colors
 * - Ensure good contrast and label readability
 * - Provide an empty state when there is no data
 */
@Composable
fun StatsScreen(
    navController: NavController,
    viewModel: MoodViewModel
) {
    // TODO: Use viewModel.moods to compute weekly mood percentages

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.background_mood),
            contentDescription = "Background for statistics screen",
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                "📊 Weekly Mood Stats (Prototype)",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            // TODO: Replace this placeholder with a real chart
            // (bar chart or pie chart using Material You color scheme)
            Text(
                "TODO: Mood percentage chart goes here.",
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(16.dp))

            // TODO: Add an empty state with icon + text when there is no mood data
            Text(
                "TODO: Empty state for missing statistics.",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
