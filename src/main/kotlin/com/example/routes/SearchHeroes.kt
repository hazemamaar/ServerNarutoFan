package com.example.routes

import com.example.repo.HeroRepo
import com.example.repo.HeroRepoImpl
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Routing.searchHeroes(){
    val heroRepo: HeroRepo = HeroRepoImpl()
    get("/naruto/heroes/search"){
      val name = call.request.queryParameters["name"]
        val apiResponse= heroRepo.searchHeroes(name)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}