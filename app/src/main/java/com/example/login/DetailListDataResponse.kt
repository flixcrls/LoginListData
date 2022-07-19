package com.example.login

data class DetailListDataResponse (
    val detail: String,
    val pengirim: String,
    val penerima: ArrayList<String>
)