package com.example.appmpsp.Services

import com.example.appmpsp.model.DetranResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DetranService {

    @GET("detran")
    fun getDataFromDetran(@Query("token")query:String) : Call<List<DetranResult>>
}