package com.axiagroups.axianotes

import android.app.Application
//import dagger.hilt.android.HiltAndroidApp
//import timber.log.Timber

/**
 * Created by Ahsan Habib on 7/10/2024.
 */

//@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
//        initTimber()
    }

//    private fun initTimber() {
//        if (BuildConfig.DEBUG) {
//            Timber.plant(object : Timber.DebugTree() {
//                override fun createStackElementTag(element: StackTraceElement): String {
//                    return super.createStackElementTag(element) + ':' + element.lineNumber
//                }
//            })
//        }
//    }
}