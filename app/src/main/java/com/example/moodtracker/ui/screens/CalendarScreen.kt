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
 * 📅 Calendar Screen (Unfinished version)
 *
 * UX/UI goals:
 * - Design a monthly calendar layout
 * - Highlight selected dates clearly
 * - Connect selection with stored moods (via viewModel)
 * - Provide a clear empty state when no moods exist
 */
@Composable
fun CalendarScreen(
    navController: NavController,
    viewModel: MoodViewModel
) {
    // TODO: Use viewModel.moods to link moods to specific dates

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.background_mood),
            contentDescription = "Background for calendar screen",
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
                text = "📅 Calendar (Prototype)",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            // TODO: Build a monthly calendar grid (Mon–Sun, 5–6 rows)
            Text(
                "TODO: Monthly calendar layout goes here.",
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(24.dp))

            // TODO: Show moods for the selected date (from database),
            // or an empty state if there is no data.
            Text(
                "TODO: Show moods for the selected date, or an empty state if none.",
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
