package com.example.login

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ListDataResponse (
    val no_order: String,
    val id_order: Int,
    val status_pengiriman: String,
    val nama_pengirim: String,
    val kab_asal: String,
    val kab_tujuan: String,
) : Parcelable