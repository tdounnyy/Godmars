package com.example.godmars

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.feed.Feed
import com.example.login.api.ILogin
import com.example.login.impl.LoginImpl
import com.example.servicehub.ServiceHub

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ServiceHub.registerService(ILogin::class.java, LoginImpl())
    }

    override fun onResume() {
        super.onResume()

        Feed().login()
    }
}