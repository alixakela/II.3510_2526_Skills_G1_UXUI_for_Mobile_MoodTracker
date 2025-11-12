package com.example.moodtracker.ui.theme

import androidx.compose.ui.graphics.Color

enum class MoodType(
    val label: String,
    val emoji: String,
    val color: Color,
    val textColor: Color
) {
    Joy("Joy", "😄", Color(0xFFFFE066), Color.Black),
    Sad("Sad", "😢", Color(0xFF1E3A8A), Color.White),
    Angry("Angry", "😡", Color(0xFFFF0000), Color.White),
    Fear("Fear", "😨", Color(0xFFC3A6FF), Color.Black),
    Love("Love", "🥰", Color(0xFFD81B60), Color.White),
    Disgust("Disgust", "🤢", Color(0xFFA8E6A3), Color.Black),
    Anxiety("Anxiety", "😟", Color(0xFFFFA552), Color.Black),
    Embarrassed("Embarrassed", "🫣", Color(0xFFFFC9D6), Color.Black),
    Tired("Tired", "🫩", Color(0xFF64B5F6), Color.Black),
    Nostalgia("Nostalgia", "😕", Color(0xFFD9D9D9), Color.Black),
    Envy("Envy", "🥺", Color(0xFFA4E5E0), Color.Black),
    Bored("Bored", "🥱", Color(0xFF3E2723), Color.White),
    Compassionate("Compassionate", "🤗", Color(0xFF4081FA), Color.White);
}

// Set of Material typography styles to start with
/*val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    // Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
) */
