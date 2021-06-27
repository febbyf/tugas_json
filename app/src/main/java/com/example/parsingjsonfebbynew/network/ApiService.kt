package com.example.parsingjsonfebbynew.network

import com.example.parsingjsonfebbynew.model.ResponUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //Menampilkan user dengan query
    @GET("api/user")
    fun getListUsers(@Query("page")page: String): Call<ResponUser>
}