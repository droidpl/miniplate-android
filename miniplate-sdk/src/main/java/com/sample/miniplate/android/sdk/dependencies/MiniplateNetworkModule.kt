package com.sample.miniplate.android.sdk.dependencies

import com.sample.miniplate.android.sdk.services.network.MiniplateNetworkApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by javierdepedrolopez@gmail.com on 5/26/17.
 */
@Module
class MiniplateNetworkModule(val baseUrl: String) {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit{
        return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()
    }

    @Provides
    fun providesNetworkApi(retrofit: Retrofit): MiniplateNetworkApi {
        return retrofit.create(MiniplateNetworkApi::class.java)
    }
}