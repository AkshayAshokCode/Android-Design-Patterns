package com.akshayashokcode.androiddesignpatterns.creational.singleton

class ClassicSingleton private constructor() {
    companion object {
        private var instance: ClassicSingleton? = null

        @Synchronized
        fun getInstance(): ClassicSingleton {
            if (instance == null) {
                instance = ClassicSingleton()
            }
            return instance!!
        }
    }
}