package com.example.moodtracker.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface MoodDao {

    @Query("SELECT * FROM mood_entries ORDER BY timeMillis DESC")
    fun getAllMoods(): Flow<List<MoodEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMood(mood: MoodEntity)

    @Query("DELETE FROM mood_entries")
    suspend fun clearAll()
}
