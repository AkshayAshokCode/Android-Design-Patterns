package com.akshayashokcode.androiddesignpatterns.creational.singleton

class AppConfig private constructor() {
    var configValue: String? = null

    companion object {
        private var instance: AppConfig? = null

        @Synchronized
        fun getInstance(): AppConfig {
            if (instance == null) {
                instance = AppConfig()
            }
            return instance!!
        }
    }
}