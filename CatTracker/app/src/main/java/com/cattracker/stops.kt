package com.cattracker

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.ColumnInfo
//import android.arch.persistence.room.NonNull

@Entity(tableName = "stops")
data class Stops(
                @ColumnInfo(name = "stop") var stop: String,
                @ColumnInfo(name = "route") var route: String,
                @ColumnInfo(name = "time") var time: String
){
    constructor():this("", "", "")
}
