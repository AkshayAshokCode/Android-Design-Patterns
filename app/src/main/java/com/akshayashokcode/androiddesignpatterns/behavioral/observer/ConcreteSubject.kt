package com.akshayashokcode.androiddesignpatterns.behavioral.observer

class ConcreteSubject : Subject {
    private val observers = mutableListOf<Observer>()
    private var message: String = ""

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(message)
        }
    }

    fun setMessage(message: String) {
        this.message = message
        notifyObservers()
    }
}