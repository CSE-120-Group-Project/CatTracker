package com.cattracker
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Query

interface stopsDao {
    @Query("SELECT * FROM stops")
    fun getAllStops(): Stops

    @Query("SELECT DISTINCT route FROM Stops WHERE stop = :stop")
    fun getRouteByStop(stop: String): List<RouteVariable>

    @Query("SELECT stop FROM stops WHERE route = :route order by orderID") //Select stop
    fun getStopByRoute(route: String): List<StopNameVariable>

    @Query("SELECT time FROM Stops WHERE stop = :stop and route = :route")
    fun getTimeBySR(stop: String, route: String): List<TimeVariable>

    @Query("SELECT time FROM Stops WHERE stop = :stop")
    fun getTimeByStop(stop: String): List<TimeVariable>

}

data class RouteVariable(
        @ColumnInfo(name = "route") var routeName: String?
)

data class StopNameVariable(
        @ColumnInfo(name = "stop") var stopName: String?
)

data class TimeVariable(
        @ColumnInfo(name = "time") var timeName: String?
)
