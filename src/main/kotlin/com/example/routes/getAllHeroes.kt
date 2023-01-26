package com.example.routes

import com.example.model.ApiResponse
import com.example.repo.HeroRepo
import com.example.repo.HeroRepoImpl
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.lang.NumberFormatException

fun Route.getAllHeroes(){
    val heroRepo: HeroRepo = HeroRepoImpl()
    get("/heroes"){

        try {
            val page =call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)
            val apiResponse = heroRepo.getAllHeroes(page)
            call.respond(message = apiResponse, status = HttpStatusCode.OK)
        }catch (e:NumberFormatException){
            call.respond(message= ApiResponse(success = false,message="Only Number Allowed."), status = HttpStatusCode.BadRequest)
        }catch (e:IllegalArgumentException){
            call.respond(message= ApiResponse(success = false,message="Heroes Not Found."), status = HttpStatusCode.BadRequest)
        }
    }
}