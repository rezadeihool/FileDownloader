package ir.andy.core.model

import ir.andy.core.helper.DownloadService

data class DownloadStatusModel(val name : String, val downloadID : String, val sizeInBytes : Long, var status : DownloadService.Status, val linkForDownload : String = "/downloads/$downloadID", var currentDownloadedSizeInBytes : Long = 0L,val fileCreationDate : Long= System.currentTimeMillis())