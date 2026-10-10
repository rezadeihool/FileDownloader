package ir.andy

import com.google.gson.Gson
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.utils.io.*
import ir.andy.core.helper.DownloadService
import ir.andy.core.utils.Utils
import java.io.File
import java.net.URLDecoder

@OptIn(InternalAPI::class)
fun Application.configureRouting() {
    val service = DownloadService()
    routing {
        get("/") {
            call.respond(Utils.getJsonBody(true, "server is running"))

            println(call.parameters["data"])
        }


        //downloading file
        get(Regex("\\/dl\\/(?i)\\b((?:https?:\\/\\/)?(?:www\\.)?[-a-zA-Z0-9@:%._+~#=]{1,256}\\.[a-z]{2,63}\\b(?:[-a-zA-Z0-9@:%_+.~#?&\\/\\/=]*))")) {
            val uriToDownload = URLDecoder.decode(call.request.uri.replace("/dl/", ""), Charsets.UTF_8)
            val data = service.downloadFile(uriToDownload!!)
            println(data)
            call.respondText {
                Utils.getJsonBody(true, Gson().toJson(data))
            }
        }

        get("/status/{id}") {
            val id = call.parameters["id"] ?: return@get call.respond(HttpStatusCode.BadRequest)
            val status = service.getStatus(id)
            call.respondText {
                Utils.getJsonBody(true, Gson().toJson(status))
            }
        }

        get("/downloads/{id}") {
            println("downloads called")

            val id = call.parameters["id"] ?: return@get call.respond(HttpStatusCode.BadRequest)

            val status = service.getStatus(id) ?: return@get call.respond(HttpStatusCode.NotFound)
            if (status.status != DownloadService.Status.FINISHED) {
                return@get call.respond(HttpStatusCode.NotFound)
            }
            val file = File("downloads", status.name)
            call.response.header(HttpHeaders.ContentDisposition,
                ContentDisposition.Attachment.withParameter(ContentDisposition.Parameters.FileName, status.name)
                    .toString()
            )
            call.respondFile(file)
        }
    }
}