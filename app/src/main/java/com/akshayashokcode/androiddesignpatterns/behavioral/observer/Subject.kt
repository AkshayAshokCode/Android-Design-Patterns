package com.akshayashokcode.androiddesignpatterns.behavioral.observer

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}