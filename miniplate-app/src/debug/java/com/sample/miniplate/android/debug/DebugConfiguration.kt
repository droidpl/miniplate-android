package com.sample.miniplate.android.debug

import android.app.Application
import com.facebook.stetho.Stetho
import com.squareup.leakcanary.LeakCanary

/**
 * Created by javierdepedrolopez@gmail.com on 5/23/17.
 */
class DebugConfiguration {
    companion object {
        fun initialize(app: Application) {
            Stetho.initialize(Stetho.newInitializerBuilder(app)
                    .enableDumpapp(Stetho.defaultDumperPluginsProvider(app))
                    .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(app))
                    .build())
            LeakCanary.install(app)
        }
    }
}