package com.example.login


import com.google.gson.annotations.SerializedName

data class DetailBarang(
    @SerializedName("berat")
    val berat: Any,
    @SerializedName("bobot_barang")
    val bobotBarang: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("jenis_barang")
    val jenisBarang: String,
    @SerializedName("keterangan")
    val keterangan: String,
    @SerializedName("lebar")
    val lebar: Int,
    @SerializedName("nilai_barang")
    val nilaiBarang: Int,
    @SerializedName("panjang")
    val panjang: Int,
    @SerializedName("qty")
    val qty: Int,
    @SerializedName("tinggi")
    val tinggi: Int
)