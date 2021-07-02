package com.example.servicehub

object ServiceHub {

    private val serviceMap = mutableMapOf<Class<*>, Any>()

    fun <T, I : T> registerService(api: Class<T>, impl: I) {
        serviceMap[api] = impl as Any
    }

    fun <T> getService(api: Class<T>): T? = serviceMap[api] as T

}