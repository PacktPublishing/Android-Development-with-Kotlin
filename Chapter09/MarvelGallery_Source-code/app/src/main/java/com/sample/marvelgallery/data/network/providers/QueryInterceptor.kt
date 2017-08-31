package com.sample.marvelgallery.data.network.providers

import com.sample.marvelgallery.BuildConfig
import okhttp3.Interceptor

fun makeAddRequiredQueryInterceptor() = Interceptor { chain ->
    val originalRequest = chain.request()

    val timeStamp = System.currentTimeMillis()

    // Url customization: add query parameters
    val url = originalRequest.url().newBuilder()
            .addQueryParameter("apikey", BuildConfig.PUBLIC_KEY)
            .addQueryParameter("hash", calculatedMd5(timeStamp.toString() + BuildConfig.PRIVATE_KEY + BuildConfig.PUBLIC_KEY))
            .addQueryParameter("ts", "$timeStamp")
            .build()

    // Request customization: set custom url
    val request = originalRequest
            .newBuilder()
            .url(url)
            .build()
    chain.proceed(request)
}