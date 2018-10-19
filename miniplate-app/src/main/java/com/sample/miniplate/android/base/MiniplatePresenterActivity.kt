package com.sample.miniplate.android.base

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

/**
 * Base activity that supports MVP.
 */
abstract class MiniplatePresenterActivity<out T : IMiniplatePresenter> : AppCompatActivity(), IMiniplateViewTranslator {

    /**
     * The current presenter.
     */
    private var presenter: T? = null

    /**
     * Method that must provide a presenter item.

     * @return The presenter provided.
     */
    protected abstract fun createPresenter(): T?

    /**
     * Provides the presenter.

     * @return The presenter provided.
     */
    fun presenter(): T? = presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle
        presenter = createPresenter()
        presenter?.onCreate(savedInstanceState, intent.extras)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        presenter?.onReady()
    }

    override fun onPause() {
        super.onPause()
        presenter?.onPause()
    }

    override fun onResume() {
        super.onResume()
        presenter?.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        presenter?.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        presenter?.onRestoreInstanceState(savedInstanceState)
    }

    override fun context(): Context = applicationContext

    override fun resources(): Resources = resources

    override fun showErrorString(error: String) {
        Snackbar.make(findViewById(android.R.id.content), error, Snackbar.LENGTH_LONG).show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        presenter?.onActivityResult(requestCode, resultCode, data)
    }
}
