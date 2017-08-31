package com.sample.marvelgallery.presenter

import com.sample.marvelgallery.data.MarvelRepository
import com.sample.marvelgallery.data.applySchedulers
import com.sample.marvelgallery.data.plusAssign
import com.sample.marvelgallery.data.subscribeBy
import com.sample.marvelgallery.view.main.MainView

class MainPresenter(val view: MainView, val repository: MarvelRepository) : BasePresenter() {

    fun onViewCreated() {
        loadCharacters()
    }

    fun onRefresh() {
        loadCharacters()
    }

    fun onSearchChanged(newText: String) {
        loadCharacters(newText)
    }

    private fun loadCharacters(search: String? = null) {
        val qualifiedSearchQuery = if (search.isNullOrBlank()) null else search
        subscriptions += repository
                .getAllCharacters(qualifiedSearchQuery)
                .applySchedulers()
                .doOnSubscribe { view.refresh = true }
                .doFinally { view.refresh = false }
                .subscribeBy(
                        onSuccess = view::show,
                        onError = view::showError
                )
    }
}