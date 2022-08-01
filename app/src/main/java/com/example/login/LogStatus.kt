package com.example.login


import com.google.gson.annotations.SerializedName

data class LogStatus(
    @SerializedName("jam")
    val jam: String,
    @SerializedName("nama_status")
    val namaStatus: String,
    @SerializedName("tanggal")
    val tanggal: String
)