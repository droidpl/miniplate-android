package com.sample.miniplate.android.sdk.utils

import java.text.SimpleDateFormat
import java.util.*


/**
 * Created by javierdepedrolopez@gmail.com on 5/26/17.
 */
class Utils {

    companion object {
        internal val dateFormat = lazy({ SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss", Locale.getDefault()) })

        fun fromStringToDate(date: String): Date {
            return dateFormat.value.parse(date)
        }
    }
}