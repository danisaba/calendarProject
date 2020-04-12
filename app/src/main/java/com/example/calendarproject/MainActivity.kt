package com.example.calendarproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.calendarproject.ImportCalendar
import com.example.calendarproject.NewCalendarAddEvents
import com.example.calendarproject.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonToCalendar : Button = findViewById(R.id.BtnToMakeCalendar)
        val buttonToImport : Button = findViewById(R.id.BtnToImportCalendar)
        buttonToCalendar.setOnClickListener {
            val intent = Intent(this, NewCalendarAddEvents :: class.java)
            startActivity(intent)
        }
        buttonToImport.setOnClickListener {
            val intent = Intent(this, ImportCalendar :: class.java)
            startActivity(intent)
        }
    }
}
