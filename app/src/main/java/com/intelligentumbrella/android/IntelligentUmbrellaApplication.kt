package com.intelligentumbrella.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class IntelligentUmbrellaApplication : Application() {

    companion object {

        const val TOKEN = "qDh3mvPdYl3oqOXo"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}