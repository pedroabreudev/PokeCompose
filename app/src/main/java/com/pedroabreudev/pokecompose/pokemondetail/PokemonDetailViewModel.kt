package com.pedroabreudev.pokecompose.pokemondetail

import androidx.lifecycle.ViewModel
import com.pedroabreudev.pokecompose.data.remote.responses.Pokemon
import com.pedroabreudev.pokecompose.repository.PokemonRepository
import com.pedroabreudev.pokecompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}