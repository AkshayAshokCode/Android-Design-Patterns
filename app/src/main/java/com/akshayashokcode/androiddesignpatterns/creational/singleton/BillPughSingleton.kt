package com.akshayashokcode.androiddesignpatterns.creational.singleton

class BillPughSingleton private constructor() {
    companion object {
        private val INSTANCE = Holder.INSTANCE

        private object Holder {
            val INSTANCE = BillPughSingleton()
        }

        fun getInstance(): BillPughSingleton {
            return INSTANCE
        }
    }
}