package com.sample.marvelgallery.data

import com.sample.marvelgallery.data.network.MarvelApi
import com.sample.marvelgallery.data.network.providers.retrofit
import com.sample.marvelgallery.model.MarvelCharacter
import io.reactivex.Single

class MarvelRepositoryImpl : MarvelRepository {

    val api = retrofit.create(MarvelApi::class.java)

    override fun getAllCharacters(searchQuery: String?): Single<List<MarvelCharacter>> = api.getCharacters(
            offset = 0,
            limit = elementsOnListLimit,
            searchQuery = searchQuery
    ).map {
        it.data?.results.orEmpty().map(::MarvelCharacter)
    }

    companion object {
        const val elementsOnListLimit = 50
    }
}