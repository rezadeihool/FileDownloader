
plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(ktorLibs.plugins.ktor)
}

group = "ir.andy"
version = "1.0.0-SNAPSHOT"

application {
    mainClass = "ir.andy.MainKt"
}

kotlin {
    jvmToolchain(21)
}

tasks.shadowJar {
    manifest {
        attributes["Main-Class"] = "ir.andy.MainKt"
    }
    archiveFileName.set("app.jar")
}
dependencies {
    implementation(ktorLibs.serialization.gson)
    implementation(ktorLibs.server.contentNegotiation)
    implementation(ktorLibs.server.core)
    implementation(ktorLibs.server.netty)
    implementation(ktorLibs.server.websockets)
    implementation(libs.logback.classic)
    implementation("io.ktor:ktor-server-partial-content:3.6.0")
    implementation("io.ktor:ktor-server-auto-head-response:3.6.0")
    testImplementation(kotlin("test"))
    testImplementation(ktorLibs.server.testHost)
}
