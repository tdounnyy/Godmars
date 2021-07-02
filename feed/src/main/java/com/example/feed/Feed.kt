package com.example.feed

import com.example.login.api.ILogin
import com.example.servicehub.ServiceHub

class Feed {

    fun login() {
        val login = ServiceHub.getService(ILogin::class.java)
        login?.login("felix", "123")
    }
}