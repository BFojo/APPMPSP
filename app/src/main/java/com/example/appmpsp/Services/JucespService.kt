package com.example.appmpsp.Services

import com.example.appmpsp.model.JucespResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface JucespService {
    @GET("jucesp")
    fun getDataFromJucesp(@Query("token")query:String) : Call<List<JucespResult>>
}