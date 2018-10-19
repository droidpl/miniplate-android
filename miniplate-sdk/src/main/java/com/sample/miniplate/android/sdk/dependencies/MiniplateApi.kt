package com.sample.miniplate.android.sdk.dependencies

import android.content.Context
import dagger.Component
import javax.inject.Singleton

/**
 * Created by javierdepedrolopez@gmail.com on 5/26/17.
 */

@Singleton
@Component(
        modules = arrayOf(
                ApplicationModule::class,
                MiniplateNetworkModule::class,
                MiniplateDatabaseModule::class,
                MiniplateRepositoriesModule::class
        )
)
interface MiniplateApi {

    fun networkApi(): MiniplateApi

    companion object {
        fun create(context: Context, url: String): MiniplateApi {
            return DaggerMiniplateApi.builder()
                    .applicationModule(ApplicationModule(context))
                    .miniplateNetworkModule(MiniplateNetworkModule(url))
                    .build()
        }
    }
}