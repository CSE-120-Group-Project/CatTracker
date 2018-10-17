package com.cattracker

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.arch.persistence.room.ColumnInfo
//import android.arch.persistence.room.NonNull

@Entity(tableName = "user")
data class User(@PrimaryKey(autoGenerate = true) var id: Long, //Primarykey: String or Int?
                @ColumnInfo(name = "userName") var userName: String,
                @ColumnInfo(name = "password") var password: String,
                @ColumnInfo(name = "stops") var stops: String,
                @ColumnInfo(name = "route") var route: String
){
    constructor():this( 0, "", "","", "")
}
