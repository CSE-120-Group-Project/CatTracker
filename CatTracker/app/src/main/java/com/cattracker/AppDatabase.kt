package com.cattracker
import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters

import com.cattracker.stopsDao
import com.cattracker.userDao
import com.cattracker.Stops
import com.cattracker.User
abstract class AppDatabase: RoomDatabase()  {
    @Database(entities = arrayOf(Stops::class, User::class), version = 1)
    //@TypeConverters(Converters::class)
    abstract class AppDatabse : RoomDatabase() {

        abstract fun userDao(): userDao
        abstract fun stopsDao(): stopsDao

    }
}