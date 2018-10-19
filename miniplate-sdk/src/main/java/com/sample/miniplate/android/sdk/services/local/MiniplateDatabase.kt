package com.sample.miniplate.android.sdk.services.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.sample.miniplate.android.sdk.services.local.converters.StringListTypeConverter
import com.sample.miniplate.android.sdk.services.local.models.SampleEntity

/**
 * Created by javierdepedrolopez@gmail.com on 5/26/17.
 */
@Database(entities = arrayOf(SampleEntity::class), version = 1, exportSchema = false)
@TypeConverters(StringListTypeConverter::class)
abstract class MiniplateDatabase : RoomDatabase() {
}