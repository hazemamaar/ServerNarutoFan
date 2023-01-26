package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*

import io.ktor.http.*
import java.time.Duration


fun Application.configureDefaultHeaders(){
    install(DefaultHeaders){
       val oneYearInSeconds=Duration.ofDays(365).seconds
        header(name = HttpHeaders.CacheControl,"public,Max-age=$oneYearInSeconds , mutable")
    }
}