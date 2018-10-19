package com.sample.miniplate.android

import android.app.Application
import com.sample.miniplate.android.debug.DebugConfiguration
import com.sample.miniplate.android.sdk.dependencies.MiniplateApi

/**
 * Created by javierdepedrolopez@gmail.com on 5/23/17.
 */
class MiniplateApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DebugConfiguration.initialize(this)
        applicationApi = MiniplateApi.create(this, BuildConfig.API_ENDPOINT)
    }

    companion object {
        lateinit var applicationApi: MiniplateApi
        fun api(): MiniplateApi = applicationApi
    }
}