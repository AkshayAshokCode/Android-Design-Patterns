package com.akshayashokcode.androiddesignpatterns.creational.singleton

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.akshayashokcode.androiddesignpatterns.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appConfig = AppConfig.getInstance()
        appConfig.configValue = "Some Config Value"

        val configValue = appConfig.configValue
        Log.d("MainActivity", "Config Value: $configValue")
    }
}