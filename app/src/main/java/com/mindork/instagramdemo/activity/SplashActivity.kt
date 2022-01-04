package com.mindork.instagramdemo.activity

import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.mindork.instagramdemo.R

class SplashActivity : AppCompatActivity() {
    private lateinit var mHandler: Handler
    private lateinit var mRunnable: Runnable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_layout)
        startSplashScreen()
    }

    fun startSplashScreen() {
        mHandler = Handler()
        mRunnable = Runnable {

        }
        mHandler.postDelayed(mRunnable, 2000)
    }
}