package com.sample.miniplate.android.sdk.usecases

import com.mytaxi.interview.android.sdk.usecases.UseCase
import com.mytaxi.interview.android.sdk.usecases.UseCaseExcecutor
import kotlinx.coroutines.Job

class SampleUseCase(private val executor: UseCaseExcecutor) : UseCase<Unit, Unit> {

    var lastJob: Job? = null

    override fun execute(arguments: Unit) {
        // Cancel previous coroutine. This can be way more complex for composable coroutines or
        // continuous background jobs, but for the purpose of this test we'll leave this simple
        // implementation
        cancel()
        lastJob = executor.execute {
            //Do something here
        }
    }

    override fun cancel() {
        lastJob?.run { cancel() }
    }
}