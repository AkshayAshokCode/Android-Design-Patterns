package com.akshayashokcode.androiddesignpatterns.behavioral.observer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akshayashokcode.androiddesignpatterns.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subject = ConcreteSubject()
        val observer1 = ConcreteObserver("Observer 1")
        val observer2 = ConcreteObserver("Observer 2")

        subject.registerObserver(observer1)
        subject.registerObserver(observer2)

        subject.setMessage("Hello Observers!")
    }
}