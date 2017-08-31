package com.sample.marvelgallery.helpers

import com.sample.marvelgallery.data.MarvelRepository
import com.sample.marvelgallery.model.MarvelCharacter
import io.reactivex.Single

class BaseMarvelRepository(
        val onGetCharacters: (String?) -> Single<List<MarvelCharacter>>
) : MarvelRepository {

    override fun getAllCharacters(searchQuery: String?) = onGetCharacters(searchQuery)
}