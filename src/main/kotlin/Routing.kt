package ir.andy

import com.google.gson.Gson
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.util.cio.*
import io.ktor.utils.io.*
import ir.andy.core.helper.DownloadService
import ir.andy.core.utils.Utils
import java.io.File
import java.net.URLDecoder


fun Application.configureRouting() {
    val service = DownloadService()
    routing {
        staticResources("/", "pages", index = "home.html")


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
            val id = call.parameters["id"] ?: return@get call.respond(HttpStatusCode.NotFound)
            val status = service.getStatus(id)
            call.respondText {
                Utils.getJsonBody(true, Gson().toJson(status))
            }
        }
        get("/clear") {
            service.clearData()
        }

        get("/stream/{id}") {
            val id = call.parameters["id"] ?: return@get call.respond(HttpStatusCode.NotFound)

            val status = service.getStatus(id) ?: return@get call.respond(HttpStatusCode.NotFound)
            if (status.status != DownloadService.Status.FINISHED) {
                return@get call.respond(HttpStatusCode.NotFound)
            }
            val file = File("downloads", status.name)
            call.respondFile(file)
        }


        get("/forceStream/{id}") {
            val id = call.parameters["id"] ?: return@get call.respond(HttpStatusCode.BadRequest)
            val f = File("downloads").listFiles()
            if (f != null) {
                f.forEach {
                    if ((it.name== id ||it.nameWithoutExtension == id) && it.isFile) {
                        return@get call.respondFile(it)
                    }
                }
                call.respond(HttpStatusCode.NotFound)
            }
            call.respond(HttpStatusCode.NotFound)
        }


        post("/upload") {
            val f = call.receiveMultipart((1024*1024)*500)
            f.forEachPart { part ->
                if (part is PartData.FileItem && part.name == "file") {
                    val fileName = "${service.generateDownloadId()}_${part.originalFileName}"
                    val out = File("downloads").let {
                        it.mkdirs()
                        File(it, fileName)
                    }
                    part.provider().copyAndClose(out.writeChannel())
                    part.release()
                    return@forEachPart call.respondText {
                        """
                            {
                                "status" : true,
                                "filename" : "$fileName",
                                "download_uri" : "/forceStream/$fileName"
                            }
                        """.trimIndent()
                    }
                }
            }
            call.respondText {
                """
                            {
                                "status" : false,
                                "filename" : null,
                                "download_uri" : null
                            }
                        """.trimIndent()
            }
        }


        get("/downloads/{id}") {
            val id = call.parameters["id"] ?: return@get call.respond(HttpStatusCode.NotFound)

            val status = service.getStatus(id) ?: return@get call.respond(HttpStatusCode.NotFound)
            if (status.status != DownloadService.Status.FINISHED) {
                return@get call.respond(HttpStatusCode.NotFound)
            }
            val file = File("downloads", status.name)
            call.response.header(
                HttpHeaders.ContentDisposition,
                ContentDisposition.Attachment.withParameter(ContentDisposition.Parameters.FileName, status.name)
                    .toString()
            )
            call.respondFile(file)
        }
    }
}