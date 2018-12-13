package com.cattracker

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.ColumnInfo
//import android.arch.persistence.room.NonNull

@Entity(tableName = "stops")
data class Stops(
                @PrimaryKey(autoGenerate = true) var id: Long,
                @ColumnInfo(name = "stop") var stop: String,
                @ColumnInfo(name = "stationID") var stationID: Int,
                @ColumnInfo(name = "time") var time: String,
                @ColumnInfo(name = "route") var route: String,
                @ColumnInfo(name = "orderID") var orderID: Int,
                @ColumnInfo(name = "lat") var latitude: Double,
                @ColumnInfo(name = "long") var lng: Double


){
    constructor():this(0,"", 0,"","",0, 0.0, 0.0)
}
