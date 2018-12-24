package com.mytaxi.interview.android.sdk.usecases
import kotlinx.coroutines.*

interface UseCaseExcecutor {
    fun execute(suspendingFunction: suspend () -> Unit): Job
}

class DefaultUseCaseExecutor: UseCaseExcecutor {
    override fun execute(suspendingFunction: suspend () -> Unit): Job = GlobalScope.launch {
        suspendingFunction()
    }
}