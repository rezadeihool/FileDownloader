package ir.andy

import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer

fun main(args: Array<String>) {
    embeddedServer(
        factory = io.ktor.server.netty.Netty,
        port = 8081,
        host = "0.0.0.0",
        module = Application::rootModule
    ).start(wait = true)
}
