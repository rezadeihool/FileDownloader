package ir.andy.core.model

import com.google.gson.annotations.SerializedName
import ir.andy.core.helper.DownloadService

data class DownloadStatusModel(
    @SerializedName("file_url") val uri: String,
    @SerializedName("file_name") val name: String,
    @SerializedName("file_id") val downloadID: String,
    @SerializedName("file_size") val sizeInBytes: Long,
    @SerializedName("file_dl_status") var status: DownloadService.Status,
    @SerializedName("file_dl_uri") val linkForDownload: String = "/downloads/$downloadID",
    @SerializedName("file_current_dl_size") var currentDownloadedSizeInBytes: Long = 0L,
    @SerializedName("file_creation_date") val fileCreationDate: Long = System.currentTimeMillis(),
    @SerializedName("file_stream_url") val streamUri: String = "/stream/$downloadID",
    @SerializedName("file_status_url") val statusUri: String = "/status/$downloadID"
)