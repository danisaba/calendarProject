package com.example.calendarproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import kotlinx.android.synthetic.main.activity_new_calendar_add_events.*
import java.util.*

class NewCalendarAddEvents : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_calendar_add_events)

        set_event.setOnClickListener{
            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CalendarContract.Events.CONTENT_URI)
                .putExtra(CalendarContract.Events.TITLE, "event title which will eventually be input")
                .putExtra(CalendarContract.Events.EVENT_LOCATION, "somewhere")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, "begin time")
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, "end time")

            startActivity(intent)
        }
    }
}
