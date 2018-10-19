package com.sample.miniplate.android.base

import android.content.Context
import android.content.res.Resources
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleOwner

/**
 * MVP view for the mobgen UI representations.
 */
interface IMiniplateViewTranslator : LifecycleOwner {

    /**
     * The current view context. It provides the context of an activity, never the application
     * one.

     * @return The context to provide.
     */
    fun context(): Context?

    /**
     * The resources where we can take some items.

     * @return The resources.
     */
    fun resources(): Resources

    /**
     * Provides the support fragment manager of the view.

     * @return The support fragment manager of the view.
     */
    fun getSupportFragmentManager(): FragmentManager?

    /**
     * Display an error in the UI.
     * @param error   The error string represented in human readable form.
     */
    fun showErrorString(error: String)
}
