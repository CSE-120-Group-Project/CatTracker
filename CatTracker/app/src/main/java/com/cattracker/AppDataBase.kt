package com.cattracker
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import android.content.Context

import com.cattracker.stopsDao
import com.cattracker.userDao
import com.cattracker.Stops
import com.cattracker.User

@Database(entities = [Stops::class, User::class], version = 1)
abstract class AppDataBase: RoomDatabase()  {

        abstract fun userDao(): userDao
        abstract fun stopsDao(): stopsDao

        companion object {
            private var INSTANCE: AppDataBase? = null

            fun getInstance(context: Context): AppDataBase?
            {
                if (INSTANCE == null)
                {
                    synchronized(AppDataBase::class) {
                        INSTANCE = Room.databaseBuilder(context.applicationContext,
                                AppDataBase::class.java, "cat.db").build()
                    }
                }

                return INSTANCE
            }

            fun destroyInstance()
            {
                INSTANCE = null
            }
        }
}