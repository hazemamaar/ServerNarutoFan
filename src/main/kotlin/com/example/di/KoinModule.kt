package com.example.di

import com.example.repo.HeroRepo
import com.example.repo.HeroRepoImpl
import org.koin.dsl.module

val KoinModule= module {
    single<HeroRepo> { HeroRepoImpl() }
}