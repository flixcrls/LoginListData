package com.example.login


import com.google.gson.annotations.SerializedName

data class Pengirim(
    @SerializedName("alamat")
    val alamat: String,
    @SerializedName("id_order")
    val idOrder: Int,
    @SerializedName("id_pickup")
    val idPickup: Int,
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
    @SerializedName("ktp_pengirim")
    val ktpPengirim: String,
    @SerializedName("lat_pengirim")
    val latPengirim: Any,
    @SerializedName("long_pengirim")
    val longPengirim: Any,
    @SerializedName("nama_pengirim")
    val namaPengirim: String,
    @SerializedName("no_hp")
    val noHp: String,
    @SerializedName("prov")
    val prov: String,
    @SerializedName("status")
    val status: Int
)