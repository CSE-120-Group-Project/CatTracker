package com.cattracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Switch to closest stop page
        val btnClosestStop = findViewById<Button>(R.id.btn_closest_stop);
        btnClosestStop.setOnClickListener()
        {
            val intent = Intent(this, ClosestStop::class.java)
            startActivity(intent)
        }

        //Switch to log in page
        val btnFavorites = findViewById<Button>(R.id.btn_favorites);
        btnFavorites.setOnClickListener()
        {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        //Switch to itinerary page
        val btnItinerary = findViewById<Button>(R.id.btn_itinerary_search);
        btnItinerary.setOnClickListener()
        {
            val intent = Intent(this, Itinerary::class.java)
            startActivity(intent)
        }

        //Switch to timetables page
        val btnTimetables = findViewById<Button>(R.id.btn_timetables);
        btnTimetables.setOnClickListener()
        {
            val intent = Intent(this, Timetables::class.java)
            startActivity(intent)
        }
    }
}
