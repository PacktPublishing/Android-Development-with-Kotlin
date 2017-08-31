# Marvel Gallery

[![CircleCI](https://circleci.com/gh/MarcinMoskala/MarvelGallery.svg?style=svg)](https://circleci.com/gh/MarcinMoskala/MarvelGallery)
[![codebeat badge](https://codebeat.co/badges/7c7f9612-d562-43df-a676-70969e52bbd7)](https://codebeat.co/projects/github-com-marcinmoskala-marvelgallery-master)

Simple application, that is showing how Kotlin can be used to make Android development simpler and easier.
Application is intentionally not using Dagger and only basic functionalities of RxJava, to keep this example simple and understandable to more programmers.

Uses Marvel Comics API as a service which contains all the information about its vast library. Data provided by Marvel.

# Usage

In application there is characters gallery, based on RecyclerView, and search bar that is allowing to type filter for presented characters.

![App flow gif](files/flow.gif)

# Development

To start an application you need to go to [Marvel Developer Portal](https://developer.marvel.com/), make account and get private and public key. Then you need to replace REPLEACE_WITH_YOUR_PUBLIC_MARVEL_KEY and REPLEACE_WITH_YOUR_PRIVATE_MARVEL_KEY in `gradle.properties` with your keys. It is enough to start and test application on AndroidStudio. 

To set up key, and still be able to commit all files without exposing them, you can place them inside module `gradle.properties` (inside `app` folder). It is already in `.gitignore`, so you will be able commit all files and it won't be included. (Do not copy file, only its content. Create new file!)