package com.sample.miniplate.android.ui.splash

import com.sample.miniplate.android.base.MiniplatePresenterActivity

/**
 * Created by javierdepedrolopez@gmail.com on 8/21/17.
 */
class MiniplateSplashActivity: MiniplatePresenterActivity<MiniplateSplashPresenter>(), MiniplateSplashView {

    override fun createPresenter(): MiniplateSplashPresenter = MiniplateSplashPresenter(this)
}