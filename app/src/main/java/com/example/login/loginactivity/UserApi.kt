package com.example.login.loginactivity

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("login/loginDriver")
    fun login(
        @Body userRequest: UserRequest
    ): Call<UserResponse>
}