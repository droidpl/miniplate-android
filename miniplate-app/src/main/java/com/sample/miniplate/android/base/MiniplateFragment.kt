package com.sample.miniplate.android.base

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleRegistry
import com.google.android.material.snackbar.Snackbar

abstract class MiniplateFragment<out T : IMiniplatePresenter> : Fragment(), IMiniplateViewTranslator {

    private var presenter: T? = null

    private lateinit var registryOwner: LifecycleRegistry

    override fun context(): Context? = activity?.applicationContext

    override fun resources(): Resources = resources

    override fun getSupportFragmentManager(): FragmentManager? = activity?.supportFragmentManager

    override fun showErrorString(error: String) {
        val view = view
        if (view != null) {
            Snackbar.make(view, error, Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registryOwner = LifecycleRegistry(this)
        presenter = createPresenter()
        presenter?.onCreate(savedInstanceState, arguments)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        presenter?.let {
            it.onRestoreInstanceState(savedInstanceState)
            it.onReady()
        }
    }

    abstract fun createPresenter(): T?

    fun presenter(): T? = presenter

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        presenter?.onSaveInstanceState(outState)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        presenter?.onActivityResult(requestCode, resultCode, data)
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

    override fun getLifecycle(): LifecycleRegistry = registryOwner
}
