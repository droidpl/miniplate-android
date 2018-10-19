package com.sample.miniplate.android.sdk.services.local.converters

import androidx.room.TypeConverter

/**
 * Created by javierdepedrolopez@gmail.com on 5/26/17.
 */
class StringListTypeConverter {
    @TypeConverter
    fun fromStringList(stringList: List<String>): String {
        val builder = StringBuilder()
        var isFirst = true
        stringList.map {
            if(!isFirst) {
                builder.append(",")
                isFirst = false
            }
            builder.append(it)
        }
        return builder.toString()
    }

    @TypeConverter
    fun toStringList(dataFromDB: String): List<String> {
        return ArrayList(dataFromDB.split(","))
    }
}