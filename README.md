<h1>Pokedex</h1>

<p>
  A modern Pokedex Android app based on development with Jetpack Compose, Hilt, Coroutines, Flow, Jetpack (ViewModel), and Material Design using MVVM architecture.
</p>


## 🔗 Google Play Store Link

PokéFacts is now released on the Google Play Store. Download it by clicking the banner below!

[![](images/google-play-badge.png)](https://linkhere)


## Tech stack & Open-source libraries
- Minimum SDK level 24
- [Kotlin](https://kotlinlang.org/)
- Jetpack
  - Lifecycle: Observe Android lifecycles and handle UI states upon the lifecycle changes.
  - ViewModel: Manages UI-related data holder and lifecycle aware. Allows data to survive configuration changes such as screen rotations.
  - [Hilt](https://dagger.dev/hilt/): for dependency injection.
- Architecture
  - MVVM Architecture
- [Retrofit2](https://github.com/square/retrofit): Construct the REST APIs and paging network data.
- [Coil](https://github.com/coil-kt/coil) 

## Screenshots  
  <div style="display: flex; width: 100%">
  <img src="https://github.com/pedroabreudev/PokeCompose/blob/master/Screenshots/PokeCompose%201.jpg?raw=true" width="19%"/>
  <img src="https://github.com/pedroabreudev/PokeCompose/blob/master/Screenshots/PokeCompose%202.jpg?raw=true" width="19%"/>
  <img src="https://github.com/pedroabreudev/PokeCompose/blob/master/Screenshots/PokeCompose%203.jpg?raw=true" width="19%"/>
  <img src="https://github.com/pedroabreudev/PokeCompose/blob/master/Screenshots/PokeCompose%204.jpg?raw=true" width="19%"/>
  <img src="https://github.com/pedroabreudev/PokeCompose/blob/master/Screenshots/PokeCompose%205.jpg?raw=true" width="19%"/>
  </div>

## Architecture
**Pokedex** is based on the MVVM architecture and the Repository pattern, which follows the [Google's official architecture guidance](https://developer.android.com/topic/architecture).

## Open API
<img src="https://user-images.githubusercontent.com/24237865/83422649-d1b1d980-a464-11ea-8c91-a24fdf89cd6b.png" align="right" width="21%"/>

Pokedex using the [PokeAPI](https://pokeapi.co/) for constructing RESTful API.<br>
PokeAPI provides a RESTful API interface to highly detailed objects built from thousands of lines of data related to Pokémon.
