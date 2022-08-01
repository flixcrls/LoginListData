package com.example.login


import com.google.gson.annotations.SerializedName

data class DetailListDataResponse(
    @SerializedName("detail")
    val detail: Detail,
    @SerializedName("foto_bongkar_barang")
    val fotoBongkarBarang: List<Any>,
    @SerializedName("foto_muat_barang")
    val fotoMuatBarang: List<Any>,
    @SerializedName("log_status")
    val logStatus: List<LogStatus>,
    @SerializedName("penerima")
    val penerima: List<Penerima>,
    @SerializedName("pengirim")
    val pengirim: Pengirim
)