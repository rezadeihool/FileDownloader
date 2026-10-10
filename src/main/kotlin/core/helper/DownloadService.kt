package ir.andy.core.helper

import ir.andy.core.model.DownloadStatusModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import java.io.File
import java.io.OutputStream
import java.net.HttpURLConnection
import java.net.URI
import java.util.concurrent.ConcurrentHashMap

class DownloadService {
    companion object {
        private val logs = ConcurrentHashMap<String, DownloadStatusModel>()
    }

    private var scope = CoroutineScope(Dispatchers.IO.limitedParallelism(10) + SupervisorJob())
    fun downloadFile(uri: String,status : DownloadStatusModel? = null,retries : Int = 0): DownloadStatusModel{
        val downloadID =status?.downloadID ?: generateDownloadId()
        val connection = URI.create(uri).toURL().openConnection() as HttpURLConnection
        val ext = getFileName(uri)
        val fileName = "$downloadID.$ext"
        connection.requestMethod = "GET"
        connection.setRequestProperty("User-Agent", "Mozilla/5.0")
        connection.doInput = true
        connection.connect()
        var size = -1L
        runCatching {
            size = if (connection.contentLength > 0) connection.contentLength.toLong() else connection.getHeaderField("Content-Length").toLong()
        }.onFailure {
            size = -1L
        }
        scope.launch {
            try {
                val inputStream = connection.inputStream
                val out = saveToDownloads(fileName)
                val buffSize = when{
                    size > ((1024)*1024)*40 -> ((1024)*1024)*4
                    else -> 1024*8
                }
                inputStream.copyTo(out,buffSize)
                inputStream.close()
                out.close()
                connection.disconnect()
            } catch (e: Exception) {
                e.printStackTrace()
                if (retries > 3) {
                    status?.status = Status.ERROR
                }
                else{
                    println("retrying")
                    downloadFile(uri, status, retries + 1)
                }
            }
        }
        val data = status ?: DownloadStatusModel(uri,fileName, downloadID, size.toLong(), Status.DOWNLOADING)
        logs[downloadID] = data
        return data

    }


    fun saveToDownloads(fileName: String): OutputStream {
        File("downloads").mkdirs()
        val f = File("downloads", fileName)
        f.createNewFile()
        return f.outputStream()
    }

    private fun generateDownloadId(len: Int = 9): String {
        val out = StringBuilder()
        val data = ('a'..'z').plusElement(('A'..'Z')) + ('0'..'9')
        repeat(len) {
            out.append(data.random())
        }
        return out.toString()
    }

    fun getStatus(id: String): DownloadStatusModel? {
        val data = logs[id] ?: return null
        if (data.status == Status.ERROR) return data

        val f = File("downloads", data.name)
        val downloaded = f.length()

        if (downloaded >= data.sizeInBytes) {
            data.status = Status.FINISHED
        }
        data.currentDownloadedSizeInBytes = downloaded
        return data
    }

    fun clearData(){
        logs.clear()
        scope.cancel()
        File("/downloads").deleteRecursively()
        scope = CoroutineScope(Dispatchers.IO.limitedParallelism(10) + SupervisorJob())
    }

    fun getFileName(uri :String):String{
        return uri.substringAfterLast(".").substringBefore("?")
    }

    enum class Status {
        DOWNLOADING, ERROR, FINISHED,QUEUED
    }
}