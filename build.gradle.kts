import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.20"
    application
}

group = "julip"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.openpnp:opencv:4.5.5-1")
}

application {
    mainClass.set("julip.ChainGui")
}

/*
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}*/