package com.cattracker
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Update
import android.arch.persistence.room.Query
import android.arch.persistence.room.OnConflictStrategy

import com.cattracker.User
interface userDao {
    @Query("SELECT * FROM User")
    fun getAllUser(): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User): Long?

    @Query("SELECT userName FROM user WHERE userName = :username LIMIT 1")
    fun findUserByUsername(username: String): User

    @Query("SELECT * FROM user WHERE id = :id LIMIT 1")
    fun findUserById(id: Long?): User

    @Query("SELECT password FROM user WHERE userName = :username")
    fun findPassword(username: String): User

    @Query("SELECT stops FROM user where userName = :username")
    fun showFavorStops(username: String): User

    @Query("SELECT route FROM user where userName = :username")
    fun showFavorRoute(username: String): User
}