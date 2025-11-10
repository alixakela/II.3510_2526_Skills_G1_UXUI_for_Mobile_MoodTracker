package com.example.moodtracker.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.moodtracker.data.MoodDatabase
import com.example.moodtracker.data.MoodEntity
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MoodViewModel(app: Application) : AndroidViewModel(app) {
    private val dao = MoodDatabase.getDatabase(app).moodDao()

    val moods = dao.getAllMoods()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun addMood(entry: MoodEntity) {
        viewModelScope.launch {
            dao.insertMood(entry)
        }
    }

    fun clearAll() {
        viewModelScope.launch {
            dao.clearAll()
        }
    }
}
