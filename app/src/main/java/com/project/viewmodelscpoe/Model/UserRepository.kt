package com.project.viewmodelscpoe.Model

import kotlinx.coroutines.delay

class UserRepository {

    suspend fun getUsers():List<User>{
        delay(8000)
        val users : List<User> = listOf(
            User(1,"besan"),
            User(2,"aseel"),
            User(3,"sama"),
            User(4,"lama"),
        )
        return users
    }
}