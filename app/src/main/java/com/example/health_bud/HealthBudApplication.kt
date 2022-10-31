package com.example.health_bud

import android.app.Application

class HealthBudApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}