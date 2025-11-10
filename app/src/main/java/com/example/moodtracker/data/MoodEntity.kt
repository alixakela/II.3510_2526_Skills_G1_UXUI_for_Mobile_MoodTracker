package com.example.moodtracker.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.moodtracker.ui.theme.MoodType

@Entity(tableName = "mood_entries")
data class MoodEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val type: MoodType,
    val comment: String,
    val timeMillis: Long
)
