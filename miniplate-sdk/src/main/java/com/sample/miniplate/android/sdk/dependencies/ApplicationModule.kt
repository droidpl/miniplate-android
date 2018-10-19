package com.sample.miniplate.android.sdk.dependencies

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by javierdepedrolopez@gmail.com on 5/26/17.
 */
@Module
class ApplicationModule(val context: Context) {

    @Provides
    fun providesContext(): Context{
        return context
    }
}