package com.example.moodtracker

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.moodtracker.ui.screens.*
import com.example.moodtracker.viewmodel.MoodViewModel

/**
 * 📱 App Navigation (Unfinished UX/UI version)
 *
 * UX/UI focus:
 * - Navigation consistency (bottom bar, labels, icons)
 * - Accessibility (contentDescription, selected state)
 * - Transitions and Material motion
 */
@Composable
fun Navigation(viewModel: MoodViewModel) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNav(navController) }
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(padding)
        ) {
            // Home screen
            composable("home") {
                HomeScreen(navController = navController, viewModel = viewModel)
            }

            // Calendar screen
            composable("calendar") {
                CalendarScreen(navController = navController, viewModel = viewModel)
            }

            // Stats screen
            composable("stats") {
                StatsScreen(navController = navController, viewModel = viewModel)
            }
        }
    }
}

/**
 * Bottom Navigation Bar
 *
 * TODOs for students:
 * - Improve color contrast for accessibility
 * - Add icon animation or motion feedback when selected
 * - Highlight the active tab (selected state)
 * - Use dynamic colors (Material You)
 */
@Composable
fun BottomNav(navController: NavHostController) {
    val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route

    NavigationBar {
        NavigationBarItem(
            selected = currentDestination == "home",
            onClick = { navController.navigate("home") },
            icon = {
                Icon(
                    Icons.Filled.Face,
                    contentDescription = "Home screen icon" // ✅ for TalkBack
                )
            },
            label = { Text("Home") }
        )

        NavigationBarItem(
            selected = currentDestination == "calendar",
            onClick = { navController.navigate("calendar") },
            icon = {
                Icon(
                    Icons.Filled.CalendarMonth,
                    contentDescription = "Calendar screen icon"
                )
            },
            label = { Text("Calendar") }
        )

        NavigationBarItem(
            selected = currentDestination == "stats",
            onClick = { navController.navigate("stats") },
            icon = {
                Icon(
                    Icons.Filled.BarChart,
                    contentDescription = "Statistics screen icon"
                )
            },
            label = { Text("Stats") }
        )
    }

    // TODO: Consider adding Material motion between destinations
    // Example: slide or fade transition using AnimatedNavHost or rememberAnimatedNavController()
}
