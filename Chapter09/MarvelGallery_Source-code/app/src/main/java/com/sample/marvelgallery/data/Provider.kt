package com.sample.marvelgallery.data

abstract class Provider<T> {

    abstract fun creator(): T

    private val instance: T by lazy { creator() }
    var override: T? = null

    fun get(): T = override ?: instance
}