package com.teleclaw

import android.app.Application

/**
 * TeleClaw Application class.
 *
 * Agent and service initialization is handled by proprietary modules
 * not included in this open framework repository.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        // Agent initialization handled by proprietary module
    }
}
