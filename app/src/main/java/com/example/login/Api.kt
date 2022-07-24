package com.example.login

import com.example.login.listdata.ListDataResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST

interface Api {

    @FormUrlEncoded
    @POST("listBursaPengirimanDriver")
    fun getPosts(
        @Header("Authorization") Authorization: String,
        @Field("offset") offset: Int,
        @Field("limit") limit: Int,
        @Field("param") param: Int): Call<ArrayList<ListDataResponse>>

    @FormUrlEncoded
    @POST("detail_pengiriman")
    fun getPostsDetail(
        @Header("Authorization") Authorization: String,
        @Field("offset") offset: Int,
        @Field("limit") limit: Int,
        @Field("param") param: Int): Call<ArrayList<ListDataResponse>>
}