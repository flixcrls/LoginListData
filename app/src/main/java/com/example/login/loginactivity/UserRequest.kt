package com.example.login.loginactivity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserRequest {
    @SerializedName("kode_driver")
    @Expose
    var username: String? = null

    @SerializedName("password")
    @Expose
    var password: String? = null
}