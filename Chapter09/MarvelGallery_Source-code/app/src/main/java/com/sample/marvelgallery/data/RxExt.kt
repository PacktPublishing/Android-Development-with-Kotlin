package com.sample.marvelgallery.data

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

fun <T> Single<T>.applySchedulers(): Single<T> = this
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())

fun <T> Single<T>.subscribeBy(
        onError: ((Throwable) -> Unit)? = null,
        onSuccess: (T) -> Unit
): Disposable = subscribe(onSuccess, { onError?.invoke(it) })

operator fun CompositeDisposable.plusAssign(disposable: Disposable) {
    add(disposable)
}
