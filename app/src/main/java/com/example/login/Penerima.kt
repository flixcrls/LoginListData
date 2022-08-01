package com.example.login


import com.google.gson.annotations.SerializedName

data class Penerima(
    @SerializedName("alamat")
    val alamat: String,
    @SerializedName("detail_barang")
    val detailBarang: List<DetailBarang>,
    @SerializedName("id_order")
    val idOrder: Int,
    @SerializedName("id_penerima")
    val idPenerima: Int,
    @SerializedName("id_shipper")
    val idShipper: Int,
    @SerializedName("kab")
    val kab: String,
    @SerializedName("kec")
    val kec: String,
    @SerializedName("kel")
    val kel: String,
    @SerializedName("kode_pos")
    val kodePos: Int,
    @SerializedName("ktp_penerima")
    val ktpPenerima: String,
    @SerializedName("nama_penerima")
    val namaPenerima: String,
    @SerializedName("no_hp")
    val noHp: String,
    @SerializedName("prov")
    val prov: String,
    @SerializedName("status")
    val status: Int
)