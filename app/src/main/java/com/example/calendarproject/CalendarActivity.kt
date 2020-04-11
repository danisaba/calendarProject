package com.example.calendarproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_calendar_add_events)

        val buttonToCalendar : Button = findViewById(R.id.BtnToMakeCalendar)
        val buttonToImport : Button = findViewById(R.id.BtnToImportCalendar)
        buttonToCalendar.setOnClickListener {
            val intent = Intent(this, newCalendarAddEvents :: class.java)
            startActivity(intent)
        }
        buttonToImport.setOnClickListener {
            val intent = Intent(this, makeYourOwnCalendar :: class.java)
            startActivity(intent)
        }
    }
}
