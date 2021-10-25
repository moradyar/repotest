package com.moradyar.rickandmortyapi

import com.moradyar.networkcore.NetworkHandler

class RickAndMortyApi {

    fun getEpisodeList(): String {
        return NetworkHandler().get("https://rickandmortyapi.com/api/episode?page=0")
    }
}