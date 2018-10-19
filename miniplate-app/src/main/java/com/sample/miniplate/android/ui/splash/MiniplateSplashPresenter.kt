package com.sample.miniplate.android.ui.splash

import com.sample.miniplate.android.base.IMiniplateViewTranslator
import com.sample.miniplate.android.base.MiniplatePresenter
import java.lang.ref.WeakReference

/**
 * Created by javierdepedrolopez@gmail.com on 8/21/17.
 */
class MiniplateSplashPresenter(view: MiniplateSplashView): MiniplatePresenter<MiniplateSplashView>(WeakReference(view)) {

    override fun onReady() {
        super.onReady()
    }
}

interface MiniplateSplashView: IMiniplateViewTranslator {

}