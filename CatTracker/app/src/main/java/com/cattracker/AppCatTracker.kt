package com.cattracker

import android.app.Application
import android.arch.persistence.room.Room
import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.db.SupportSQLiteDatabase
import com.cattracker.AppDatabase
class AppCatTracker: Application(){
    companion object {
        var db: AppDatabase? = null
    }
    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(this, AppDatabase::class.java, "app_db").allowMainThreadQueries().build()
    }


}