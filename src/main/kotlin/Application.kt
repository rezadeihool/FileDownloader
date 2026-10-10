package ir.andy

import io.ktor.serialization.gson.*
import io.ktor.server.application.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.partialcontent.*

fun Application.rootModule() {

    configureRouting()
    install(ContentNegotiation) { gson {} }
    install(AutoHeadResponse)
    install(PartialContent) { maxRangeCount = 10 }
}
