package com.sample.miniplate.android.sdk.dependencies

import android.content.Context
import androidx.room.Room
import com.sample.miniplate.android.sdk.services.local.MiniplateDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by javierdepedrolopez@gmail.com on 5/26/17.
 */
@Module
class MiniplateDatabaseModule {

    val DATABASE_NAME = "miniplate_database"

    @Provides
    @Singleton
    fun providesMiniplateDatabase(context: Context): MiniplateDatabase {
        return Room.databaseBuilder(context, MiniplateDatabase::class.java, DATABASE_NAME) //We will not add migration by this time
                .build()
    }
}