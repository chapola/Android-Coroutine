package com.android.coroutinetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {

            doNetworkCall()
            doNetworkCall2()

        }
        Log.d(TAG, "Thread: ${Thread.currentThread().name}")
    }

    suspend fun doNetworkCall(){
        delay(30000L)
        Log.d(TAG, "doNetworkCall: ")
    }
    suspend fun doNetworkCall2(){
        delay(1000L)
        Log.d(TAG, "doNetworkCall2: ")
    }
}