package com.mytaxi.interview.android.sdk.usecases


interface UseCase<I, O> {
    fun execute(arguments: I): O
    fun cancel()
}