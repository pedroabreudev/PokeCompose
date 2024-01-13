package com.pedroabreudev.pokecompose.repository

import com.pedroabreudev.pokecompose.data.remote.PokeApi
import com.pedroabreudev.pokecompose.data.remote.responses.Pokemon
import com.pedroabreudev.pokecompose.data.remote.responses.PokemonList
import com.pedroabreudev.pokecompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.Exception
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error(" Um erro desconhecido aconteceu")

        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("Um erro desconhecido aconteceu")
        }
        return Resource.Success(response)
    }
}