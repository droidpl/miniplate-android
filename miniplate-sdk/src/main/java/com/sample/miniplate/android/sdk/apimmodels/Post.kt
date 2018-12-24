package com.sample.miniplate.android.sdk.apimmodels


data class Post(
        val id: Int,
        val title: String)

sealed class PostResult
object Loading : PostResult()
data class Error(val exception: Exception, val error: String? = null) : PostResult()
data class Data(val data: List<Post>) : PostResult()