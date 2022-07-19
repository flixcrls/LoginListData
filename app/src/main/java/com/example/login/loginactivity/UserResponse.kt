package com.example.login.loginactivity

data class UserResponse (
    var status: Int,
    var username: String,
    var role: String,
    var token: String,
)

