package com.sample.miniplate.android.sdk.services

import androidx.annotation.IntDef


/**
 * Created by javierdepedrolopez@gmail.com on 5/29/17.
 */

sealed class MiniplateResult

data class Loading(val resourceName: String? = null): MiniplateResult()

data class Error(val exception: Exception, val errorType: String? = null): MiniplateResult()

data class Data<out T>(val data: T, @Status.DataStatus val status: Int): MiniplateResult()

data class Status(@DataStatus val status: Int) {

    @IntDef(STATUS_FRESH, STATUS_LOCAL, STATUS_INCONSISTENT)
    @Retention(AnnotationRetention.SOURCE)
    annotation class DataStatus

    companion object {
        /**
         * The status of the request is fresh.
         */
        const val STATUS_FRESH = 0
        /**
         * The status of the data is dataLocal.
         */
        const val STATUS_LOCAL = 1
        /**
         * The status of the data is not consistent. This means an error
         * was produced when we tried to reach the dataLocal storage.
         */
        const val STATUS_INCONSISTENT = 2
    }
}