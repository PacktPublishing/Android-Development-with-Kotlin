package com.sample.marvelgallery.helpers

import com.sample.marvelgallery.model.MarvelCharacter

object Example {
    val exampleCharacter = MarvelCharacter("ExampleName", "ExampleImageUrl", "ExampleDescription", listOf("A", "E", "GHI"), listOf("B", "F", "JK LM"), listOf("C"), listOf("D"))
    val exampleCharacterList = listOf(
            exampleCharacter,
            MarvelCharacter("Name1", "ImageUrl1", "Description1", listOf("A1"), listOf("B2"), listOf("C3"), listOf("D4")),
            MarvelCharacter("Name2", "ImageUrl2", "Description2", listOf("E1"), listOf("F2"), listOf("G3"), listOf("H4"))
    )
}