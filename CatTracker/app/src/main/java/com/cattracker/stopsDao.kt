package com.cattracker
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.cattracker.Stops

interface stopsDao {
    @Query("SELECT * FROM stops")
    fun getAllStops(): Stops

    @Query("SELECT route FROM Stops WHERE stop = :stop")
    fun getRouteByStop(stop: String): Stops

    @Query("SELECT stop FROM Stops WHERE route = :route")
    fun getStopByRoute(route: String): Stops

    @Query("SELECT time FROM Stops WHERE stop = :stop and route = :route")
    fun getTimeBySR(stop: String, route: String): Stops

    @Query("SELECT time FROM Stops WHERE stop = :stop")
    fun getTimeByStop(stop: String): Stops

}
