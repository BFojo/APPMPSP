package com.example.appmpsp.Services

import com.example.appmpsp.model.DetranResult
import retrofit2.Call
import retrofit2.http.GET

interface DetranService {

    @GET("detran")
    fun getDataFromDetran() : Call<List<DetranResult>>
}