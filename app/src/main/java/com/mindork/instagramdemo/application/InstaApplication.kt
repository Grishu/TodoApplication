package com.mindork.instagramdemo.application

import android.app.Application
import com.androidnetworking.AndroidNetworking
// Main application class file
class InstaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidNetworking.initialize(applicationContext)
    }
}