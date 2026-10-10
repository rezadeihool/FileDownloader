package ir.andy.core.utils

import ir.andy.core.model.DownloadStatusModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.File
import java.io.OutputStream
import java.net.HttpURLConnection
import java.net.URI

object Utils {
    fun getJsonBody(status: Boolean = true, data: String?): String {
        return $$"""
            {
                "status" : $$status,
                "msg" : "$${if (status) "data retrieved successfully" else "error occurred while retrieving data"}",
                "data" : $$data
            }
        """.trimIndent()
    }







}