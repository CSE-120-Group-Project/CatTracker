package com.cattracker
import android.arch.persistence.room.*

import com.cattracker.User
interface userDao {
    @Query("SELECT * FROM User")
    fun getAllUser(): List<User>

    @Insert(onConflict = OnConflictStrategy.ROLLBACK)
    fun insertUser(user: User): Long?

    @Query("SELECT userName FROM user WHERE userName = :username LIMIT 1")
    fun findUserByUsername(username: String): List<UserNameVariable>

    @Query("SELECT * FROM user WHERE id = :id LIMIT 1")
    fun findUserById(id: Long?): User

    @Query("SELECT password FROM user WHERE userName = :username")
    fun findPassword(username: String): List<PasswordVariable>

    @Query("SELECT stops FROM user where userName = :username")
    fun showFavorStops(username: String): List<UserStopsNameVariable>

    @Query("SELECT route FROM user where userName = :username")
    fun showFavorRoute(username: String): List<UserRouteVariable>
}

data class UserNameVariable(
        @ColumnInfo(name = "userName") var userName: String?
)

data class PasswordVariable(
        @ColumnInfo(name = "password") var timeName: String?
)

data class UserStopsNameVariable(
        @ColumnInfo(name = "stops") var stopsName: String?
)

data class UserRouteVariable(
        @ColumnInfo(name = "route") var routesName: String?
)