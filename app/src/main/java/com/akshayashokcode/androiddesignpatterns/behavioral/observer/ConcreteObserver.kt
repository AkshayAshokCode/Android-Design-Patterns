package com.akshayashokcode.androiddesignpatterns.behavioral.observer

import android.util.Log

class ConcreteObserver(private val name: String) : Observer {
    override fun update(message: String) {
        Log.d("ConcreteObserver", "$name received message: $message")
    }
}