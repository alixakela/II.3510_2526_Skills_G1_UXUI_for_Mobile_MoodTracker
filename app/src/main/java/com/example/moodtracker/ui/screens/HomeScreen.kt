package com.example.moodtracker.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
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
import com.example.moodtracker.ui.theme.MoodType
import com.example.moodtracker.viewmodel.MoodViewModel

/**
 * 🏠 Home Screen (Unfinished version)
 *
 * UX/UI goals:
 * - Improve visual hierarchy and ergonomics
 * - Apply Material You dynamic theming
 * - Add accessibility support (contentDescription)
 * - Handle “empty states” in a friendly way
 *
 * NOTE:
 * viewModel is injected and ready to be used (Room database is available),
 * but the UI is intentionally incomplete for students to work on.
 */
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: MoodViewModel
) {
    // Basic local UI state
    var selectedMood by remember { mutableStateOf(MoodType.Joy) }
    var comment by remember { mutableStateOf("") }

    // TODO (for students): use viewModel.moods to display today’s moods
    // val allMoods by viewModel.moods.collectAsState()

    Box(modifier = Modifier.fillMaxSize()) {

        // Background image
        Image(
            painter = painterResource(id = R.drawable.background_mood),
            contentDescription = "Background illustration for mood tracking", // TODO: Decide if this should be ignored by screen readers
            contentScale = ContentScale.Crop,
            modifier = Modifier.matchParentSize()
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Title
            Text(
                text = "Mood Tracker (Prototype)",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            // TODO: Replace this with a real UX explanation of the app
            Text(
                "TODO: Add a short description of the app’s concept and goals.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Spacer(modifier = Modifier.height(24.dp))

            // TODO: Build the interactive mood buttons (grid of 12 moods)
            // - Use MoodType values
            // - Respect touch target sizes
            // - Good color contrast and Material You styling
            Text(
                "TODO: Create the interactive mood buttons grid here.",
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Comment input field
            OutlinedTextField(
                value = comment,
                onValueChange = { comment = it },
                label = { Text("Add a comment about your mood") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            // TODO: Connect this button to the database via viewModel.addMood(...)
            Button(
                onClick = {
                    // Example idea (students should implement it):
                    // if (comment.isNotBlank()) {
                    //     viewModel.addMood(
                    //         MoodEntity(
                    //             type = selectedMood,
                    //             comment = comment.trim(),
                    //             timeMillis = System.currentTimeMillis()
                    //         )
                    //     )
                    //     comment = ""
                    // }
                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("Add Mood")
            }

            Spacer(modifier = Modifier.height(16.dp))

            // TODO: Replace this with a real list of moods from the database
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                item {
                    Text(
                        "Empty State — No moods displayed yet.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}
