package ir.andy

import io.ktor.http.*
import io.ktor.serialization.gson.*
import io.ktor.server.application.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.partialcontent.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import ir.andy.core.helper.Pages

fun Application.rootModule() {

    configureRouting()
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, status ->
            call.response.header("Content-Type", "text/html; charset=utf-8")
            call.respondText(Pages.get404Page())
        }

    }
    install(ContentNegotiation) { gson {} }
    install(AutoHeadResponse)
    install(PartialContent) { maxRangeCount = 10 }
}
