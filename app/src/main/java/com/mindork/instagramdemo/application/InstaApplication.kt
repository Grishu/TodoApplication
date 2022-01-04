package com.mindork.instagramdemo.application

import android.app.Application
import com.androidnetworking.AndroidNetworking

class InstaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidNetworking.initialize(applicationContext)
    }
}