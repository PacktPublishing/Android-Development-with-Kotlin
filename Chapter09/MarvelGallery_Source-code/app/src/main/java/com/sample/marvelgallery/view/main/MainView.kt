package com.sample.marvelgallery.view.main

import com.sample.marvelgallery.model.MarvelCharacter

interface MainView {
    var refresh: Boolean
    fun show(items: List<MarvelCharacter>)
    fun showError(error: Throwable)
}