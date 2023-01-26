val ktorVersion: String by project
val kotlinVersion: String by project
val logbackVersion: String by project
val koinVersion :String by project

plugins {
    application
    kotlin("jvm") version "1.8.0"
    id("io.ktor.plugin") version "2.2.2"
                id("org.jetbrains.kotlin.plugin.serialization") version "1.8.0"
}

group = "com.example"
version = "0.0.1"
application {
//    mainClass.set("com.example.ApplicationKt")
    mainClass.set("io.ktor.server.netty.EngineMain")
//    val isDevelopment: Boolean = project.ext.has("development")
//    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenLocal()
    jcenter()
    maven { url =uri("https://kotlin.bintray.com/ktor") }

}

dependencies {
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-core-jvm:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-call-logging-jvm:$ktorVersion")
    implementation("io.ktor:ktor-server-netty-jvm:$ktorVersion")
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktorVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
    implementation("io.ktor:ktor-server-default-headers:$ktorVersion")
    // Koin for Ktor
    implementation ("io.insert-koin:koin-ktor:$koinVersion")
    implementation ("io.insert-koin:koin-logger-slf4j:$koinVersion")
    testImplementation ("io.insert-koin:koin-test:$koinVersion")
    testImplementation ("io.insert-koin:koin-test-junit4:$koinVersion")
//



}