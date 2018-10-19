package com.sample.miniplate.android.base

import android.content.Intent
import android.os.Bundle
import java.lang.ref.WeakReference

/**
 * Base class for the presenter.
 */
abstract class MiniplatePresenter<out T : IMiniplateViewTranslator>
/**
 * The base constructor with the view translator.

 * @param viewTranslator The view translator of the MVP.
 */
(private val view: WeakReference<T>) : IMiniplatePresenter {

    /**
     * Provides the view.

     * @return The current view.
     */
    fun view(): T? = view.get()

    override fun onCreate(savedInstanceState: Bundle?, extras: Bundle?) {}

    override fun onReady() {}

    override fun onPause() {}

    override fun onResume() {}

    override fun onDestroy() {}

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {}

    override fun onSaveInstanceState(savedInstanceState: Bundle?) {}

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {}
}
