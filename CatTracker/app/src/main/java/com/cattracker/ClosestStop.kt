package com.cattracker

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_closest_stop.*

class ClosestStop : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_closest_stop)
        this.bottomNavigationView.menu.getItem(2).setChecked(true)

        this.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_favorites -> {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }
                R.id.action_itinerary_search -> {
                    val intent = Intent(this, Itinerary::class.java)
                    startActivity(intent)
                }
                R.id.action_timetables -> {
                    val intent = Intent(this, Timetables::class.java)
                    startActivity(intent)
                }
                R.id.action_closest_stop -> {
                    val intent = Intent(this, ClosestStop::class.java)
                    startActivity(intent)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }

    }
}
