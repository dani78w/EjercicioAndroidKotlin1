package com.gmail.danielarribas78w.ejerciciokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onStop = 4
    private var onDestroy = 5
    private var onRestart = 6




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onCreate++

        Log.i("onCreate", onCreate.toString())








    }
    override fun onStart() {
        super.onStart()
        onStart++
        Log.i("onStart", onStart.toString())
    }
    override fun onResume() {
        super.onResume()
        onResume++
        Log.i("onResume", onResume.toString())
    }
    override fun onPause() {
        super.onPause()
        onPause++
        Log.i("onPause", onPause.toString())
    }
    override fun onStop() {
        super.onStop()
        onStop++
        Log.i("onStop", onStop.toString())
    }
    override fun onDestroy() {
        super.onDestroy()
        onDestroy++
        Log.i("onDestroy", onDestroy.toString())
    }
    override fun onRestart() {
        super.onRestart()
        onRestart++
        Log.i("onRestart", onRestart.toString())
    }

}