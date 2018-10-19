package com.sample.miniplate.android.base

import android.content.Intent
import android.os.Bundle

/**
 * Implementation of a presenter based on the MVP pattern.
 */
interface IMiniplatePresenter {

    /**
     * On of callback for the activity or fragment lifecycle.

     * @param savedInstanceState The bundle with the previous state.
     * *
     * @param bundle The bundle.
     */
    fun onCreate(savedInstanceState: Bundle?, extras: Bundle?)

    /**
     * Callback that ensures the global state of the application is ready. This ensures that if there
     * is something asynchronous to be loaded it is done in the proper time.
     */
    fun onReady()

    /**
     * On video_pause equivalent callback for an activity or a fragment.
     */
    fun onPause()

    /**
     * On restore lifecycle callback for an activity or a fragment.
     */
    fun onResume()

    /**
     * On destroy lifecycle callback for an activity or a fragment.
     */
    fun onDestroy()

    /**
     * On restore the fragment or activity state.

     * @param savedInstanceState The bundle where you can find the state.
     */
    fun onRestoreInstanceState(savedInstanceState: Bundle?)

    /**
     * On saveBitmap the fragment or activity state.

     * @param savedInstanceState The bundle where the state should be added.
     */
    fun onSaveInstanceState(savedInstanceState: Bundle?)

    /**
     * Allows the startBroadcastWith activity for result.
     * @param requestCode The requested code.
     * *
     * @param resultCode The resulted code.
     * *
     * @param data The data.
     */
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
}
