package com.example.login.impl

import com.example.login.api.ILogin

class LoginImpl : ILogin {

    override fun login(username: String, passwd: String): Boolean = true

}