package com.example.login.api

interface ILogin {
    fun login(username: String, passwd: String): Boolean
}