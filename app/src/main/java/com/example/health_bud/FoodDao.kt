package com.example.health_bud

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface FoodDao {
    @Query("SELECT * FROM food_table")
    fun getAll(): Flow<List<FoodEntity>>

    @Insert
    fun insertAll(entries: List<FoodEntity>)

    @Insert
    fun insert(entry: FoodEntity)

    @Query("DELETE FROM food_table")
    fun deleteAll()

    @Query("SELECT AVG(calorie) FROM food_table")
    fun getAvg(): Float

    @Query("SELECT MIN(calorie) FROM food_table")
    fun getMin(): Float

    @Query("SELECT MAX(calorie) FROM food_table")
    fun getMax(): Float
}