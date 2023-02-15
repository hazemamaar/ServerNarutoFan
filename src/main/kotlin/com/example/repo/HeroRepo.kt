package com.example.repo

import com.example.model.ApiResponse
import com.example.model.Hero

interface HeroRepo {

//    val heroes: Map<Int, List<Hero>>

        val heroes: List<Hero>
//    val page1: List<Hero>
//    val page2: List<Hero>
//    val page3: List<Hero>
//    val page4: List<Hero>
//    val page5: List<Hero>

    suspend fun getAllHeroes(): ApiResponse
    suspend fun searchHeroes(name: String?): ApiResponse
}