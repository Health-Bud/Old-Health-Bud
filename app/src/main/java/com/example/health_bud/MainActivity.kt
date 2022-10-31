package com.example.health_bud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val calendarView = findViewById<CalendarView>(R.id.calendarView2)
        val fragmentManager: FragmentManager = supportFragmentManager
        val logFragment: Fragment = LogFragment()

        /*
        calendarView.setOnDateChangeListener { calendarView, year, month, day ->
            Toast.makeText(this, year.toString() + (month+1).toString() + day.toString(), Toast.LENGTH_SHORT).show()
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.list_frame_layout, logFragment)
            fragmentTransaction.commit()
        }
        */
    }
}